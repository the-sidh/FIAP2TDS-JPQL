package br.com.fiap.daoexample.dao;


import javax.persistence.EntityManager;

import br.com.fiap.daoexample.domain.TipoEstabelecimento;

import java.util.List;

public class TipoEstabelecimentoDAO extends GenericDAO<TipoEstabelecimento, Integer> {

    public TipoEstabelecimentoDAO(EntityManager em) {
        super(em);
    }

    @Override
    public List<TipoEstabelecimento> listar() {
        return this.em.createQuery(
                "from TipoEstabelecimento"
        ).getResultList();
    }

    public List listarOrdenadoNome() {
        return this.em.createQuery(
                "from TipoEstabelecimento order by nome"
        ).getResultList();
    }

    public List listarTresUltimos() {
        return this.em.createQuery(
                "from TipoEstabelecimento order by id desc"
        ).setMaxResults(3).getResultList();

    }

    public List
    listarPaginado(int itensPorPagina, int pagina) {
        int primeiro = (pagina - 1) * itensPorPagina;

        return this.em.createQuery(
                "from TipoEstabelecimento order by nome"
        ).setMaxResults(itensPorPagina)
                .setFirstResult(primeiro)
                .getResultList();

    }
}
