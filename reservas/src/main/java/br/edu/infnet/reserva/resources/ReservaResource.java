package br.edu.infnet.reserva.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.reserva.clients.QuartoClient;
import br.edu.infnet.reserva.resources.dto.HospedeDTO;
import br.edu.infnet.reserva.resources.dto.ReservaDTO;
import br.edu.infnet.reserva.resources.dto.QuartoDTO;
import br.edu.infnet.reserva.resources.dto.ReservaResponseDTO;

@RestController
@RequestMapping("/reservas")
public class ReservaResource {
	
	private static Logger log = LoggerFactory.getLogger(ReservaResource.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hospede.endpoint.url}")
	private String hospedeApiUrl;
	
	@Autowired
	private QuartoClient quartoClient;
	
	
	@PostMapping
	public ReservaResponseDTO efetuaReserva(@RequestBody ReservaDTO reservaDTO) {
		log.info("reserva: {}", reservaDTO);
		
		if(log.isDebugEnabled()) {
			log.debug("Debug ligado");
		}
		HospedeDTO hospedeDTO = restTemplate.getForObject(hospedeApiUrl+
					reservaDTO.getHospedeId(), HospedeDTO.class);
		
		log.info("Chamada a api de hospedes realizada: {}", hospedeDTO);
		
		ResponseEntity<List<QuartoDTO>> quartos = quartoClient.getQuartos();
		
		QuartoDTO quartoAux = new QuartoDTO();
		for (QuartoDTO quarto : quartos.getBody()) {
			quartoAux.setCodigo(quarto.getCodigo());
			quartoAux.setNome(quarto.getNome());
			quartoAux.setPreco(quarto.getPreco());
		}
		
		return new ReservaResponseDTO(hospedeDTO, quartoAux);
		
	}

}

