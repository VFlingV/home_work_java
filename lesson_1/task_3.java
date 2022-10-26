package lesson_1;
import java.util.Scanner;
/**
 * создать калькулятор
 * 
 *
 */
public class task_3 {
    public static void main( String[] args )
    {
        int a;
        int b;
        int result;
        char op;
        Scanner read = new Scanner(System.in);
        System.out.println("Введите числа: ");
        a = read.nextInt();
        b = read.nextInt();
        System.out.println("Выбирете операцию +, -, *, /: ");
        op = read.next().charAt(0);
        switch(op){
            case '+': result = a + b;
            break;
         case '-': result = a - b;
            break;
         case '*': result = a * b;
            break;
         case '/': result = a / b;
            break;
         default:  System.out.printf("Ошибка!");
            return;
        }
        System.out.printf(a + " " + op + " " + b + " = " + result);
    }
}
