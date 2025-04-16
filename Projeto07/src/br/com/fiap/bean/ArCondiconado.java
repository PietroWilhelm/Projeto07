package br.com.fiap.bean;
// criacao da classe e seus atributos
public class ArCondiconado {
    private int temperatura;
    private String modo;

    // Getters e Setters
    public int getTemperatura() {return temperatura;}

    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 0 && temperatura <= 30) {
                this.temperatura = temperatura;
            }else {
                throw new Exception("Tempetura fora faixa permitida!, maximo permetido e 30");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getModo() {return modo;}

    public void setModo(String modo) {
        try {
            if (modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar") ){
                this.modo = modo;
            }else {
                throw new Exception("O modo que voce selecinou nao existe");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // métodos das classe (particulares)
    public void aumentarTemperatura(int temperatura){
        if (temperatura < 30){
            temperatura++;
        }

    }

    public void diminuirTemperatura(int temperatura){
        if (temperatura > 0){
            temperatura--;
        }

    }
}
