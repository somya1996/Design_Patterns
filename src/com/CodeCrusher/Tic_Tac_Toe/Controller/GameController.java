package com.CodeCrusher.Tic_Tac_Toe.Controller;

import com.CodeCrusher.Tic_Tac_Toe.Exceptions.DuplicateSymbolException;
import com.CodeCrusher.Tic_Tac_Toe.Exceptions.MoreThanOneBotException;
import com.CodeCrusher.Tic_Tac_Toe.Exceptions.PlayerCountDimensionMismatchException;
import com.CodeCrusher.Tic_Tac_Toe.Models.Game;
import com.CodeCrusher.Tic_Tac_Toe.Models.GameState;
import com.CodeCrusher.Tic_Tac_Toe.Models.Player;
import com.CodeCrusher.Tic_Tac_Toe.Strategies.WinningStrategies;

import java.util.List;

public class GameController {
	public Game startGame(int dimensionOfBoard ,
	                      List<Player> players ,
	                      List<WinningStrategies> winningStrategies) throws DuplicateSymbolException, PlayerCountDimensionMismatchException, MoreThanOneBotException {
		return Game.getBuilder()
				.setPlayers(players)
				.setWinningStrategies(winningStrategies)
				.setDimension(dimensionOfBoard)
				.build();
	}

	public void makeMove(Game game){
		game.getMoves();
	}
	public void undo(Game game){
		game.undo();
	}
	public Player getWinner(Game game){
		return game.getWinner();
	}
	public GameState getGameStatus(Game game) {
		return game.getGameState();
	}

	public void printBoard(Game game) {
		game.printBoard();
	}

	public void makeNextMove(Game game) {
	}

	public GameState checkState(Game game) {
		return game.getGameState();
	}
}
