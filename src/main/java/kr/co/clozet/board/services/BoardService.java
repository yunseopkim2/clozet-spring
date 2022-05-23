package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Board2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    List<Board2> findAll();

    List<Board2> findAll(Sort sort);

    Page<Board2> findAll(Pageable pageable);

    String delete(Board2 board);

    long count();


    Optional<Board2> findById(String userid);

    boolean existsById(String userid);

    Board2 save(Board2 board);

    String update(Board2 board);
}
