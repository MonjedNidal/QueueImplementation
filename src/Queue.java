public class Queue {

    private String[] elements;
    private int front;
    private int rear;

    public Queue(int length) {
        elements = new String[length];
        front = rear = 0;
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public boolean isFull(){
        return rear== elements.length;
    }

    public void add(String value){//circular add
        if (!isFull()){
            elements[rear++] = value;
        }else {
            if (front == 0 || front == 1){
                System.out.println("Queue is full.");
            }else{
                rear = elements.length%rear;
                if (rear + 1 != front){
                    elements[rear++] = value;
                }
            }
        }
    }

    public String delete(){
        if (!isEmpty()){
            return elements[front++];
        }else {
            System.out.println("Queue is empty.");
            return "";
        }
    }

    String peek(){
        if (!isEmpty()){
            return elements[front];
        }else {
            System.out.println("Queue is empty.");
            return "";
        }
    }

//    public void print(){
//        for (String a:
//             elements) {
//            System.out.println(a);
//        }
//    }

}
