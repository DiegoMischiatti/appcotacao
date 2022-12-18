package br.edu.infnet.reserva.resources.dto;

public class ReservaDTO {
	
	private Integer hospedeId;
	
	private Integer quartoId;

	public Integer getHospedeId() {
		return hospedeId;
	}

	public void setHospedeId(Integer hospedeId) {
		this.hospedeId = hospedeId;
	}

	public Integer getQuartoId() {
		return quartoId;
	}

	public void setQuarto(Integer quartoId) {
		this.quartoId = quartoId;
	}

	@Override
	public String toString() {
		return "ReservaDTO [hospedeId=" + hospedeId + ", quartoId=" + quartoId + "]";
	}
	

	
}