package MainProgram.Personagens;

import MainProgram.Metodos.MetodosCalc;

public class Guerreiro extends MetodosCalc implements IPersonagem {
    String nome = "Guerreiro";
    int pdV = 12;
    int forca = 4;
    int defesa = 3;
    int agilidade = 3;
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
