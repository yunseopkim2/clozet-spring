package kr.co.clozet.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface ScheduleCustomRepository{

}

@Repository
public interface ScheduleRepository extends JpaRepository, StadiumCustomRepository{
}
