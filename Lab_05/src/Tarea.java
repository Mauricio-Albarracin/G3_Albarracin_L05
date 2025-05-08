public class Tarea {
    private String descripcion;
    private int prioridad; // Cuanto menor el número, mayor la prioridad

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return descripcion + " (Prioridad: " + prioridad + ")";
    }

    @Override
    public boolean equals(Object o) {
        // Compara si el objeto actual y el recibido son exactamente el mismo en memoria
        if (this == o) return true;

        // Verifica que el objeto recibido sea una instancia de Tarea
        if (!(o instanceof Tarea)) return false;

        // Convierte el objeto recibido a tipo Tarea para comparar sus atributos
        Tarea otra = (Tarea) o;

        // Compara si las descripciones son iguales y las prioridades son iguales
        return this.descripcion.equals(otra.descripcion) && this.prioridad == otra.prioridad;
    }
}
