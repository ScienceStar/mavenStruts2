package serviceImpl;

import java.io.IOException;
import java.util.List;

import base.MyBatisConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import service.IPersonService;
import bean.Person;
import dao.PersonDao;

public class PersonServiceImpl implements IPersonService {
    public static SqlSessionFactory sqlSessionFactory = null;

    public List<Person> getPersonListById(Person p) {
	// TODO Auto-generated method stub
	//return personDao.getPersonListById(p);
        return  null;
    }

    public List<Person> getAllPersonList() {
        List<Person> plist = null;
        SqlSession session = null;
        try {
             sqlSessionFactory = MyBatisConfig.dataConfig();
            session = sqlSessionFactory.openSession();
            PersonDao personDao = session.getMapper(PersonDao.class);
            plist = personDao.getAllPersonList();

            for(Person p : plist){
                System.out.println(p.getPersonId()+"\t"+p.getPersonName()+"\t"+p.getPersonAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        return plist;
    }

}
