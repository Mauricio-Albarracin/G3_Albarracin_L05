public class FourthExcercise {
    public static <T> int contarNodos(Node<T> head) {
        int contador = 0;
        Node<T> actual = head;
    
        while (actual != null) {
            contador++;                // Aumenta el contador por cada nodo
            actual = actual.getNext(); // Avanza al siguiente nodo
        }
    
        return contador; // Retorna el total de nodos
    }
    
    public static void main(String[] args) {
        // Crear una lista: 5 - 10 - 15
        Node<Integer> nodo3 = new Node<>(15, null);
        Node<Integer> nodo2 = new Node<>(10, nodo3);
        Node<Integer> nodo1 = new Node<>(5, nodo2);
        Node<Integer> head = nodo1; // Apunta al primer nodo

        // Contar nodos en la lista
        int cantidad = contarNodos(head); // Llama a la función para contar nodos
        System.out.println("Cantidad de nodos: " + cantidad); // Muestra el resultado
    }
}
