public class ThirdExercise {
    public static <T> Node<T> insertarAlFinal(Node<T> head, T valor) {
        Node<T> nuevo = new Node<>(valor, null); // Crea un nuevo nodo con el valor
    
        if (head == null) {
            return nuevo; // Si la lista está vacía, el nuevo nodo es la cabeza
        }
    
        Node<T> actual = head;
        while (actual.getNext() != null) {
            actual = actual.getNext(); // Recorre hasta el último nodo
        }
    
        actual.setNext(nuevo); // Enlaza el nuevo nodo al final
        return head;
    }
    public static void main(String[] args) {
        // Crear una lista: 10 - 20 - 30
        Node<Integer> nodo3 = new Node<>(30, null);
        Node<Integer> nodo2 = new Node<>(20, nodo3);
        Node<Integer> nodo1 = new Node<>(10, nodo2);
        Node<Integer> head = nodo1;

        // Agregar nodo nuevo al final
        head = insertarAlFinal(head, 100); // Inserta el número 100 al final

         // Imprimir lista actualizada
         Node<Integer> actual = head;
         while (actual != null) {
            System.out.print(actual.getData() + " - ");
            actual = actual.getNext();
        }
        System.out.println("null");
    }    
}
