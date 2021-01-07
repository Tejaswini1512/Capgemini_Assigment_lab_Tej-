/*
**
* : Write a java program Divisibility. 
* * @author Teja
*
*/
import java.util.Scanner;
public class Divisibility {

	public static int calculateSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			int num = sc.nextInt();
			int res = calculateSum(num);
			System.out.println(res);

			sc.close();
	}

}