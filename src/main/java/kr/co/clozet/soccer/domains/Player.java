package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="playerId")
@Data
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerId;
    private String playerName;
    private String teamId;
    private String ePlayerName;
    private String nickname;
    private String joinYYYY;
    private String position;
    private String backNO;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;

}
