package ifam.frameworks.ramonsilva.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pet {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true,nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDateTime nascimento;
    @Enumerated
    private SexoPetENUM sexo;
    @ManyToOne
    private Raca raca;
    @ManyToOne
    private Pessoa proprietario;

    public Pet() {
    }

    public Pet(String nome, LocalDateTime nascimento, SexoPetENUM sexo, Raca raca, Pessoa proprietario) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.raca = raca;
        this.proprietario = proprietario;
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

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public SexoPetENUM getSexo() {
        return sexo;
    }

    public void setSexo(SexoPetENUM sexo) {
        this.sexo = sexo;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", sexo=" + sexo +
                ", raca=" + raca +
                ", proprietario=" + proprietario +
                '}';
    }
}
