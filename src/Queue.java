public class Queue {
    int maxSize;
    int front;
    int rear;
    int arr[];

    Queue(int s){
        maxSize=s;
        front=0;
        rear=-1;
        arr=new int[s];
    }
    boolean isfull(){
        return(rear+1==maxSize);
    }
    void enQueue(int x){
        if(isfull()){
            System.out.println("Queue is full");
        }else{
            rear++;
            arr[rear]=x;
        }
    }
    boolean isEmpty(){
        return (front>rear);
    }
    void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            front++;
        }
    }

    void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Queue queueObj= new Queue(5);
        // Enqueue elements
        queueObj.enQueue(10);
        queueObj.enQueue(20);
        queueObj.enQueue(30);
        queueObj.enQueue(40);
        queueObj.printQueue();

        // Dequeue elements
        queueObj.deQueue();
        queueObj.printQueue();
        queueObj.enQueue(70);
        queueObj.printQueue();

    }

}
