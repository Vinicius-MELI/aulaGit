programa {
  funcao inicio() {

        inteiro numero1, numero2

         escreva ("Digite o primeiro n�mero do intervalo: ")
         leia (numero1)

          escreva ("Digite o �ltimo n�mero do intervalo: ")
         leia (numero2)

        enquanto (numero2 < numero1)
        {
          escreva ("Intervalo inv�lido!")
        pare
        }

        se (numero1 % 3 == 0 e numero2 % 3 == 0 e numero1 % 5 ==0 e numero2 %5 ==0)
        {
          escreva (numero1, " � m�ltiplo de 5 e 3\n")
          escreva (numero2, " � m�ltiplo de 5 e 3\n")
        }
           
  }
}

programa {
  funcao inicio() {

    inteiro numero, totalDeNumerosPares, totalDeNumeroImpares, contadorNumero

    contadorNumero = 1
    totalDeNumeroImpares = 0
    totalDeNumerosPares = 0

      escreva("Digite n�meros aleat�rios para saber quantos s�o pares ou impares: ")

  para (contadorNumero; contadorNumero<=10; contadorNumero++)
    {
			escreva("\n Digite o ", contadorNumero, "� n�mero: ")
      leia(numero)

    se (numero % 2 == 0)
    {totalDeNumerosPares ++}
    senao
    {totalDeNumeroImpares ++}

		}

      escreva ("Total de n�meros pares: ", totalDeNumerosPares)
      escreva ("\nTotal de n�meros �mares:", totalDeNumeroImpares)
    
  }
}

programa
{
	funcao inicio()
  {
		inteiro numero
    inteiro soma = 0

    faca 
    {
      escreva ("Digite um n�mero: ")
      leia (numero)

    se (numero > 0)
      soma += numero
    }
    
    enquanto (numero !=  0)
			escreva("\nDescubra a soma dos n�meros positivos: ", soma)


  }
}