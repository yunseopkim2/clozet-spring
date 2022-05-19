package kr.co.clozet.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface StadiumCustomRepository{

}

@Repository
public interface StadiumRepository extends JpaRepository, StadiumCustomRepository {
}
