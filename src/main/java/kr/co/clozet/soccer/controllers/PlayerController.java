package kr.co.clozet.soccer.controllers;

import kr.co.clozet.soccer.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/player")
@RestController
public class PlayerController {
    private final PlayerService service;




}
