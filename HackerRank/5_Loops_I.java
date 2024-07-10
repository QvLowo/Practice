/*
Given an integer ,N, print its first 10 multiples. 
Each multiple N x i (where 1 <= i <= 10 ) should be printed on a new line in the form: N x i = result.

Print 10 lines of output; each line i (where 1<=i<=10) contains the results of N x i in the form:
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


// 印出2的乘法表到10
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 2
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // 1~10
        for (int i=1;i<=10;i++){
            // 印出2 x 1 = 2 ...以此類推
            System.out.printf("%d x %d = %d%n",N,i,N*i);
        }
        bufferedReader.close();
    }
}
