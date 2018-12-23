package br.com.paulo.aula3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do codigo");
        palavras.add("caelum");


        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        palavras.sort(Comparator.comparing(s -> s.length()));

        palavras.sort(Comparator.comparing(String::length));

        palavras.forEach(System.out::println);

        palavras.forEach(s -> s.substring(0, 4));

        palavras.sort(String.CASE_INSENSITIVE_ORDER);

    }
}
