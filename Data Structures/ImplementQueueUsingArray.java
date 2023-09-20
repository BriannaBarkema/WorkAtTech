/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Implements queue using array
 * Implements these methods: int size(), boolean is Empty(), int front(),
 * int back(), void push(int element), void pop()
 */
class Queue {
    private int[] myArray;
    private int size;

    Queue (int capacity) {
        myArray = new int [capacity];
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    int front() {
        if(this.isEmpty()){
            return -1;
        }
        return myArray[0];
    }

    int back() {
        if(this.isEmpty()){
            return -1;
        }
        return myArray[size-1];
    }

    void push(int element) {
        myArray[size] = element;
        size++;
    }

    void pop() {
        for(int i = 0; i <= size; i++){
            myArray[i] = myArray[i+1];
        }
        size--;
    }
}
