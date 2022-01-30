package ifam.frameworks.ramonsilva.model;

import javax.persistence.*;

@Entity
public class Cidade {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true,nullable = false)
    private String codigoIBGE;
    @Column(unique = true,nullable = false)
    private String nome;
    @ManyToOne
    private  Estado estado;

    public Cidade() {
    }

    public Cidade(String codigoIBGE, String nome, Estado estado) {
        this.codigoIBGE = codigoIBGE;
        this.nome = nome;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", codigoIBGE='" + codigoIBGE + '\'' +
                ", nome='" + nome + '\'' +
                ", estado=" + estado +
                '}';
    }
}
