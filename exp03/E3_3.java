package exp03;
import java.util.Scanner;

public class E3_3 {
        public static void main(String[] args) {
//        public static int Maxsarsum(int [][]matrix02){
            int[][] matrixmax = {
                    {2, 2, 2},
                    {3, 9, 7},
                    {2, 1, 4}
            };
            if (matrixmax == null || matrixmax.length==0){
                return;
            }
//        System.out.println(" مقدار نا مشخص است:");
            int maxsum = 0;
            int maxRow = 0;
            int currentsum;

            for (int i = 0; i < matrixmax.length; i++) {
                currentsum=0;
                for (int j = 0; j < matrixmax.length; j++) {
                    currentsum=currentsum +matrixmax[i][j];
                    System.out.println("مجوعه سطر " + (i+1) + currentsum);
                    if (currentsum > maxsum){
                        currentsum =maxsum;
                        maxRow = i+1;

                    }
                }
                System.out.println("نتیجه ....");
                System.out.println(":سطر با بیشترین مجموعه" + maxRow);
                System.out.println("مقدار مجموعه:" + maxsum);
            }
        }
    }

