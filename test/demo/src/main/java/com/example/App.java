package com.example;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
public class App 
{private static final Logger logger = Logger.getLogger(App.class.getName());
    
    private static String [] returnNum(){
        int [] numbers = {11, 3, 14, 16, 7, 22, 45, 1};      
        boolean isSort = false;
        int num;
        String[] result = ();
        while(!isSort) {
            isSort = true;
          
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSort = false;
                    num = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = num;
                    System.out.println(result);
                    result = logger.info(Arrays.toString(numbers));
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
