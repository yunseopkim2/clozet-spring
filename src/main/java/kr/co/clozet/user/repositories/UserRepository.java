package kr.co.clozet.user.repositories;


import kr.co.clozet.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

interface UserCustomRepository{
  // 000. 사용자 비밀번호와 이메일을 수정하시오

}

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

  //  String login(User user);
    //void put(User user);
  Optional<User> findByUsername(String usernamd);
}
