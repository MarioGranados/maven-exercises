import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word so that I could reverse it");
        String str = in.nextLine();
        try {
            Integer.valueOf(str);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(StringUtils.reverse(str));
    }
}
