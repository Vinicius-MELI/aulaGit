programa {
  inclua biblioteca Matematica

  funcao inicio() {
    
    real salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido



    escreva ("\nDigite aqui qual o seu salário bruto: ")
    leia (salarioBruto)

    escreva ("\nDigite o valor do seu adicional noturno: ")
    leia (adicionalNoturno)

    escreva ("\nQual seu saldo de horas extras: ")
    leia (horasExtras)
    horasExtras = horasExtras * 5
    escreva ("Saldo horas extras atualizado: ", horasExtras)

    escreva ("\nPreencher o valor do adiantamento salarial: ")
    leia (descontos)

    salarioLiquido = (salarioBruto + adicionalNoturno + horasExtras) - descontos



    escreva ("\n Salário Líquido: ", salarioLiquido)




  }
}
