import java.util.ArrayList;
import java.util.Collections;



public class Daj2 {
    public static void najvecaKolona(int[] matrix) {

        int index = 0;
        int niz[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                niz[i][j] = matrix[index];
                index++;
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> kolona = new ArrayList<Integer>();
        int[][] matrix = {{3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum = sum + matrix[j][i];
            }
            kolona.add(sum);

        }


        System.out.println(
                "Najveca suma je " + Collections.max(kolona) + " u koloni " + kolona.indexOf(Collections.max(kolona)));

        for (int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                var temp = matrix[i][1];
                matrix[i][1] = matrix[i][3];
                matrix[i][3] = temp;
            }


        }
        System.out.println(matrix);
    }
}




