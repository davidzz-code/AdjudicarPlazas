public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private static int contador = 0;


    // Constructores

    public Persona() {
        
    }

    public Persona(String nombre, String apellido1, String apellido2) {
        this.setId();
        this.setNombre(nombre);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
    }


    // Método toString()
    @Override
    public String toString() {
        return "\nID persona: " + id
                + "\nNombre: " + nombre
                + "\nPrimer apellido: " + apellido1
                + "\nSegudno apellido: " + apellido2;
    }

    
    // Setters & Getters
    public void setId() {
        contador++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

}