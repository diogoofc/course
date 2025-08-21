public class Casting {
    public static void main(String[] args) {

        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString();

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();



        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " "  + numeroString);
        System.out.println(numeroDouble + " " + numeroDoubleString);
    }
}

