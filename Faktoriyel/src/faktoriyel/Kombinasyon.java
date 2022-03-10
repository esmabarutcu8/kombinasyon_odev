package faktoriyel;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[]args){
        int n,r;
        Scanner input=new Scanner(System.in);
        System.out.println("n değeri girin:");
        n=input.nextInt();
        System.out.println("r değeri girin:");
        r=input.nextInt();

        int total=1;
        int total2=1;
        int total3=1;

        for(int i=1;i<=n;i++){
            total=total*i;
        }
        for(int j=1;j<=r;j++){
            total2=total2*j;
        }
        int fark=n-r;
        for(int k=1;k<=fark;k++){
            total3=total3*k;
        }
       // System.out.println("n!:"+total);
       // System.out.println("r!:"+total2);
       // System.out.println("n-r:!"+total3);
        double kombinasyon=total/(total2*total3);
        System.out.println("kombinasyon:"+kombinasyon);






    }
}
