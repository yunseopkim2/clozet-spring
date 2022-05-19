package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Board2;
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
    public List<Board2> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Board2> findAll(Sort sort) {
        return repository.findAll();
    }

    @Override
    public Page<Board2> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public String delete(Board2 board) {
        repository.delete(board);
        return null;

    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public Optional<Board2> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public Board2 save(Board2 board) {
        return repository.save(board);
    }
}
