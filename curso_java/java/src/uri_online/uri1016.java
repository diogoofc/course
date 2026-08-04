package uri_online;

import java.util.Locale;
import java.util.Scanner;

public class uri1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        int total = distancia * 2;

        System.out.println(+total+ " minutos");

        sc.close();
    }
}
