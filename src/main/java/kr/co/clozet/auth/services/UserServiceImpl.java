package kr.co.clozet.auth.services;

import kr.co.clozet.auth.domains.User;
import kr.co.clozet.auth.repositories.UserRepository;
import kr.co.clozet.common.dataStructure.Box;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;


    @Override
    public String login(User user) {
         return null;
                //repository.login(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void put(User user) {
       //repository.put(user);
    }
    @Override
    public String update(User user) {
        //repository.put(user);
        return "";
    }
    @Override
    public String delete(User user) {
       repository.delete(user);
       return null;
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public Optional<User> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public User getOne(Long id) {
        return null;
    }

    @Override
    public List<User> findByUserName(String name) {
        List<User> ls = repository.findAll();
        Box<String, User> box = new Box<>();
        //ls = box.findByUserName(ls, name);
        //ls.stream().filter(...);
        return null;

    }
}
