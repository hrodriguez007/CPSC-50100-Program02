//Heidy Rodriguez
//Programming Fundamentals
//Summer 2021
//Programming Assignment 2 (Figures)
 

import java.util.Scanner;
public class Figures {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Programming Fundamentals"); //start message welcome
		System.out.println("NAME: HEIDY RODRIGUEZ");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		
		int size, chosen; //declaring variables
		System.out.println("\nEnter the size of the figure (odd number):");
		size = scanner.nextInt();
		while (size%2 == 0) {
			System.out.println("\nInvalid figure size - must be an odd number");
			System.out.println("\nEnter the size of the figure: ");
			size = scanner.nextInt();
		}
		do {
			System.out.print("\nMENU: \n1.Print box \n2.Print diamond \n3.Print X \n4.QuitProgram");
			System.out.print("\nPlease select an option: ");
				chosen = scanner.nextInt();
				switch (chosen) {
				case 1: 
					printBox(size);
					break;
				case 2:
					printDiamond(size);
					break;
				case 3:
					printX(size);
					break;
				case 4:
					quit();
					break;
				default:
					System.out.println("Invalid selection");
				}
				
		}
		while(chosen != 4);
			}
	//printing the box
	static void printBox(int size) {
		int i,j;
		for (i = 1; i <= size; i++) {
		
			for (j = 1; j <= size; j++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}
	//printing the diamond
	static void printDiamond(int size) {
		int i, j, mid;
		size = size + 1;
		mid = ((size +1)/2);
	for (i = 1; i <= mid; i++) {
			for(j = 1; j <= (mid - i); j++) {
				System.out.print(" ");
			}
		if (i == 1) {
			System.out.print("XX");
		} else {
			System.out.print("X");
			
			for (j = 1; j<= 2 * i - 3; j++) {
				System.out.print(" ");
			}
			System.out.print(" X");
		}
		System.out.print("\n");
		}
	for (i = mid + 1; i < size + 1; i++) {
				for(j = 1; j <= i - mid; j++) {
					System.out.print(" ");
				}
		if (i == (size +1) - 1) {
			System.out.print("XX");
		} else {
			System.out.print("X");
			
			for(j = 1; j <= 2 * ((size + 1)- i) - 3; j++) {
				System.out.print(" ");
			}
			System.out.print("X");
		}
		System.out.print("\n");
			}
	}
	
	//printing the x
	static void printX(int size)
	{
		int i, j;
		for(i = 1; i <= size; i++)
		{
			for (j = 1; j<= size; j++)
			{
				if (j == i)
				{
					System.out.print("X");
				}
				else if (j == size -(i - 1))
				{
					System.out.print("X");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
	}
	
	//quiting time
	static void quit()
	{
		System.out.println("\nGood bye!");
		System.exit(0);
		
		scanner.close(); // closing scanner
		}
	}
	
	