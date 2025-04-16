package br.com.fiap.main;

import br.com.fiap.bean.ArCondiconado;
import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*---------TV-----------*");
        Scanner scan = new Scanner(System.in);
        ArCondiconado arcondiconado = new ArCondiconado();
        /*
        tv.setCanal(17);
        tv.setVolume(19);
        tv.aumentarVolume();
        tv.aumentarVolume();*/


        int escolha;
        try {

            System.out.println("Digite um modo: ");
            arcondiconado.setModo(scan.next());
            System.out.println("Digite o temperaturaa: ");
            arcondiconado.setTemperatura(scan.nextInt());

            System.out.println("Faça sua escolha \n (1) definir novo modo\n (2) aumentar temperatura \n(3) diminuir temperatura");
            escolha = scan.nextInt();

            if (escolha == 1){
                System.out.println("Digite um novo modo");
                arcondiconado.setModo(scan.next());
            }else if (escolha == 2){
                System.out.println("Aumentando temperatura");
                arcondiconado.aumentarTemperatura(scan.nextInt());
            }else{
                System.out.println("Diminuir temperatura");
                arcondiconado.diminuirTemperatura(scan.nextInt());
            }
            System.out.printf("\nModo: %s \nTemperatura: %d", arcondiconado.getModo(), arcondiconado.getTemperatura());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
