package scr1;

import java.util.Scanner;

public class Scr1 {

   
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int rata;
        
        Scanner dataln = new Scanner(System.in);
        
        System.out.print("Masukkan data 1 : ");
        a = dataln.nextInt();
        System.out.print("Masukkan data 2 : ");
        b= dataln.nextInt();
        System.out.print("Masukkan data 3 : ");
        c= dataln.nextInt();
        
        System.out.println("data 1 = "+ a);
        System.out.println("data 2= "+ b);
        System.out.println("data 3 = "+ c);
        rata= (a+b+c)/3;
        System.out.println("Rata Rata = "+rata );

        
    }
    
}
