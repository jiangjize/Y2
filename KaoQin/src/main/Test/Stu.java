import cn.jjz.dao.LoginDao;
import cn.jjz.dao.StudentDao;
import cn.jjz.entity.Login;
import cn.jjz.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Stu {
    @Test
    public void a(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao=(StudentDao) applicationContext.getBean("studentdao");
        Student student=new Student();
        student.setClassesid(0);
       studentDao.ByclassSelect(student);

    }
    @Test
    public void b(){

    }
}
