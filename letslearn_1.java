import java.util.Scanner;
public class letslearn_1 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; ++i) {
            System.out.print("Enter five integers");
            int n = scanner.nextInt();
            sum += n;
        }

        System.out.println("The sum is:" + sum);
        scanner.close();
    }
}
