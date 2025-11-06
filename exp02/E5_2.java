package exp02;

import java.util.Scanner;

public class E5_2 {

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in );
            System.out.println("Enter a Number: ");
            double nm =scan.nextDouble();
            if (nm ==0 ){
                System.out.println("zore");
            }
            else {
                String result = "   ";
                if( nm > 0 ){
                    result = "positive";
                }
                else  {
                    result = "nagative";
                }
                double nmValue = Math.abs(nm);
                if (nmValue < 1) {
                    result += " small";
                } else if (nmValue > 1000000) {
                    result += " large";
                }

                System.out.println(result);


            }
        }
    }


