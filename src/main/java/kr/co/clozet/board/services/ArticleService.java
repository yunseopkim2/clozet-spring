package kr.co.clozet.board.services;
import kr.co.clozet.board.domains.Article2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article2> findAll();

    long count();

    String delete(Article2 board);

    String save(Article2 board);

    String update(Article2 article);

    Optional<Article2> findById(String userid);

    boolean existsById(String userid);

    List<Article2> findAll(Sort sort);

    Page<Article2> findAll(Pageable pageable);
}
