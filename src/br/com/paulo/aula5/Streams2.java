package br.com.paulo.aula5;

import br.com.paulo.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Streams2 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        Optional<Curso> optional = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100).findAny();

//        Curso curso = optional.get();
//        System.out.println(curso);
//
//        Curso curso1 = optional.orElse(null);
//        System.out.println(curso1.getNome());
//
//        optional.ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() < 60).findAny().ifPresent(c -> System.out.println(c.getNome()));

        List<Curso> resultado = cursos.stream()
                .filter(curso -> curso.getNome().contains("C"))
                .collect(Collectors.toList());

        resultado.forEach(curso -> System.out.println(curso.getNome()));

        Map resultadoMap = cursos.stream().filter(curso -> curso.getAlunos() > 0)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

        System.out.println(resultadoMap);

        List<Curso> resultadoParalelo = cursos.parallelStream()
                .filter(curso -> curso.getNome().contains("C"))
                .collect(Collectors.toList());

        resultadoParalelo.forEach(curso -> System.out.println(curso.getNome()));

        OptionalDouble media = cursos.stream().mapToDouble(c -> c.getAlunos()).average();

        System.out.println(media);

    }

}
