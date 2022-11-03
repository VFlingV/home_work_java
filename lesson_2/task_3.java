package lesson_2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.Logger;

public class task_3 {
    private static final Logger logger = Logger.getLogger(task_2.class.getName());
    
    private static String [] returnNum(){
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
                    System.out.println(result);
                    String [] result = logger.info(Arrays.toString(numbers));
                }
            }
        }
        return result;     
    }
    
    private static void createLog(String[] strings){
        File file = new File("file.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (strings s : strings){
                bw.write(s + "\n");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }


    }
    public static void main(String [] args) { 
        createLog(returnNum());
  
    }  
}
