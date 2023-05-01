public class Sanitarios extends Persona {
    private String especialidad;
    private int diasTrabajados;


    // Constructores
    public Sanitarios() {

    }
    
    public Sanitarios(String nombre, String apellido1, String apellido2, String especialidad, int diasTrabajados) {
        super(nombre, apellido1, apellido2);
        this.setEspecialidad(especialidad);
        this.setDiasTrabajados(diasTrabajados);
    }


    // Setters y getters
    public String getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(String espcecialidad) {
        this.especialidad = espcecialidad;
    }


    public int getDiasTrabajados() {
        return diasTrabajados;
    }


    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    
    // Método toString
    @Override
    public String toString() {
        return super.toString()
                + "\nEspecialidad: " + especialidad
                + "\nDías trabajados: " + diasTrabajados;
    }
}
