package com.CodeCrusher.Tic_Tac_Toe.Models;

import com.CodeCrusher.Tic_Tac_Toe.Strategies.BotPlayingStrategies.BotPlayingStrategies;
import com.CodeCrusher.Tic_Tac_Toe.Strategies.BotPlayingStrategies.BotPlayingStrategyFactory;

public class Bot extends Player{
	private BotDifficultyLevel botDifficultyLevel;
	private BotPlayingStrategies botPlayingStrategies;
	public Bot(Long id, String name , Symbol symbol ,BotDifficultyLevel botDifficultyLevel){
		super(id , name , symbol , PlayerType.BOT);
		this.botDifficultyLevel = botDifficultyLevel;
		this.botPlayingStrategies = BotPlayingStrategyFactory
				.getBotPlayingStrategyForDifficultyLevel(botDifficultyLevel);
	}
	@Override
	public Move makeMove(Board board) {
		Move move = botPlayingStrategies.makeMove(board);
		move.setPlayer(this);

		return move;
	}
	public BotDifficultyLevel getBotDifficultyLevel() {
		return botDifficultyLevel;
	}

	public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
		this.botDifficultyLevel = botDifficultyLevel;
	}
}
