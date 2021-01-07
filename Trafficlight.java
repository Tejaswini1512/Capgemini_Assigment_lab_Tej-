/*
**
* : Write a java program that simulates a traffic light. 
* * @author Teja
*
*/
import java.util.Scanner;

public class Trafficlight{

	public static void checkTraffic(String color) {
	
		switch(color) {
		case "red": System.out.println("STOP");
				  	break;
		case "yellow": System.out.println("READY");
						break;
		case "green": System.out.println("GO");
						break;
		default:
			System.out.println("color is invalid");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		checkTraffic(color);
		sc.close();

	}

}
