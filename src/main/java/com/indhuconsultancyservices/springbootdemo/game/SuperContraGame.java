package com.indhuconsultancyservices.springbootdemo.game;

public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Move up");
	}
	public void down() {
		System.out.println("Crouch");
	}
	public void left() {
		System.out.println("Decelerate");
	}
	public void right() {
		System.out.println("Shooting");
	}
}
