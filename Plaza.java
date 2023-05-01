public class Plaza {
    private int id;
    private char tipoPlaza;
    private boolean adjudicada = false;
    private Persona persona;



    // Constructores
    public Plaza() {
        
    }

    public Plaza(int id, char tipoPlaza) {
        this.setId(id);
        this.setTipoPlaza(tipoPlaza);
    }


    // Setters y getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public char getTipoPlaza() {
        return tipoPlaza;
    }
    public void setTipoPlaza(char tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }
    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    // Método toString
    @Override
    public String toString() {
        if (adjudicada) {
            return "ID Plaza: " + id
                    + "\nTipo de plaza: " + tipoPlaza
                    + "\nAdjudicada: ADJUDICADA" 
                    + "\nPersona adjudicada:" + persona;
        } else {
            return "ID Plaza: " + id
                    + "\nTipo de plaza: " + tipoPlaza
                    + "\nAdjudicada: NO ADJUDICADA";
        }
    }
}
