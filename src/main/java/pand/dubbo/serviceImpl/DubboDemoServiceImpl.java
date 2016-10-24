package pand.dubbo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import pand.dubbo.bean.User;
import pand.dubbo.service.DubboDemoService;

public class DubboDemoServiceImpl implements DubboDemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();  
        User u1 = new User();  
        u1.setName("jack");  
        u1.setAge(20);  
        u1.setSex("女");  
          
        User u2 = new User();  
        u2.setName("tom");  
        u2.setAge(21);  
        u2.setSex("男");  
          
        User u3 = new User();  
        u3.setName("rose");  
        u3.setAge(19);  
        u3.setSex("男");  
          
        list.add(u1);  
        list.add(u2);  
        list.add(u3);  
        return list;
	}
}
