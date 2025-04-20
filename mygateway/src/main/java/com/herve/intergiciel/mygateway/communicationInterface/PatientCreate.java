package com.herve.intergiciel.mygateway.communicationInterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.herve.intergiciel.mygateway.dtos.InfoPatient;

@FeignClient(name = "PATIENTSMANAGER", url = "http://localhost:8000/patient")
public interface PatientCreate {
    
    @PostMapping(path = "/create")
    ResponseEntity<String> createPateint(@RequestBody InfoPatient infoPatient );

    @GetMapping
    List<InfoPatient> listPatient();

    @PostMapping(path = "/update")
    ResponseEntity<String> updatePatient(@RequestBody InfoPatient infoPatient);

    @PostMapping(path = "/delete")
    ResponseEntity<String> deletePatient(@RequestBody InfoPatient infoPatient);
}
