package kr.co.clozet.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface PlayerCustomRepository{

}

@Repository
public interface PlayerRepository extends JpaRepository, PlayerCustomRepository{
}
