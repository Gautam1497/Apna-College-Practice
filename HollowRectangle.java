import java.util.*;

public class HollowRectangle {
    public static void main(String[]arg){
        System.out.println("Enter No. of Column");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println("Enter no. of Rows");
        Scanner ac=new Scanner (System.in);
        int b=ac.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=a;j++){
                if (j==1 || j==a || i==1 || i==b){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
