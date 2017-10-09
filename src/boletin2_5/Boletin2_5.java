
package boletin2_5;

import java.util.Scanner;
public class Boletin2_5 {

    
    public static void main(String[] args) {
        
        float millas=1852,metros;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca millas");
        millas=sc.nextFloat();
        metros=millas*1609;
        System.out.println(millas+" millas son "+metros+" metros");
        
    }
    
}
