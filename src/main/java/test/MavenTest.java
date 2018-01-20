package test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import bean.Person;

public class MavenTest {
    @Test
    public void testSelectAll() throws IOException {
	
	try {
		Reader reader = Resources.getResourceAsReader("config.xml");
		// ����
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		// ������Դ
		SqlSessionFactory factory = builder.build(reader);
		// ��session
		SqlSession session = factory.openSession();
		// 1��ͳд�������Ƽ�
		/*
		 * List<Emp> list =
		 * session.selectList("com.shandian.mapper.empmapper.queryall"); for
		 * (Emp emp : list) { System.out.println(emp); }
		 */
		// 2,�ýӿ�ӳ�����ʽ���в�ѯ���ٷ��Ƽ�
		/*empmapper empmapper = session.getMapper(empmapper.class);
		List<Emp> list = empmapper.queryall();
		for (Emp emp : list) {
			System.out.println(emp.getEname()+"\t"+emp.getJob());
		}*/
		
		/**方法1**/
		/*PersonDao personDao = session.getMapper(PersonDao.class);
		List<Person> list = personDao.getAllPersonList();
		for(Person per : list){
			System.out.println(per.getPersonId()+"\t"+per.getPersonName()+"\t"+per.getPersonAge());
		}*/
		
		/**
		 * 方法2
		 */
		Person person = new Person();
		person.setPersonId(3);
		Person p = session.selectOne("dao.PersonDao.getPersonListById",person);
		System.out.println(p.getPersonId()+"\t"+p.getPersonName()+"\t"+p.getPersonAge());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
