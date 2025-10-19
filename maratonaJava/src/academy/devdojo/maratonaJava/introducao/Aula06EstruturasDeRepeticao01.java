package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int contatdor = 0;
        while(contatdor < 10){
            System.out.println(contatdor);
            contatdor++;
        }
        contatdor = 0;
        do{
            System.out.println("Dentro do do-while");
            contatdor++;
        }while (contatdor < 10);

        for(int i=0 ; i<10; i++){
            System.out.println("for "+ i);

        }
    }

}
