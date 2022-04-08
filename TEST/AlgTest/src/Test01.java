import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        System.out.println("test");

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while(T-- > 0) {

            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();

            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();

            System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
        }

    }
    public static int tangent_point(int x1,int y1,int r1,int x2,int y2,int r2) {
        int resultNum = 0;

        double lengthP = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            resultNum = -1;
        }
        else if((r1 + r2) < lengthP) {
            resultNum = 0;
        }
        else if((r1 + r2) == lengthP ) {
            resultNum = 1;
        }
        else if((r1 + r2) > lengthP) {
            resultNum = 2;
            int longR = r1;
            int shortR = r2;
            if(r1 < r2) {
                longR = r2;
                shortR = r1;
            }

            if(longR == (lengthP + shortR)) {
                resultNum = 1;
            }
            else if(longR  > lengthP) {
                resultNum = 0;
            }
        }



        return resultNum;
    }
}
