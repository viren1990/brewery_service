package com.example.brewery_service.events;

import com.example.brewery_service.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvents {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
