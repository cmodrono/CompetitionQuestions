/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Maze {
    
   
    public static void main(String[] args) {
        //Creating scanner object and general variable for general input
        Scanner in = new Scanner(System.in);
        String choice;
       
        //Taking Number of mazes
        int mazes = in.nextInt();
       
        //For each maze, do the following...
        for (int i = 0; i < mazes; i++) {
            //Take coordinates from user and turn into ints
            int row = Integer.parseInt(in.next());
            int col = Integer.parseInt(in.next());
           
            //Create the maze from user input
            String[][] maze = new String[row][col];
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    maze[r][c] = in.next();
                }
            }
            
            /*
            NOT WORKING!!!
                currently does not stop taking inputs
                testing required to solve
                just learn scanners bro
                
                jk luv ya <3 you can do this!!
            */
        }
    }  
}
