package Exercicios;

import java.util.Scanner;

public class ex100123 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float salario, abono, novoSalario;


        System.out.println("Digite o valor do salário: ");
        salario = ler.nextInt();

        System.out.println("Digite o valor do abono: ");
        abono = ler.nextInt();

        novoSalario = salario + abono;
        System.out.printf("Valor do novo salário é %.2f", novoSalario);

    }
    }


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;


        System.out.println("Digite sua primeira nota: ");
        nota1 = ler.nextInt();

        System.out.println("Digite sua segunda nota: ");
        nota2 = ler.nextInt();

        System.out.println("Digite sua terceira nota: ");
        nota3 = ler.nextInt();

        System.out.println("Digite sua quarta nota: ");
        nota4 = ler.nextInt();


        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("\nSua média é %.2f", media);

        }
        }


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;


        System.out.println("Digite seu salário bruto: R$ ");
        salarioBruto = ler.nextInt();

        System.out.println("Digite seu adicional noturno: R$ ");
        adicionalNoturno = ler.nextInt();

        System.out.println("Digite suas horas extras: R$ ");
        horasExtras = ler.nextInt();

        System.out.println("Digite seus descontos: R$ ");
        descontos = ler.nextInt();


        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Sua média é %.2f", salarioLiquido);

        }
        }


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float numero1, numero2, numero3, numero4, diferenca;


        System.out.println("Digite o primeiro número: ");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = ler.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero3 = ler.nextInt();

        System.out.println("Digite o quarto número");
        numero4 = ler.nextInt();


        diferenca = (numero1 * numero2) - (numero3 * numero4);

        System.out.printf("A difereça entre os números é %.2f", diferenca);

        }
        }

