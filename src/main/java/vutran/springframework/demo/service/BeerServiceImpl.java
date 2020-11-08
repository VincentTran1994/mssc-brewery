package vutran.springframework.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vutran.springframework.demo.web.model.BeerDto;

import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Ple Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return  BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo update existing beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Object " + beerId + " is deleted!");
    }
}
