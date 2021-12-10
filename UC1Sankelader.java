import java.util.*;
public class UC1Sankelader {

	public static void main(String[] args) {
		System.out.println("Welcome to the Game of SNAKE & LADDER");

		int n;  
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the Nos of snakes you want : ");  
        n=sc.nextInt(); 
        int [] snakeArr = new int [n];//5
		System.out.print("Enter the numbers : "); 
        for (int a=0;a<snakeArr.length;a++) {
            snakeArr[a]=sc.nextInt();// {10 20 55 94 66}
        }

		int f;  
        Scanner sc1=new Scanner(System.in); 
        System.out.print("Enter the Nos of Lader you want : ");  
        f=sc1.nextInt(); 
        int [] LaderArr = new int [f];//5
		System.out.print("Enter the numbers : "); 
        for (int a=0;a<LaderArr.length;a++) {
            LaderArr[a]=sc1.nextInt();// {10 20 55 94 66}
        }
		int No_of_dice_rolled = 0;
		int plyerPosition = 1;
		System.out.println("Starting Position of the Player = 0");
		
		for (plyerPosition = 1; plyerPosition <= 100; plyerPosition++) {

			int diceRoll = 0;
			double dicenumber = (double) ((Math.random() * 6)+1);
			diceRoll = (int) dicenumber;

			System.out.println("Dice Number =" + " " + diceRoll);
			
			plyerPosition = plyerPosition + diceRoll;
			plyerPosition = plyerPosition - 1;

			System.out.println("Current Position =" + " " + plyerPosition);
			No_of_dice_rolled++;

			if (plyerPosition == 100) {
				System.out.println("CONGRATULATION!! YOU WON THE GAME.");
			}
			if (diceRoll == 0) {
				// plyerPosition = plyerPosition - diceRoll;
				System.out.println("You have to stay on the same position!!");
			}
			if (plyerPosition == snakeArr[0]) {
				plyerPosition = 5;
				System.out.println("IT'S A SNAKE \n, Current Position is :  " + plyerPosition);
			} else if (plyerPosition == snakeArr[1]) {
				plyerPosition = 48;
				System.out.println("IT'S A SNAKE \n, Current Position is :  " + plyerPosition);
			} else if (plyerPosition == snakeArr[2]) {
				plyerPosition = 77;
				System.out.println("IT'S A SNAKE \n, Current Position is :  " + plyerPosition);
			} else if (plyerPosition == LaderArr[0]) {
				plyerPosition = 34;
				System.out.println("YOU GOT A LADDER,\n Current Position is : " + plyerPosition + " position.");
			} else if (plyerPosition == LaderArr[1]) {
				plyerPosition = 64;
				System.out.println("YOU GOT A LADDER,\n Current Position is : " + plyerPosition + " position.");
			} else if (plyerPosition == LaderArr[2]) {
				plyerPosition = 86;
				System.out.println("YOU GOT A LADDER,\n Current Position is : " + plyerPosition + " position.");
			} else if (plyerPosition > 100) {
				plyerPosition = plyerPosition - diceRoll;
				System.out.println("YOU CAN'T JUMP, YOU MUST LAND ON A 100.");
			}
		}
		System.out.println("The Dice was rolled to Win is :" + No_of_dice_rolled);
	}
}