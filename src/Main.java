public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add("1");
        q.add("2");
        q.add("3");
        q.add("4");
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.peek());
        q.add("5");
    }
}
