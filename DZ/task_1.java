//Дан LinkedList. Реализовать метод, возвращающий перевернутый список

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class task_1{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i ++){
            ll.add(rand.nextInt(100));
        }
        System.out.println(ll);
        System.out.println(ReverseLst(ll));       
    }

    public static LinkedList<Integer> ReverseLst(LinkedList<Integer> ll){
        int size = ll.size();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < size; i++){
            st.add(ll.pop());           
        }    
        for(int j = 0; j < size; j++){
            ll.add(st.pop());
        }
        return ll;
    }


}