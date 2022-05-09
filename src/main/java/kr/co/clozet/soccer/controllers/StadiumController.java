package kr.co.clozet.soccer.controllers;

import kr.co.clozet.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/stadium")
@RestController
public class StadiumController {
    private final StadiumService service;
}
