package collection.streams.tests;

import collection.streams.dominio.Jogador;
import collection.streams.dominio.JogadorImpl;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static java.nio.file.Path.*;

public class JogadoresTest {
    public static void main(String[] args) throws IOException {
        JogadorImpl jogImpl = new JogadorImpl();
        String enderecoDir = "/home/daslan/Documentos/Projects/Java/JAVA-essential/JAVA/src/collection/doc";
        String nomeArquivo = "listaJogadores.txt";

        List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Path.of(enderecoDir + "/" + nomeArquivo));
        if (!jogImpl.verificarArquivoExiste(Path.of(enderecoDir))){
            System.out.println("Arquivo não encontrado");
        }
        else
        {
//            jogImpl.imprimirJogadores(listaDeJogadores);
//            jogImpl.imprimirJogadoresTime(listaDeJogadores, "SÃO PAULO");
//            jogImpl.imprimirJogadoresTime(listaDeJogadores, "flamengo");
//            jogImpl.imprimirJogadoresTimeGol(listaDeJogadores, "Flamengo");
//            jogImpl.calcularMediaIdade(listaDeJogadores);
//            jogImpl.imprimirJogadorMaisVelho(listaDeJogadores);
//            System.out.println("-------------------------------");
//            jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
//            System.out.println(jogImpl.imprimirSomatorioGols(listaDeJogadores));


//            for (Map.Entry<String, List<String>> time : jogImpl.agruparJogadoresPeloTime(listaDeJogadores).entrySet()){
//                System.out.println(time.getKey() + " : " + time.getValue());
//                System.out.println("---------------------------------------------------------------------------------------------");
//                System.out.println();
//            }

            jogImpl.ordenarJogadoresGols(listaDeJogadores);
//




        }

    }
}
