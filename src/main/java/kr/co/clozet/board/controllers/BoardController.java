package kr.co.clozet.board.controllers;

import kr.co.clozet.auth.domains.User;
import kr.co.clozet.board.domains.Board2;
import kr.co.clozet.board.services.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @PostMapping("/board")
    public String Board(Board2 board){
        return null;
    }

    @GetMapping("/findAll")
    public List<Board2> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Board2> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Board2> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Board2 board) {return service.delete(board);}

    @PostMapping("/join")
    public Board2 save(@RequestBody Board2 board) {
        return service.save(board);
    }
    @PutMapping("/update")
    public String update(@RequestBody Board2 board) {
        return service.update(board);
    }


}
