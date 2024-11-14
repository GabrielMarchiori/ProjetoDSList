package com.example.dslist.dto;

import com.example.dslist.entidades.Game;
import com.example.dslist.entidades.GameList;

public class GameListDTO {
    private Long id;
    private String titulo;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
}
