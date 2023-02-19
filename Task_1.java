
package JAVA.Homework_seminar_2;

import java.util.Arrays;

public class Task_1 {
    // Дана строка sql-запроса "select * from students where ". Сформируйте часть
    // WHERE этого запроса,
    // используя StringBuilder. Данные для фильтрации приведены ниже в виде json
    // строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
    // "city":"Moscow", "age":"null"}

    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(str);

        // String[] words = str.split("//s"); // Разбиение строки на слова с помощью
        // разграничителя (пробел)
        // for (String Substr:words){
        // System.out.println(Substr);
        // }

        String text = "select * from students where ";

        // разбиение строки по разделителю

        String[] subStr; // создаем массив из символов, разделенных кавычками
        String delimeter = "\""; // это разделитель
        subStr = str.split(delimeter);
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }

        for (int i = 0; i < subStr.length; i++) {
            if (i % 2 == 0) {
                subStr[i] = null;
            }
        }
        System.out.println(Arrays.toString(subStr));
    

        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");

        
        for (int i=1; i<subStr.length-2; i=i+4){
            if (subStr[i] != "" || subStr[i+2] != null){
            String new_str = text.concat(subStr[i]).concat(" = " + subStr[i+2]);
            System.out.println(new_str);
          }
        // System.out.println(subStr[15]);


        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < subStr.length; i++) {
        // if (i % 2 != 0) {
        // sb.append(subStr[i]);
        // }
        // }
        // System.out.println(sb);

    }
}
}