package kr.co.clozet.domains;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Table(name="users")
@Data
@Component
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String userid;
    @Column(nullable = false)private String password ;
    @Column(nullable = false)private String email;
    @Column(nullable = false)private String name;
    private String phone;
    private String birth;
    private String address;
}
