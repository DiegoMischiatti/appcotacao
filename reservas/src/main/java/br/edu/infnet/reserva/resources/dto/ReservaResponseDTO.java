package br.edu.infnet.reserva.resources.dto;

import java.util.List;

public class ReservaResponseDTO {
	
	private HospedeDTO hospede;
	
	private QuartoDTO quarto;
	
	public ReservaResponseDTO() {
		
	}

	public ReservaResponseDTO(HospedeDTO hospede, QuartoDTO quarto) {
		super();
		this.hospede = hospede;
		this.quarto = quarto;
	}

	public HospedeDTO getHospede() {
		return hospede;
	}



	public void setHospede(HospedeDTO hospede) {
		this.hospede = hospede;
	}



	public QuartoDTO getQuarto() {
		return quarto;
	}



	public void setQuarto(QuartoDTO quarto) {
		this.quarto = quarto;
	}

	
	

}
