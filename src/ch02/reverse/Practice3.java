package ch02.reverse;

import java.util.Scanner;

public class Practice3 {

    //책 안보고 푼 풀이
    static void reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int storage = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = storage;
        }
    }

    //책 참고하여 푼 풀이(책이랑 비슷)
    static void reverse2(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    static void swap(int[] a, int b, int c) {
        int storage = a[b];
        a[b] = a[c];
        a[c] = storage;
    }

    //배열의 합 구하는 메서드
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 역순으로 정렬하기");
        System.out.print("배열 길이: ");
        int num = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + "번째 배열값: ");
            array[i] = scanner.nextInt();
        }

        reverse2(array);

        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ",");
        }
        System.out.println("}");
        System.out.println("배열 역순으로 정렬 끝!!!");
        System.out.println("배열의 합은 " + sumOf(array));
    }
}
