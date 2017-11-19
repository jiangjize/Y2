package cn.jjz.service.impl;

import cn.jjz.entity.Person;
import cn.jjz.repostitory.PersonRepository;
import cn.jjz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 123 on 2017/10/07.
 */
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;


    public Long savePerson() {
        Person person = new Person();
        person.setUsername("BT亮");
        person.setPhone("18381005946");
        person.setAddress("北京海淀区北大青鸟信息中心");
        person.setRemark("我是变态亮");
        return personRepository.save(person);
    }
}
