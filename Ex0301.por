// primeiro

programa {
  funcao inicio() {

    inteiro numero

  escreva ("Digite um número: ")
  leia (numero)

  se (numero % 2 == 0 e numero > 0)
  escreva ("O número ", numero , " é par e positivo!")

  senao se (numero % 2 != 0 e numero > 0)
  escreva ("O número "+ numero + " é ímpar e positivo!")

  senao se (numero % 2 == 0 e numero < 0)
  escreva ("O número ", numero, " é par e negativo")

  senao se (numero % 2 != 0 e numero < 0) 
  escreva ("O número "+ numero + " é ímpar e negativo!")

  senao escreva ("zero")


  }
}


// segundo
programa {
funcao inicio()
	{
		inteiro codigoDoProduto, quantidade, produto, valorTotal

		escreva ("# ## ### #### #########   MENU   ########## #### ### ## #\n")
    escreva ("Digite aqui o número do seu pedido\n")
		
		escreva ("1 Cachorro-quente - R$ 10,00\n")
		escreva ("2 X-Salada - R$ 15,00\n")
		escreva ("3 X-Bacon - R$ 18,00\n")
    escreva ("4 Bauru - R$ 12,00\n")
    escreva ("5 Refrigerante - R$ 8,00\n")
    escreva ("6 Suco de laranja - R$ 13,00\n")
    

		leia (codigoDoProduto)

		se (codigoDoProduto > 6 ou codigoDoProduto < 1)
    escreva ("Digite um número entre 1 e 6.")	
		escolha (codigoDoProduto)
		{
			caso 1:
				escreva ("Quantidade?: ")
        leia (quantidade)
        escreva ("Produto: Cachorro-Quente\n", "Valor Total R$ ", (quantidade * 10))
        pare
			caso 2:
				escreva ("Quantidade?: ")
        leia (quantidade)
        escreva ("Produto: X-Salada\n", "Valor Total R$ ", (quantidade * 15))
        pare
      caso 3:
				escreva ("Quantidade?: ")
        leia (quantidade)
        escreva ("Produto: X-Bacon\n", "Valor Total R$ ", (quantidade * 18))
        pare
      caso 4:
				escreva ("Quantidade?: ")
        leia (quantidade)
        escreva ("Produto: Bauru\n", "Valor Total R$ ", (quantidade * 12))
        pare
      caso 5:
				escreva ("Quantidade?: ")
        leia (quantidade)
        escreva ("Produto: Refrigerante\n", "Valor Total R$ ", (quantidade * 8))
        pare
      caso 6:
				escreva ("Quantidade?: ")
        leia (quantidade)
        escreva ("Produto: Suco de laranja\n", "Valor Total R$ ", quantidade * 13))
        pare
		}
		
	}
}


// terceiro

programa {

funcao inicio() 
{

inteiro idade

escreva ("Digite a idade: ")

leia (idade)

se (idade >= 16 e idade < 18)
escreva ("A pessoa está apta a votar e o voto é facultativo.")

senao se (idade >= 18 e idade < 65)
escreva ("A pessoa está apta a votar e o voto é obrigatório.")

senao se (idade >= 65)
escreva ("A pessoa está apta a votar e o voto é facultativo.")

senao escreva ("A pessoa não está apta a votar.")


    
  }
}


// quarto 


programa {

  funcao inicio() {
    inteiro salario
    
    escreva ("Digite o Salário: ")
    leia (salario)

    se (salario <= 2000 ou >= 0)
    escreva ("Isento")

    senao se (salario > 2000 e salario <= 3000)
    
    escreva ("Imposto de Renda: ", salario * 8/100)

    senao se (salario > 3000 e salario <= 4500)
    escreva ("Imposto de Renda: ", salario * 18/100)

    senao
    escreva ("Imposto de Renda: ", salario * 28/100)








    
  }
}


// quinto

programa {
  funcao inicio() {

    escreva ("Diga se o animal é vertebrado ou invertebrado: ")

    cadeia vertebras, tipo, alimentacao
    leia (vertebras)

    
      se (vertebras == "vertebrado")

    {
      escreva ("ave ou mamifero: ")
      leia (tipo)
      
      se (tipo == "ave")
    {
      escreva ("carnivoro ou onivoro? ")
      leia (alimentacao)

      se (alimentacao == "carnivoro")
      escreva ("Águia")

      senao escreva ("pomba")
    }
    }

    se (tipo == "mamifero")
    { 
      escreva ("onivoro ou herbivoro? ")
      leia (alimentacao)

      se (alimentacao == "herbivoro")

    escreva ("vaca")

      senao escreva ("homem")

    }
    

    senao se (vertebras == "invertebrado")
    {
      escreva ("inseto ou anelideo: ")
      leia (tipo)
      
      se (tipo == "inseto")
    {
      escreva ("hematofago ou herbivoro? ")
      leia (alimentacao)

      se (alimentacao == "hematofago")
      escreva ("Pulga")

      senao escreva ("Lagarta")

  }
   se (tipo == "anelideo")
{
      escreva ("hematofago ou onivoro? ")
      leia (alimentacao)

      se (alimentacao == "hematofago")
      escreva ("Sanguessuga")

      senao escreva ("Minhoca")

}
}