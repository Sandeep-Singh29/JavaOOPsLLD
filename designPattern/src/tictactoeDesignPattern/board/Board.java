package tictactoeDesignPattern.board;

import tictactoeDesignPattern.piece.PlayingPiece;
import tictactoeDesignPattern.player.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 29/01/25
 */


public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row , int column , PlayingPiece playingPiece){
        if (board[row][column]!=null){
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j]==null){
                    Pair<Integer,Integer> rowColumn = new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board[i][j].pieceType + " ");
                }
            }
            System.out.println();
        }
    }


}
