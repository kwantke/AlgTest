import java.util.Scanner;


public class Test03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while(T-- > 0) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int i = 0;
            int[] cx = new int[50];
            int[] cy = new int[50];
            int[] r = new int[50];
            int T2 = in.nextInt();
            int result =0;

            while (T2-- > 0) {
                cx[i] = in.nextInt();
                cy[i] = in.nextInt();
                r[i] = in.nextInt();
                result+=  littlePrince(x1, y1, x2, y2, cx, cy, r,i);
                i++;
            }

            System.out.println(result);
        }
    }

    public static int littlePrince(int x1, int y1, int x2, int y2, int[] cx, int[] cy, int[] r,int i) {

        int resultNum=0;

        int gapALength = (int)Math.pow(r[i],2) - (int)(Math.pow(x1-cx[i],2) + Math.pow(y1-cy[i],2));
        int gapBLength = (int)Math.pow(r[i],2) - (int)(Math.pow(x2-cx[i],2) + Math.pow(y2-cy[i],2));

        if( gapALength>0 && gapBLength>0){

        } else if(gapALength>0) {
            resultNum++;
        } else if(gapBLength>0) {
            resultNum++;
        }
        return resultNum;
    }
}
