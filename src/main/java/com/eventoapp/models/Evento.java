package com.eventoapp.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="evento")
public class Evento implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codigo")
    private long codigo;
    @Column(name="nome")
    private String nome;
    @Column(name="local")
    private String local;
    @Column(name="data")
    private String data;
    @Column(name="horario")
    private String horario;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
