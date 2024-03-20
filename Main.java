import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args, boolean completada) {
        Tareas tareas = new Tareas();

        String op;
        do {
            System.out.println("\t\t\t\t\t\t\tBienvenido a calendapp\n\n Presiona cualquier tecla para ver las tareas existentes");
            in.nextLine();

            if (tareas.obtenerCantidadTareas() == 0) {
                System.out.println("Aún no se han agregado tareas.");
            } else {
                System.out.println("Tareas existentes:");
                // Aquí podrías imprimir las tareas existentes si lo deseas
            }

            System.out.println("¿Deseas agregar una nueva tarea? (s/n)");
            String respuesta = in.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre de la nueva tarea:");
                String nombre = in.nextLine();
                tareas.agregarTareas(new Tarea(nombre,completada));
            }

            System.out.println("¿Deseas salir? (s/n)");
            op= in.nextLine();
        } while (op.equalsIgnoreCase("n"));
    }
}