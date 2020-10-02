import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BlackJackGame {
	
	
	public static void main(String [] args) {

	displayMenu();
	
	System.out.println("");
	}
	
	public static void displayMenu(){
		int userInput = 0;
		int userHandInput = 0;
		int deck[] = {'2','3','4','5','6','7','8','9','T','J','Q','K','A','2','3','4','5','6','7','8','9','T','J','Q','K','A','2','3','4','5','6','7','8','9','T','J','Q','K','A','2','3','4','5','6','7','8','9','T','J','Q','K','A'};		
		int cardSelector = 0;
		int betAmount = 0;
		int playerHandSum = 0;
		int casinoHandSum = 0;
		int minBet = 20;
		double playerWallet = 1000;
		
		
		Random rand = new Random();
		ArrayList<String> playerHand = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Casino Royale BLACKJACK Table");
		System.out.println("Minimum wager is: $" + minBet);
		
		do{
			if(playerHand.size() == 0){
				System.out.println("What would you like to do? Please make a selection!");
				System.out.println("1) Play a hand");
				System.out.println("2) Change the bet amount");
				System.out.println("3) Leave with $" +playerWallet);
				userInput = sc.nextInt();
			}
			else if(playerHand.size() == 1)
				userInput = 1;
			
			if(userInput == 1 && userHandInput !=2){					
				cardSelector = rand.nextInt(deck.length);
				if(deck[cardSelector] == '2')
					playerHand.add("2");
				else if(deck[cardSelector] == '3')
					playerHand.add("3");
				else if(deck[cardSelector] == '4')
					playerHand.add("4");
				else if(deck[cardSelector] == '5')
					playerHand.add("5");
				else if(deck[cardSelector] == '6')
					playerHand.add("6");
				else if(deck[cardSelector] == '7')
					playerHand.add("7");
				else if(deck[cardSelector] == '8')
					playerHand.add("8");
				else if(deck[cardSelector] == '9')
					playerHand.add("9");
				else if(deck[cardSelector] == 'T')
					playerHand.add("10");
				else if(deck[cardSelector] == 'J')
					playerHand.add("J");
				else if(deck[cardSelector] == 'Q')
					playerHand.add("Q");
				else if(deck[cardSelector] == 'K')
					playerHand.add("K");
				else if(deck[cardSelector] == 'A')
					playerHand.add("A");
						
					
				deck = removeTheElement(deck,cardSelector);
				
				if(playerHand.size() >=2) {
					System.out.println("Your are dealt the following Hand: " );
					System.out.println(playerHand);
					
					System.out.println("Your total for this hand is: " +playerHandSum);
					System.out.println("What would you like to do?");
					System.out.println("1) Draw another card");
					System.out.println("2) Stay");
					System.out.println("2) Forfeit");
					userHandInput = sc.nextInt();
				}
				
				else
					;	
				}
			
			if(userInput == 2)
			{
				System.out.println("How much would you like to bet?");
				while(betAmount <= minBet)
				{
					betAmount = sc.nextInt();
					if(betAmount < minBet)	
					{			
						System.out.println("The minimum bet is $"+minBet+ "! Please try again.");								
					}
				}
				System.out.println("You are betting $"+betAmount+". Good Luck!");
			}
				
			else if(userInput == 3)
				System.out.println("Thank you for playing! See you soon.");
				
				
		}while(userInput != 3);
		 
	
	}
	public static int[] removeTheElement(int[] arr,  
             int index) 
	{ 
	if (arr == null || index < 0 || index >= arr.length) { 
	
	return arr; 
	} 
	
	int[] anotherArray = new int[arr.length - 1]; 
	
	System.arraycopy(arr, 0, anotherArray, 0, index); 
	

	System.arraycopy(arr, index + 1, 
	anotherArray, index, 
	arr.length - index - 1); 
	
	return anotherArray; 
	} 
}
	
