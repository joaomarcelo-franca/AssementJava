package MainProgram.Relatorios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MetodosRelatorio {
    static List<String> herois = new ArrayList<>();
    static int vezesGuerreiro = 0;
    static int vezesBarbaro = 0;
    static int vezesPaladino = 0;
    public static String  pegarHeroiMaisJogado(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String linhaHeroi = list.get(i).split(";")[1];
            herois.add(linhaHeroi);
        }
        herois.forEach(heroi ->{
            if (Objects.equals(heroi, "Guerreiro")){
                vezesGuerreiro++;
            }
            else if (Objects.equals(heroi, "Paladino")){
                vezesPaladino++;
            }
            else if (Objects.equals(heroi, "Barbaro")){
                vezesBarbaro++;
            }
        });
        if (vezesBarbaro > vezesPaladino && vezesBarbaro > vezesGuerreiro){
            return "Barbaro";
        } else if (vezesPaladino > vezesBarbaro && vezesPaladino > vezesGuerreiro){
            return "Paladino";
        } else if (vezesGuerreiro > vezesBarbaro && vezesGuerreiro > vezesPaladino){
            return  "Guerreiro";
        }
        return null;
    }
    public static String pegarMonstroMaisEnfrentado(List<String> list){
        String monstroMaisJogado = null;
        int maxVezes = 0;
        for (String linha : list){
            String heroi = linha.split(";")[3];
            int vezes = 0;
            for (String linha2 :
                    list) {
                String heroi2 = linha2.split(";")[3];
                if (heroi.equals(heroi2)){
                    vezes++;
                }
            }
            if (vezes > maxVezes){
                maxVezes = vezes;
                monstroMaisJogado = heroi;
            }
        };
        return monstroMaisJogado;
    }
    public static int pegarPontosDeBatalha(List<String> list){
        List<Integer> linhasRodadas = new ArrayList<Integer>();
        list.forEach(linha -> {
            linhasRodadas.add(Integer.parseInt(linha.split(";")[4]));
        });
        int qntRodadas = linhasRodadas.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return (list.size() * 100) - qntRodadas;
    }
}
