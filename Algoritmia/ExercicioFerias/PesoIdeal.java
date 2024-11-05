/*1 – Peso Ideal
Objetivo: Desenvolver um pequeno programa que permita apresentar o peso ideal do utilizador.
Informação Adicional
Assuma que:
- O peso ideal para homens é: Altura * 72.7 – 58
- O peso ideal para mulheres é: Altura * 62 – 44.7
Requisitos:
• Começar por perguntar ao utilizador se é homem ou mulher. O utilizador terá de escrever a 
palavra “homem” ou a palavra “mulher” para que o programa possa prosseguir e apresentar 
o peso ideal. Se o utilizador não escrever uma destas duas palavras, o programa deverá dar 
uma resposta indicando que não compreendeu o que foi escrito e terá de pedir que escreva 
novamente.
• Posteriormente o programa deverá solicitar a altura do utilizador. Não é necessário fazer 
validações para a altura, assuma que o utilizador irá introduzir um número real positivo.
• Por fim, o programa deverá apresentar a altura ideal do utilizador.*/

import java.util.Scanner;

class PesoIdeal {
    Scanner scanUser = new Scanner(System.in);

    PesoIdeal() {
        inputUser();
    }

    void inputUser() {
        String scanSexo;
        do {
            System.out.println("Digite 'homem' ou 'mulher' para declarar seu sexo: ");
            scanSexo = scanUser.nextLine();
            if (!scanSexo.equals("homem") && !scanSexo.equals("mulher")) {
                System.out.println("Opção Incorreta: Valide Novamente.");
            }
        } while (!scanSexo.equals("homem") && !scanSexo.equals("mulher"));

        alturaUser(scanSexo);
    }

    void alturaUser(String sexo) {
        System.out.println("Digite sua altura em metros: ");
        float altura = scanUser.nextFloat();
        double idealPeso;
        if (sexo.equals("homem")) {
            idealPeso = altura * 72.7 - 58;
        } else {
            idealPeso = altura * 62 - 44.7;
        }
        System.out.println("Seu peso ideal é: " + idealPeso);
    }

    public static void main(String[] args) {
        new PesoIdeal();
    }
}
