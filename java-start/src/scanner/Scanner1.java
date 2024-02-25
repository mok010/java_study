package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: "); //println -> 줄바꿈, print -> 줄바꿈x
        String str = scanner.nextLine(); //입력을 문자열로
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요 : "); //println -> 줄바꿈, print -> 줄바꿈x
        int intValue = scanner.nextInt(); //입력을 문자열로

        System.out.print("실수를 입력하세요"); //println -> 줄바꿈, print -> 줄바꿈x
        double double1 = scanner.nextDouble(); //입력을 문자열로
        System.out.println("입력한 실수: " + double1);

    }
}
