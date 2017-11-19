import cn.jjz.dao.StudentDao;
import cn.jjz.entity.StudentInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class StudentInfoTest {
    @Test
    public void accessStudentInfo(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao dao=(StudentDao)  a.getBean("studentdao");
        List<StudentInfo> list=dao.accessStudentInfo();
        for (StudentInfo s:list) {
            System.out.println(s.getStuname()+" "+s.getGradeInfo().getGraname());
        }
    }
    @Test
    public void onConditionQuery(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao dao=(StudentDao)  a.getBean("studentdao");
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.setStugrade(1);
        studentInfo.setStuname("");
        List<StudentInfo> list=dao.onConditionQuery(studentInfo);
        for (StudentInfo s:list) {
            System.out.println(s.getStuname());
        }
    }
    @Test
    public void Luru(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao dao=(StudentDao)  a.getBean("studentdao");
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.setStucode(1);
        studentInfo.setStuscore(60);
       int i=dao.inputResult(studentInfo);
       if(i>0){
           System.out.println("yes");
       }else {
           System.out.println("no");
       }
    }

}
