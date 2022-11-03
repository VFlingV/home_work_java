package lesson_2;
import java.util.Arrays;
import java.util.logging.Logger;

public class task_2 {
    private static final Logger logger = Logger.getLogger(task_2.class.getName());
    
    public static void main(String [] args) {
        int [] numbers = {11, 3, 14, 16, 7, 22, 45, 1};      
        boolean isSort = false;
        int num;
        while(!isSort) {
            isSort = true;
          
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSort = false;
                    num = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = num;
                    logger.info(Arrays.toString(numbers));
                }
            }
        }     
    }  
}
