package Desafios;

/*
Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos). A saída deverá ser o reverso de um
número inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.

Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos e continuar a programação
até a resposta final.
 */

import java.util.Scanner;

public class NumeroReverso {

    public static void Reverso() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite  um valor inteiro e positivo (este número deverá conter 4 dígitos): ");
            int numero = sc.nextInt();
            String numeroString = String.valueOf(numero);
            if(numero >= 1000 && numero <= 9999){
                StringBuilder stringBuilder = new StringBuilder(numeroString);
                System.out.println(stringBuilder.reverse());
                break;
            }else if(numeroString.length() <4 ){
                System.out.println("Numero informado deve conter 4 dígitos");
            }
        } while (true);
    }
}
