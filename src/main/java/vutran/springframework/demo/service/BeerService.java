package vutran.springframework.demo.service;

import vutran.springframework.demo.web.model.BeerDto;
import vutran.springframework.demo.web.model.CustomerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
