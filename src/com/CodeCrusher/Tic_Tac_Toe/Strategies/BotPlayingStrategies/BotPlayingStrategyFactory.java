package com.CodeCrusher.Tic_Tac_Toe.Strategies.BotPlayingStrategies;

import com.CodeCrusher.Tic_Tac_Toe.Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
	public static BotPlayingStrategies getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel level) {
		return new EasyBotPlayingStrategy();
	}
}
