package MainProgram.Personagens;

import MainProgram.Metodos.MetodosCalc;

public class Barbaro extends MetodosCalc implements IPersonagem {
    String nome = "Barbaro";
    int pdV = 13;
    int forca = 6;
    int defesa = 1;
    int agilidade = 3;
    int fdD = dadode6() + dadode6();
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
