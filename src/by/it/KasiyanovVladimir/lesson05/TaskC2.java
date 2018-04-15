package by.it.KasiyanovVladimir.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while(i < 20){
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
            i++;
        }

        for (int j = 1; j < list.size(); j++){
            for (int k = list.size() - 1; k >= j; k--){
                if (list.get(k-1) < list.get(k)){
                    int temp = list.get(k-1);
                    list.set(k-1,list.get(k));
                    list.set(k, temp);

                }
            }
        }
        for (int a = 0; a < list.size(); a++) {
            System.out.println(list.get(a));
        }

    }





    public static void sort(int[] array) {
        //Напишите тут ваш код
    }

}
