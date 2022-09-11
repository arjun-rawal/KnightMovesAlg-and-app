import java.lang.Math;
import java.util.Scanner;
import java.util.*;
public class KnightMovesALG {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a spot on a chess board(like a1 or c6)");
        String first = in.nextLine();
        System.out.println("Please enter another spot in the same form");
        String second = in.nextLine();
        int totalMovesItTakes = knight(first,second);
        System.out.println("That takes " + totalMovesItTakes + " Moves!");
    }
    

    public static int knight(String start, String  finish) {
        int totalMoves = 0;
        int y =0;
        int x =0;
        char[] startingPos = start.toCharArray();
        char[] endingPos = finish.toCharArray();
        switch (startingPos[0]){
            case 'a': x = 0;
            break;
            case 'b': x = 1;
            break;
            case 'c': x=2;
            break;
            case 'd': x=3;
            break;
            case 'e': x=4;
            break;
            case 'f': x=5;
            break;
            case 'g': x=6;
            break;
            case 'h': x=7;
        }
        y = 8 - Character.getNumericValue(startingPos[1]);
        
        int knightY=0;
        int knightX =0;
        switch (endingPos[0]){
            case 'a': knightX = 0; 
            break;
            case 'b': knightX = 1;
            break;
            case 'c': knightX=2;
            break;
            case 'd': knightX=3;
            break;
            case 'e': knightX=4;
            break;
            case 'f': knightX=5;
            break;
            case 'g': knightX=6;
            break;
            case 'h': knightX=7;
        }
        knightY = 8  - Character.getNumericValue(endingPos[1]);
       
        

        int[][] grid = new int[8][8];
        grid[knightY][knightX] = 1;
        grid[y][x] = 0;

        int knightMoves= 0;
        
        while (grid[y][x] == 0){
            int abc = 0;
            int abc1=0;
            knightMoves ++;
            for( abc = 0; abc< 8; abc++){
                for( abc1 = 0; abc1<8; abc1++){
                    if (grid[abc][abc1] == knightMoves){
                        totalMoves = knightMoves + 1;
                        knightY = abc;
                        knightX = abc1;
                        if ((knightX<6) && (knightY<7)){
                            grid[knightY+1][knightX + 2] = totalMoves;
                            if (knightY>0){
                                grid[knightY-1][knightX + 2] = totalMoves;
                            }
                        }
                        if ((knightX>1) && (knightY<7)){
                            grid[knightY+1][knightX - 2] = totalMoves;
                            if (knightY>0){
                                grid[knightY-1][knightX - 2] = totalMoves;
                            }
                        }
                        if ((knightX<7) && (knightY<6)){
                            grid[knightY+2][knightX + 1] = totalMoves;
                            if (knightX>0){
                                grid[knightY+2][knightX -1] = totalMoves;
                            }
                        }
                        if ((knightX<7) && (knightY>1)){
                            grid[knightY-2][knightX + 1] = totalMoves;
                            if (knightX>0){
                                grid[knightY-2][knightX - 1] = totalMoves;
                            }
                        }
                        totalMoves++;
                   }
                }
            }
        }
        for (int qwe = 0; qwe<8; qwe++){
            System.out.println("");
            for (int qw1e = 0; qw1e<8; qw1e++){
                System.out.print(grid[qwe][qw1e]);
            }
        }







        return knightMoves;
    }


    }
  
  



