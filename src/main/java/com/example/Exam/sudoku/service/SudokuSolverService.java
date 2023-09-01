/*
package com.example.Exam.sudoku.service;

import org.springframework.stereotype.Service;

@Service
public class SudokuSolve {
    public boolean solveSudoku(int[][] puzzle) {
        int[] emptyPosition = findEmptyPosition(puzzle);
        if (emptyPosition == null) {
            return true;
        }
        
        int i = emptyPosition[0];
        int j = emptyPosition[1];
        
        for (int num = 1; num <= 9; num++) {
            if (isValidMove(puzzle, i, j, num)) {
                puzzle[i][j] = num;
                
                if (solveSudoku(puzzle)) {
                    return true;
                }
                
                puzzle[i][j] = 0;
            }
        }
        
        return false;
    }
    
    private int[] findEmptyPosition(int[][] puzzle) {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (puzzle[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    
    private boolean isValidMove(int[][] puzzle, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (puzzle[row][i] == num || puzzle[i][col] == num) {
                return false;
            }
        }
        
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (puzzle[i][j] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
*/
