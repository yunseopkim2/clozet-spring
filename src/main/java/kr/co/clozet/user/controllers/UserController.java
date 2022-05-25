package kr.co.clozet.user.controllers;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.user.domains.User;
import kr.co.clozet.user.domains.UserDTO;
import kr.co.clozet.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody User user) {
        return ResponseEntity.ok(service.login(user));
    }
    @GetMapping("/logout")
    public ResponseEntity<Messenger> logout() {return ResponseEntity.ok(service.logout());}

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {return ResponseEntity.ok(service.findAll());}

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<User>> findAll(Sort sort) {return ResponseEntity.ok(service.findAll(sort));}

    @GetMapping("/findAll/pageable")
    public ResponseEntity<Page<User>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));}

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {return ResponseEntity.ok(service.count());}

    @PutMapping("/put")
    public String put(@RequestBody User user) {service.put(user);return "";}

    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(@RequestBody User user) {
        return ResponseEntity.ok(service.delete(user));}

    @PostMapping("/join")
    public ResponseEntity<Messenger> save(@RequestBody User user) {
       return ResponseEntity.ok(service.save(user)); }

    @GetMapping("/findById/{userid}")
    public ResponseEntity<Optional<User>> findById(@PathVariable String userid) {
        return ResponseEntity.ok(service.findById(userid));}

    @GetMapping("/existsById/{userid}")
    public ResponseEntity<Messenger> existsById(@PathVariable String userid) {
        return ResponseEntity.ok(service.existsById(userid));}

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Messenger> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(service.getOne(id));}
    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody User user) {

        return ResponseEntity.ok(service.update(user));
    }

}


