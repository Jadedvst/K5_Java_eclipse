// 재귀에 대한 이해를 돕는 순수 재귀 메서드
package dataStructure.ch5Recursive.given_checked;

import java.util.Scanner;

class Recur {
    //--- 순수 재귀 메서드 ---//
    static void recur(int n) {
        if (n > 0) {
//        	System.out.println("answer check"+n);
            recur(n - 1);//n을 실행, n print 전 n-1을 실행, n=0이 되기전까지 recur 실행
            System.out.println(n); //0보다 하나 큰 1이 되어서야 실행
            recur(n - 2); //1,2에선 아웃, n=3일때 recur(1): print(1)
            			  // n=4일때 recur(2)->recur(1): 1,2 
           
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        recur(x);
    }
}
