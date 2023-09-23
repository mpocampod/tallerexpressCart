
//Yaritzay Suarez y Paulina Ocampo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println(
                "Bienvenido a la aplicación de gestión de tareas. \n Por favor, seleccione una opción para continuar");
        int opcion = 0;
        do {
            System.out.println("1. Ingresar una tarea");
            System.out.println("2. Completar una tarea");
            System.out.println("3. Listar las tareas pendientes");
            System.out.println("4. Listar las tareas completas");
            System.out.println("5. Listar todas las tareas");
            System.out.println("6. Eliminar una tarea");
            System.out.println("7. Actualizar una tarea");
            System.out.println("8. Ver detalle de tarea");
            System.out.println("9. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea");
                    String tarea = leer.next();
                    TodoList.agregarTarea(tarea);
                    System.out.println("Tarea guardada con éxito" + "\n");
                    break;
                case 2:
                    String listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);

                    System.out.println("Ingrese el número de la tarea que va a completar");
                    int numero = leer.nextInt();
                    System.out.println("¿Cuántos minutos se tomó para realizarla?");
                    int minutos = leer.nextInt();
                    TodoList.completarTarea(numero, minutos);
                    System.out.println("Felicitaciones por completar la tarea" + "\n");

                    break;
                case 3:

                    System.out.println("Estas son sus tareas pendientes" + "\n");
                    String listaTareasPendientes = TodoList.listarTareasPendientes();
                    System.out.println(listaTareasPendientes);

                    break;
                case 4:

                    System.out.println("Estas son sus tareas completadas" + "\n");
                    String listaTareasCompletadas = TodoList.listarTareasCompletadas();
                    System.out.println(listaTareasCompletadas);

                    break;
                case 5:

                    System.out.println("Estas son todas sus tareas" + "\n");
                    listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);

                    break;
                case 6:
                    listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);
                    System.out.println("¿Qué número de tarea desea eliminar? ");
                    numero = leer.nextInt();
                    Boolean resultado = TodoList.eliminarTarea(numero);
                    if (resultado) {
                        System.out.println("Eliminada con éxito: " + resultado + "\n");
                    } else {
                        System.out.println("Esa tarea no está por lo tanto no se pudo eliminar " + "\n");
                    }

                    break;
                case 7:
                    listaTareas = TodoList.listarTareas();
                    System.out.println(listaTareas);
                    System.out.println("¿Qué número de tarea desea actualizar? ");
                    numero = leer.nextInt();
                    listaTareasCompletadas = TodoList.listarTareasCompletadas();
                    if (numero <= TodoList.listaDeTareas.size() && (listaTareas != listaTareasCompletadas)) {
                        System.out.println("¿Qué descripción va a actualizar? ");
                        String descripcion = leer.next();
                        TodoList.actualizarTarea(numero, descripcion);
                        System.out.println("Actualizado con éxito" + "\n");
                        listaTareas = TodoList.listarTareas();
                        System.out.println(listaTareas);
                    } else {
                        System.out.println(
                                "Ingrese un número de tareas que aparezca en la lista y no este completada" + "\n");
                    }

                    break;
                case 8:
                    listaTareas = TodoList.listarTareas();
                    listaTareasCompletadas = TodoList.listarTareasCompletadas();
                    if (listaTareas != listaTareasCompletadas) {
                        listaTareas = TodoList.listarTareas();
                        System.out.println(listaTareas);
                        System.out.println("¿Qué número de tarea desea ver con detalle? ");
                        numero = leer.nextInt();
                        listaTareas = TodoList.verDetalleTarea(numero);
                        System.out.println(listaTareas);
                    } else {
                        System.out.println("Primero tiene que ingresar la tarea" + "\n");
                    }
                    break;
                case 9:
                    // System.exit(0);
                    break;
            }

        } while (opcion != 9);
    }
}