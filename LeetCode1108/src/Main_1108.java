import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main_1108 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //System.out.print("Skriv in IP adress: ");
        //String tal = in.nextLine();
        String address1 = "1.1.1.1";
        String address2 = "255.100.50.0";
        defangIPaddr(address1);
        defangIPaddr(address2);
    }


    public static String defangIPaddr(String address) {

        System.out.println(address.replace(".", "[.]"));
        return address;
    }
}
