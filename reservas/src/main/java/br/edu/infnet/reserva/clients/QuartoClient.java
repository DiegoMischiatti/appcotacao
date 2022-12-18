package br.edu.infnet.reserva.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.reserva.resources.dto.QuartoDTO;

@FeignClient("quarto")
public interface QuartoClient {

    @GetMapping("/quartos")
    ResponseEntity<List<QuartoDTO>> getQuartos();
    
}
