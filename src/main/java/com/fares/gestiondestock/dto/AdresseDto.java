package com.fares.gestiondestock.dto;



import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {


	private Integer id;

	private String adresse1 ;
	
	private String adresse2 ;
	
	private String ville ;
	
	private String codePostale ;
	
	private String pays ;
}
