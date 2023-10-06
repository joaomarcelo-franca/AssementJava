package MainProgram.Metodos;

import MainProgram.Users.Jogador;
import MainProgram.Users.Maquina;

public class MetodosAtaque {
    static int rodadas = 0;
    public static void ataqueJogador(Jogador jogador, Maquina maquina){
        System.out.println("Vez do Jogador: " + jogador.getNickname() + " jogando com " + jogador.getNome());
        if (jogador.getAtaque() > maquina.getDefesa()){
            System.out.println(jogador.getNome() + " Atacou!!!");
            System.out.println("A Defesa de " + maquina.getNome() + " não aguentou");
            maquina.setVida(maquina.getVida() - jogador.getDano());
            System.out.println(maquina.getNome() + " tomou " + jogador.getDano() + " pontos de dano!");
            System.out.println("Vida de "+ maquina.getNome() + ": " + maquina.getVida());
            System.out.println();
            if (maquina.getVida() <= 0){
                System.out.println(maquina.getNome() + " Morreu...");
                System.out.println(jogador.getNome() + " é o vencedor da Batalha!!!");
                jogador.setVencedor(true);
            } else {
                ataqueMaquina(jogador,maquina);
            }
        }else{
            System.out.println(maquina.getNome() + " Defendeu...");
            System.out.println("A Defesa de " + maquina.getNome() + " aguentou o ataque!!!");
            System.out.println(maquina.getNome() + " tomou 0 de pontos de dano");
            System.out.println("Agora é a vez de " + maquina.getNome());
            System.out.println();
            ataqueMaquina(jogador, maquina);
        }
        rodadas++;
    }
    public static void ataqueMaquina(Jogador jogador, Maquina maquina){
        System.out.println("Vez da Maquina jogando com " + maquina.getNome());
        if (maquina.getAtaque() > jogador.getDefesa()){
            System.out.println(maquina.getNome() + " Atacou!!!");
            System.out.println("A Defesa de " + jogador.getNome() + " não aguentou");
            jogador.setVida(jogador.getVida() - maquina.getDano());
            System.out.println(jogador.getNome() + " tomou " + maquina.getDano() + " pontos de dano!");
            System.out.println("Vida de "+ jogador.getNome() + ": " + jogador.getVida());
            System.out.println();
            if (jogador.getVida() <= 0){
                System.out.println(jogador.getNome() + " Morreu...");
                System.out.println(maquina.getNome() + " é o vencedor da Batalha!!!");
                jogador.setVencedor(false);
            } else {
                ataqueJogador(jogador,maquina);
            }
        } else {
            System.out.println(jogador.getNome() + " Defendeu...");
            System.out.println("A Defesa de " + jogador.getNome() + " aguentou o ataque!!!");
            System.out.println(jogador.getNome() + " tomou 0 de pontos de dano");
            System.out.println("Agora é a vez de " + jogador.getNome());
            System.out.println();
            ataqueJogador(jogador, maquina);
        }
        rodadas++;
    }
    public static int getNumeroRodadas(){
        return rodadas;
    }
}
