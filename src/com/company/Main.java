package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();

        System.out.print("Опция:");
        int choice = input.nextInt();

        List<String> choices = new ArrayList<String>(6);
        String name = null;
        String email = null;
        String id = null;
        String start = null;
        String end = null;
        String type = null;

        switch (choice)
        {
            case 1:

                System.out.println("Въведете Име: ");
                name = input.nextLine();
                name = input.nextLine();
                choices.add(name);

                System.out.println("Въведете Имейл: ");
                email = input.nextLine();
                choices.add(email);

                System.out.println("Въведете ЕГН: ");
                id = input.nextLine();
                    if (id.length() != 10){
                        System.out.println("Няма такова ЕГН!");
                        id = input.nextLine();
                    }
                    else
                    {
                        choices.add(id);
                    }

                System.out.println("Въведете дата за начало на отпуската: ");
                start = input.nextLine();
                choices.add(start);

                System.out.println("Въведете дата за край на отпуската: ");
                end = input.nextLine();
                choices.add(end);

                System.out.println("Въведете тип на отпуската (платена или неплатена): ");
                type = input.nextLine();
                switch (type)
                {
                    case "платена", "Платена":
                        type = "Платена";
                        choices.add(type);
                        break;
                    case "неплатена", "Неплатена":
                        type = "Неплатена";
                        choices.add(type);
                        break;
                    default:
                        System.out.println("Невалиден тип!");
                        type = input.nextLine();
                        break;
                }

                System.out.println("Вашата заявка е потвърдена!");
                menu();
                System.out.println("Изберете друга опция: ");
                choice = input.nextInt();

                case 2:
                    System.out.println(choices);
                    menu();
                    System.out.println("Изберете друга опция: ");
                    choice = input.nextInt();


                case 3:
                    System.out.println("Тази опция е все още в процес на разработка!");
                menu();
                    System.out.println("Изберете друга опция: ");
                    choice = input.nextInt();


                case 4:
                    System.out.println("Тази опция е все още в процес на разработка!");
                menu();
                    System.out.println("Изберете друга опция: ");
                    choice = input.nextInt();


                case 5:
                    break;


                default:
                System.out.println("Невалидна опция!");
                choice = input.nextInt();
        }
    }

    public static void menu()
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("  1. Заяви отпуска");
        System.out.println("  2. Виж всички отпуски");
        System.out.println("  3. Виж отпуска за служител");
        System.out.println("  4. Промени статус на отпуска");
        System.out.println("  5. Изход");
        System.out.println("--------------------------------------------------------------------");
    }


}