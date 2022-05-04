package kr.co.clozet.services;

import kr.co.clozet.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String login(User user);

    List<User> findAll();
    List<User> findAll(Sort sort);
    Page<User> findAll(Pageable pageable);

    long count();

    void put(User user);

    String delete(User user);

    void save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    User getOne(Long id);
}
