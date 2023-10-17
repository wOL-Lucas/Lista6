/*Faça um programa que leia uma matriz A de tamanho 3 x 3 e calcule B= A2. Onde B é uma nova matriz.*/
package Exercicio4;


import Exercicio1.Exercicio1;

import java.util.Scanner;

public class Exercicio4 {
    public static int[][] multiply_matrix(int[][] matrix_a){
        int[][] matrix_c = new int[3][3];
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                for(int k = 0;k < 3;k++){
                    matrix_c[i][j] += matrix_a[i][k] * matrix_a[k][j];
                }
            }
        }
        return matrix_c;
    }

    public static int[][] get_matrix(Scanner scanner, int number){
        System.out.println("Enter the matrix number " + number + ":");
        int[][]matrix = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 3; x++){
                matrix[i][x] = Exercicio1.get_number(scanner);
            }
        }
        return matrix;
    }

    public static void outMatrix(int[][] matrix){
        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 3; x++){
                System.out.printf("%d ", matrix[i][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        outMatrix(multiply_matrix(get_matrix(new Scanner(System.in),1)));
    }

}
