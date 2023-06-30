import java.util.ArrayList;
import java.util.Arrays;

public class Assignment4_3 {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// new int[2][2];
        int k[][] = new int[3][3];
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                k[j][i] = a[i][j];

            }

        }
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                System.out.print(k[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
