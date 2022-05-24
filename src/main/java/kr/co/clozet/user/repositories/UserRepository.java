package kr.co.clozet.user.repositories;


import kr.co.clozet.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

interface UserCustomRepository{

}

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

  //  String login(User user);
    //void put(User user);
  Optional<User> findByUsername(String usernamd);
}
