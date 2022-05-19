package kr.co.clozet.board.repositories;


import kr.co.clozet.board.domains.Article2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article2, Long>{

}
