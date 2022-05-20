package kr.co.clozet.board.repositories;

import kr.co.clozet.board.domains.Board2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface BoardCostomRepository{
    // 000. 게시판 이름 boardName을 변경하시오.

}
@Repository
public interface BoardRepository extends JpaRepository <Board2, Long>, BoardCostomRepository{
}
