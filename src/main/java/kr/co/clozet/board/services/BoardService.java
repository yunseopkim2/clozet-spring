package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    List<Board> findAll();

    List<Board> findAll(Sort sort);

    Page<Board> findAll(Pageable pageable);

    String delete(Board board);

    long count();


    Optional<Board> findById(String userid);

    boolean existsById(String userid);

    Board save(Board board);
}
