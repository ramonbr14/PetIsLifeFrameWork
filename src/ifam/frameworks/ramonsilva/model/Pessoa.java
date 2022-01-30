package ifam.frameworks.ramonsilva.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pessoa {
    @Id
    @Column(unique = true,nullable = false)
    private String documento;
    @Column(unique = true,nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    private String endereco;
    private String email;
    @ManyToOne
    private Cidade cidade;
    @Enumerated
    private SexoPessoaENUM sexo;
    @Enumerated
    private PessoaENUM tipo;
    @Column(nullable = true)
    private LocalDateTime nascimento;

    public Pessoa() {
    }

    public Pessoa(String documento, String nome, String telefone, String endereco, String email, Cidade cidade, SexoPessoaENUM sexo,
                  PessoaENUM tipo, LocalDateTime nascimento) {
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.cidade = cidade;
        this.sexo = sexo;
        this.tipo = tipo;
        this.nascimento = nascimento;

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public SexoPessoaENUM getSexo() {
        return sexo;
    }

    public void setSexo(SexoPessoaENUM sexo) {
        this.sexo = sexo;
    }

    public PessoaENUM getTipo() {
        return tipo;
    }

    public void setTipo(PessoaENUM tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }



}