package lesson_1;
/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 *  n! (произведение чисел от 1 до n)
 *
 */
public class task_1 {
    public static void main( String[] args )
    {
        int n_1 = 1;
        for (int i = 2; i < 5 + 1; i++){
            n_1 = n_1 + i;
        }
        System.out.println(n_1);

        int n_2 = 1;
        for (int i = 2; i < 5 + 1; i++){
            n_2 = n_2 * i;
        }
        System.out.println(n_2);
    }

}
