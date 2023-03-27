import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı gir");
        int n = inp.nextInt();

        for (int a = 1; a <= n - 1; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (n - a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}