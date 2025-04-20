package com.herve.intergiciel.mygateway.gatewayControl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herve.intergiciel.mygateway.communicationInterface.PatientCreate;
import com.herve.intergiciel.mygateway.dtos.InfoPatient;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/patient")
@AllArgsConstructor
public class PatientControl {

    private final PatientCreate patientCreate;

    @GetMapping(produces = "application/json")
    public List<InfoPatient> listePatient(){
        return patientCreate.listPatient();
    }

    @PostMapping(path = "/create")
    public ResponseEntity<String> createpatient(@RequestBody InfoPatient infoPatient){
        return patientCreate.createPateint(infoPatient);
    }

}
