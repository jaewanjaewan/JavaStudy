package CodingTest.Class03;

import java.util.Scanner;

public class P11720_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();

        //char형 배열로 변환 toCharArray()사용
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0'; //문자형의 값을 숫자형으로 변환(아스키코드)
        }

        System.out.println(sum);
    }
}
