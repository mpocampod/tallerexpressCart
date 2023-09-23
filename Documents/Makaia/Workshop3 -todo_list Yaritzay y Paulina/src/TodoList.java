
//Yaritzay Suarez y Paulina Ocampo
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public static List<String[]> listaDeTareas = new ArrayList<>();

    public static void agregarTarea(String descripcionTarea) {
        // arr[i] = valor
        String[] tarea = new String[3];
        tarea[0] = descripcionTarea;
        tarea[1] = String.valueOf(false);
        tarea[2] = String.valueOf(0);
        listaDeTareas.add(tarea);
    }

    public static String listarTareas() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++) {
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
        }
        return listaTareas;
    }

    public static String listarTareasPendientes() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++) {
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if (!estaTareaCompleta) {
                listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
            }
        }
        return listaTareas;
    }

    public static void completarTarea(int i, int minutos) {
        String listaTareas = "";

        String[] tarea = listaDeTareas.get(i);
        tarea[1] = String.valueOf(true);
        tarea[2] = String.valueOf(minutos);
        boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
        if (estaTareaCompleta) {
            listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
        }
    }

    public static String listarTareasCompletadas() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++) {
            // vec[i] -> lista.get(i)
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if (estaTareaCompleta) {
                listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
            }
        }
        return listaTareas;
    }

    public static boolean eliminarTarea(int i) {
        String[] tarea = listaDeTareas.get(i);
        if (tarea != null) {
            listaDeTareas.remove(tarea);
            return true;
        }
        return false;

    }

    public static void actualizarTarea(int i, String descripcion) {
        String listaTareas = "";
        String[] tarea = listaDeTareas.get(i);
        tarea[0] = descripcion;
        tarea[1] = String.valueOf(false);
        listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";

    }

    public static String verDetalleTarea(int i) {
        String listaTareas = "";
        String[] tarea = listaDeTareas.get(i);
        listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
        return listaTareas;
    }

}
