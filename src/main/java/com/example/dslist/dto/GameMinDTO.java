package com.example.dslist.dto;

import com.example.dslist.entidades.Game;

public class GameMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entidade) {
        id = entidade.getId();
        titulo = entidade.getTitulo();
        ano = entidade.getAno();
        imgUrl = entidade.getImgUrl();
        descricaoCurta = entidade.getDescricaoCurta();
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

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
