package com.dragon;

/*
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 10 для получения результата " +
                "умножения определенного числа, либо введите - 111 для получения всех таблицы.");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //String table = sc.nextLine();

//        if ("all".equals(table)) {
//            for (int i = 1; i <= 10; i++) {
//                for (int j = 1; j <= 10; j++) {
//                    System.out.println(i + " * " + j + " = " + (i * j) + " ");
//                }
//                System.out.println();
//            }
//        }
        switch (number) {
            case 1:
                for (int i = 1; i <= 1; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 2; i <= 2; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 3; i <= 3; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 4; i <= 4; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 5; i <= 5; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 6:
                for (int i = 6; i <= 6; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 7:
                for (int i = 7; i <= 7; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 8:
                for (int i = 8; i <= 8; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 9:
                for (int i = 9; i <= 9; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 10:
                for (int i = 10; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            case 111:
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j) + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Вы не попали в числа от 1 до 10, попробуйте снова :)");
                break;
        }
    }
}
