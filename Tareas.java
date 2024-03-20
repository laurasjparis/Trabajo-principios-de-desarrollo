
import java.util.ArrayList;
import java.util.List;

public class Tareas {

    private List<Tarea> tareas = new ArrayList<>();

    public Tareas() {

    }


    public void agregarTareas(Tarea tarea){
        tareas.add(tarea);
    }

    public int obtenerCantidadTareas() {
        return tareas.size();
    }

    public Tarea buscarTarea(String nombre){
        Tarea tareaEncontrada = null;
        for (Tarea tarea : this.tareas) {
            if (tarea.getNombre().equals(nombre)){
                tareaEncontrada = tarea;
                break;
            }
        }
        return tareaEncontrada;
    }

}

