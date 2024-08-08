/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package islandperimeter;

/**
 *
 * @author Connor Robert Davies
 */
//Topics: Array, Deph-First Search, Breadth-First Search, Matrix
public class IslandPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] grid = {
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        };
        
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    //Check the vertical blocks
                    if (i == 0) {
                        perimeter++;
                    }
                    if (i == grid.length - 1) {
                        perimeter++;
                    }
                    if (i != 0) {
                        if (grid[i - 1][j] == 0) {
                            perimeter++;
                        }
                    }
                    if (i != grid.length - 1) {
                        if (grid[i + 1][j] == 0) {
                            perimeter++;
                        }
                    }

                    //Check the horizontal blocks
                    if (j == 0) {
                        perimeter++;
                    }
                    if (j == grid[i].length - 1) {
                        perimeter++;
                    }
                    if (j != 0) {
                        if (grid[i][j - 1] == 0) {
                            perimeter++;
                        }
                    }
                    if (j != grid[i].length - 1) {
                        if (grid[i][j + 1] == 0) {
                            perimeter++;
                        }
                    }

                }

            }
        }

        return perimeter;
    }

}
