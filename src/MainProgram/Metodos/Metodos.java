package MainProgram.Metodos;

import MainProgram.Users.Jogador;
import MainProgram.Users.Maquina;
import MainProgram.Personagens.*;

import java.util.Random;
import java.util.Scanner;

public class Metodos {
    static Scanner scan = new Scanner(System.in);
    public static String pegarNickname(){
        System.out.println("Qual sera seu nickname? Digite");
        String nickname = scan.next();
        return nickname;
    }
    public static String pegarClasse(){
        System.out.println("Qual Classe voce quer escolher?");
        System.out.println("Guerreiro, Bárbaro ou Paladino");
        String classe = scan.next();
        classe = classe.toLowerCase();
        return classe;
    }
    public static boolean verificarClasse(String _classe) {
        String[] classes = {"guerreiro", "barbaro", "bárbaro", "paladino"};
        for (String classe :
                classes) {
            if (_classe.equals(classe)){
                return true;
            } else {

            }
        }
        return false;
    }
    public static IPersonagem pegarMonstro(){
        Random random = new Random();
        String[] monstros = {"orc", "mortoVivo", "kobold"};
        int i = random.nextInt(2 + 1);
        String nomeMonstro = monstros[i];
        IPersonagem monstro = null;
        if (nomeMonstro.equals("orc")){
            return new Orc();
        } else if (nomeMonstro.equals("mortoVivo")){
            return new MortoVivo();
        } else if (nomeMonstro.equals("kobold")){
            return new Kobold();
        }
        return monstro;
    }
    public static IPersonagem pegarHeroi(String classe){
        IPersonagem heroi = null;
        if (classe.equals("guerreiro")){
            return new Guerreiro();
        } else if (classe.equals("paladino")){
            return new Paladino();
        } else if (classe.equals("barbaro") || classe.equals("bárbaro")) {
            return new Barbaro();
        }
        return heroi;
    }
    public static boolean pegarQuemComeca(Jogador jogador, Maquina maquina){
        do{
            if (jogador.getCalcInit() > maquina.getCalcInit()){
                return true;
            } else if (jogador.getCalcInit() < maquina.getCalcInit()) {
                return false;
            }
        } while (jogador.getCalcInit() == maquina.getCalcInit());
        return true;
    }
    public static void limparConsole(){
        int linhasEmBranco = 50;
        for (int i = 0; i < linhasEmBranco; i++) {
            System.out.println();
        }
    }

}
