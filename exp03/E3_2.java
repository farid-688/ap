package exp03;

import java.util.Scanner;

public class E3_2 {
        public static void main(String[] args ) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix01 = new int[2][2];
            System.out.println(":ماتریکس دو در دو را وارد کنید");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("[" + i + "][" + j + "]");
                    matrix01[i][j] = scanner.nextInt();
                }
            }
            int determinan = matrix01[0][0] * matrix01[1][1] - matrix01[0][1] * matrix01[1][0];
            System.out.println(":دترمینان " + determinan);

        }
    }

