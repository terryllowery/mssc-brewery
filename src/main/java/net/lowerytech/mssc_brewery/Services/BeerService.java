package net.lowerytech.mssc_brewery.Services;

import net.lowerytech.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
