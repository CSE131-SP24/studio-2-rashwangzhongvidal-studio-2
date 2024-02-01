package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of money you start with: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter the chance of winning this game （as a decimal): ");
		double winChance = in.nextDouble();
		System.out.println("Enter the amount of money you want to have before leaving: ");
		double winLimit = in.nextDouble();
		System.out.println("Enter the number of days that you want to play: ");
		int totalSimulations =in.nextInt();
		int Count = 0;
		
		double numOfLoser = 0;
		
		while(Count < totalSimulations) {
			double amount = startAmount;
			int numOfPlays = 0;
			while(amount > 0 && amount < winLimit) {
				double rand = Math.random();
				if(rand < winChance) {
					amount++;
					numOfPlays++;
				}
				else {
					amount--;
					numOfPlays++;
				}
			}
			
			if (amount == winLimit) {
				System.out.println("Success!");
			}
			else {
				System.out.println("Loser!");
				numOfLoser++;
			}
			Count++;
			System.out.println("Current day：" + Count);
			System.out.println("Number of plays this day: " + numOfPlays);
		}
		int numOfLoser0 = (int) numOfLoser;
		System.out.println("Losses: " + numOfLoser0 + " Simulations: " + totalSimulations);
		System.out.println("Ruin rate from simulation: " + (numOfLoser/totalSimulations));
	}
		

}
