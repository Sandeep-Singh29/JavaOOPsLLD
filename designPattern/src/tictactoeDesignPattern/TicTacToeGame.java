package tictactoeDesignPattern;

import tictactoeDesignPattern.board.Board;
import tictactoeDesignPattern.piece.PieceType;
import tictactoeDesignPattern.piece.PlayingPieceO;
import tictactoeDesignPattern.piece.PlayingPieceX;
import tictactoeDesignPattern.player.Pair;
import tictactoeDesignPattern.player.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Sandeep Singh
 * Date: 29/01/25
 */

public class TicTacToeGame {


    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        intializeGame();
    }

    private void intializeGame() {
        // Creating players and add into players
        players = new LinkedList<>();
        // Player 1
        players.add(new Player("Player1", new PlayingPieceX()));
        // Player 2
        players.add(new Player("Player2", new PlayingPieceO()));
        // Create a Game Board with Matrix
        gameBoard = new Board(3);

    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            //Take out the player whose turn and put in to the back the next players
            Player playerTurn = players.removeFirst();

            // get the freeSpace from the Board
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpace = gameBoard.getFreeCells();
            if (freeSpace.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Read the user Input
            System.out.println("Player : " + playerTurn.name + " Enter the Row and Column :  ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // Place the Piece
            boolean isPieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!isPieceAddedSuccessfully) {
                // Player can't insert the piece into the cell , Player has to Choose another cell
                System.out.println("Incorrect Position Choose :  Try Again");
                players.add(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }

        }
        return "Match TIE..!!";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Need to Check in ROw
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }
        // Need to Check in Column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // Need to Check in Diagonal
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // Need to Check in AntiDiagonal
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
