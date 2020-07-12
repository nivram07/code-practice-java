package code.practice.datastructure;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU {
    public class Node {
        private int id;

        public Node(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null)
                return false;
            if (o == this)
                return true;
            if (o instanceof Node) {
                Node other = (Node)o;
                if (other.id == this.id)
                    return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.id;
        }

        @Override
        public String toString() {
            return this.id + "";
        }
    }

    private Map<Integer, Node> map = new HashMap<>();
    private Deque<Node> deque = new LinkedList<>();
    private int capacity = 1;

    public LRU(int capacity) {
        if (capacity >= 1)
            this.capacity = capacity;
        else
            throw new IllegalStateException("Cannot have capacity below 1.");
    }

    public int getSize() {
        return deque.size();
    }

    public int getCapacity()  {
        return this.capacity;
    }

    public void offer(int id) {
        offer(new Node(id));
    }

    public void offer(Node node) {
        if (node == null)
            return;

        if (map.containsKey(node.id)) {
            deque.remove(node);
        } else if (deque.size() < capacity) {
            map.put(node.id, node);
        } else {
            Node current = deque.poll();
            if (current != null)
                map.remove(current.getId());
            map.put(node.id, node);
        }
        deque.add(node);
    }

    public Node get(int id) {
        if (map.containsKey(id)) {
            Node current = map.get(id);
            deque.remove(current);
            deque.add(current);
            return current;
        }
        return null;
    }

    public void remove(int id) {
        if (map.containsKey(id)) {
            Node node = map.get(id);
            map.remove(id);
            deque.remove(node);
        }
    }

    public void print() {
       if (deque.size() > 0) {
           for (Node node : deque)
               System.out.format("%s ", node.toString());
           System.out.format("\n");
       }
    }

    private void verify() {
        if (map.size() != deque.size())
            throw new IllegalStateException("Map and deque have different sizes!\n");
    }
}
