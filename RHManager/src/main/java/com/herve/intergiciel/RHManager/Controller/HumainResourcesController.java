package com.herve.intergiciel.RHManager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rh")
public class HumainResourcesController {

    @GetMapping("/employees")
    public String getEmployees() {
        return "List of employees";
    }
    // @GetMapping("/departments")
    // public String getDepartments() {
    //     return "List of departments";
    // }
    // @GetMapping("/salaries")
    // public String getSalaries() {
    //     return "List of salaries";
    // }
    // @GetMapping("/vacations")
    // public String getVacations() {
    //     return "List of vacations";
    // }
    // @GetMapping("/recruitments")
    // public String getRecruitments() {
    //     return "List of recruitments";
    // }
    // @GetMapping("/trainings")
    // public String getTrainings() {
    //     return "List of trainings";
    // }
    // @GetMapping("/evaluations")
    // public String getEvaluations() {
    //     return "List of evaluations";
    // }
    // @GetMapping("/promotions")
    // public String getPromotions() {
    //     return "List of promotions";
    // }

}
