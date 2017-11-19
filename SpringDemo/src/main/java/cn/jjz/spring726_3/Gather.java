package cn.jjz.spring726_3;
import java.util.*;

/**
 * Created by lenovo on 2017/7/26.
 */
public class Gather {
    //字符串数组
    private String[] names;
    //list集合
    private List<String> list;
    //set集合
    private Set<String> set;
    //map集合
    private Map<String,String> map;
    private Properties properties;

    @Override
    public String toString() {
        return "Gather{" +
                "names=" + Arrays.toString(names) +
                '}';
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
