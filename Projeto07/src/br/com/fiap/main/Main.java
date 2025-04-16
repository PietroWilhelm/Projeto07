package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*---------TV-----------*");
        Scanner scan = new Scanner(System.in);
        Televisor tv = new Televisor();
        /*
        tv.setCanal(17);
        tv.setVolume(19);
        tv.aumentarVolume();
        tv.aumentarVolume();*/


        int escolha;
        try {

            System.out.println("Digite um Canal: ");
            tv.setCanal(scan.nextInt());
            System.out.println("Digite o volume: ");
            tv.setVolume(scan.nextInt());

            System.out.println("Faça sua escolha (1)\n definir novo canal\n (2) definir novo volume \n(3) aumentar volume \n(4) Diminir volume");
            escolha = scan.nextInt();

            if (escolha == 1){
                System.out.println("Digite um novo canal");
                tv.setCanal(scan.nextInt());
            }else if (escolha == 2){
                System.out.println("Digite um novo volume");
                tv.setVolume(scan.nextInt());
            }else if (escolha == 3){
                System.out.println("Aumentar volume");
                tv.setVolume(scan.nextInt());
            }
            else{
                System.out.println("Diminuir volume");
                tv.setVolume(scan.nextInt());
            }
            System.out.printf("\nCanal: %d \nVolume: %d", tv.getCanal(), tv.getVolume());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
