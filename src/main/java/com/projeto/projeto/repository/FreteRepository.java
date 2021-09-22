package com.projeto.projeto.repository;


import com.projeto.projeto.model.Frete;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FreteRepository {
    private List<Frete> frete;

    public FreteRepository() {
        frete = new ArrayList<>();
        frete.add(new Frete("Luke", "Skywalker", "nao sei"));
        frete.add(new Frete("Obi-Wan", "Kenobi", "nao sei"));
        frete.add(new Frete("Qui-Gon", "Jinn", "nao sei"));
    }

    public List<Frete> getAll() {
        return frete;
    }

    public void add(final Frete frete) {
        this.frete.add(frete);
    }
}
