package com.eventoapp.repository;
import com.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventoRepository extends CrudRepository<Evento, Integer> {
    //Listar todos os eventos
    List<Evento> findAll();

    //pesquisar por codigo
    Evento findByCodigo(int codigo);
    //Remover produto
    void delete(Evento evento);
    //Cadastrar/AlterarProduto
    <EventMod extends Evento> EventMod save(EventMod evento);
}
