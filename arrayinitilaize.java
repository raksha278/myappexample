import java.util.Arrays;
import java.util.Scanner;

public class arrayinitilaize {
    public static void main(String[] args) {
        // int a[]=new int[5];
        /*Arrays.fill(a,5);
        for(int i =0;i<a.length;i++)
            System.out.println("value of a"+i);
        //using loop

        //int b[]=new int[5];
        for(int i =0;i<b.length;i++)
            b[i]=i+1;

        for(int i =0;i<b.length;i++)
            System.out.println("value of b" +b[i]);
            //user input*/
        int c[] = new int[5];
        Scanner u = new Scanner(System.in);
        System.out.println("enetr values");

        for (int i = 0; i < c.length; i++) {
            System.out.println("enetr values");
            c[i] = u.nextInt();
            System.out.println("value of c [" + i + "]is" + c[i]);
        }

    }

}