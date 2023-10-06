package MainProgram.Users;

import MainProgram.Metodos.MetodosCalc;
import MainProgram.Personagens.IPersonagem;

public class Maquina {
    IPersonagem maquina;
    public Maquina(IPersonagem classe) {
        maquina = classe;
    }
    public int getCalcInit(){
        return MetodosCalc.calcIni(maquina.getAgilidade());
    }
    public int getAtaque(){
        return MetodosCalc.dadode10() + maquina.getAgilidade() + maquina.getForca();
    }
    public int getDefesa(){
        return MetodosCalc.dadode10() + maquina.getAgilidade() + maquina.getDefesa();
    }
    public int getDano(){
        return maquina.getDano() + maquina.getForca();
    }
    public String getNome(){
        return maquina.getNome();
    }
    public int getVida(){
        return maquina.getVida();
    }

    public void setVida(int novaVida){
        maquina.setVida(novaVida);
    }
}
