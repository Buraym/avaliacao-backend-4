package com.example.avaliacao4.model;

import javax.persistence.*;

@Entity
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer preco;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getPreco() {return preco;}
    public void setPreco(Integer preco) {this.preco = preco;}

    public Produto() {}

    public Produto(Long id, String nome, Integer preco, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
