package exp02;

import java.util.Arrays;
import java.util.Scanner;

public class E5_18 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter three strings: ");
            String[] strings = new String[3];
            for (int i = 0; i < 3; i++) {
                strings[i] = scanner.next();
            }

            // مرتب‌سازی آرایه
            Arrays.sort(strings);

            // چاپ نتیجه
            for (String str : strings) {
                System.out.println(str);
            }

            scanner.close();
        }
    }


