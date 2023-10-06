package MainProgram.Users;

import MainProgram.Metodos.MetodosCalc;
import MainProgram.Personagens.IPersonagem;

public class Jogador {
    IPersonagem classe;
    String nickname;
    private boolean vencedor;
    public int getCalcInit() {
        return MetodosCalc.calcIni(classe.getAgilidade());
    }
    public Jogador(IPersonagem classe, String nickname) {
        this.classe = classe;
        this.nickname = nickname;
    }
    public int getAtaque(){
        return MetodosCalc.dadode10() + classe.getAgilidade() + classe.getForca();
    }
    public int getDefesa(){
        return MetodosCalc.dadode10() + classe.getAgilidade() + classe.getDefesa();
    }
    public int getDano(){
        return classe.getDano() + classe.getForca();
    }
    public String getNickname() {
        return nickname;
    }
    public String getNome(){
        return classe.getNome();
    }
    public void setVida(int novaVida){
        classe.setVida(novaVida);
    }
    public int getVida(){
        return classe.getVida();
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }
}
