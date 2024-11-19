package com.plataformaonline.dto;


import java.util.Date;

public class AlunoDTO {
    private Long id;
    private String nome;
    private String email;
	private Date dataCadastro;

    // Construtor
    public AlunoDTO(Long id, String nome, String email, Date date) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = date;
    }

    

	// Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
