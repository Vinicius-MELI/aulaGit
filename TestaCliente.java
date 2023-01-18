import java.util.Scanner;
public class TestaCliente {



    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Cliente novoCliente = new Cliente();

        System.out.println("Qual o seu nome?");
        String nome = ler.next();
        novoCliente.setName(nome);

        System.out.println(novoCliente.getName() + " Digite o número do seu RG: ");

        int rg = ler.nextInt();
        novoCliente.setRg(rg);

        novoCliente.info();


    }


}
