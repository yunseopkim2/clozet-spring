package kr.co.clozet.board.services;
import kr.co.clozet.board.domains.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article> findAll();

    long count();

    String delete(Article board);

    String save(Article board);

    Optional<Article> findById(String userid);

    boolean existsById(String userid);

    List<Article> findAll(Sort sort);

    Page<Article> findAll(Pageable pageable);
}
