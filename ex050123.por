programa
{
	
	funcao inicio()
	{
		inteiro vetorInteiros[10], j, i, copia, tamanho
		
    tamanho = 10

    para(inteiro indice=0; indice < 10; indice ++){
			escreva("Digite o ", indice + 1, "º Numero: \n")
			leia(vetorInteiros[indice])
		}

		para(i = 0; i < tamanho - 1; i++){
      		para(j = 0; j < tamanho - 1 - i; j++){
		        se(vetorInteiros[j] < vetorInteiros[j+1]){
		          copia = vetorInteiros[j]
		          vetorInteiros[j] = vetorInteiros[j+1]
		          vetorInteiros[j+1] = copia
		        }
      		}
    		}
    		
		escreva("\nVetor: \n")
		
		para(inteiro indice=0; indice < tamanho; indice ++){
			escreva(indice + 1, "º Numero: ", vetorInteiros[indice], "\n")
		}
		
	}
}


programa
{
	
	funcao inicio()
	{
	
		real matrizInteiros[10][4], tamanhoI, tamanhoJ, soma=0, vetorSoma[10]

		
		tamanhoI = 10
		tamanhoJ = 4
		
		
		para(inteiro indiceI=0; indiceI < tamanhoI; indiceI++)
      {
			para(inteiro indiceJ=0; indiceJ < tamanhoJ; indiceJ++)
      {
			
				escreva("Digite as notas do aluno número: ", indiceI + 1, ", do bimestre ", indiceJ + 1, "º: ")
				leia(matrizInteiros[indiceI][indiceJ])
			}
		  }

		  para(inteiro indiceI=0; indiceI < tamanhoI; indiceI++)
      {
			para(inteiro indiceJ=0; indiceJ < tamanhoJ; indiceJ++)
      {	
				soma += matrizInteiros[indiceI][indiceJ]
			}

			vetorSoma[indiceI] = soma
		
			soma = 0 
			
		  }

		  para(inteiro indiceJ=0; indiceJ < tamanhoJ; indiceJ++)
      {
  			escreva("\nSoma de todas as notas do aluno ", indiceJ + 1, " é: ", vetorSoma[indiceJ])
	  	}
		
	}
}