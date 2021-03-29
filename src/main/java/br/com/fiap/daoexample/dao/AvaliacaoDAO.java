package br.com.fiap.daoexample.dao;

import br.com.fiap.daoexample.domain.Avaliacao;
import br.com.fiap.daoexample.domain.AvaliacaoId;

import javax.persistence.EntityManager;

public class AvaliacaoDAO extends GenericDAO<Avaliacao, AvaliacaoId>{

    public AvaliacaoDAO(EntityManager em) {
        super(em);
    }
}
