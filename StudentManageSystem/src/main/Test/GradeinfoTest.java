import cn.jjz.dao.GradeDao;
import cn.jjz.entity.GradeInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class GradeinfoTest {
    @Test
    public void selectGrade(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
        GradeDao dao=(GradeDao) a.getBean("gradedao");
       List<GradeInfo> list= dao.selectAllGrade();
        for (GradeInfo g:list) {
            System.out.println(g.getGraname());
        }
    }

    @Test
    public void addGrade(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
        GradeDao dao=(GradeDao) a.getBean("gradedao");
        GradeInfo gradeInfo=new GradeInfo();
        gradeInfo.setGraname("Y2168");
        dao.addGrade(gradeInfo);
    }
}
