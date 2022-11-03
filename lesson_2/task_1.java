package lesson_2;
import java.util.Scanner;

/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки. Разберите строку, используя String.split.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class task_1 
{
    public static void main( String[] args )
    {
        int pos;
        int pos_1;
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder result = new StringBuilder();
        result.append(text);



        while((pos = result.indexOf(":")) != -1){
            result.replace(pos, pos + 1, " = ");     
            } 

        while((pos = result.indexOf(",")) != -1){
            result.replace(pos, pos + 1, " AND ");     
        }
        System.out.println(result);
    }  
}