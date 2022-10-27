package lesson_2;
import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 *  n! (произведение чисел от 1 до n)
 *
 */
public class task_1 
{
    public static void main( String[] args )
    {
        int pos;
        int pos_1;

       Scanner input = new Scanner(System.in);
        System.out.print("Введите параметры для фильтрации: ");
        String parameters = input.nextLine();
        String [] s = parameters.split(",");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length - 1; i++) {
            result.append(String.join(" ", s[i]));

        }


      while((pos = result.indexOf(":")) != -1){
            result.replace(pos, pos + 1, " = ");
            
        }     
        System.out.println("____________");
        System.out.println(result);
        input.close();
        

    }
    
}