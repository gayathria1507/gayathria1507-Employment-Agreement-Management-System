package repository;

import model.EmploymentAgreement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmploymentAgreementRepository {

    private List<EmploymentAgreement> database = new ArrayList<>();

    public List<EmploymentAgreement> findAll() {
        return database;
    }

    public Optional<EmploymentAgreement> findById(String id) {
        return database.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public EmploymentAgreement save(EmploymentAgreement agreement) {
        database.add(agreement);
        return agreement;
    }

    public EmploymentAgreement update(String id, EmploymentAgreement updatedAgreement) {
        delete(id);
        database.add(updatedAgreement);
        return updatedAgreement;
    }

    public boolean delete(String id) {
        return database.removeIf(e -> e.getId().equals(id));
    }
}
