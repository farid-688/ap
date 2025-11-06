package exp03;

import java.util.Scanner;

public class E3_6 {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int[][] sumMatrix = new int[2][2];
        System.out.println(":عدد برای ماتریکس مورد نظر وارد کنید");
        sumMatrix[0][0]= scanner.nextInt();
        sumMatrix[0][1] = scanner.nextInt();
        sumMatrix[1][0] = scanner.nextInt();
        sumMatrix[1][1] = scanner.nextInt();

        System.out.println("نتیجه ");
        System.out.println(sumMatrix[0][0] +"   "+ sumMatrix[0][1]);
        System.out.println(sumMatrix[1][0] +"   "+ sumMatrix[1][1]);
        int sum = sumMatrix[0][0] + sumMatrix[0][1] + sumMatrix[1][0] + sumMatrix[1][1];

        System.out.println(":مجموعه ماتریکس برابر است با" + sum);


    }
}