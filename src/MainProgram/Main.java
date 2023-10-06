package MainProgram;

import MainProgram.GravarLog.GerarLog;
import MainProgram.Metodos.Metodos;
import MainProgram.Metodos.MetodosAtaque;
import MainProgram.Personagens.IPersonagem;
import MainProgram.Users.Jogador;
import MainProgram.Users.Maquina;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        String resultado;
        do {
            System.out.println("Bem Vindo ao jogo Medieval Battle");
            String nickname = Metodos.pegarNickname();
            String classe;
            do {
                classe = Metodos.pegarClasse();
            } while (!Metodos.verificarClasse(classe));
            IPersonagem heroi = Metodos.pegarHeroi(classe);
            IPersonagem monstro = Metodos.pegarMonstro();
            Jogador jogador = new Jogador(heroi, nickname);
            Maquina maquina = new Maquina(monstro);

            Metodos.limparConsole();

            System.out.println("A Batalha Começa!!!!");
            System.out.println("Fase de Luta!!!");
            System.out.println();

            boolean comecaAtaq = Metodos.pegarQuemComeca(jogador, maquina);

            if (comecaAtaq) {
                System.out.println(jogador.getNickname() + " jogando com " + jogador.getNome() + " começara atacando");
                System.out.println();
                MetodosAtaque.ataqueJogador(jogador, maquina);
            } else {
                System.out.println("Maquina começara atacando jogando com " + maquina.getNome());
                System.out.println();
                MetodosAtaque.ataqueMaquina(jogador, maquina);
            }
            if (jogador.isVencedor()){
                System.out.println("Voce Venceu");
                resultado = "Ganhou";
            } else {
                System.out.println("Voce perdeu");
                resultado = "Perdeu";
            }
            LocalDate localDate = LocalDate.now();
            String data = localDate.getDayOfMonth() + "/" + localDate.getMonthValue() + "/" + localDate.getYear();
            String log = data + ";" + jogador.getNome() + ";" + resultado + ";" + maquina.getNome() + ";" + MetodosAtaque.getNumeroRodadas();
            GerarLog.GravarLog(log, jogador.getNickname());
        } while (false);
    }
}