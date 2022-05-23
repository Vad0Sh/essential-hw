package homework7.task5;

import java.util.Scanner;

public class Calculator {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        scanner.hasNextInt();
        num = scanner.nextInt();


        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int add(int num1, int num2, char operation) {
        int result;
        result = num1 + num2;
        return result;
    }
    public static int sub(int num1, int num2, char operation) {
        int result;
        result = num1 - num2;
        return result;
    }
    public static int mul(int num1, int num2, char operation) {
        int result;
        result = num1 * num2;
        return result;
    }
    public static int div(int num1, int num2, char operation) {
        int result = 0;

        try {
            result = num1 / num2;
        } catch (ArithmeticException exception) {
            System.out.println("На ноль делить нельзя!");
            }
        return result;
    }
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result= add (num1,num2,operation);
                break;
            case '-':
                result= sub (num1,num2,operation);
                break;
            case '*':
                result= mul (num1,num2,operation);
                break;
            case '/':
                result= div (num1,num2,operation);
                break;

            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

