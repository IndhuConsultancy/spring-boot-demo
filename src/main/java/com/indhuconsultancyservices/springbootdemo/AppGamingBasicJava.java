package com.indhuconsultancyservices.springbootdemo;

import com.indhuconsultancyservices.springbootdemo.game.GameRunner;
import com.indhuconsultancyservices.springbootdemo.game.MarioGame;
import com.indhuconsultancyservices.springbootdemo.game.PacmanGame;
import com.indhuconsultancyservices.springbootdemo.game.SuperContraGame;

public class AppGamingBasicJava {
	
	public static void main(String[] args) {
	//	var game = new MarioGame();
		var game = new PacmanGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	} 
}
