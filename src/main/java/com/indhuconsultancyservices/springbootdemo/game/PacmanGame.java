package com.indhuconsultancyservices.springbootdemo.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("eat up");
	}
	public void down() {
		System.out.println("eat down");
	}
	public void left() {
		System.out.println("eat left");
	}
	public void right() {
		System.out.println("eat right");
	}
}
