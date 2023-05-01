public class Docentes extends Persona {
    private String titulacion;
    private float puntos;


    // Constructores
    public Docentes() {
    }

    public Docentes(String nombre, String apellido1, String apellido2, String titulacion, float puntos) {
        super(nombre, apellido1, apellido2);
        this.setTitulacion(titulacion);
        this.setPuntos(puntos);
    }
    

    // SETTERS & GETTERS
    public String getTitulacion() {
        return titulacion;
    }

    public Docentes(String titulacion, float puntos) {
        this.titulacion = titulacion;
        this.puntos = puntos;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString()
                + "\nTitulación: " + titulacion
                + "\nPuntos: " + puntos;
    }
}