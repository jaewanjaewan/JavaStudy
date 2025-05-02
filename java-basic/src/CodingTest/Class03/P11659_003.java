package CodingTest.Class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_003 {
    public static void main(String[] args) throws IOException {
        //받는 데이터가 많을땐 scanner보단 bufferedReader 쓰는게 좋다. scanner보다 더 빠름
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //데이터가 10만개이면 한줄에 길게 데이터가 들어오기때문에 int형으로 받기힘듬
        //StringTokenizer을 이용하여 값을 분리해서 사용 (token으로 분리)
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        //산술연산이 많을땐 int로 선언했다가 범위가 넘어갈 수 있음. 숫자형 데이터를 다룰땐 long형으로 선언하기
        //0번째 인덱스를 무시하기위해 뒤에 + 1 선언
        long S[] = new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++){ //인덱스0 무시
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); //합 배열 공식
        }
        for(int q=0; q<quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
