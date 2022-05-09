package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Article;
import kr.co.clozet.board.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repository;

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Article article) {
        repository.delete(article);
        return null;
    }

    @Override
    public String save(Article article) {
        repository.save(article);
        return null;
    }

    @Override
    public Optional<Article> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public List<Article> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Article> findAll(Pageable pageable) {
        return null;
    }
}
