package br.com.welc.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.welc.testes.Pessoa.Genero;

public class StreamsListarSexoFeminino {
    public static void main(String[] args) {
        // Sample list of Pessoas
        List<Pessoa> Pessoas = Arrays.asList(
        		new Pessoa("Alice", 22, Genero.Feminino),
                new Pessoa("Alberto", 32, Genero.Masculino),
                new Pessoa("Cris Flores", 22, Genero.Feminino),
                new Pessoa("Ednolia", 40, Genero.Feminino),
                new Pessoa("David", 32, Genero.Masculino),
                new Pessoa("Andre", 26, Genero.Masculino),
                new Pessoa("Iolanda Battista", 23, Genero.Feminino),
                new Pessoa("Carlos", 29, Genero.Masculino)  
        );

        // Pessoas do sexo feminino
        List<Pessoa> SexoFeminino = getSexoFeminino(Pessoas);
        System.out.println("**** Lista de Pessoas do sexo Feminino:\n");
        SexoFeminino.forEach(Pessoa -> System.out.println(Pessoa.getNome()));
    
        // Pessoas do sexo masculino
        List<Pessoa> SexoMasculino = getSexoMasculino(Pessoas);
        System.out.println(" \n *************************************\n");
        System.out.println("#### Lista de Pessoas do sexo Masculino:\n");
        SexoMasculino.forEach(Pessoa -> System.out.println(Pessoa.getNome()));
}
    
    

    public static List<Pessoa> getSexoFeminino(List<Pessoa> Pessoas) {
        return Pessoas.stream()
                .filter(Pessoa -> Pessoa.getGenero() == Genero.Feminino)
                .collect(Collectors.toList());
    }


    public static List<Pessoa> getSexoMasculino(List<Pessoa> Pessoas) {
        return Pessoas.stream()
                .filter(Pessoa -> Pessoa.getGenero() == Genero.Masculino)
                .collect(Collectors.toList());
    }
	
      
}

/*
class Pessoa {
    private String name;
    private int idade;
    private Genero genero;

    public Pessoa(String name, int idade, Genero genero) {
        this.name = name;
        this.idade = idade;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }
}

enum Genero {
    Masculino,
    Feminino
}
*/