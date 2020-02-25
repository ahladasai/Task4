package compound;

import java.util.Scanner;

public class Construction_of_House_Main extends Standard_Materials_cost{

public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter The Area of your House");

			float Area = scan.nextFloat();

			Standard_Materials_cost(Area);

		}
}
