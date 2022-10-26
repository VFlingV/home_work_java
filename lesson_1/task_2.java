package lesson_1;

/**
 * Вывести все простые 
 * числа от 1 до 1000
 *
 */
public class task_2 {
    public static void main( String[] args )
    {
        int i;
        for (int n = 1; n<1000 + 1; n++){
            i = 0;

            for (int j = 1; j <= n; j++){
                if (n % j == 0)
                i++;
            }
            if (i <= 2 & i > 1) 
                System.out.println(n);
        }
    }
}
