package com.Bridglabz.programs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacTaoGame {
	Scanner scanner;
	static char[] board = new char[10];
	String playername;
	String computername;
	static char playersign, compsign;
	
	void addElementInBoard() {
		for(int i=0; i<10; i++) {
			board[i] = '.';
		}
	}
	public TicTacTaoGame() {
		scanner = new Scanner(System.in);
	}
	
	public char getCharValue() {
		return scanner.next().charAt(0);
	}
	
	public void getSigntoPlay() {
		boolean sign = false;
		do {
			
			System.out.println("Select the Sign to play");
			System.out.println("1. x");
			System.out.println("2. O");
			char choice = getCharValue() ;
			if(choice == '1' || choice == 'x') {
				playersign = 'X';
				compsign = 'O';
			}
			else if(choice == '2' || choice == 'o') {
				playersign = 'O';
				compsign = 'x';
			}
			else {
				sign = true;
				System.out.println("Invalid Selection");
			}
		}while(sign);
	}
	
	public void showBoard() {
		System.out.println("");
			for(int i=1; i<10; i++) {
				System.out.print(" "+board[i]+" ");
				if(i % 3 == 0)
					System.out.println("\n");
			}
	}
	
	public void makeMove() {
		
		boolean flag = false;
		do {
			System.out.print("Enter the index from 1 to 9 to make move: ");
			int move = scanner.nextInt();
			if(board[move] == '.')
				board[move] = playersign;
			else {
				System.out.println("This index is full try another");
				flag = true;
			}
		}while(flag);
	}
	
	public void getTheToss() {
		boolean select = true;
		do {
			System.out.println("Select Heads or Tails");
			System.out.println("1. heads");
			System.out.println("2. tails");
			char choice = getCharValue() ;
			if(choice == '1' || choice == '2')
			{
				Random random = new Random();
				int toss = random.nextInt(2);
				select = false;
				if(toss == 0 && choice == '1') {
					System.out.println(playername+" Wins the toss");
					System.out.println(playername+" will make 1st move ");
				}
				else if(toss == 1 && choice == '2') {	
					System.out.println(playername+" Wins the toss");
					System.out.println(playername+" will make 1st move ");
				}
				else {
					System.out.println(computername+" Wins the toss");
					System.out.println(computername+" will make 1st move ");
				}
			}
			else {
				System.out.println("Invalid Selection");
			}
		}while(select);
	}
	
	public void getPlayers() {
		System.out.print("Enter Your name : ");
		playername = scanner.next() ;
		System.out.print("Enter Rivel name : ");
		computername = scanner.next() ;
	}
	public void start() {
		System.out.println("******** "+playername+" V/S "+computername+" ********");
		System.out.print(playername+" = "+playersign+"   ");
		System.out.print(computername+" = "+compsign);
	}
	
	void startPlaying() {
		while(Arrays.toString(board).contains(".")) {
			
		}
	}
}
