package Instrumentos.Actividades8;

public class Main {
    public static void main( String[] args ) {
    	Piano piano = new Piano();
    	Campana campana = new Campana();
    	
    	piano.add(Nota.DO);
    	piano.add(Nota.SOL);
    	piano.add(Nota.MI);
    	
    	campana.add(Nota.RE);
    	campana.add(Nota.LA);
    	campana.add(Nota.FA);
    	
    	piano.interpretar();
    	campana.interpretar();
    	
    	
    	
    }
    
}
