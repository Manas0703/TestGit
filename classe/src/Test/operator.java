package Test;

public class operator {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myFirstval = 21.00;
		double mySecondval = 80.00;
		//double myResult = myFirstval + mySecondval * 100.00;
		double myResult = (myFirstval + mySecondval) * 100.00;
		System.out.println("Result = " + myResult);
		double myRemainder = myResult % 40.00;
		System.out.println("Remainder = " + myRemainder );
		boolean isNoRemainder = (myRemainder ==0) ? true : false;
		System.out.println("isNoRemainder = " + isNoRemainder);
		if(!isNoRemainder) {
			System.out.println("Some Remainder");
		}
		
		int i = 10;
		int n = ++i%5;
		System.out.println(i + " " + n);
	
		int highScorePosition = calHighScore(1500);
		displayHighScorePosition("Manas", highScorePosition);
		highScorePosition = calHighScore(1000);
		displayHighScorePosition("Test", highScorePosition);
		highScorePosition = calHighScore(100);
		displayHighScorePosition("tim", highScorePosition);
		highScorePosition = calHighScore(500);
		displayHighScorePosition("Ron", highScorePosition);
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName +" Position is "  + highScorePosition + " on the table");
	}
	
	public static int calHighScore(int playerScore) {
		if(playerScore >= 1000) {
			return 1;
		}else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		}else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}
	
}

