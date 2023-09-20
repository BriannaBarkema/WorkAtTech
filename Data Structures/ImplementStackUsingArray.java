/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Implements stack using array
 * Implements methods int size(), boolean isEmpty(), int top(),
 * void push(int element), void pop()
 */
class Stack {
    private int[] myArray;
    private int size;

    public Stack (int capacity) {
        myArray = new int [capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int top() {
        if(this.isEmpty()){
            return -1;
        }
        return myArray[size-1];
    }

    public void push(int element) {
        myArray[size] = element;
        size++;
    }

    public void pop() {
        size--;
    }
}
