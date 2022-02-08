package snack_and_ladder;

import java.util.*;

public class UC2_DiceRoll {
	
	static int getDiceRoll() {
		int Dice_min = 1, Dice_max = 6;
		Random random = new Random();
		int Dice = random.nextInt(Dice_max)+Dice_min;
		return Dice;
	}
	public static void main(String[] args) {
		System.out.println(getDiceRoll());
	}
}
