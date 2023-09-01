/*
package com.example.Exam.sudoku.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Exam.sudoku.entity.SudokuEntity;
import com.example.Exam.sudoku.repository.SudokuRepo;
import com.example.Exam.sudoku.service.SudokuSolve;



@Controller
public class sudokuController {
    @Autowired
    private SudokuRepo repo;
    
    @Autowired
    private SudokuSolve solve;

    @GetMapping("/sudokus")
    public String index(Model model) {
        List<SudokuEntity> puzzles = repo.findAll();
        model.addAttribute("puzzles", puzzles);
        return "sudokus";
    }

    @GetMapping("/create")
    public String printform(Model model) {
        model.addAttribute("sudoku", new SudokuEntity());
        return "create";
    }
    
    @PostMapping("/create")
    public String createSudoku(@ModelAttribute SudokuEntity sudoku) {
        if (sudoku.getPuzzle() != null) {
            int[][] sudokulist = solveparser(sudoku.getPuzzle());

            if (isSudokuValid(sudokulist)) {
                sudoku.setPuzzle(PuzzleArray(sudokulist));
                repo.save(sudoku);
                return "redirect:/sudokus";
            } else {
                return "create";
            }
        } else {
            return "create";
        }
    }
	
//    @PostMapping("/create")
//    public String createSudoku(@ModelAttribute Sudoku sudoku) {
//        String puzzleString = sudoku.getPuzzle();
//        
//        if (puzzleString != null && !puzzleString.isEmpty()) {
//            int[][] puzzleArray = parsePuzzleString(puzzleString);
//            
//            if (isValidPuzzle(puzzleArray)) {
//                sudoku.setPuzzle(formatPuzzleArray(puzzleArray));
//                puzzleRepository.save(sudoku);
//                return "redirect:/sudokus";
//            }
//        }
//        
//        return "create";
//    }

    

    @GetMapping("/solve/{id}")
    public String solveSudoku(@PathVariable Long id, Model model) {
        Optional<SudokuEntity> optsudoku = repo.findById(id);
        if (optsudoku.isPresent()) {
            SudokuEntity puzzle = optsudoku.get();
            int[][] sudokulist = solveparser(puzzle.getPuzzle());
            model.addAttribute("solvedPuzzle", sudokulist);
            return "solve";
            } else {
            	model.addAttribute("message", "enter values");
                return "error";
        }
    }

    private int[][] solveparser(String puzzleString) {
        int[][] sudokulist = new int[9][9];
        String[] lines = puzzleString.trim().split("\n");

        for (int row = 0; row < 9; row++) {
            String[] input = lines[row].trim().split("\\s+");
            for (int column = 0; column < 9; column++) {
                sudokulist[row][column] = Integer.parseInt(input[column]);
            }
        }

        return sudokulist;
    }

    private boolean isSudokuValid(int[][] sudokulist) {
        
    	return true;
    }

    private String PuzzleArray(int[][] sudokulist) {
        StringBuilder newSudoku = new StringBuilder();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                newSudoku.append(sudokulist[row][column]);
                if (column < 8) {
                    newSudoku.append(" ");
                }
            }
            newSudoku.append("\n");
        }
        return newSudoku.toString();
    }
}
*/