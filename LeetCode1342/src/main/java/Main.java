import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv in tal: ");
        String tal = in.nextLine();
        int num = Integer.parseInt(tal);
        numberOfSteps(num);
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }
        System.out.println(count);
        return count;
    }
}
