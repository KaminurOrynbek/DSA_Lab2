package week6Laboratory2;

import java.util.NoSuchElementException;

public class MyQueue<T extends Comparable<T>> {
    private final MyLinkedList<T> list = new MyLinkedList<T>(); // Use MyLinkedList to handle the elements

    // Enqueue an element at the end of the queue
    public void enqueue(T element) {
        list.addLast(element);
    }

    // Dequeue an element from the front of the queue

}
