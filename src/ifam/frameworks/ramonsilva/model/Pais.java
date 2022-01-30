package ifam.frameworks.ramonsilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pais {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true,nullable = false)
    private String codidoISO;

    public Pais() {
    }

    public Pais(String nome, String codidoISO) {
        this.nome = nome;
        this.codidoISO = codidoISO;
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

    public String getCodidoISO() {
        return codidoISO;
    }

    public void setCodidoISO(String codidoISO) {
        this.codidoISO = codidoISO;
    }

}
