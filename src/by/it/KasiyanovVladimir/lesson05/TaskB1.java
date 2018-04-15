package by.it.KasiyanovVladimir.lesson05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/




public class TaskB1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        int i = 0;

        while(i < 5){
            String s = reader.readLine();
            list.add(s);
            i++;
        }
        System.out.println(list.size());

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list);
        }
    }

}
