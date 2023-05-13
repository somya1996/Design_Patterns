package com.CodeCrusher.Tic_Tac_Toe.Models;

import java.util.Scanner;

public abstract class Player {
	private Symbol symbol;
	private String name;
	private Long id;
	private PlayerType playerType;
	private Scanner scanner;

	public Player(Long id, String name , Symbol symbol , PlayerType playerType ){
		this.id = id;
		this.name = name;
		this.symbol = symbol;
		this.playerType = playerType;
		this.scanner = new Scanner(System.in);
	}

	public Move makeMove(){
		System.out.println("please tell row count where you want to move(Starting from 0)");
		int row = scanner.nextInt();
		System.out.println("please tell col count where you want to move(Starting from 0)");
		int col = scanner.nextInt();

		return new Move(new Cell(row , col) , this);
	}

	public Symbol getSymbol(){
		return symbol;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	public abstract Move makeMove(Board board);
}
