package cn.jjz.ognl;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * Created by lenovo on 2017/10/25.
 */
public class OgnlAction implements Action {
    private int[] num;
/*    private Student student;*/

    public String execute() throws Exception {
         Student student=new Student();
         student.setEmil("liulu");
         student.setName("垃圾");
        ValueStack vs= ActionContext.getContext().getValueStack();
        vs.push(student);
            System.out.println(num);
        return "success";
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }


}
