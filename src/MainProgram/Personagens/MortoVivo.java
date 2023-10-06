package MainProgram.Personagens;

import MainProgram.Metodos.MetodosCalc;

public class MortoVivo extends MetodosCalc implements IPersonagem {
    String nome = "MortoVivo";
    int pdV = 25;
    int forca = 4;
    int defesa = 0;
    int agilidade = 1;
    int fdD = dadode4() + dadode4();
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
