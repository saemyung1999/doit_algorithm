package ch02.max;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long seed = Long.parseLong(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        Random random = new Random(seed); //시간은 항상 변하므로 이것을 seed값으로 주어서 항상 값이 변하는 random 함수를 만듬

        int num = random.nextInt(10);

        System.out.println("키의 최댓값 구하기");
        System.out.println("사람수: " + num);

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
