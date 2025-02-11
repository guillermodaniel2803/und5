package TEMA5;
    
import java.util.ArrayList;

class Incidencia {
    private static int contador = 0; // Contador para asignar códigos automáticamente
    private int codigo;
    private int puesto;
    private String estado;
    private String descripcion;

    public Incidencia(int puesto) {
        this.codigo = ++contador;
        this.puesto = puesto;
        this.estado = "pendiente";
        this.descripcion = "";
    }

    public void resolver(String descripcion) {
        this.estado = "resuelta";
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Incidencia " + codigo + " - Puesto: " + puesto + ", Estado: " + estado + (descripcion.isEmpty() ? "" : ", Descripción: " + descripcion);
    }
}

public class GestionIncidencias {
    public static void main(String[] args) {
        ArrayList<Incidencia> incidencias = new ArrayList<>();

        // Crear algunas incidencias de ejemplo
        incidencias.add(new Incidencia(105));
        incidencias.add(new Incidencia(14));
        incidencias.add(new Incidencia(7));

        // Resolver una incidencia
        incidencias.get(1).resolver("El teclado no funciona.");

        // Mostrar todas las incidencias
        for (Incidencia incidencia : incidencias) {
            System.out.println(incidencia);
        }
    }
}

