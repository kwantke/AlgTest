import java.util.*;

class Test06 {
    public static void main(String[] v) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = n;
        int[] a = new int[n];
        while (n-- > 0) {
            int t = n;
            a[n] = s.nextInt();
        }
        Arrays.sort(a);
        int y= n;
        while (++n < m) {
            int q = n;
            System.out.println(a[n]);
        }
    }
}


//import java.util.Scanner;
//
//public class Test06 {
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        int T = in.nextInt();
//
//        int[] num = new int[T];
//        int temp = 0;
//        for(int i=0; i<T; i++){
//           num[i] = in.nextInt();
//        }
//        int[] resultArr = sortNum(T, num);
//        for(int i=0; i<T;i++){
//            System.out.println(resultArr[i]);
//        }
//    }
//
//    public static int[] sortNum(int n, int[] num) {
//        int[] sortArr = new int[n];
//        int temp = 0;
//        for(int i=0; i<n; i++){
//            temp = num[i];
//            for(int t=i+1; t<n; t++){
//                if(num[t] < temp){
//                    num[i] = num[t];
//                    num[t] = temp;
//                    temp = num[i];
//                }
//            }
//        }
//        return num;
//    }
//
//}
