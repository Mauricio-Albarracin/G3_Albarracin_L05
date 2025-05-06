public class SecondExercise {
    public static <T> Node<T> invertirLista(Node<T> head) {
        Node<T> prev = null;
        Node<T> actual = head;
    
        while (actual != null) {
            Node<T> siguiente = actual.getNext(); // Guarda el siguiente nodo
            actual.setNext(prev);                 // Invierte el enlace del nodo actual
            prev = actual;                        // Mueve prev al nodo actual
            actual = siguiente;                   // Continúa al siguiente nodo original
        }
    
        return prev; // Nueva cabeza de la lista
    }

    public static void imprimirLista(Node<Integer> head) {
        Node<Integer> actual = head;
        while (actual != null) {
            System.out.print(actual.getData() + " - ");
            actual = actual.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Crear la lista: 10 - 20 - 30
        Node<Integer> nodo3 = new Node<>(30, null);
        Node<Integer> nodo2 = new Node<>(20, nodo3);
        Node<Integer> nodo1 = new Node<>(10, nodo2);
        Node<Integer> head = nodo1;

        System.out.println("Lista original:");
        imprimirLista(head);

        // Invertir la lista
        Node<Integer> invertida = invertirLista(head);

        System.out.println("Lista invertida:");
        imprimirLista(invertida);
    }
}
