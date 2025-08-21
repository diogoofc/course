public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Diogo";
        String nome2 = "Jose";


        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nome2);



        System.out.println("Olá " + nome + " seu nome tem " + tamanhoString + " Caracteres");
        System.out.println("Os nomes são iguais " + saoIguais);
    }
}
