package kr.co.clozet.soccer.domains;

import kr.co.clozet.soccer.services.TeamService;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "teamId")
@Data
@Entity
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teamId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYYYY;
    private String stadiumId;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String ownerName;

}
