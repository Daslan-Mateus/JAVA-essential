package collection.streams.tests;
import collection.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamTest01 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Overlord", 2.50),
            new LightNovel("Red Evergarden", 16),
            new LightNovel("Mushoku Tensei", 35.60),
            new LightNovel("Violet Evergarden", 1.75),
            new LightNovel("Ookami to Koushinryou", 1.6),
            new LightNovel("Monogatari", 3.6)));


    public static void main(String[] args) {

//        lightNovelList.stream().sorted(Comparator.comparing(LightNovel::getTitle)).forEach(System.out::println);
//        System.out.println("-----------------------------------");
//        System.out.println();
//        lightNovelList.stream().sorted(Comparator.comparing(LightNovel::getPrince)).forEach(System.out::println);
        System.out.println("Order Light novels by title");
        lightNovelList.stream().sorted().forEach(System.out::println);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("Retrieve the first 3 titles light novels with prince less than 4");
        List<String> newLightNovels = lightNovelList.stream().filter(l -> l.getPrince() < 4).limit(3).map(LightNovel::getTitle).collect(Collectors.toList());
        System.out.println(newLightNovels);
    }

}
