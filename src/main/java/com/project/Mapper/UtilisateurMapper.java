package com.project.Mapper;
import org.modelmapper.ModelMapper;

import com.project.Dto.UtilisateurDTO;
import com.project.Model.Utilisateur;


public class UtilisateurMapper {
	
	private static final ModelMapper modelMapper= new ModelMapper();

	public static UtilisateurDTO convertToDto(Utilisateur utilisateur)
	{
		return modelMapper.map(utilisateur, UtilisateurDTO.class);
	}
	public static Utilisateur convertToEntity(UtilisateurDTO utilisateurDTO)
	{
		return modelMapper.map(utilisateurDTO, Utilisateur.class);
	}
	
	
}