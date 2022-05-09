package kr.co.clozet.soccer.services;


import kr.co.clozet.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ScheduleServiceImpl {
    private final ScheduleRepository repository;
}
