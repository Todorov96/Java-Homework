import java.util.Scanner;
public class _3_pointsInsideAFigure {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String numberOne=input.nextLine();
	String array[]=numberOne.split(" ");
	double x=Double.parseDouble(array[0]);
	double y=Double.parseDouble(array[1]);
	if (y<6||y>13.5) {
		System.out.println("Outside");
	}
	else
		if (x<12.5||x>22.5) {
			System.out.println(" Outside");
			
		}
		else
			if (x>17.5&&x<20&&y>8.5) {
				System.out.println("Outside");
			}
			else
				System.out.println("Inside");

}
}
