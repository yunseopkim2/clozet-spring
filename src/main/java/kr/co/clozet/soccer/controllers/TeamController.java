package kr.co.clozet.soccer.controllers;

import kr.co.clozet.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/team")
@RestController
@RequiredArgsConstructor
public class TeamController {
    private final TeamService service;

}
