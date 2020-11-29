import java.util.Iterator;

class MyLinkedList<T> implements Iterable<Object>{
    private Node<Object> head;
    private Node<Object> tail;
    private int size;

    @Override
    public Iterator<Object> iterator() {
        MyLinkedList myLinkedList = this;
        return new Iterator<Object>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size && index >= 0;
            }

            @Override
            public Object next() {
                if (!hasNext()) throw new UnsupportedOperationException();
                return myLinkedList.get(index++);
            }
        };
    }

    static class Node<T> {
        T val;
        Node<Object> next;
        Node<Object> prev;
        public Node(T val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.size = 0;
    }

    public Object get(int index) {
        if (index >= size) {
            return null;
        }
        Node<Object> p = this.head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        if (p == null) {
            return -1;
        }
        return p.val;
    }

    public void addAtHead(T val) {
        Node<Object> addedValue = new Node<>(val);
        if (size == 0){
            this.head = addedValue;
            this.tail = addedValue;
        }
        addedValue.next = head;
        this.head.prev = addedValue;
        this.head = addedValue;
        size++;
    }

    public void addAtTail(T val) {
        Node current = new Node(val);
        if (size == 0) {
            this.head = current;
        }
        else {
            current.prev = tail;
            tail.next = current;
        }
        this.tail = current;
        size++;
    }

    public void addAtIndex(int index, T val) {
        if (index == 0) {
            this.addAtHead(val);
        }
        else if (index == size) {
            this.addAtTail(val);
        }
        else if (index >= 0 && index < size) {
            Node<Object> p = this.head;
            for (int i = 0; i < index; i++) {
                if (p == null) {
                    return;
                }
                p = p.next;
            }
            Node<Object> addedValue = new Node<Object>(val);
            addedValue.prev = p.prev;
            addedValue.next = p;
            p.prev = addedValue;
            addedValue.prev.next = addedValue;
            p = addedValue;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        Node<Object> p = this.head;
        int count = 0;
        if (index == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            }
            else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
        else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        else if (index > 0 && index < size - 1) {
            while (p != null) {
                if (count == index) {
                    p.prev.next = p.next;
                    p.next.prev = p.prev;
                    size--;
                    return;
                }
                count++;
                p = p.next;
            }
        }
    }
}
