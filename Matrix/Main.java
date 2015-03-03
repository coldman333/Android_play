package com.com.teststring;

/**
 * Created by vova on 24.02.2015.
 */
public class Main {

    public static void main(String[] args) {
        Matrix matrixA = new Matrix(3, 3, new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}});
        Matrix matrixB = new Matrix(3, 3, new int[][]{{5, 6, 7}, {8, 9, 10}, {11, 12, 13}});
        Matrix matrixResult = new Matrix(matrixA.getSizeX(), matrixA.getSizeY(),
                new int[matrixA.getSizeX()][matrixA.getSizeY()]);
        matrixResult = matrixA.multiplicationMatrix(matrixA, matrixB);


        System.out.println( matrixA.toString());
        System.out.println( matrixB.toString());
        System.out.println( matrixResult.toString());
    }

}
