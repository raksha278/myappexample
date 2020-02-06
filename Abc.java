import java.util.Scanner;
public class swapvariables {
    public static void main (String[] args){
        int a,b,temp;
        System.out.println("enter 2 values to swap");
        Scanner sca= new Scanner(System.in);
        a=sca.nextInt();
        b=sca.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("ab="+b);


    }
}