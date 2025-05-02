import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int count = 0;
        int num = 1;
        while (count < a) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}