/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
Leve em consideração o ano com 365 dias e o mês com 30.

(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
 */

package com.mycompany.pergunta_2;

import java.util.Scanner;

public class PERGUNTA_2 {

    public static void main(String[] args) {
        
        int dias;
        double meses;
        int anos;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade em numeros: ");
        int idade = scanner.nextInt();
        
        dias = idade * 365;
        meses = 12 / idade;
           
        System.out.println("Voce tem " + idade + " anos, " + dias +" dias e " + meses + " meses ");
        
        
    }
}
