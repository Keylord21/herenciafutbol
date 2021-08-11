
package herencia.ejemplo.futbol;
import javax.swing.JOptionPane;
    
public class TeamSoccer {
    protected int id ;
    protected String nombre , apellido;
    protected int edad; 
}

 class player extends TeamSoccer {
        private int dorsal ;
        private int valor ; 
        private String nacionalidad;
    public player(){
        super();
    }
}

class coach extends TeamSoccer {
        private String nacionalida;
        private int sueldo;

        public coach () {
		super();
	}
}

class therapist extends TeamSoccer {

	private String Titulación;
	private int añosExperiencia;
        private int sueldo;

        public therapist() {
		super();
	}
}