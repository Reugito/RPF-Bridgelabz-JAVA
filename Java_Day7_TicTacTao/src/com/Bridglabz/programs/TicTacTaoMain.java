package com.Bridglabz.programs;

public class TicTacTaoMain {

	public static void main(String[] args) {

		TicTacTaoGame game = new TicTacTaoGame();
		game.addElementInBoard();
		game.getPlayers();
		game.getTheToss();
		game.getSigntoPlay();
		game.start();
		game.showBoard();
		game.makeMove();
		game.showBoard();

	}
	

}
