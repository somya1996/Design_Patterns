package com.CodeCrusher.Tic_Tac_Toe.Models;

import com.CodeCrusher.Tic_Tac_Toe.Exceptions.DuplicateSymbolException;
import com.CodeCrusher.Tic_Tac_Toe.Exceptions.MoreThanOneBotException;
import com.CodeCrusher.Tic_Tac_Toe.Exceptions.PlayerCountDimensionMismatchException;
import com.CodeCrusher.Tic_Tac_Toe.Strategies.WinningStrategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
	private List<Player>players;
	private Board board;
	private List<Move> moves;
	private Player winner;
	private GameState gameState;
	private int nextMovePlayerIndex;
	private List<WinningStrategies> winningStrategies;

	public static Builder getBuilder(){
		return new Builder();
	}
	//constructor
	private Game(int dimension , List<Player>players , List<WinningStrategies> winningStrategies){
		this.nextMovePlayerIndex = 0;
		this.gameState = GameState.IN_PROGRESS;
		this.moves = new ArrayList<>();
		this.players = players;
		this.winningStrategies = winningStrategies;
		this.board = new Board(dimension);
	}

	public static class Builder {
		private List<Player> players;
		private List<WinningStrategies> winningStrategies;
		private int dimension;

		private Builder() {
			this.dimension = 0;
			this.players = new ArrayList<>();
			this.winningStrategies = new ArrayList<>();
		}

		public Builder setDimension(int dimension) {
			this.dimension = dimension;
			return this;
		}

		public Builder setPlayers(List<Player> players) {
			this.players = players;
			return this;
		}

		public Builder addPlayer(Player player) {
			this.players.add(player);
			return this;
		}

		public Builder addWinningStrategies(WinningStrategies winningStrategy) {
			this.winningStrategies.add(winningStrategy);
			return this;
		}

		public Builder setWinningStrategies(List<WinningStrategies> winningStrategies) {
			this.winningStrategies = winningStrategies;
			return this;
		}

		private void validateBotCounts() throws MoreThanOneBotException {
			int botCount = 0;

			for (Player player: players) {
				if (player.getPlayerType().equals(PlayerType.BOT)) {
					botCount += 1;
				}
			}

			if (botCount > 1) {
				throw new MoreThanOneBotException();
			}
		}

		private void validateDimensionPlayerCount() throws PlayerCountDimensionMismatchException {
			if (players.size() != dimension - 1) {
				throw new PlayerCountDimensionMismatchException();
			}
		}

		private void validateUniqueSymbolsForPlayers() throws DuplicateSymbolException {
			Map<Character, Integer> symbolCounts = new HashMap<>();

			for (Player player: players) {
				if (!symbolCounts.containsKey(player.getSymbol().getaChar())) {
					symbolCounts.put(player.getSymbol().getaChar(), 0);
				}

				symbolCounts.put(
						player.getSymbol().getaChar(),
						symbolCounts.get(player.getSymbol().getaChar()) + 1
				);

				if (symbolCounts.get(player.getSymbol().getaChar()) > 1) {
					throw new DuplicateSymbolException();
				}
			}
		}

		// This validation of creation of objects
		private void validate() throws DuplicateSymbolException, PlayerCountDimensionMismatchException, MoreThanOneBotException {
			validateBotCounts();
			validateDimensionPlayerCount();
			validateUniqueSymbolsForPlayers();
		}

		public Game build() throws DuplicateSymbolException, PlayerCountDimensionMismatchException, MoreThanOneBotException {
			validate();

			return new Game(
					dimension,
					players,
					winningStrategies
			);
		}
	}
	public void printBoard(){
		board.printBoard();
	}

	public void undo() {
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void getMoves() {
		Player currentMovePlayer = players.get(nextMovePlayerIndex);
		System.out.println("It is "+currentMovePlayer.getName()+"'s turn");
		currentMovePlayer.makeMove();
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

	public int getNextMovePlayerIndex() {
		return nextMovePlayerIndex;
	}

	public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
		this.nextMovePlayerIndex = nextMovePlayerIndex;
	}

	public List<WinningStrategies> getWinningStrategies() {
		return winningStrategies;
	}

	public void setWinningStrategies(List<WinningStrategies> winningStrategies) {
		this.winningStrategies = winningStrategies;
	}
}
