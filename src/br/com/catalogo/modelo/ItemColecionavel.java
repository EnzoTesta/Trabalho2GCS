package br.com.catalogo.modelo;

import java.time.LocalDate;
import java.util.List;

public abstract class ItemColecionavel {
    
    private String id;
    private String nome;
    private LocalDate dataAquisicao;
    private List<String> autores;

    public ItemColecionavel(String id, String nome, LocalDate dataAquisicao, List<String> autores) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(LocalDate dataAquisicao) { this.dataAquisicao = dataAquisicao; }
    public List<String> getAutores() { return autores; }
    public void setAutores(List<String> autores) { this.autores = autores; }
}