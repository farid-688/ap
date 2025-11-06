package exp03;
import java.util.Scanner;

    public class E3_4 {
        public static void main(String[] args){

            Scanner scanner=new Scanner(System.in);
            int[][] trandMatrix = new int[2][2];
            int[][] transpose = new int[2][2];

            System.out.println(" : ماتریکس 2 در 2 را وارد کنید");
            trandMatrix[0][0]=scanner.nextInt();
            trandMatrix[0][1]=scanner.nextInt();
            trandMatrix[1][0]=scanner.nextInt();
            trandMatrix[1][1]=scanner.nextInt();

            transpose[0][0] = transpose[0][0];
            transpose[0][1] = transpose[1][0];
            transpose[1][0] = transpose[0][1];
            transpose[1][1] = transpose[1][1];

            System.out.println(":ماتریکس اصلی ما : ");
            System.out.println(trandMatrix[0][0] +"  "+ trandMatrix[0][1]);
            System.out.println(trandMatrix[1][0] +"  "+ trandMatrix[1][1]);


            System.out.println(" ماتریکس ترانهاده شده:  ");
            System.out.println(trandMatrix[0][0] +"  "+ trandMatrix[1][0]);
            System.out.println(trandMatrix[0][1] +"  "+ trandMatrix[1][1]);



        }
    }


