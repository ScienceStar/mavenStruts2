package action;

import bean.Person;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.IPersonService;
import serviceImpl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class LoginAction extends ActionSupport {
    private Person per;
    private IPersonService iper;

    public String goTo(){
       /* Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.setPersonId(1);
        p1.setPersonName("Tom1");
        p1.setPersonAge(21);

        p2.setPersonId(2);
        p2.setPersonName("Tom2");
        p2.setPersonAge(21);

        p3.setPersonId(3);
        p3.setPersonName("Tom3");
        p3.setPersonAge(21);*/

        Person p = new Person();
        p.setPersonId(2);
        List <Person > plist = new ArrayList<Person>();
        iper = new PersonServiceImpl();
        plist = iper.getAllPersonList();

        /*plist.add(p1);
        plist.add(p2);
        plist.add(p3);*/
        ActionContext.getContext().getSession().put("plist", plist);
        return "welcome";
    }

    @Override
    public String execute() throws Exception {
        return "success";
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public IPersonService getIper() {
        return iper;
    }

    public void setIper(IPersonService iper) {
        this.iper = iper;
    }
}
