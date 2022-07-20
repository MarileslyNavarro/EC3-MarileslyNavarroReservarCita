package com.idat.ec3MarileslyNavarroReservarCitaPrueba.service;

import java.util.List;

import com.idat.ec3MarileslyNavarroReservarCitaPrueba.dto.HospitalDTORequest;
import com.idat.ec3MarileslyNavarroReservarCitaPrueba.dto.HospitalDTOResponse;

public interface HospitalService {

	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);
	
}
