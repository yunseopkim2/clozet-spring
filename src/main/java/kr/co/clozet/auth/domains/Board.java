package kr.co.clozet.auth.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-18
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
@Table(name="boards")
@Component
@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private long boardId;
    @Column private @NotNull String boardName;
    @Column(name = "create_date") @NotNull private String createDate;

    @OneToMany(mappedBy = "board")
    List<Article> articles = new ArrayList<>();
}
