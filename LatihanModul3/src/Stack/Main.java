package Stack;
public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push("a");
        theStack.push("b");
        theStack.push("c");
       // theStack.push(100);

        while(!theStack.isEmpty()){
            String value = theStack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println("");
    }
}
