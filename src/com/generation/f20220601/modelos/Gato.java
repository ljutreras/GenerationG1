package com.generation.f20220601.modelos;

public class Gato  extends Mascota {

    //La palabra EXTENDS, significa qie estamos usando herencias
    private Boolean garrasRetractil;
    private Boolean visionNocturna;
    private String sonidoVocal;

    public Gato() {
    }

    public Gato(Boolean garrasRetractil, Boolean visionNocturna, String sonidoVocal) {
        this.garrasRetractil = garrasRetractil;
        this.visionNocturna = visionNocturna;
        this.sonidoVocal = sonidoVocal;
    }

    public Boolean getGarrasRetractil() {
        return garrasRetractil;
    }

    public void setGarrasRetractil(Boolean garrasRetractil) {
        this.garrasRetractil = garrasRetractil;
    }

    public Boolean getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(Boolean visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public String getSonidoVocal() {
        return sonidoVocal;
    }

    public void setSonidoVocal(String sonidoVocal) {
        this.sonidoVocal = sonidoVocal;
    }

    //@Override es la sobreescritura del metodo
    //SUPER te enlaza directamente a la herencia Padre sin necesidad de invocar
    //En este caso te invoca a MASCOTA sin necesidad de crear MASCOTA como Objeto
    @Override
    public String toString() {
        return "Gato{" +
                "garrasRetractil=" + garrasRetractil +
                ", visionNocturna=" + visionNocturna +
                ", sonidoVocal='" + sonidoVocal + '\'' + " " + super.toString() + '}';
    }

    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }
}
