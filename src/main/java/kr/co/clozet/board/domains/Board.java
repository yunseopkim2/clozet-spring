package kr.co.clozet.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity
@Table
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false) private String projects;
    @Column(nullable = false)private String startData;
    @Column(nullable = false)private String status;
    @Column(nullable = false)private String team;
    @Column(nullable = false)private String progress;
    @Column(nullable = false)private String action;

}
