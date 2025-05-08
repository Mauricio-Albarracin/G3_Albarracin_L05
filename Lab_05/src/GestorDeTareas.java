// Clase genérica para gestionar tareas pendientes
public class GestorDeTareas<T> {
    // Lista enlazada personalizada que almacena las tareas pendientes
    private ListaEnlazada<T> tareasPendientes = new ListaEnlazada<>();

    // Agrega una tarea al final de la lista enlazada
    public void agregarTarea(T tarea) {
        tareasPendientes.agregar(tarea);
    }

    // Elimina una tarea específica si existe en la lista
    public boolean eliminarTarea(T tarea) {
        return tareasPendientes.eliminar(tarea);
    }

    // Verifica si una tarea está contenida en la lista
    public boolean contieneTarea(T tarea) {
        return tareasPendientes.contiene(tarea);
    }

    // Imprime todas las tareas pendientes
    public void imprimirTareas() {
        tareasPendientes.imprimir();
    }

    // Devuelve la cantidad de tareas pendientes
    public int contarTareas() {
        return tareasPendientes.contar();
    }

    // Invierte el orden de las tareas en la lista enlazada
    public void invertirTareas() {
        tareasPendientes.invertir();
    }

    // Devuelve la tarea con mayor prioridad (si T es instancia de Tarea)
    public T obtenerTareaMasPrioritaria() {
        if (tareasPendientes.getCabeza() == null) return null;

        Nodo_act<T> actual = tareasPendientes.getCabeza();
        T tareaMasPrioritaria = actual.dat;

        // Recorre la lista comparando prioridades (menor número = mayor prioridad)
        while (actual != null) {
            if (actual.dat instanceof Tarea) {
                Tarea actualT = (Tarea) actual.dat;
                Tarea mejorT = (Tarea) tareaMasPrioritaria;

                if (actualT.getPrioridad() < mejorT.getPrioridad()) {
                    tareaMasPrioritaria = actual.dat;
                }
            }
            actual = actual.siguiente;
        }

        return tareaMasPrioritaria;
    }
}
