package kr.co.clozet.auth.repositories;


import kr.co.clozet.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface UserCustomRepository{
    String login(User user);

    void put(User user);
}

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository{


}
