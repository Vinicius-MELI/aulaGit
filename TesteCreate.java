package personagens;

import tipos.Saiajyn;

import java.util.Scanner;

public class TesteCreate {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        Saiajyn novo = new Saiajyn("loiro", "kamehamehaaaaaaa", "Goku");
        String nome;


        System.out.println("Qual o seu nome?");
        nome = ler.next();
        novo.setNome(nome);

        System.out.println("Então seu nome é " + nome + "?" + "\nProve dando um " + novo.getPoder() + "\n");



        novo.setNome("Vegeta");


        System.out.println("\nObrigado por salvar o mundo " + novo.getNome() + ". Achei lindo seu cabelo " + novo.getCabelo() + " e seu");

        novo.setPoder("\nFinaaal Flaaash!");

       novo.visuDoPoder();

    }




}
