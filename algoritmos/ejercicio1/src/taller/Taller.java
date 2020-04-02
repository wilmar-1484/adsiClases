
package taller;

import java.util.Scanner;

public class Taller {
    public static Scanner s = new Scanner(System.in);  
    public static Scanner r = new Scanner(System.in);

    public static void main(String[] args) {
        int A=1, B=2;
        System.out.println("ingrese primer numeros ");
        B=s.nextInt();  
        System.out.println("ingrese segundo numero ");  
        A=r.nextInt();
        System.out.println("la variable A es:  "+ A);
        System.out.println("la variable B es:  "+ B);
    }
    
}
