package br.com.tc.escola;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.tc.escola.model.Aluno;
import br.com.tc.escola.service.AlunoService;

@Named
@RequestScoped
public class AlunoMB implements Serializable{
	
	@Inject
	private AlunoService alunoService;
	
	public void teste(){
		System.out.println("fez algo");
	}
	
	public String testaService(){
		System.out.println("Testando service");
		alunoService.cadastrarAluno(new Aluno());
		return "sucesso";
	}

}
