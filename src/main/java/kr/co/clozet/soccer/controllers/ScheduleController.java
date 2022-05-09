package kr.co.clozet.soccer.controllers;

import kr.co.clozet.soccer.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/schedule")
@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService service;
}
