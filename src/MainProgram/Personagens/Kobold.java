package MainProgram.Personagens;

import MainProgram.Metodos.MetodosCalc;

public class Kobold extends MetodosCalc implements IPersonagem {
    String nome = "Kobold";
    int pdV = 20;
    int forca = 4;
    int defesa = 2;
    int agilidade = 4;
    int fdD = dadode2() + dadode2() + dadode2();
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
    public int getAgilidade() {
        return agilidade;
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
