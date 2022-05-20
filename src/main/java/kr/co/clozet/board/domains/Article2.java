package kr.co.clozet.board.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "articles2")
@Component
@Entity
public class Article2 {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false) private String projects;
        @Column(nullable = false)private String startData;
        @Column(nullable = false)private String status;
        @Column(nullable = false)private String team;
        @Column(nullable = false)private String progress;
        @Column(nullable = false)private String action;

}
