package com.CodeCrusher.Tic_Tac_Toe.Strategies.BotPlayingStrategies;

import com.CodeCrusher.Tic_Tac_Toe.Models.Board;
import com.CodeCrusher.Tic_Tac_Toe.Models.Bot;
import com.CodeCrusher.Tic_Tac_Toe.Models.Move;

public interface BotPlayingStrategies {
	Move makeMove(Board board);
}
