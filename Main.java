import java.util.ArrayList;

public class Main {

    public static void adjudicarPlaza(ArrayList<Plaza> listaPlazas, ArrayList<Persona> listaPersonas) {
        for (Plaza plaza : listaPlazas) {
            if (plaza.getTipoPlaza() == 'D') {
                Docentes docenteMax = null;

                for (Persona persona : listaPersonas) {
                    if (persona instanceof Docentes) {
                        Docentes docente = (Docentes) persona;
                        if (docenteMax == null || docente.getPuntos() > docenteMax.getPuntos()) {
                            docenteMax = docente;
                        }
                    }
                }
                if (!listaPersonas.isEmpty()) {
                    plaza.setPersona(docenteMax);
                    plaza.setAdjudicada(true);
                    listaPersonas.remove(docenteMax);
                }

            } else if (plaza.getTipoPlaza() == 'S') {
                Sanitarios sanitarioMax = null;

                for (Persona persona : listaPersonas) {
                    if (persona instanceof Sanitarios) {
                        Sanitarios sanitario = (Sanitarios) persona;
                        if (sanitarioMax == null || sanitario.getDiasTrabajados() > sanitarioMax.getDiasTrabajados()) {
                            sanitarioMax = sanitario;
                        }
                    }
                }
                if (!listaPersonas.isEmpty()) {
                    plaza.setPersona(sanitarioMax);
                    plaza.setAdjudicada(true);
                    listaPersonas.remove(sanitarioMax);
                }
            }
        }
    }

    public static void mostrarPlazas(ArrayList<Plaza> listaPlazas) {
        System.out.println("=====================================");
        System.out.println("Lista de plazas para SANITARIOS:");
        System.out.println("=====================================");
        for (Plaza plaza : listaPlazas) {
            if (plaza.getTipoPlaza() == 'S') {
                System.out.println(plaza.toString());
                System.out.println("------------------------------------");
            }
        }

        System.out.println("=====================================");
        System.out.println("Lista de plazas para DOCENTES:");
        System.out.println("=====================================");
        for (Plaza plaza : listaPlazas) {
            if (plaza.getTipoPlaza() == 'D') {
                System.out.println(plaza.toString());
                System.out.println("------------------------------------");
            }
        }
    }

    public static void simularPlazas(ArrayList<Persona> listaPersonas, ArrayList<Plaza> listaPlazas) {
        Plaza p0 = new Plaza(0, 'D');
        Plaza p1 = new Plaza(1, 'S');
        Plaza p2 = new Plaza(2, 'S');
        Plaza p3 = new Plaza(3, 'D');
        Plaza p4 = new Plaza(4, 'S');
        Plaza p5 = new Plaza(5, 'D');
        Plaza p6 = new Plaza(6, 'D');
        Plaza p7 = new Plaza(7, 'S');
        Plaza p8 = new Plaza(8, 'D');

        listaPlazas.add(p0);
        listaPlazas.add(p1);
        listaPlazas.add(p2);
        listaPlazas.add(p3);
        listaPlazas.add(p4);
        listaPlazas.add(p5);
        listaPlazas.add(p6);
        listaPlazas.add(p7);
        listaPlazas.add(p8);

        Docentes juanAlberto = new Docentes("Juan", "Álvarez", "García", "Máster", (float) 3.8);
        Docentes andresAlguacil = new Docentes("Andrés", "Alcázar", "López", "Doctor", (float) 4.5);
        Docentes guillemMillet = new Docentes("Guillem", "Mulet", "Rivas", "Grado", (float) 3.7);
        Sanitarios mariaCanovas = new Sanitarios("María Isabel", "Cánovas", "Castillo", "Traumatología", 30);
        Sanitarios victorMulet = new Sanitarios("Iván", "Barajas", "Sánchez", "Oncología", 27);
        Sanitarios marcosTorres = new Sanitarios("Marcos", "Torres", "Martorell", "Cardiología", 29);

        listaPersonas.add(juanAlberto);
        listaPersonas.add(andresAlguacil);
        listaPersonas.add(guillemMillet);
        listaPersonas.add(mariaCanovas);
        listaPersonas.add(victorMulet);
        listaPersonas.add(marcosTorres);
    }

    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        ArrayList<Plaza> listaPlazas = new ArrayList<>();

        simularPlazas(listaPersonas, listaPlazas);
        adjudicarPlaza(listaPlazas, listaPersonas);
        mostrarPlazas(listaPlazas);
    }
}
