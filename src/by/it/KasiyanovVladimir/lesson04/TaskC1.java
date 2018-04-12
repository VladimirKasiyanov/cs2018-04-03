package by.it.KasiyanovVladimir.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        int salary = scanner.nextInt();
        String months[] = {"0","январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь","13","14"};
        double resultSalary = 0.0;
        double numberOfTheBeast = salary * 1.5;


        if (salary <= 300 || salary >= 3000){
            System.out.println("Мы вам перезвоним!");
        }
        else{
            for (int month = 0; month < 15; month++) {
                if (numberOfTheBeast == 666.0) {
                    switch (month) {
                        case 0:
                            resultSalary = salary * 0.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 1:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                    }
                }
                else if (salary == 666){
                        switch (month) {
                            case 0:
                                resultSalary = salary * 0.0;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                            case 1:
                                resultSalary = salary * 1.5;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                            case 2:
                                resultSalary = salary * 1.5;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                            case 3:
                                resultSalary = salary * 1.5;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                            case 4:
                                resultSalary = salary * 1.5;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                            case 5:
                                resultSalary = salary * 1.5;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                            case 6:
                                resultSalary = salary * 1.0;
                                System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                                break;
                        }
                    }
                else {
                    switch (month) {
                        case 0:
                            resultSalary = salary * 0.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 1:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 2:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 3:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 4:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 5:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 6:
                            resultSalary = salary * 1.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 7:
                            resultSalary = salary * 1.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 8:
                            resultSalary = salary * 1.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 9:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 10:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 11:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 12:
                            resultSalary = salary * 1.5;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 13:
                            resultSalary = salary * 0.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                        case 14:
                            resultSalary = salary * 0.0;
                            System.out.println("За месяц " + months[month] + " начислено $" + resultSalary);
                            break;
                    }
                }

            }
        }
    }



}