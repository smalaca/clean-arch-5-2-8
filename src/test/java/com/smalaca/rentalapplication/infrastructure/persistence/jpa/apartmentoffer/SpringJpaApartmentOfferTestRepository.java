package com.smalaca.rentalapplication.infrastructure.persistence.jpa.apartmentoffer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class SpringJpaApartmentOfferTestRepository {
    private final SpringJpaApartmentOfferRepository repository;

    SpringJpaApartmentOfferTestRepository(SpringJpaApartmentOfferRepository repository) {
        this.repository = repository;
    }

    public void deleteAll(List<String> ids) {
        ids.forEach(this::deleteById);
    }

    public void deleteById(String apartmentId) {
        deleteById(UUID.fromString(apartmentId));
    }

    public void deleteById(UUID apartmentId) {
        repository.deleteById(apartmentId);
    }
}