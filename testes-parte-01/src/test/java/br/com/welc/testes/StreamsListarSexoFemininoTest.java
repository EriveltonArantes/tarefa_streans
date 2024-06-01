package br.com.welc.testes;



import org.junit.Assert;

import org.junit.Test;

import br.com.welc.testes.Pessoa.Genero;

import java.util.Arrays;
import java.util.List;

public class StreamsListarSexoFemininoTest {

    private static final List<Pessoa> PessoasSexoFeminino = null;

	@Test
    public void testGetFemalePersons() {
        List<Pessoa> pessoa = Arrays.asList(
        		new Pessoa("Alice", 22, Genero.Feminino),
                new Pessoa("Alberto", 32, Genero.Masculino),
                new Pessoa("Cris Flores", 22, Genero.Feminino),
                new Pessoa("Ednolia", 40, Genero.Feminino),
                new Pessoa("David", 32, Genero.Masculino),
                new Pessoa("Andre", 26, Genero.Masculino),
                new Pessoa("Iolanda Battista", 23, Genero.Feminino),
                new Pessoa("Carlos", 29, Genero.Masculino)
                );
	
       

    		List<Pessoa> apenasPessoasDoSexoFeminino = Arrays.asList(
    				new Pessoa("Alice", 22, Genero.Feminino),
                    new Pessoa("Ednolia", 40, Genero.Feminino),
                    new Pessoa("Andreia", 26, Genero.Feminino),
                    new Pessoa("Cris Flores", 22, Genero.Feminino),
                    new Pessoa("Iolanda Batista", 23, Genero.Feminino)
                   
            );
         
         
       //  List<Pessoa> Pessoas2SexoFeminino = StreamsListarSexoFeminino.getSexoFeminino(pessoa);         
         Assertions.assertEquals(apenasPessoasDoSexoFeminino, pessoa);
          
         
    }

}

