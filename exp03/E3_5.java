package exp03;

import java.util.Scanner;

public class E3_5 {
        public static void main(String[] args ) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            System.out.println(":ماتریکس 3*3 را وارد کنید");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.println(": ماتریکس اصلی  ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(matrix[i][j] + "    ");

                }
                System.out.println( );
            }

            System.out.println( ": انتخاب کنید(0,1,2)سطر برای حذف بین ");
            int removeRow = scanner.nextInt();
            System.out.println(" ستون برای حذف بین انتخاب کنید:(0و1و2)");
            int removeCol = scanner.nextInt();

            int[][]newMatrix = new int[2][2];
            int newII = 0;
            for (int i = 0; i < 2; i++) {
                if (i==removeRow) continue;
int newjj =0;
                for (int j = 0; j < 2; j++) {
                    if (j==removeCol) continue;
                    newMatrix[newII][newjj]=matrix[i][j];
                    newjj++;

                }
                newII++;
            }
            System.out.println("ماتریکس جدید");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2 ; j++) {
                    System.out.println(newMatrix[i][j] + "");

                }
                System.out.println(    );


            }
        }
    }






