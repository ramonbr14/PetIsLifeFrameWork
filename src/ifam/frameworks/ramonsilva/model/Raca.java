package ifam.frameworks.ramonsilva.model;

import javax.persistence.*;

@Entity
public class Raca {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @ManyToOne
    private Especie especie;

    public Raca() {
    }

    public Raca(String nome, Especie especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Raca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
