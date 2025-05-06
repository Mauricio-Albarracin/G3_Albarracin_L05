public class FirstExcersice {
    public static <T> boolean buscarElemento(Node<T> head, T valor) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.getData().equals(valor)) { // Compara el valor del nodo actual con el buscado
            return true;
        }
        actual = actual.getNext(); // Avanza al siguiente nodo
    }
    return false; // No se encontró el valor
    }
    public static void main(String[] args) {
        // Crear una lista: 10 -> 20 -> 30
        Node<Integer> nodo3 = new Node<>(30, null);
        Node<Integer> nodo2 = new Node<>(20, nodo3);
        Node<Integer> nodo1 = new Node<>(10, nodo2);
        Node<Integer> head = nodo1;

        // Buscar si 20 está en la lista
        boolean resultado = buscarElemento(head, 20);
        System.out.println("¿Está el valor 20? " + resultado); // true

        // Buscar si 50 está en la lista
        boolean resultado2 = buscarElemento(head, 50);
        System.out.println("¿Está el valor 50? " + resultado2); // false
    }
}
