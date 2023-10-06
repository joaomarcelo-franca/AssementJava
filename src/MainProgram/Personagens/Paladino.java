package MainProgram.Personagens;

import MainProgram.Metodos.MetodosCalc;

public class Paladino extends MetodosCalc implements IPersonagem {
    String nome = "Paladino";
    int pdV = 15;
    int forca = 2;
    int defesa = 5;
    int agilidade = 1;
    int fdD = dadode4() + dadode4();

    public int getFdD() {
        return fdD;
    }

    public int getPdV() {
        return pdV;
    }

    public int getAgilidade() {
        return agilidade;
    }

    @Override
    public int getVida() {
        return pdV;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getForca() {
        return forca;
    }

    @Override
    public int getDefesa() {
        return defesa;
    }
    @Override
    public int getDano() {
        return fdD;
    }

    @Override
    public void setVida(int vida) {
        pdV = vida;
    }
}
