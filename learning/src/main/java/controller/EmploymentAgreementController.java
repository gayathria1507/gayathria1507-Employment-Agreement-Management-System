package controller;

import model.EmploymentAgreement;
import service.EmploymentAgreementService;

import java.util.List;

public class EmploymentAgreementController {

    private final EmploymentAgreementService service;

    public EmploymentAgreementController() {
        this.service = new EmploymentAgreementService();
    }

    public List<EmploymentAgreement> getAllAgreements() {
        return service.getAllAgreements();
    }

    public EmploymentAgreement getAgreementById(String id) {
        return service.getAgreementById(id);
    }

    public EmploymentAgreement createAgreement(EmploymentAgreement agreement) {
        return service.createAgreement(agreement);
    }

    public EmploymentAgreement updateAgreement(String id, EmploymentAgreement agreement) {
        return service.updateAgreement(id, agreement);
    }

    public String deleteAgreement(String id) {
        return service.deleteAgreement(id);
    }
}
