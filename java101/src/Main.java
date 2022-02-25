import java.util.Scanner;

public class Main {public static void main(String[] args) {
   double  r , aci , alan , cevre , alan2 ;
   Scanner input = new Scanner (System.in);
   System.out.println("Lütfen dairenin yarıçapını giriniz");
   r = input.nextInt();
   System.out.println("Lütfen hesaplanacak olan daire diliminin açısını giriniz");
   aci = input.nextInt();
   alan = 3.14 * r * r ;
   cevre = 2 * 3.14 * r ;
   alan2 = (3.14 * r * r * aci) / 360;
   System.out.println("Dairenin alanı=" + alan );
   System.out.println("Dairenin çevresi=" + cevre );
   System.out.println("Daire diliminin alanı =" + alan2);
}

}