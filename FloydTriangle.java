import java.util.*;

public class FloydTriangle {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        for (int i=1;i<=a;i++){

            for (int j=1;j<=i;j++){
                System.out.print(b);
                b=b+1;
            }
            System.out.println();
        }
    }
}
