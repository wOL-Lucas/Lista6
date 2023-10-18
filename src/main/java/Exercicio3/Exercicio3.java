/*
Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição das matrizes
lidas.
*/
package Exercicio3;

import Exercicio1.Exercicio1;

import java.util.Scanner;

public class Exercicio3 {


    public static int[][] create_matrix_with_bigger(int[][]matrix_a, int[][]matrix_b){
        int[][] matrix_c = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 4; x++){
                matrix_c[i][x] = matrix_a[i][x] > matrix_b[i][x] ? matrix_a[i][x] : matrix_b[i][x];
            }
        }
        return matrix_c;
    }

    public static void outMatrix(int[][] matrix){
        for(int i = 0; i < 4; i++){
            for(int x = 0; x < 4; x++){
                System.out.printf("%d ", matrix[i][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        outMatrix(create_matrix_with_bigger(Exercicio1.get_voxcel(new Scanner(System.in)), Exercicio1.get_voxcel(new Scanner(System.in))));
    }

}
