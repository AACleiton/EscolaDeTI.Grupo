package br.unicesumar.ads2015.Disciplina;

import java.io.Serializable;

public class Disciplina implements Serializable{
    private String id;
    private String nome;
    private String hora;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", nome=" + nome + ", hora=" + hora + '}';
    }
    
    
}
