package es.iescamas.estructura;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Conjunto extends ConjuntoArray {

    public Conjunto() {
        super();
    }

    public int numeroElementos() {
        return size();
    }

    public boolean insertar(int n) {
        return add(n); 
    }

    public void añadirElementosDe(Conjunto otro) {
        Objects.requireNonNull(otro, "otro es null");
        for (int i = 0; i < otro.size(); i++) {
            add(otro.get(i)); // add evita duplicados automáticamente
        }
    }

    // Elimina un elemento
    public boolean eliminarElemento(int n) {
        return removeValue(n);
    }

    public void eliminarTodos(Conjunto otro) {
        Objects.requireNonNull(otro, "otro es null");
        for (int i = 0; i < otro.size(); i++) {
            removeValue(otro.get(i));
        }
    }

    public boolean pertenece(int n) {
        return contains(n);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i));
            if (i < size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public int minimo() {
        if (size() == 0)
            throw new NoSuchElementException("Conjunto vacío");
        int min = get(0);
        for (int i = 1; i < size(); i++) {
            if (get(i) < min) min = get(i);
        }
        return min;
    }

    public int maximo() {
        if (size() == 0)
            throw new NoSuchElementException("Conjunto vacío");
        int max = get(0);
        for (int i = 1; i < size(); i++) {
            if (get(i) > max) max = get(i);
        }
        return max;
    }

    public double media() {
        if (size() == 0)
            throw new NoSuchElementException("Conjunto vacío");
        int suma = 0;
        for (int i = 0; i < size(); i++) {
            suma += get(i);
        }
        return (double) suma / size();
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
        Objects.requireNonNull(c1, "c1 es null");
        Objects.requireNonNull(c2, "c2 es null");

        if (c1.size() == 0)
            return true;

        for (int i = 0; i < c1.size(); i++) {
            if (!c2.contains(c1.get(i)))
                return false;
        }
        return true;
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Objects.requireNonNull(c1, "c1 es null");
        Objects.requireNonNull(c2, "c2 es null");

        Conjunto resultado = new Conjunto();
        resultado.añadirElementosDe(c1);
        resultado.añadirElementosDe(c2);

        return resultado;
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Objects.requireNonNull(c1, "c1 es null");
        Objects.requireNonNull(c2, "c2 es null");

        Conjunto resultado = new Conjunto();
        for (int i = 0; i < c1.size(); i++) {
            Integer valor = c1.get(i);
            if (c2.contains(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Objects.requireNonNull(c1, "c1 es null");
        Objects.requireNonNull(c2, "c2 es null");

        Conjunto resultado = new Conjunto();
        for (int i = 0; i < c1.size(); i++) {
            Integer valor = c1.get(i);
            if (!c2.contains(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }
}
