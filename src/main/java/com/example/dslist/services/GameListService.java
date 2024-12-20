package com.example.dslist.services;

import com.example.dslist.dto.GameListDTO;
import com.example.dslist.entidades.Game;
import com.example.dslist.entidades.GameList;
import com.example.dslist.projections.GameMinProjection;
import com.example.dslist.repositories.GameListRepository;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> buscarTodas() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional
    public void movimentacao(Long listId, int posicaoOrigem, int posicaoDestino) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(posicaoOrigem);
        list.add(posicaoDestino, obj);

        int min = posicaoOrigem < posicaoDestino ? posicaoOrigem : posicaoDestino;
        int max = posicaoOrigem < posicaoDestino ? posicaoDestino : posicaoOrigem;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

}
