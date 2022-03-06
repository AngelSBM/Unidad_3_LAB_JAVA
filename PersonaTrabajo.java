public class PersonaTrabajo {
    public static void main(String[] args) {
        PersonaTrabajoTest test1 = new PersonaTrabajoTest();
        test1.main(args);

    }    
}

class Persona {
    private String nombre;
    private String cedula;
    private Trabajo trabajo;

    public Persona (String nombre, String cedula, String posicionTrabajo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.trabajo = new Trabajo(posicionTrabajo, nombre);

    }

    public void obtenerInfoLaboral(){
        System.out.println("Yo, " + nombre + " laboro en el área de " + trabajo.obtenerNombreTrabajo());
    }
}

class Trabajo {
    private String nombreTrabajo;
    private String titularTrabajo;


    public Trabajo (String nombreTrabajo, String titularTrabajo){
        this.nombreTrabajo = nombreTrabajo;
        this.titularTrabajo = titularTrabajo;
    }

    public String obtenerNombreTrabajo (){
        return nombreTrabajo;
    }
}

class PersonaTrabajoTest {
    public void main(String[] args) {
        Persona sanchoPansa = new Persona("Sancho Pansa", "012301203123", "Desarrollo de Software");
        sanchoPansa.obtenerInfoLaboral();
    }
}