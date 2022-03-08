import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word so that I could reverse it");
        String str = in.nextLine();

        //System.out.println(StringUtils.isNumeric(str));

        if(!StringUtils.isNumeric(str)) {
            System.out.println(StringUtils.reverse(str));;
            System.out.println(StringUtils.swapCase(str));
        } else {
            System.out.println("you didn't enter a string");
        }


    }
}
