import java.util.*;
public class HollowButterfly {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=1;i<=a;i++){
            int b=2*(a-i);
            for (int j=1;j<=i;j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j=1;j<=b;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            int b=2*(i-1);
            for(int j=1;j<=(a-i+1);j++){
                if (j==1 || j==(a-i+1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=b;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(a-i+1);j++){
                if (j==1 || j==(a-i+1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
