//реализовать очередь с помощью LinkedList: enqueue() помещает элемент в конец очереди,
//dequeгу() возвращает первый элемент из очереди и удаляет его
//first() возвращает первый элемент из очереди, не удаляя его

import java.util.LinkedList;
import java.util.Random;


public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i ++){
            ll.add(rand.nextInt(100));
        }
        System.out.printf("Имеем произвольный LinkedList: %s\n", ll);
        enqueue(ll, 100);
        System.out.printf("Помещаем '100' в конец листа: %s\n", ll);
        System.out.printf("Возвращаем первый элемент листа и удаляем его: %s\n", 
        dequeue(ll));
        System.out.println(ll);
        System.out.printf("Возвращаем первый элемент листа, сохраняя его: %s\n%s", 
        first(ll), ll);
    }
    public static LinkedList<Integer> enqueue(LinkedList ll, Integer num){
        ll.addLast(num);
        return ll;
    }

    public static Integer dequeue(LinkedList<Integer> ll){
        int rem = ll.get(0);
        ll.removeFirst();
        return rem;
    }

    public static Integer first(LinkedList<Integer> ll){
        return ll.getFirst();
    }
}
