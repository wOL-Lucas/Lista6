/*Faça um programa que leia duas matrizes A e B de tamanho 2 x 2 e calcule C = A ∗ B*/
package Exercicio4;
import Exercicio1.Exercicio1;

import java.util.Scanner;

public class Exercicio4 {

    public static int[][] multiply_matrix(int[][] matrix_a, int[][] matrix_b){
        int[][] matrix_c = new int[2][2];
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 2; j++){
                for(int k = 0;k < 2;k++){
                    matrix_c[i][j] += matrix_a[i][k] * matrix_b[k][j];
                }
            }
        }
        return matrix_c;
    }

    public static int[][] get_matrix(Scanner scanner, int number){
        System.out.println("Enter the matrix number " + number + ":");
        int[][]matrix = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int x = 0; x < 2; x++){
                matrix[i][x] = Exercicio1.get_number(scanner);
            }
        }
        return matrix;
    }

    public static void outMatrix(int[][] matrix){
        for(int i = 0; i < 2; i++){
            for(int x = 0; x < 2; x++){
                System.out.printf("%d ", matrix[i][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //outMatrix(get_matrix(scanner, 1));
        //outMatrix(get_matrix(scanner, 2));

        outMatrix(multiply_matrix(get_matrix(scanner,1), get_matrix(scanner, 2)));

    }
}
