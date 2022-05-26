package kr.co.clozet.user.domains;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name="users")
@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;

    @OneToMany(mappedBy = "user")
    List<Article> articles = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;
}

