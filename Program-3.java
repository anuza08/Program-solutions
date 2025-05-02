import java.util.Scanner;

public class OddTillValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int num = 1;
        while (num <= a) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
