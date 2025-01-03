package collection.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carros = new HashMap<>();
        carros.put("gol", 14.4);
        carros.put("uno", 15.6);
        carros.put("mobi", 16.1);
        carros.put("hb20", 14.5);
        carros.put("kwid", 15.6);

        System.out.println("Lista de carros:");
        System.out.println(carros);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carros.put("gol", 15.2);
        System.out.println(carros);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Confira se o modelo tucson está no dicionário: " );
        System.out.println(carros.containsKey("tucson"));
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba o consumo do uno: " );
        System.out.println(carros.get("uno"));
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba os modelos: ");
        System.out.println(carros.keySet());
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba os consumos dos carros: ");
        System.out.println(carros.values());
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double maisEficiente;
        for (Map.Entry<String, Double> carro : carros.entrySet()) {
            maisEficiente = Collections.max(carros.values());
            if (carro.getValue().equals(maisEficiente)){
                System.out.println(carro.getKey() + " : " + carro.getValue());
            }
        }
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );
        Double menosEficiente = Collections.min(carros.values());
        for (Map.Entry<String, Double> carro : carros.entrySet()) {
            if(carro.getValue().equals(menosEficiente)) {
                System.out.println(carro.getKey() + " : " + carro.getValue());
            }
        }
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba a soma dos consumos: " );

        Iterator<Double> iterator = carros.values().iterator();
        double somaConsumos = 0;
        while (iterator.hasNext()) {
            somaConsumos += iterator.next();
        }
        System.out.println(somaConsumos);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " );
        System.out.println(somaConsumos / carros.size());
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() == 15.6) iterator1.remove();
        }
        System.out.println(carros);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosOrdemInsercao = new LinkedHashMap<>();
        carrosOrdemInsercao.put("gol", 14.4);
        carrosOrdemInsercao.put("uno", 15.6);
        carrosOrdemInsercao.put("mobi", 16.1);
        carrosOrdemInsercao.put("hb20", 14.5);
        carrosOrdemInsercao.put("kwid", 15.6);
        System.out.println(carrosOrdemInsercao);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosOrdemModelo = new TreeMap<>(carrosOrdemInsercao);
        for (Map.Entry<String, Double> carro : carrosOrdemModelo.entrySet()){
            System.out.println(carro.getKey() + " : " + carro.getValue());
        }
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Apague o dicionario de carros: ");
        carros.clear();

        System.out.println("Confira se o dicionário está vazio: " + carros.isEmpty());
    }
}