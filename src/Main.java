import problems.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        start(sc);
    }

    public static void start(Scanner sc) {
        boolean flag = true;
        while (flag) {
            System.out.println("Choice a problem: 1 - 10 ");
            System.out.println("Exit: 0");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("============================");
                    System.out.println("Problem 1");
                    Firstproblem.start();
                    System.out.println();
                    System.out.println("============================");
                    break;
                case 2:
                    System.out.println("============================");
                    System.out.println("Problem 2");
                    Secondproblem.start();
                    System.out.println();
                    System.out.println("============================");
                    break;
                case 3:
                    System.out.println("============================");
                    System.out.println("Problem 3");
                    Thirdproblem.start();
                    System.out.println();
                    System.out.println("============================");
                    break;
                case 4:
                    System.out.println("============================");
                    System.out.println("Problem 4");
                    Fourthproblem.start();
                    System.out.println();
                    System.out.println("============================");
                    break;
                case 5:
                    System.out.println("============================");
                    System.out.println("Problem 5");
                    Fifthproblem.start();
                    System.out.println();
                    System.out.println("============================");
                    break;
                case 6:
                    System.out.println("============================");
                    System.out.println("Problem 6");
                    Sixthproblem.start();
                    System.out.println();
                    System.out.println("===========================");
                    break;
                case 7:
                    System.out.println("============================");
                    System.out.println("Problem 7");
                    Seventhproblem.start();
                    System.out.println();
                    System.out.println("===========================");
                    break;
                case 8:
                    System.out.println("============================");
                    System.out.println("Problem 8");
                    Eighthproblem.start();
                    System.out.println();
                    System.out.println("===========================");
                    break;
                case 9:
                    System.out.println("============================");
                    System.out.println("Problemm 9");
                    Ninthproblem.start();
                    System.out.println();
                    System.out.println("===========================");
                    break;
                case 10:
                    System.out.println("============================");
                    System.out.println("Problem 10");
                    Tenthproblem.start();
                    System.out.println();
                    System.out.println("============================");
                    break;
                case 0:
                    flag = false;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}