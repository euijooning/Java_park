package Prac01;

import java.util.Scanner;

public class Quiz {
// 퀴즈 1
// 세개의 숫자를 각각 변수 선언하고 세수의 총합을 인쇄해보기
/*
    public static void main(String[] args) {


        int i = 10;
        int j = 20;
        int k = 3;
        int sum = i+j+k;
        System.out.println("세수의 합은 " + (i+j+k)+ " 입니다.");
    }
 */

    //    퀴즈2
// 스캐너를 통해 가로와 세로를 입력받아 사각형의 넓이를 구해보기 (전체 주석 쳐 보기)
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
    System.out.println("가로: ");
    int x = sc.nextInt();
        System.out.println("세로: ");
    int y = sc.nextInt();

        System.out.println("사각형의 넓이는 " + (x*y) + "입니다." );
    }
}
