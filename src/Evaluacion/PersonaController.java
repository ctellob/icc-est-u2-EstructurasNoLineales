package Evaluacion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {
    // Filtrar de todas las personas que llegan, las que son superiores al umbral
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral) {
        Set<Persona> personasFiltradas = new TreeSet<>(
                (p1, p2) -> {
                    int compE = Integer.compare(p1.getEdad(), p2.getEdad());
                    if (compE != 0) {
                        return compE;
                    }
                    int compN = p1.getNombre().compareToIgnoreCase(p2.getNombre());
                    return compN;
                });
        return null;
    }

    public Map<String, Set<String>> agruparPorEdad(List<Persona> personas, int edadUmbral) {
        // Personas agrupadas por edad
        String nombre = "Juan Perez";
        String pNombre = nombre.split(" ")[0];
        // Devuelve un Arreglo de String
        // ["Juan","Perez"]

        return null;
    }
}
