package stringCalculator;

import java.util.Scanner;

public class stringCalculator {
    public static void main(String[] args) {
        stringCalculator strCal = new stringCalculator();

        // 문자열 입력받기
        String value = strCal.input();

        // 문자열 나누기
        String[] values = strCal.split(value);

        // 숫자 분리하기
        int[] num = strCal.numberSplit(values);

        // 기호 분리하기
        String[] operator = strCal.operatorSplit(values);
        
        // 연산 진행
        int result = num[0];
        for (int i = 0; i < operator.length; i++) {
            if (operator[i].equals("+")) {
                result = strCal.add(result, num[i + 1]);
            }

            if (operator[i].equals("-")) {
                result = strCal.subtract(result, num[i + 1]);
            }

            if (operator[i].equals("*")) {
                result = strCal.multiply(result, num[i + 1]);
            }

            if (operator[i].equals("/")) {
                result = strCal.divide(result, num[i + 1]);
            }
        }

        System.out.println(result);
    }

    // 문자열 입력받기
    String input() {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        scanner.close();

        return value;
    }

    // 문자열 나누기
    String[] split(String value) {
        String[] values = value.split(" ");

        return values;
    }

    // 숫자 구하기
    int[] numberSplit(String[] values) {
        int[] num = new int[values.length / 2 + 1];

        int count = 0;
        for (int Index = 0; Index < values.length; Index++) {
            if (Index % 2 == 0) {
                num[count++] = Integer.parseInt(values[Index]);
            }
        }

        return num;
    }

    // 기호 구하기
    String[] operatorSplit(String[] values) {
        String[] operator = new String[values.length / 2];

        int count = 0;
        for (int Index = 0; Index < values.length; Index++) {
            if (Index % 2 != 0) {
                operator[count++] = values[Index];
            }
        }

        return operator;
    }


    // 더하기
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // 빼기
    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // 곱하기
    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // 나누기
    int divide(int num1, int num2) {
        return num1 / num2;
    }

}
