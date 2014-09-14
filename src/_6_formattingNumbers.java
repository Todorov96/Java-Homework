import java.util.Scanner;
 
public class _6_formattingNumbers {
 
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                double b = in.nextDouble();
                double c = in.nextDouble();
               
                String aHexString = Integer.toHexString(a).toUpperCase();
                String aBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
               
                if (c%1 == 0) {
                        System.out.printf("|%-10s|%s|%10.2f|%-10.0f|",aHexString,aBinary,b,c);
                }else {
                        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",aHexString,aBinary,b,c);
                }
       
        }
}