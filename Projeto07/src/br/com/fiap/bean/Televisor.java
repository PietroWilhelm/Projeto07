package br.com.fiap.bean;

public class Televisor {
    // Atributos
    private int volume;
    private int canal;

    // Métodos Getters/Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        try {
            if (volume >= 0 && volume <= 20){
                this.volume = volume;
            }else {
                throw new Exception("Volume fora faixa permitida! (min=0 até max=100)");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal ==13){
                this.canal = canal;
            }else {
                throw new Exception("Canal fora faixa permitida! (min=2 até max=13 dentro dos canais 4, 5, 7 e 13 qualquer coisa fora disso não é permitido)");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    // métodos das classe (particulares)
    public void aumentarVolume(){
        if (volume < 20){

        }
        volume++;
    }

    public void diminuirVolume(){
        if (volume > 0){

        }
        volume--;
    }
}

