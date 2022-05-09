package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl {
    private final StadiumRepository repository;
}
