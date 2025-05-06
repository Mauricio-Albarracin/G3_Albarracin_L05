public class SixthExcercise {
    public static <T> Node<T> concatenarListas(Node<T> lista1, Node<T> lista2) {
        if (lista1 == null) return lista2; // Si la primera lista está vacía, retorna la segunda
    
        Node<T> actual = lista1;
        while (actual.getNext() != null) {
            actual = actual.getNext(); // Recorre hasta el final de la primera lista
        }
    
        actual.setNext(lista2); // Conecta la segunda lista al final de la primera
        return lista1;
    }

    public static void main(String[] args) {
        // Crear la primera lista: 1 - 2
        Node<Integer> nodo2_lista1 = new Node<>(2, null);
        Node<Integer> nodo1_lista1 = new Node<>(1, nodo2_lista1);
        Node<Integer> lista1 = nodo1_lista1;

        // Crear la segunda lista: 3 - 4
        Node<Integer> nodo2_lista2 = new Node<>(4, null);
        Node<Integer> nodo1_lista2 = new Node<>(3, nodo2_lista2);
        Node<Integer> lista2 = nodo1_lista2;

        // Concatenar las listas
        Node<Integer> resultado = concatenarListas(lista1, lista2);

        // Imprimir la lista concatenada
        System.out.print("Lista concatenada: ");
        Node<Integer> actual = resultado;
        while (actual != null) {
            System.out.print(actual.getData() + " - "); // Imprime cada valor de la lista
            actual = actual.getNext();               // Avanza al siguiente nodo
        }
        System.out.println("null"); // Salto de línea final
    }
}
