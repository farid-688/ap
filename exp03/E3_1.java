package exp03;
import java.util.Scanner;

public class E3_1 {
        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            System.out.println(":تعداد سطر های ماتریس اول");
            int ras1=scanner.nextInt();
            System.out.println(":تعداد ستون ماتریس اول");
            int sot1=scanner.nextInt();

            System.out.println(":تعداد سطر های ماتریس دوم");
            int ras2= scanner.nextInt();
            System.out.println(":تعداد ستون های ماتریس دوم ");
            int sot2 = scanner.nextInt();
            if (sot1 != ras2){
                System.out.println(":امکان ضرب وجود ندارد ");
                return;
            }
            int [][] matrix1= new int[ras1][sot1];
            int [][] matrix2= new int [ras2][sot2];
            int[][] result = new int[ras1][sot2];

            System.out.println("عناصر ماتریس اول");
            for (int i = 0; i < ras1; i++) {
                for (int j = 0; j <sot1 ; j++) {
                    System.out.println("[" + i + "["+j+"]:");
                    matrix1[i][j]=scanner.nextInt();
                }
            }
            System.out.println("عناصر ماتریس دوم");
            for (int i = 0; i < ras2; i++) {
                for (int j = 0; j <sot2 ; j++) {
                    System.out.println("[" + i + "["+j+"]:");
                    matrix1[i][j]=scanner.nextInt();
                }
            }
            for (int i = 0; i < ras1; i++) {
                for (int j = 0; j < sot2; j++) {
                    for (int k = 0; k < sot1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println(":نتیجه ضرب دو ماتریس");
            for (int i =0 ; i<ras1; i++) {
                for (int j = 0; j < sot2; j++) {
                    System.out.println(result[i][j] + "   ");
                }
                System.out.println(       );


            }



        }



    }


