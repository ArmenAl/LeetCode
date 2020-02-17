import java.util.Scanner;

public class MainStart {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tal = in.nextLine();
        System.out.println("Skriv in tal: " + tal);
        int num = Integer.parseInt(tal);
    }

}
