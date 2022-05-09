package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Board;
import kr.co.clozet.board.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repository;

    @Override
    public List<Board> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return repository.findAll();
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public String delete(Board board) {
        repository.delete(board);
        return null;

    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public Optional<Board> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public Board save(Board board) {
        return repository.save(board);
    }
}
