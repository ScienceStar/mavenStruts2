package bean;

import java.io.Serializable;

public class Person implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int personId;
    private String personName;
    private int personAge;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Person(int personId, String personName, int personAge) {
        super();
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
    }


}
