package com.CodeCrusher.Tic_Tac_Toe.Strategies.BotPlayingStrategies;

import com.CodeCrusher.Tic_Tac_Toe.Models.Board;
import com.CodeCrusher.Tic_Tac_Toe.Models.Cell;
import com.CodeCrusher.Tic_Tac_Toe.Models.CellState;
import com.CodeCrusher.Tic_Tac_Toe.Models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategies{
	@Override
	public Move makeMove(Board board){
		for (List<Cell> row: board.getBoard()) {
			for (Cell cell: row) {
				if (cell.getCellState().equals(CellState.EMPTY)) {
					return new Move(
							cell,
							null
					);
				}
			}
		}
		return null;
	}
}
