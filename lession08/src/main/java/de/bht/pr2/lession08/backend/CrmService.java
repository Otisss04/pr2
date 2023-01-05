package de.bht.pr2.lession08.backend;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import de.bht.pr2.lession08.data.Company;
import de.bht.pr2.lession08.data.Contact;
import de.bht.pr2.lession08.data.Status;

@Service
public class CrmService {

  private final List<Contact> contacts;
  private final List<Company> companies;

  private final List<Status> statuses;

  public CrmService() {
    contacts = new LinkedList<>();
    companies = new LinkedList<>();
    statuses = new LinkedList<>();

    Company company = new Company();
    company.setName("BHT");
    companies.add(company);

    Status status = new Status("Wissenschaftlicher Mitarbeiter");
    statuses.add(status);

    company.setEmployees(contacts);
  }

  public List<Contact> findAllContacts(String stringFilter) {
    return contacts;
  }

  public long countContacts() {
    return contacts.size();
  }

  public void deleteContact(Contact contact) {
    //
    contacts.remove(contact);
  }

  public void saveContact(Contact contact) {
    contacts.remove(contact);
    contacts.add(contact);
  }

  public List<Company> findAllCompanies() {
    return companies;
  }

  public List<Status> findAllStatuses() {
    return statuses;
  }
}
