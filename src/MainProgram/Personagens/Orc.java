package MainProgram.Personagens;

import MainProgram.Metodos.MetodosCalc;

public class Orc extends MetodosCalc implements IPersonagem {
    String nome = "Orc";
    int pdV = 20;
    int forca = 6;
    int defesa = 2;
    int agilidade = 2;
    int fdD = dadode8();
    public int getFdD() {
        return fdD;
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
