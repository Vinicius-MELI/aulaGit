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



import java.util.Scanner;
 
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







import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
 
       Scanner ler = new Scanner(System.in);
 
       System.out.println("Diga se o animal é vertebrado ou invertebrado: ");
 
       String vertebras, tipo, alimentacao;
 
       vertebras = ler.nextLine();
 
       if (vertebras == "vertebrado") {
           System.out.println("ave ou mamifero: ");
       }
       tipo = ler.nextLine();
 
       if (tipo == "ave") {
           System.out.println("carnivoro ou onivoro? ");
           alimentacao = ler.nextLine();
 
           if (alimentacao == "carnivoro") {
               System.out.println("Águia");
       else System.out.println("pomba");
 
           }
 
           if (tipo == "mamifero") {
               System.out.println("onivoro ou herbivoro? ");
 
               alimentacao = ler.nextLine();
 
               if (alimentacao == "herbivoro")
                   System.out.println("vaca");
 
               else System.out.println("homem");
 
           } else if (vertebras == "invertebrado") {
               System.out.println("inseto ou anelideo: ");
               tipo = ler.nextLine();
 
               if (tipo == "inseto") {
                   System.out.println("hematofago ou herbivoro? ");
                   alimentacao = ler.nextLine();
 
                   if (alimentacao == "hematofago")
                       System.out.println("Pulga");
 
                   else System.out.println("Lagarta");
 
               }
               if (tipo == "anelideo") {
                   System.out.println("hematofago ou onivoro? ");
                   alimentacao = ler.nextLine();
 
                   if (alimentacao == "hematofago") {
                       System.out.println("Sanguessuga");
 
               else System.out.println("Minhoca");
 
                   }
 
               }
           }
       }
   }
}





















import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero, totalDeNumerosPares, totalDeNumeroImpares;

        Scanner leia = new Scanner(System.in);
        totalDeNumeroImpares = 0;
        totalDeNumerosPares = 0;

        System.out.println ("Digite números aleatórios para saber quantos são pares ou impares: ");

        for (int contadorNumero = 1; contadorNumero<=10; contadorNumero++){
            System.out.println("\n Digite o " + contadorNumero + "º número: ");
            numero = leia.nextInt();

            if (numero % 2 == 0)
                totalDeNumerosPares ++;
            else
                totalDeNumeroImpares ++;

        }

        System.out.println ("Total de números pares: " + totalDeNumerosPares);
        System.out.println ("\nTotal de números ímares:" + totalDeNumeroImpares);




    }
}


    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int numero;
        int soma = 0;

        do{
            System.out.println ("Digite um número: ");
            numero = leia.nextInt();
            if (numero > 0)
                soma += numero;
            else if (numero < 0) System.out.println("Esse número não será somado");

            else System.out.println("Número nulo");

        }

        while (numero !=  0);
        System.out.println ("\nDescubra a soma dos números positivos: " + soma);




    }
}



    public static void main(String[] args) {

        int idade = 0;
        int somaIdadeMaior = 0;
        int somaIdadeMenor = 0;

        Scanner leia = new Scanner(System.in);


        while (idade >= 0) {
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();

            if (idade < 21 && idade > 0) somaIdadeMenor++;
            else if (idade > 50) somaIdadeMaior ++;

        }
        System.out.println("Total de pessoas menores de 21 anos: " + somaIdadeMenor);
        System.out.println("Total de pessoas maiores de 50 anos: " + somaIdadeMaior);



    }
}
