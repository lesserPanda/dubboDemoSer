package pand.dubbo.test.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import pand.dubbo.test.bean.User;
import pand.dubbo.test.service.DubboProvider1Service;

public class DubboProvider1ServiceImpl implements DubboProvider1Service {

	public void delet(String id) {
		System.out.println("delete info by id");

	}

	public List<User> getUser() {
		List<User> l = new ArrayList<User>();
		User u1 = new User();
		u1.setAge(20);
		u1.setName("zhang");
		u1.setSex("girl");
		
		User u2 = new User();
		u2.setAge(22);
		u2.setName("li");
		u2.setSex("boy");
		
		l.add(u1);
		l.add(u2);
		
		return l;
	}

}
