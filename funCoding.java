import java.util.Arrays;
import java.util.Scanner;

public class funCoding {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		diceRoll();

	}
//-------------Generate Random Number for diceRoll------------------//
	public static int diceRoll() {
		boolean roll = false;
		int rollNum = 0;
		int turn = 0;
		int point1 =0;
		int point2 =0;
		
		do{
			int numGen = (int)(Math.random()* 6 + 1);
			rollNum = numGen;
			System.out.println("Your roll was " + rollNum);
				if(rollNum < 4) {
					turn++;
						if(turn%2 == 1) {
							System.out.println("\n" + "It is players 2 turn");
						}else {
							System.out.println("\n" + "It is players 1 turn");
						}
						roll = false;
				}else{
					roll = true;
					instances();
						if(turn%2 ==1) {
							point1++;
						}else {
							point2++;
						}
				}
		}while(point1 < 10 || point2 < 10);
			if(point1== 10) {
				System.out.println("Player 1 wins");
			}else {
				System.out.println("Player 2 wins");
			}
		return rollNum;
	}
//--------generates instances when Dice Roll > 4 --------------------//	
	public static void instances() {
		int num1 = (int)(Math.random() * 100 + 0);
		int num2 = (int)(Math.random() * 100 + 0);
		int response = 0;
		int answer = 0;
		int moveGen = 0;
		double answer1 = 0;
		double response1 = 0;
			
		//---------------------------------Instance Generator--------------//
			for(int i=0; i < 1; i++) {
				//Generates a question----------------------------//
				int instanceGen = (int)(Math.random() * 100 + 0);
				System.out.println("The instance roll was = " + instanceGen);
					//Addition Instance-------------------------------//
					if(instanceGen <= 25 && instanceGen >= 0) {
						System.out.println("What is " + num1 + " + " + num2);
						answer = num1 + num2;
						response = input.nextInt();
							if(response == answer) {
								moveGen = (int)Math.random()*3 + 1;
								System.out.println("Move up " + moveGen);
							}
					//multiplication instance------------------------//
					}else if(instanceGen <= 50 && instanceGen >= 26) {
						System.out.println("What is " + num1 + " * " + num2);
						answer = num1 * num2;
						response = input.nextInt();
							if(response == answer) {
								moveGen = (int)Math.random()*3 + 1;
								System.out.println("Move up " + moveGen);
							}
					//division instance-------------------//
					}else if(instanceGen <= 75 && instanceGen >= 51) {
						System.out.println("What is " + num1 + "/" + num2);
						System.out.println("Round to the lowest whole number");
						answer = num1/num2;
						response = input.nextInt();
							if(response == answer) {
								moveGen = (int)Math.random()*3 + 1;
								System.out.println("Move up " + moveGen);
							}
					//subtraction instance----------------------//
					}else {
						System.out.println("What is " + num1 + " - " + num2);
						answer = num1 - num2;
						response = input.nextInt();
							if(response == answer) {
								moveGen = (int)Math.random()*3 + 1;
								System.out.println("Move up " + moveGen);
							}
					}
			}
			
	}

}
