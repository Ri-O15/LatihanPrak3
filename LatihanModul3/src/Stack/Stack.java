package Stack;
public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int a){
        maxSize = 5;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String J){
        stackArray[++top] = J;
    }

    public String pop(){
        return stackArray[top--];
    }

    public String peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return(top == -1);
    }

    public boolean isFull(){
        return(top == maxSize-1);
    }
}
