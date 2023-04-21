import java.util.ArrayDeque;

public class ex2 {

    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
        linkedList.addLast(element);

        return linkedList;
    }

    public static int dequeue(ArrayDeque<Integer> linkedList) {
        int firstElement = linkedList.getFirst();
        linkedList.pollFirst();
        System.out.println("Очередь после удаления : " + linkedList);

        return firstElement;
    }

    public static int first(ArrayDeque<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> linkedList = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add((int) (Math.random() * (10 - 1)));
        }
        int element = 22;
        System.out.println("Очередь: " + linkedList);
        System.out.println("Очередь после добавления : " + enqueue(linkedList, element) + "\n"
                + "Добавляемый элемент " + element);
        System.out.println("Удаляемый элемент: " + dequeue(linkedList));
        System.out.println("Первый элемент: " + first(linkedList));
    }
 
}
