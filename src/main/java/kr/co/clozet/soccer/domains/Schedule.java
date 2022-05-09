package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Table(name = "schedulePk")
@Component
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadiumId;
    private String scheDate;
    private String gubun;
    private String homeTeamId;
    private String awayTeamId;
    private String homeScore;
    private String awayScore;
    private String schedulePk;
    private String scheduleFk;
}
