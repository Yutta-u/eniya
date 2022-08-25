import java.util.Scanner;

public class eniya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int mult = a * b * c;

        System.out.println(mult * 2);
    }
}
