public class Node<E> {

    private Node nextNode;
    private Node beforeNode;
    private E data;


    public Node(E data) {
        this.data = data;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<E> getBeforeNode() {
        return beforeNode;
    }

    public void setBeforeNode(Node<E> beforeNode) {
        this.beforeNode = beforeNode;
    }

    public E getData() {
        return data;
    }


}
