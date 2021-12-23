/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dto;

import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class Obra  {
    private int id;
    private String categoria;
    private String titulo;
    private Autores[] autor;
    private Assuntos[] assuntos;
    private String nota;
    private int anoPublicacao;
    private String editora;
    private String cidadeEditora;
    private String edicao;
    private int volume;

    public Obra(int id, String categoria, String titulo, String nota, int anoPublicacao, String editora, String cidadeEditora, String edicao, int volume) {
        this.id = id;
        this.categoria = categoria;
        this.titulo = titulo;
        this.nota = nota;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.cidadeEditora = cidadeEditora;
        this.edicao = edicao;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autores[] getAutor() {
        return autor;
    }

    public void setAutor(Autores[] autor) {
        this.autor = autor;
    }

    public Assuntos[] getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(Assuntos[] assuntos) {
        this.assuntos = assuntos;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidadeEditora() {
        return cidadeEditora;
    }

    public void setCidadeEditora(String cidadeEditora) {
        this.cidadeEditora = cidadeEditora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    



    
    
    
}
