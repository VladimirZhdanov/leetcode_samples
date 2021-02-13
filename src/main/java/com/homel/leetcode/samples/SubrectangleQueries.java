package com.homel.leetcode.samples;

// Implement the class SubrectangleQueries which receives a rows x cols rectangle
// as a matrix of integers in the constructor and supports two methods:
//
//  1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
//  Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1)
//  and bottom right coordinate is (row2,col2).
//  2. getValue(int row, int col)
//
//  Returns the current value of the coordinate (row,col) from the rectangle.

import java.util.Arrays;

public class SubrectangleQueries {
    int[][] core;


    public SubrectangleQueries(int[][] rectangle) {
        core = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        // i - row / j - col
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                core[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return core[row][col];
    }


    public static void main(String[] args) {
        int[][] array = {{1,2, 1}, {4,3, 4}, {3, 2, 1}, {1, 1, 1}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(array);
        //System.out.println(subrectangleQueries.getValue(1, 1));
        subrectangleQueries.updateSubrectangle(0, 0, 1, 1, 9);
        for (int i = 0; i < subrectangleQueries.core.length; i++) {
            for (int j = 0; j < subrectangleQueries.core[i].length; j++) {
                System.out.print(subrectangleQueries.core[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
