package ch02.reverse;

import java.util.Scanner;

public class Practice2 {

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
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
            System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
            System.out.println();
            swap(a, i, a.length - i - 1);
        }
    }

    static void swap(int[] a, int b, int c) {
        int storage = a[b];
        a[b] = a[c];
        a[c] = storage;
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
    }
}

