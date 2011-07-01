package app.models;

import org.junit.Test;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;

import app.TestBase;

public class Testzao extends TestBase {
	
	@Test
	public void persistindo() {
		Objectify ofy = fact.begin();
		Pessoa paraCadastrar = new Pessoa();
		paraCadastrar.setNome("ARTHUR M. CARVALHO");
		paraCadastrar.setIdade(19);
		ofy.put(paraCadastrar);
		
		Pessoa cadastrada = ofy.get(new Key<Pessoa>(Pessoa.class, paraCadastrar.getId()));
		System.out.println(cadastrada.getNome());
		System.out.println(cadastrada.getIdade());
	}

}