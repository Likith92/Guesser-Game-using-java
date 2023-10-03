package com.destination.gusser_game.pack1;

import java.util.Scanner;

public class GuesserGame {
	static int gusser;
	static byte playerNo[]=new byte[3];
	static Scanner s=new Scanner(System.in);
	
	static void guesser()
	{
		System.out.println("gusser should enter the number =");
		gusser = s.nextInt();
	}
	static void player()
	{
		for (byte i=0; i<3; i++) {
		System.out.println("player"+(i+1)+" should enter the number =");
		playerNo[i] = s.nextByte();
		}
	}
	void compare()
	{
		if(gusser==playerNo[0]) {
			System.out.println("player1 won");
		}
		else if(gusser==playerNo[1]) {
			System.out.println("player2 won");
		}
		else if(gusser==playerNo[2]) {
			System.out.println("player3 won");
		}
		else {
			System.out.println("game over !");
		}
	}

	public static void main(String[] args) {
		guesser();
		player();
		GuesserGame g  =new GuesserGame();
		g.compare();

	}

}
