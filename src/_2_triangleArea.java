import java.util.Scanner;
 
public class _2_triangleArea {
 
        public static void main(String[] args) {
                Scanner input= new Scanner(System.in);
                String firstPoint = input.nextLine();
                String firstArr[] = firstPoint.split(" ");
                int ax = Integer.parseInt(firstArr[0]);
                int ay = Integer.parseInt(firstArr[1]);
                String secondPoint = input.nextLine();
                String secondArr[] = secondPoint.split(" ");
                int bx = Integer.parseInt(secondArr[0]);
                int by = Integer.parseInt(secondArr[1]);
                String thirdPoint = input.nextLine();
                String thirdArr[] = thirdPoint.split(" ");
                int cx = Integer.parseInt(thirdArr[0]);
                int cy = Integer.parseInt(thirdArr[1]);
                int area = (ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2;
                if(area>=0) System.out.println(area);
                else System.out.println(area*-1);
        }
 
}