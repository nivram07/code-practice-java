package code.practice.java.datastructure;

import java.util.Arrays;

public class HeapPractice {


    public static void main(String args[]) {

        MinHeap minHeap = new MinHeap();
        minHeap.add(3);
        minHeap.add(7);
        minHeap.add(2);
        minHeap.add(1);
        minHeap.add(4);
        minHeap.add(6);
        minHeap.add(5);

        minHeap.print();

//        int firstElement = minHeap.poll();
//        System.out.println("First element: " + firstElement);
//        minHeap.print();

//        minHeap.removeItem(2);
//        minHeap.print();

        minHeap.print();
    }

    public static class MinHeap {

        private Integer[] heap;
        private int cap = 5;
        private int size = 0;

        public MinHeap() {
            heap = new Integer[cap];
        }

        private void expandCapacity() {
            heap = Arrays.copyOf(heap, cap * 2);
            cap = cap * 2;
            System.out.println("Heap cap is now: " + cap);
        }

        private int getParentIndex(int index) {
            if (index <= 0) return -1;
            return (index - 1)/2;
        }

        private int getLeftChildIndex(int index) {
            return index*2 + 1;
        }

        private int getRightChildIndex(int index) {
            return index*2 + 2;
        }

        private boolean hasLeftChild(int index) {
            return (index*2 + 1 < size) && heap[index*2 +1] != null;
        }

        private boolean hasRightChild(int index) {
            return (index*2 + 2 < size) && heap[index*2 +2] != null;
        }

        private void swap(int firstIndex, int secondIndex) {
            int temp = heap[firstIndex];
            heap[firstIndex] = heap[secondIndex];
            heap[secondIndex] = temp;
        }

        public void add(int num) {
            if (size == cap) {
                expandCapacity();
            }

            heap[size] = num;
            size++;
            heapifyUp(size - 1);
        }

        public void heapifyUp(int index) {
            int currentIndex = index;
            int parentIndex = getParentIndex(currentIndex);
            while (parentIndex >= 0 && currentIndex > 0) {
                parentIndex = getParentIndex(currentIndex);
                if (heap[parentIndex] < heap[currentIndex]) {
                    break;
                }
                swap(parentIndex, currentIndex);
                currentIndex = parentIndex;
            }
        }

        public void heapifyDown(int index) {
            int currentIndex = index;
            while (hasLeftChild(currentIndex)) {
                int smallerChildIndex = getLeftChildIndex(currentIndex);
                if (hasRightChild(currentIndex)) {
                    smallerChildIndex = heap[getRightChildIndex(currentIndex)] < heap[smallerChildIndex]
                            ? getRightChildIndex(currentIndex) : smallerChildIndex;
                }

                if (heap[currentIndex] > heap[smallerChildIndex]) {
                    swap(currentIndex, smallerChildIndex);
                    currentIndex = smallerChildIndex;
                } else {
                    break;
                }
            }
        }

        public int poll() {
            int root = heap[0];
            heap[0] = heap[size - 1];
            heap[size -1] = null;
            size--;
            heapifyDown(0);
            return root;
        }

        public void removeItem(int index) {
            if (index < size) {
                swap(index, size - 1);
                heap[size - 1] = null;
                size--;
                heapifyDown(index);
            }
        }

        public void print() {
            System.out.println();
            Arrays.stream(heap).filter(num -> num != null).forEach(num -> System.out.print(num + " "));
        }

    }

}
