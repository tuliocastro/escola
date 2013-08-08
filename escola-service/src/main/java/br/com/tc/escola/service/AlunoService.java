package br.com.tc.escola.service;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.tc.escola.model.Aluno;

@Named
@RequestScoped
public class AlunoService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void cadastrarAluno(Aluno aluno){
		System.out.println("Aluno "+aluno.getNome()+" cadastrado");
	}

}
