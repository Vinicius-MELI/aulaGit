import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = ler.nextInt ();

        if (numero % 2 == 0 && numero > 0)
            System.out.println ("O número " + numero + " é par e positivo!");

        else if (numero % 2 != 0 && numero > 0)
            System.out.println ("O número "+ numero + " é ímpar e positivo!");

        else if (numero % 2 == 0 && numero < 0)
            System.out.println ("O número " + numero + " é par e negativo");

        else if (numero % 2 != 0 && numero < 0)
            System.out.println ("O número "+ numero + " é ímpar e negativo!");

        else System.out.println ("zero");


    }
}


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int codigoDoProduto, quantidade, produto, valorTotal;

        System.out.println ("# ## ### #### #########   MENU   ########## #### ### ## #\n");

        System.out.println ("1 Cachorro-quente - R$ 10,00\n");
        System.out.println ("2 X-Salada - R$ 15,00\n");
        System.out.println ("3 X-Bacon - R$ 18,00\n");
        System.out.println ("4 Bauru - R$ 12,00\n");
        System.out.println ("5 Refrigerante - R$ 8,00\n");
        System.out.println ("6 Suco de laranja - R$ 13,00\n");

        System.out.println ("Digite aqui o número do seu pedido\n");
        codigoDoProduto = ler.nextInt();

        if (codigoDoProduto > 6 || codigoDoProduto < 1)
            System.out.println ("Digite um número entre 1 e 6.");
        switch (codigoDoProduto)
        {
            case 1:
                System.out.println ("Quantidade?: ");
                quantidade = ler.nextInt();
                System.out.println ("Produto: Cachorro-Quente\n" + "Valor Total R$ " + (quantidade * 10));
                break;
            case 2:
                System.out.println ("Quantidade?: ");
                quantidade = ler.nextInt();
                System.out.println ("Produto: X-Salada\n" + "Valor Total R$ " + (quantidade * 15));
                break;
            case 3:
                System.out.println ("Quantidade?: ");
                quantidade = ler.nextInt();
                System.out.println ("Produto: X-Bacon\n" + "Valor Total R$ " + (quantidade * 18));
                break;
            case 4:
                System.out.println ("Quantidade?: ");
                quantidade = ler.nextInt();
                System.out.println ("Produto: Bauru\n" + "Valor Total R$ " + (quantidade * 12));
                break;
            case 5:
                System.out.println ("Quantidade?: ");
                quantidade = ler.nextInt();
                System.out.println ("Produto: Refrigerante\n" + "Valor Total R$ " + (quantidade * 8));
                break;
            case 6:
                System.out.println ("Quantidade?: ");
                quantidade = ler.nextInt();
                System.out.println ("Produto: Suco de laranja\n" + "Valor Total R$ " + (quantidade * 13));
                break;
        }

    }
}
