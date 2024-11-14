package com.example.dslist.repositories;

import com.example.dslist.entidades.Game;
import com.example.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
        SELECT g.id,
               g.titulo, 
               g.ano,
               g.img_url AS imgUrl,
               g.descricao_curta AS descricaoCurta,
               b.posicao
        FROM tb_game g
        INNER JOIN tb_belonging b ON g.id = b.game_id
        WHERE b.list_id = :listId
        ORDER BY b.posicao
        """)
    List<GameMinProjection> searchByList(Long listId);


}
