programa {
  inclua biblioteca Matematica

  funcao inicio() {

real nota1, nota2, nota3, nota4, media

escreva ("Vamos descobrir sua m�dia final, digite sua primeira nota: ")
leia (nota1)

escreva ("Agora digite sua segunda nota: ")
leia (nota2)

escreva ("Digite sua terceira nota: ")
leia (nota3)

escreva ("E ent�o sua quarta nota: ")
leia (nota4)


media = (nota1 + nota2 + nota3 + nota4)/ 4

escreva ("Sua m�dia �: ", Matematica.arredondar (media, 1))


    
  }
}
