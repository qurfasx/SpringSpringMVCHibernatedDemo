import com.hc.entity.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/27.
 */
public class EmpTest {
    @Test
    public void textssh(){
        ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory= (SessionFactory) act.getBean("sqlSessionFactory");
        Session session = sessionFactory.openSession();
        Session session1 = sessionFactory.openSession();
        Session session2 = sessionFactory.openSession();
        System.out.println(session1 == session2);
    }


    @Test
    public void fun2() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) act.getBean("sqlSessionFactory");

        Session session = sessionFactory.getCurrentSession();
            //从主动方开始查，只查一次
            Dept dept = new Dept(2, "1111111", "1111111");
            session.save(dept);
    }

}