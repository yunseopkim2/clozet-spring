package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl {
    private final TeamRepository repository;

}
