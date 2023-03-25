package com.api.parkingcontrol.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	//criar um ponto de injeção do nosso repository
	//sempre que tiver uma requisição, o controller vai acionar o service e o service vai acionar o repository
	
	/*Fazer um ponto de injeção de dependencia com a anotação @autoWired, avisar ao spring que em alguns momentos ele vai precisar 
	 injetar uma dependencia de ParkingSpotRepository em ParkingSpotService*/
	/*Ou criamos um ponto de injeção de dependencia dentro do contrutor da classe:*/
	
	final ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}
	public boolean existsByApartmentAndBlock(String apartment, String block) {
		
		return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}
	public Page<ParkingSpotModel> findAll(Pageable pageable) {
		
		return parkingSpotRepository.findAll(pageable);
	}
	public Optional<ParkingSpotModel> findById(UUID id) {
		return parkingSpotRepository.findById(id);
	}
	
	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
	parkingSpotRepository.delete(parkingSpotModel);
	}
	
	// criação de um metodo acionado pelo post da da classe controller
	
	
	
	
	
}
