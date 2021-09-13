package com.example.ec.explorecali.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.ec.explorecali.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

	Optional<TourPackage> findByName(String name);
	
}
