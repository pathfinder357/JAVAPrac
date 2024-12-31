
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //제목
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //요리 별점
        Scanner sc1 = new Scanner(System.in);
        float Star = sc1.nextFloat();
        int convertStar = (int) Star;
        float Percent = ((float) convertStar/ 5)* 100;
        // 넘버링 문자열
        Scanner sc2 = new Scanner(System.in);
        String input2 = sc2.nextLine();
        String input3 = sc2.nextLine();
        String input4 = sc2.nextLine();
        String input5 = sc2.nextLine();
        String input6 = sc2.nextLine();
        String input7 = sc2.nextLine();
        String input8 = sc2.nextLine();
        String input9 = sc2.nextLine();
        String input10 = sc2.nextLine();
        String input11 = sc2.nextLine();
        // 입력부
        System.out.println("[ " + input + " ]");
        System.out.println("별점: "+convertStar + " ("+Percent + "%"+")");
        System.out.println("1. "+ input2);
        System.out.println("2. "+ input2);
        System.out.println("3. "+ input2);
        System.out.println("4. "+ input2);
        System.out.println("5. "+ input2);
        System.out.println("6. "+ input2);
        System.out.println("7. "+ input2);
        System.out.println("8. "+ input2);
        System.out.println("9. "+ input2);
        System.out.println("10. "+ input2);
    }
}