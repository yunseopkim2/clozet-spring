package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface TeamCustomRepository{

}

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>, TeamCustomRepository{
}
