package com.gugawag.biblioteca.listeners;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.gugawag.biblioteca.modelo.Aluno;

/**
 * Application Lifecycle Listener implementation class SessaoListener
 *
 */
@WebListener
public class SessaoListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public SessaoListener() {
    }

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(1, "1001", "Leonardo"));
		alunos.add(new Aluno(2, "1012", "Jœlia"));
		alunos.add(new Aluno(3, "2012", "Let’cia"));
		event.getSession().setAttribute("alunos", alunos);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
	}
	
}
