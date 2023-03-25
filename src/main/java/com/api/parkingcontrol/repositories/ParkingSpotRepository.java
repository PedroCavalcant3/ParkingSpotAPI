package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;



// POSSUI VARIOS METODOS PRONTOS PARA UTLIZAR PARA TRANSAÇÕES COM O BANCO DE DADOS, JA TRAZ A SIMPLIFAÇÃO DESTES METODOS TEMOS ACESSO A ELES JA PRONTOS

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	
	public boolean existsByLicensePlateCar(String licensePlateCar);
	
	public boolean existsByParkingSpotNumber(String parkingSpotNumber);
	
	public boolean existsByApartmentAndBlock(String apartment, String block);

}
