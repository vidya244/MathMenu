import java.util.*;
import java.io.*;
import java.sql.*;

class Math{


	public static void main(String[] args){

	boolean isExit = true;

	while(isExit){

		System.out.println("Please enter your choice: \n 1)Area\n 2)Area\n 3)Prime Numbers\n4)EXIT");
		Scanner read = new Scanner(System.in);
		int choice = read.nextInt();

			switch (choice) {
			
				case 1: 
					Area area = new Area();
					System.out.println("Please enter your choice: \n 1)Circle\n 2)Triangle\n 3)Rectangle\n4)Square\n5)Pentagon\n6)Hexagon\n7)EXIT");	
					int option = Input.getScanInteger();

					switch (option) {

						case 1: 
							area.circle();
						break;
						
						case 2:
							area.triangle();
						break;

						case 3:
							area.rectangle();
						break;

						case 4: 
							area.square();
						break;

						case 5: 
							area.pentagon();
						break;

						case 6: 
							area.hexagon();
						break;

						case 7:
							isExit = !isExit;
						break;

						default: 
							System.out.println("Please Enter Valid input");
						break;		
					}

					break;
				
				case 2:
					Numbers num = new Numbers();
					System.out.println("Please enter your choice: \n 1)Prime Numbers\n 2)Square root\n 3)LCM\n4)GCF\n5)EXIT");
					int option = Input.getScanInteger();

					switch (option) {

						case 1: 
							System.out.println("Please enter number to check");
							int n = read.nextInt();
							read.nextLine();
							if(prime(n)){  
					         	System.out.println("Prime") ; 
					     	 } 
					         else{ 
					         	System.out.println("Non Prime");
					         } 	
						break;
						
						case 2:
							num.sqRoot();
						break;

						case 3:
							num.lcm();
						break;

						case 4: 
							num.gcf();
						break;

						case 5: 
							isExit = !isExit;
						break;

						default: 
							System.out.println("Please Enter Valid input");
						break;		
					}
									
					break;

				case 3:
					Volume vol = new Volume();
					System.out.println("Please enter your choice: \n 1)Sphere\n 2)Cone\n 3)Cylinder\n4)Cube\n5)Rectangular Prism\n6)EXIT");
					int option = Input.getScanInteger();

					switch (option) {

						case 1: 
							vol.sphere();	
						break;
						
						case 2:
							vol.cone()
						break;

						case 3:
							vol.cylinder();
						break;

						case 4: 
							vol.cube();
						break;

						case 5: 
							vol.prism();
						break;
						case 6:
							isExit = !isExit;
						break;

						default: 
							System.out.println("Please Enter Valid input");
						break;		
					}
					break;

				case 4:
					isExit = !isExit;
					break;

				default: 
					System.out.println("Please Enter Valid input");
				break;		
			}
		}
	}
}

	




