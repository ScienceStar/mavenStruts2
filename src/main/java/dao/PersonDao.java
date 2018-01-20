package dao;

import java.util.List;

import bean.Person;

public interface PersonDao {
  public List<Person> getPersonListById(Person p);
  public List<Person> getAllPersonList();
}
