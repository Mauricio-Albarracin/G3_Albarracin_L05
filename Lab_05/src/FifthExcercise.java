public class FifthExcercise {
    public static <T> boolean sonIguales(Node<T> lista1, Node<T> lista2) {
        while (lista1 != null && lista2 != null) {
            if (!lista1.getData().equals(lista2.getData())) { // Compara los datos de ambos nodos
                return false;
            }
            lista1 = lista1.getNext();
            lista2 = lista2.getNext();
        }
    
        return lista1 == null && lista2 == null; // Son iguales si ambas listas llegan al final al mismo tiempo
    }
    
    public static void main(String[] args) {
        // Crear la primera lista: 1 - 2 - 76
        Node<Integer> lista1_nodo3 = new Node<>(76, null);
        Node<Integer> lista1_nodo2 = new Node<>(2, lista1_nodo3);
        Node<Integer> lista1_nodo1 = new Node<>(1, lista1_nodo2);
        Node<Integer> lista1 = lista1_nodo1;

        // Crear la segunda lista: 1 - 2 - 3
        Node<Integer> lista2_nodo3 = new Node<>(3, null);
        Node<Integer> lista2_nodo2 = new Node<>(2, lista2_nodo3);
        Node<Integer> lista2_nodo1 = new Node<>(1, lista2_nodo2);
        Node<Integer> lista2 = lista2_nodo1;

        // Comparar ambas listas
        boolean resultado = sonIguales(lista1, lista2); // Llama al método para comparar nodos
        System.out.println("¿Las listas son iguales? " + resultado); // Muestra true si son iguales
    }
}
