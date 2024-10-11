import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   Airplane airplane1 = new Airplane();
   Airplane airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
   
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   String callsign = sc.nextLine();
   callsign = callsign.toUpperCase();
   double dist = sc.nextDouble();
   int dir = sc.nextInt();
   int alt = sc.nextInt();

   Airplane airplane3 = new Airplane(callsign, dist, dir, alt);

   System.out.println("\nInitial Positions:");
   System.out.println("Airplane 1: " + airplane1.toString());
   System.out.println("Airplane 2: " + airplane2.toString());
   System.out.println("Airplane 3: " + airplane3.toString());

   System.out.println("\nInitial Distances:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3));
   
   System.out.println("\nInitial Height Differences:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + Math.abs(airplane1.getAlt() - airplane2.getAlt()));
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + Math.abs(airplane1.getAlt() - airplane3.getAlt()));
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + Math.abs(airplane2.getAlt() - airplane3.getAlt()));
   
   airplane1.move(airplane2.distTo(airplane3), 65);
   airplane2.move(8.0, 135);
   airplane3.move(5.0, 55);
   airplane1.gainAlt(3000);
   airplane2.loseAlt(2000);
   airplane3.loseAlt(4000);

   System.out.println("\nNew Positions:");
   System.out.println("Airplane 1: " + airplane1.toString());
   System.out.println("Airplane 2: " + airplane2.toString());
   System.out.println("Airplane 3: " + airplane3.toString());
   
   System.out.println("\nNew Distances:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3));
   
   System.out.println("\nNew Height Differences:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + Math.abs(airplane1.getAlt() - airplane2.getAlt()));
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + Math.abs(airplane1.getAlt() - airplane3.getAlt()));
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + Math.abs(airplane2.getAlt() - airplane3.getAlt()));
}
}
