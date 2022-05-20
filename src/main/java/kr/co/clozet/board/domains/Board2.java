package kr.co.clozet.board.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "boards2")
public class Board2 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false) private String projects;
    @Column(nullable = false)private String startData;
    @Column(nullable = false)private String status;
    @Column(nullable = false)private String team;
    @Column(nullable = false)private String progress;
    @Column(nullable = false)private String action;

}
