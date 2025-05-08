public class Main {
    public static void main(String[] args) {
        // 1. Crear una instancia de GestorDeTareas<Tarea>
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        // Lista genérica para tareas completadas (sin usar ArrayList ni LinkedList)
        ListaEnlazada<Tarea> tareasCompletadas = new ListaEnlazada<>();

        // 2. Agregar tareas
        gestor.agregarTarea(new Tarea("Enviar informe", 2));
        gestor.agregarTarea(new Tarea("Revisar correos", 4));
        gestor.agregarTarea(new Tarea("Actualizar sistema", 1));

        // 3. Eliminar alguna tarea
        gestor.eliminarTarea(new Tarea("Revisar correos", 4));

        // 4. Imprimir todas las tareas actuales
        System.out.println("Tareas pendientes:");
        gestor.imprimirTareas();

        // 5. Verificar si cierta tarea existe
        boolean existe = gestor.contieneTarea(new Tarea("Enviar informe", 2));
        System.out.println("\n¿Existe la tarea 'Enviar informe'? " + (existe ? "Sí" : "No"));

        // 6. Invertir la lista
        gestor.invertirTareas();
        System.out.println("\nTareas invertidas:");
        gestor.imprimirTareas();

        // 7. Transferir tarea completada a lista de tareas completadas
        Tarea tareaCompleta = new Tarea("Actualizar sistema", 1);
        if (gestor.eliminarTarea(tareaCompleta)) {
            tareasCompletadas.agregar(tareaCompleta);
        }

        // 8. Mostrar ambas listas
        System.out.println("\nTareas pendientes actualizadas:");
        gestor.imprimirTareas();

        System.out.println("\nTareas completadas:");
        tareasCompletadas.imprimir();

        // Obtener tarea más prioritaria
        Tarea masPrioritaria = gestor.obtenerTareaMasPrioritaria();
        System.out.println("\nTarea más prioritaria:");
        System.out.println(masPrioritaria != null ? masPrioritaria : "No hay tareas pendientes.");
    }
}
