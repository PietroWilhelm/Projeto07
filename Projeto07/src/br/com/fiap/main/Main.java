package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.setVolume(99);
        radio.setEstacao(89.1f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(92.5f);
        System.out.printf("Estação: %.1fMHZ \nVolume: %d", radio.getEstacao(), radio.getVolume());

        Televisor televisor = new Televisor();
        televisor.setCanal(7);
        televisor.setVolume(19);
        televisor.diminuirVolume();
        televisor.diminuirVolume();
        televisor.setCanal(13);
        System.out.printf("\nCanal: %d \nVolume: %d", televisor.getCanal(), televisor.getVolume());
    }
}
