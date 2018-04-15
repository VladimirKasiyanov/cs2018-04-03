package by.it.KasiyanovVladimir.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> listElse = new ArrayList<>();

        int i = 0;

        while(i < 20){
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
            i++;
        }

        for (int j = 0; j < list.size(); j++) {
            if ((list.get(j) % 2) == 0){
                list2.add(list.get(j));
            }
            else if ((list.get(j) % 3) != 0){
                listElse.add(list.get(j));
            }
        }
        for (int k = 0; k < list.size(); k++) {
            if ((list.get(k) % 3) == 0){
                list3.add(list.get(k));
            }
        }
        printList(list3);
        printList(list2);
        printList(listElse);


    }

    private static void printList(List<Integer> list) {

        for (Integer aList : list) System.out.println(aList);
    }


}
