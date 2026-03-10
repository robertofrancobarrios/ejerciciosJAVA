package Actividad8;

public class Usuario implements Validable, Mostrable {

	private String email;
	private String password;
	
	public Usuario(String email, String password) {
		this.email=email;
		this.password=password;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("El email debe contener '@'");
		}
		if (password == null || password.length() < 8) {
			throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres");
		}
		
	}
	
	@Override
	public String mostrar() {
		return "Usuario [email=" + email + ", password=" + password + "]";
	}

}
