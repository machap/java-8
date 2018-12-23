package br.com.paulo.aula4;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.paulo.model.Curso;

import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.forEach(c -> System.out.println(c.getAlunos()));

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .map(curso -> curso.getAlunos())
                .forEach(curso -> System.out.println(curso));

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        int soma = cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .mapToInt(Curso::getAlunos)
                .sum();

    }
}

