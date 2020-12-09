import java.util.HashMap;

class LRUCache<K, V> {
    class MyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        class Node {
            K val;
            Node next;
            Node prev;
            public Node(K val) {
                this.val = val;
            }
        }

        public MyLinkedList() {
            this.size = 0;
        }

        public Object get(int index) {
            if (index >= size) {
                return -1;
            }
            Node p = this.head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            if (p == null) {
                return -1;
            }
            return p.val;
        }

        public void addAtHead(K val) {
            Node addedValue = new Node(val);
            if (size == 0){
                this.head = addedValue;
                this.tail = addedValue;
                size++;
                return;
            }
            addedValue.next = head;
            this.head.prev = addedValue;
            this.head = addedValue;
            size++;
        }

        public void addAtTail(K val) {
            Node current = new Node(val);
            if (size == 0) {
                this.head = current;
                this.tail = current;
                size++;
                return;
            }
            current.prev = tail;
            tail.next = current;
            tail = current;
            size++;
        }

        public void addAtIndex(int index, K val) {
            if (index == 0) {
                this.addAtHead(val);
            }
            else if (index == size) {
                this.addAtTail(val);
            }
            else if (index >= 0 && index < size) {
                Node p = this.head;
                for (int i = 0; i < index; i++) {
                    if (p == null) {
                        return;
                    }
                    p = p.next;
                }
                Node addedValue = new Node(val);
                addedValue.prev = p.prev;
                addedValue.next = p;
                p.prev = addedValue;
                addedValue.prev.next = addedValue;
                p = addedValue;
                size++;
            }
        }

        public void deleteAtIndex(int index) {
            Node p = this.head;
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

        int indexOf(K val) {
            Node p = this.head;
            for (int i = 0; i < this.size; i++) {
                if (p.val == val) {
                    return i;
                }
                p = p.next;
            }
            return -1;
        }
        void remove(K val) {
            if (this.head.val == val) {
                if (size == 1) {
                    head = null;
                    tail = null;
                }
                else {
                    head.next.prev = null;
                    head = head.next;
                }
                size--;
            }
            else if (this.tail.val == val) {
                tail.prev.next = null;
                tail = tail.prev;
                size--;
            }
            else {
                Node p = this.head.next;
                while (p != null) {
                    if (p.val == val) {
                        p.prev.next = p.next;
                        p.next.prev = p.prev;
                        size--;
                        return;
                    }
                    p = p.next;
                }
            }
        }
    }
    private final int capacity;
    private HashMap<K, V> map;
    private MyLinkedList keyList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.keyList = new MyLinkedList();
    }

    public Object get(K key) {
        if (keyList.indexOf(key) == -1)
            return -1;
        V value = map.get(key);
        keyList.remove(key);
        keyList.addAtTail(key);
        return value;
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            keyList.remove(key);
        }
        keyList.addAtTail(key);
        if (keyList.size > capacity) {
            keyList.deleteAtIndex(0);
        }
        map.put(key, value);
    }
}
