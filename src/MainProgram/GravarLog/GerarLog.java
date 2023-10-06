package MainProgram.GravarLog;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class GerarLog {
    public static void GravarLog(String log, String nickname) throws IOException {
//        Criando arquivo temp para o codigo ser portatil para qualquer computador
        String caminhoDiretorio = "src/MainProgram/temp";
        File file = new File(caminhoDiretorio);
        if (!file.exists()) {
            Files.createDirectory(Path.of(caminhoDiretorio));
        }
//        Criando CSV caso nao exista
        Path caminhoCSV = Paths.get(caminhoDiretorio + "/" + nickname + ".csv");
        if (!Files.exists(caminhoCSV)) {
            Files.createFile(caminhoCSV);
        }
//        Escrevendo no Arquivo
        List<String> linhas = Files.readAllLines(caminhoCSV);
        linhas.add(log);
        Files.write(caminhoCSV, linhas);
    }
}