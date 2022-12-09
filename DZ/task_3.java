//Напишите постфиксный калькулятор в обратной польской записи. 
//Калькулятор вычисляет результат и проверяет, что в стеке получилдось едиственное число

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;
import java.util.Stack;

public class task_3 {

    public static boolean isNumeric(String str) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }

    public static void main(String[] args) {
        int result = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.printf("Введите строку калькулятора в обратной польской записи: ");
        String input = Scan.nextLine();
        System.out.println(input);
        var ll = input.split("");
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ll.length; i++) {
            if (isNumeric(ll[i])) {
                st.push(Integer.parseInt(ll[i]));
            } else if (ll[i].equals("+")) {
                result = st.pop() + st.pop();
                st.push(result);
            } else if (ll[i].equals("-")) {
                result = st.pop() - st.pop();
                st.push(result);
            } else if (ll[i].equals("*")) {
                result = st.pop() * st.pop();
                st.push(result);
            } else if (ll[i].equals("/")) {
                result = st.pop() / st.pop();
                st.push(result);
            }
        }
        System.out.printf(" = %s\n", st.pop());
        Scan.close();

    }
}
