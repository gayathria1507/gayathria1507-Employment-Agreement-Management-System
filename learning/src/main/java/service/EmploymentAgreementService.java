package service;

import exception.InvalidEmploymentAgreementException;
import model.EmploymentAgreement;
import repository.EmploymentAgreementRepository;

import java.util.List;
import java.util.Optional;

public class EmploymentAgreementService {

    private final EmploymentAgreementRepository repository;

    public EmploymentAgreementService() {
        this.repository = new EmploymentAgreementRepository();
    }

    public List<EmploymentAgreement> getAllAgreements() {
        return repository.findAll();
    }

    public EmploymentAgreement getAgreementById(String id) {
        return repository.findById(id).orElseThrow(() -> new InvalidEmploymentAgreementException("Employment Agreement not found with id: " + id));
    }

    public EmploymentAgreement createAgreement(EmploymentAgreement agreement) {
        if (agreement.getSalary() < 0) {
            throw new InvalidEmploymentAgreementException("Salary cannot be negative.");
        }
        return repository.save(agreement);
    }

    public EmploymentAgreement updateAgreement(String id, EmploymentAgreement agreement) {
        return repository.update(id, agreement);
    }

    public String deleteAgreement(String id) {
        if (!repository.delete(id)) {
            throw new InvalidEmploymentAgreementException("Could not delete agreement with id: " + id);
        }
        return "Deleted successfully";
    }
}
