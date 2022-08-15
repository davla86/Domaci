import java.util.Scanner;

public class Daj {
    public static void najveciRed(int[][] matrix) {
        int[] niz = new int[4];
        int m = 0;
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            int s = 0;
            for (int j = 0; j < 4; j++) {
                s += matrix[i][j];
            }
            if (s > suma) {
                suma = s;
                m = i;
            }
        }
        for (int k = 0; k < 4; k++) {
            System.out.print (matrix[m][k] + " ");

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [][] matrix = { { 3, 2, 1, 7 },
                            { 9, 11, 5, 4 },
                            { 6, 0, 13, 17},
                            { 7, 21, 14, 15} };

        najveciRed(matrix);
    }






}
