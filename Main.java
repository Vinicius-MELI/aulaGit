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


import java.util.Scanner;

public class Main {
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


import java.util.Scanner;

public class Main {
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
