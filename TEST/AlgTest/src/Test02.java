import java.util.Scanner;

public class Test02 {

    public static int aa;
    public static int bb;

    public static void main(String[] args) {
        System.out.println("test");

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();



        while(T-- > 0) {

            int x = in.nextInt();


            int a= fibonacci(x);
            System.out.println(aa+" "+bb);
            aa=0;bb=0;


        }

    }


    public static int fibonacci(int n) {
        if (n == 0) {
            aa++;
           // System.out.println("0");
            return 0;
        } else if (n == 1) {
            bb++;
            //System.out.println("1");
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}


