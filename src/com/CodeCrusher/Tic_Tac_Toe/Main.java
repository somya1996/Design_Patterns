package com.CodeCrusher.Tic_Tac_Toe;

import com.CodeCrusher.Tic_Tac_Toe.Controller.GameController;
import com.CodeCrusher.Tic_Tac_Toe.Models.*;
import com.CodeCrusher.Tic_Tac_Toe.Strategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		GameController gameController = new GameController();
		System.out.println(" Game is starting");
		try {
			int dimension = 3;
			List<Player> players = new ArrayList<>();
			players.add(new Player(1l,"Somya", new Symbol('X'), PlayerType.HUMAN));
			players.add(new Bot(2L,"GPT",new Symbol('O'), BotDifficultyLevel.HARD));

			List<WinningStrategies> winningStrategies = new ArrayList<>();

			Game game = gameController.startGame(
					dimension,
					players,
					winningStrategies
			);
			while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
				//1. printboard
				//2. x's turn
				//3. ask to makeMove
				gameController.printBoard(game);
				gameController.makeMove(game);
			}
		}catch(Exception e){
			System.out.println("Something is wrong");
		}

	}
}
