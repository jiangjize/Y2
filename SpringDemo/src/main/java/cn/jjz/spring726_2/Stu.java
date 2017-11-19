package cn.jjz.spring726_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/7/26.
 */
@Component()
public class Stu {
    @Value("hehe")
    private String n;
    @Autowired
 @Qualifier("car")
  // @Resource(name="car")
    private Car car;

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "n='" + n + '\'' +
                ", car=" + car +
                '}';
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
}
