package snack_and_ladder;

public class UC8_Two_player extends UC3_player_option {
	static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;
	
	public static void main(String[] args) {
		int position1 = new UC1_getPosition().position;
		int position2 = new UC1_getPosition().position;
		int cnt = 0, position = 0, diceroll;
		boolean player1 = true, player2 = false;
		
		while((position1 < 100) && (position2 < 100)) {
			diceroll = getDiceRoll();
			
			switch(getOption()) {
				case NOPLAY:
					position = position;
					break;
				case SNAKE:
					position -= diceroll;
					break;
				case LADDER:
					position += diceroll;
					continue;
			}
			if( position > 0) {
				if (player1) {
					position1 += position;
					position = 0;
					player1 = false;
					player2  = true;
				}
				else {
					position2 += position;
					position = 0;
					player2  = false;
					player1 = true;
				}
			}
			
			else {
				position = 0;
			}
			
		}
	if(position1>position2) {
		System.out.println("player1 is the winner");
	}
	else {
		System.out.println("player2 is the winner");
	}
	}
}
