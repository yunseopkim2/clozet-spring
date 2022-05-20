package kr.co.clozet.board.repositories;


import kr.co.clozet.board.domains.Article2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface ArticleCostomRepository{
    // 000. 게시판 이름 boardName을 변경하시오.

}
@Repository
public interface ArticleRepository extends JpaRepository<Article2, Long>, ArticleCostomRepository{

}
