package CodingTest.Class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); //배열 오름차순 정렬

        int count = 0;
        int i = 0; //양족끝에다가 위치 A[0]에서 시작, min값
        int j = N - 1; //양족끝에다가 위치 A[N-1]에서 시작, max값
        while (i<j){
            if(A[i]+A[j]<M){
                i++;
            } else if(A[i]+A[j]>M){
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        bf.close();
    }
}
