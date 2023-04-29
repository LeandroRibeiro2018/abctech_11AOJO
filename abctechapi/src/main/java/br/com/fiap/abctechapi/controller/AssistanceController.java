package br.com.fiap.abctechapi.controller;

import br.com.fiap.abctechapi.application.AssistanceApplication;
import br.com.fiap.abctechapi.application.dto.AssistDto;
import br.com.fiap.abctechapi.entity.Assistance;
import br.com.fiap.abctechapi.service.AssistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/assists")
@RestController
public class AssistanceController {
private final AssistanceApplication assistanceApplication;

@Autowired
public AssistanceController(AssistanceApplication assistanceApplication){
    this.assistanceApplication = assistanceApplication;
}

public ResponseEntity<List<AssistDto>> getAssists(){
    return ResponseEntity.ok(assistanceApplication.getAssists());
}
}
