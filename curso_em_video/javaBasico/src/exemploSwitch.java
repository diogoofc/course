public class exemploSwitch {
    public static void main (String[] args) {
        char nota  = 'A';

        switch (nota) {
            case 'A':
                System.out.println("Aluno aprovado");
                break;
            case 'B':
                System.out.println("Alio aprovado");
                break;
            case 'C':
                System.out.println("Aluno aprovado");
                break;
            default:
                System.out.println("Aluno reprovado !");
        }

    }
}
