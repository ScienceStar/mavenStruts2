package service;

import java.util.List;

import bean.Person;

public interface IPersonService {
  public List<Person> getPersonListById(Person p);
  public List<Person> getAllPersonList();
}
