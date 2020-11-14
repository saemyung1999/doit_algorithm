package ch02.ArrayCompare;

import java.util.Scanner;

public class Practice4 {

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열 b의 요솟수: ");
        int nb = scanner.nextInt();

        int[] a = new int[nb];
        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }
        copy(a, b);

        for (int i = 0; i < b.length; i++) {
            System.out.println("a[" + i + "]: " + a[i]);
        }
    }
}
