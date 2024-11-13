package com.example.dslist.dto;

import com.example.dslist.entidades.Game;
//import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double pontuacao;
    private String imgUrl;
    private String descricaoCurta;
    private String descricaoLonga;

    public GameDTO() {}

    public GameDTO(Game entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        genero = entity.getGenero();
        plataforma = entity.getPlataforma();
        pontuacao = entity.getPontuacao();
        imgUrl = entity.getImgUrl();
        descricaoCurta = entity.getDescricaoCurta();
        descricaoLonga = entity.getDescricaoLonga();
//        Funcionaria tambem utilizando o atalho abaixo que copia as propridades
//        Porem para funcionar é necessario que a classe tenha get E setters
//   >>>> BeanUtils.copyProperties(entity, this); <<<<
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public String getDescricaoLonga() {
        return descricaoLonga;
    }
}
