package kr.co.clozet.user.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.user.domains.User;
import kr.co.clozet.user.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO login(User user);
    Messenger logout();
    List<User> findAll();
    List<User> findAll(Sort sort);
    Page<User> findAll(Pageable pageable);

    Messenger count();

    Messenger delete(User user);

    Messenger save(UserDTO user);

    Optional<User> findById(String userid);

    Messenger existsById(String userid);

    Messenger getOne(Long id);
    //custom

    List<User> findByUserName(String name);

    Messenger update(User user);
}
