package CodingTest.Class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1546_002 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int max = 0;

        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            if(temp > max){
                max = temp;
            }
            sum += temp;
        }

        System.out.println(sum * 100.0 / max / N); //100.0 double형 계산으로 변경(소수점까지 계산)


        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int sum = 0, max = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if(temp > max){
                max = temp;
            }
            sum += temp;
        }

        System.out.println(sum * 100.0 / max / N);
        */
    }
}
