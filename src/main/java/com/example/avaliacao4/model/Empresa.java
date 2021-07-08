package com.example.avaliacao4.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    @OneToMany(mappedBy = "empresa", targetEntity = Produto.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public List<Produto> getProdutos() {return produtos;}
    public void setProdutos(List<Produto> produtos) {this.produtos = produtos;}

    public Empresa() {}

    public Empresa(Long id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", produtos='" + produtos + '\'' +
                '}';
    }
}
