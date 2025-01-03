package collection.streams.dominio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class JogadorImpl {
    public  boolean verificarArquivoExiste(Path caminho) {
        boolean ret = false;
        try {
            Stream<Path> stream = Files.list(caminho);
            Optional<Path> arq = stream.filter( p -> p.toString().endsWith("listaJogadores.txt")).findAny();
            ret = arq.isPresent();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ret;
    }

    public List<Jogador> getListaDeJogadores(Path caminho) throws IOException {
        Stream<String> linhas = Files.lines(caminho, StandardCharsets.UTF_8);
        List<String> listaDeLinhas = linhas.collect(Collectors.toList());
        List<Jogador> listaDeJogadores = new ArrayList<>();
        Jogador jogador;

        Iterator<String> iterator = listaDeLinhas.iterator();
        String str = null;
        while (iterator.hasNext()) {
            str = (String) iterator.next().trim();
            if (str.isEmpty()) {
                continue;
            }
            String info[]  = str.split(",");
            jogador = new Jogador();
            jogador.setNome(info[0]);
            jogador.setPosicao(info[1]);
            jogador.setIdade(Integer.parseInt(info[2]));
            jogador.setTimeAtual(info[3]);
            jogador.setGolsMarcados(Integer.parseInt(info[4]));
            listaDeJogadores.add(jogador);
        }
        return listaDeJogadores;
    }

    public void imprimirJogadores(List<Jogador> jogadores) {
        jogadores.stream().forEach(nome -> System.out.println(nome.getNome()));
    }

    public void imprimirJogadoresTime(List<Jogador> jogdores, String time) {
        jogdores.stream()
                .filter(jogador -> jogador.getTimeAtual().toLowerCase().equals(time.toLowerCase()))
                .forEach(jogador -> System.out.println(jogador.getNome() + " : " + jogador.getGolsMarcados() + " Gols"));
    }

    public  void imprimirJogadoresTimeGol(List<Jogador> jogadores, String time) {
        jogadores.stream()
                .filter(jogador -> jogador.getGolsMarcados() > 10 && jogador.getTimeAtual().toLowerCase().equals(time.toLowerCase()))
                .forEach(jogador -> System.out.println(jogador.getNome() + " : " + jogador.getGolsMarcados() + " Gols"));
    }

    public void calcularMediaIdade(List<Jogador> jogadores) {
        double media = jogadores.stream().mapToInt( Jogador::getIdade).average().getAsDouble();
        DecimalFormat mediaFormatada = new DecimalFormat("#.00");
        System.out.println(mediaFormatada.format(media));
        }

    public void imprimirJogadorMaisVelho(List<Jogador> jogadores) {
        Jogador jogador = jogadores.stream().max(Comparator.comparingInt(Jogador::getIdade)).get();
        System.out.println(jogador.getNome() + ": " + jogador.getIdade() + " anos");

    }

    public void imprimirJogadorMaisNovo(List<Jogador> jogadores) {
        Jogador jogador = jogadores.stream().min(Comparator.comparingInt(Jogador::getIdade)).get();
        System.out.println(jogador.getNome() + ": " + jogador.getIdade() + " anos");

    }

    public int  imprimirSomatorioGols(List<Jogador> jogadores) {
        int somaJogadores = jogadores.stream().mapToInt(Jogador::getGolsMarcados).sum();
        return somaJogadores;
    }

    public Map<String, List<String> > agruparJogadoresPeloTime(List<Jogador> jogadores) {
        Map<String, List<Jogador>> jogadoresAgrupados = jogadores.stream().collect(Collectors.groupingBy(Jogador::getTimeAtual));
        Map<String, List<String> > jogadoresAgrupadosPorTimeNome = new TreeMap<>();

        for (Map.Entry<String, List<Jogador>> jogador : jogadoresAgrupados.entrySet()) {
            List<String> nomeJogador = jogador.getValue().stream().map(Jogador::getNome).collect(Collectors.toList());
            jogadoresAgrupadosPorTimeNome.put(jogador.getKey(), nomeJogador );
        }
        return jogadoresAgrupadosPorTimeNome;
    }

    public void ordenarJogadoresGols(List<Jogador> jogadores) {
        jogadores.stream().sorted(Comparator.comparingInt(Jogador::getGolsMarcados).reversed()).forEach(jogador -> System.out.println(jogador.getNome() +
                " : " + jogador.getGolsMarcados() + " gols" + "\n-----------------------------"));
    }





}
