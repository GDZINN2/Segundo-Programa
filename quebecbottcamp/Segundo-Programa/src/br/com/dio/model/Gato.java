package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;



    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Gato() {

    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gato gato)) return false;
        return Objects.equals(getNome(), gato.getNome()) && Objects.equals(getCor(), gato.getCor()) && Objects.equals(getIdade(), gato.getIdade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCor(), getIdade());
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
