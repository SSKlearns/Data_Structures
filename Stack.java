/**
 * Stack
 */
public class Stack {

    static int max_Size = 10000;        //Setting max size of the stack as 10000
    static int top;                     //The variable used to iterate through the stack
    int[] stackArr;                     //The array used as the stack

    //Creating stack constructor
    Stack (int maxSize){
        if (maxSize <= max_Size){
            max_Size = maxSize;
        }
        else {
            System.out.println("Stack size exceeds stack capacity");
        }
        top = -1;
        stackArr = new int[max_Size];
    }

    //Function to check if the stack is empty
    static boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    //Function to check if the stack is full
    static boolean isFull() {
        if (top >= max_Size - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    //Function to push values into the stack
    void push(int val) {
        if (!Stack.isFull()) {
            top ++;
            stackArr[top] = val;
        }
        else {
            System.out.println("Stack overflow");
        }
    }

    //Function to pop values from a stack
    int pop() {
        if (Stack.isEmpty()){
            System.out.println("Stack is empty. Program ending");
            System.exit(1);
            return 0;
        }
        else {
            int returnVal = stackArr[top];
            top --;
            return returnVal;
        }
    }

    //Function to print the entire stack
    void print() {
        if (!Stack.isEmpty()) {
            for (int i = 0; i <= top; i ++) {
                System.out.println(stackArr[i]);
            }
        }
        else {
            System.out.println("Stack is Empty");
        }
    }
}