package net.lowerytech.mssc_brewery.Services;

import net.lowerytech.mssc_brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerStyle("IPA")
                .beerName("Wicked India Double Pale Ale")
                .upc(12345L)
                .build();
    }
}
