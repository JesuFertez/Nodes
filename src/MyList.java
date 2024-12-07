public class MyList<E> implements MyListI<E> {

    private Node<E> first;
    // private E data; No usé esta variable
    private int cont = 0;

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> aux = first;

        while (aux != null) {
            if (aux.getData().equals(o)) {
                return true;
            } else {
                aux = aux.getNextNode();
            }
        }
        return false;
    }


    @Override
    public boolean add(Object o) {
        Node<E> newNode = (Node<E>) new Node<>(o);
        Node<E> aux;

        if (isEmpty()) {
            first = newNode;
            cont++;
            return true;
        } else {
            aux = first;
            while (aux.getNextNode() != null && aux.getData() != o) {
                aux = aux.getNextNode();
            }

            if (aux.getData() == o) {
                System.out.println("Duplicate data");
            } else {
                aux.setNextNode(newNode);
                aux.setBeforeNode(aux);
                cont++;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        if (!isEmpty()) first = null;
        cont = 0;
    }

    @Override
    public E get(int index) {
        Node<E> aux = first;
      for(int i = 0; i< cont; i++){
          aux = aux.getNextNode();
          if(aux != null && i == index -1){
              return aux.getData();
          }
      }
        return message();
    }
        @Override
        public boolean remove ( int index){
            Node<E> aux = first;
            int count = 0;
            boolean response;

            if (first != null && index <= cont) {
                while (count < index - 1 && aux.getNextNode() != null) {
                    aux = aux.getNextNode();
                    count++;
                }
                System.out.println(aux.getData());
                aux.setNextNode(aux.getNextNode().getNextNode());
                response = true;
                cont--;
            } else {
                System.out.println("Out of range");
                response = false;
            }
            return response;
        }

    public E message(){
        System.out.println("Not Found");
        return null;
    }

}

