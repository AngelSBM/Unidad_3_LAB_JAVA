import java.util.Vector;

public class Agregacion {
    public static void main(String[] args) {
        AgregacionTest agregacionTest1 = new AgregacionTest();
        agregacionTest1.main(args);
    }
}

class AgregacionTest{
    public void main(String[] args) {
        
        Empleado marcos = new Empleado("Marcos", "UASD", "Ninguna", "Inglés, Francés");
        Empleado juan = new Empleado("Juan", "OyM", "CCNA", "Inglés, Creole");
        Empleado miguel = new Empleado("Miguel", "INTEC", "AWS", "Francés,");
        Empleado pedro = new Empleado("Pedro", "PUCMM", "Azure", "Portugués, Japonés");

        Vector <Empleado> listaEmpleados = new Vector<Empleado>();

        listaEmpleados.add(marcos);
        listaEmpleados.add(juan);
        listaEmpleados.add(miguel);
        listaEmpleados.add(pedro);

        Departamento tecnologia = new Departamento("Tecnología y Desarrollo", listaEmpleados);

        Vector <Departamento> listaDepartamentos = new Vector<Departamento>();

        listaDepartamentos.add(tecnologia);

        Hospital plazaSalud = new Hospital("Plaza de la salud", 
                                            "27 de febrero #23", 
                                            "809-234-2344", 
                                            listaDepartamentos);

        
        plazaSalud.mostrarDepartamentos(); 
        
        tecnologia.listaEmpleados();

    }
}

class Hospital{
    private String nombre;
    private String direccion;
    private String telefono;
    private Vector<Departamento> listaDepartamentos;

    public Hospital( String nombre, String direccion, String telefono, Vector<Departamento> departamentos ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaDepartamentos = departamentos;
    }

    public void mostrarDepartamentos(){
        System.out.println("Lista de departamentos");;
        for( int i = 0; i < listaDepartamentos.size(); ++i ){
            System.out.println(listaDepartamentos.get(i).obtenerNombre());
        }
    }

}

class Departamento {
    private String nombre;
    private Vector<Empleado> listaEmpleados;

    public Departamento( String nombre, Vector<Empleado> empleados) {
        this.nombre = nombre;
        this.listaEmpleados = empleados;      
    }

    public void listaEmpleados(){
        System.out.println("Lista de empleados del departamento de " + nombre);;
        for( int i = 0; i < listaEmpleados.size(); ++i ){
            System.out.println(listaEmpleados.get(i).obtenerNombre());
        }
    }

    public String obtenerNombre() {
        return nombre; 
   }
}

class Empleado{
    private String nombre;
    private String educacion;
    private String certificaciones;
    private String idiomas;

    public Empleado(String nombre, String educacion, String certificaciones, String idiomas ) {
        this.nombre = nombre;        
        this.educacion = educacion;        
        this.certificaciones = certificaciones;        
        this.idiomas = idiomas;        
    }

    public String obtenerNombre() {
         return nombre; 
    }

}