package p1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Juan Carlos
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String sc;
		double r=0, area,circunferecnia;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
                
		sc=leer.next();
                
                if(Pattern.matches("[a-zA-Z]+", sc) ){
                    System.out.println("Debe Introducir Numeros");
                    return;
                }
                
                r = Double.parseDouble(sc);
                
                if(r<0){
                    System.out.println("Debe introducir numeros positivos");
                    return;
                }
                
                circunferecnia =2 * Math.PI*r;
		area= Math.PI*Math.pow(r, 2);
		System.out.println("Circulo con radio "+r+",");
		System.out.println(" la circunferencia es "+circunferecnia);
		System.out.println(" y el area es "+area+".");
                leer.close();
                
                
	}
}
