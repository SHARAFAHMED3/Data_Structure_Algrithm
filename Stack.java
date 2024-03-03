//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stack {
    int arr[];
    int maxSize;
    int top=-1;
    Stack(int S){
     arr= new int[S];
     maxSize=S;
    }
    Boolean isfull(){
        return (top+1 ==maxSize);
    }
    // push value in stack
    void push(int x){
        if(isfull()){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=x;
//          System.out.println("Value Pushed: "+x);
        }
    }
    boolean isEmpty(){
        return (top==-1);
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            top--;
        }
    }
    void newStack(){
        for(int i=0;i<=top;i++){
            System.out.println("Stack value"+arr[i]);
        }
    }
    public static void main(String[] args) {

        Stack myStack= new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.pop();
        myStack.pop();
        myStack.newStack();

    }
}