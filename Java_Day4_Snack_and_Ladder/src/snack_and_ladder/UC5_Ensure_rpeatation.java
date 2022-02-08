package snack_and_ladder;

public class UC5_Ensure_rpeatation extends UC3_player_option {
	static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;
	
	public static void main(String[] args) {
		int position = new UC1_getPosition().position;
	
		
		while(position < 100) {
			int diceroll = getDiceRoll();
			switch(getOption()) {
				case NOPLAY:
					position = position;
					break;
				case SNAKE:
					position -= diceroll;
					break;
				case LADDER:
					position += diceroll;
					break;	
			}
			
			if(position < 0) {
				position = 0;
			}
			else if(position > 100 ) {
				position -= diceroll;
			}
			System.out.println("position = "+position);	
		}
		
	}
}
