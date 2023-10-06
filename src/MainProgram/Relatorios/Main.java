package MainProgram.Relatorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String caminhoDiretorio = "src/MainProgram/temp";
        System.out.println("Programa de Relatórios do Medieval Battle");
        System.out.println("Informe o nickname do jogador que deseja obter o relatório de partidas");
        String entradaNickname = scanner.next();
        Path caminhoNickname = Paths.get(caminhoDiretorio + "/" + entradaNickname + ".csv");
        if (Files.exists(caminhoNickname)){
            System.out.println("Encontrado o seu nickname no banco de Relatórios");
            List<String> linhas = Files.readAllLines(caminhoNickname);
            int qtdPartidas = linhas.size();

            System.out.printf("%s %s\n", "Jogador", entradaNickname);
            System.out.printf("%s %s\n", "Nickname:", entradaNickname);
            System.out.printf("%s %d\n","Patidas Jogadas:", qtdPartidas);
            System.out.printf("%s %s\n", "Heroi mais jogado:", MetodosRelatorio.pegarHeroiMaisJogado(linhas));
            System.out.printf("%s %s\n", "Monstro mais enfrentado:", MetodosRelatorio.pegarMonstroMaisEnfrentado(linhas));
            System.out.printf("%s %d\n", "Pontos De Batalha:", MetodosRelatorio.pegarPontosDeBatalha(linhas));

        } else {
            System.out.println("Usuário Inexistente");
        }
    }
}
