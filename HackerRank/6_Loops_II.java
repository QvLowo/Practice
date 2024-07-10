/*
We use the integers a,b , and n to create the following series:
(a+2⁰*b),(a+2⁰*b+2¹*b) ,...,(a+2⁰*b+2¹*b+...+2ⁿ⁻¹*b)
即為(a+1b),(a+1b+2b),(a+1b+2b+4b),...

You are given q queries in the form of a, b, and n. 
For each query, print the series corresponding to the given a, b, and  values as a single line of n space-separated integers.
*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            // n為行，指加幾次數列
            int n = in.nextInt();
            int series = a;
            // j即次方，累加上去
            for (int j = 0; j<n; j++){
            // 計算1b 2b 4b 以此類推，並將結果加入並更新series
                series +=Math.pow(2,j)*b;
                // 印出每個series並加一個空格
                System.out.print(series+" ");
            }
            // 換行
            System.out.println();
        }
        in.close();
    }
}