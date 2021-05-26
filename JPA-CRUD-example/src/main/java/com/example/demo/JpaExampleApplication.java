package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaExampleApplication.class, args);
		UserDao userDao = context.getBean(UserDao.class);

		// To save and save all the user
		User user = new User();
		user.setUserName("Rohini Ninawe");
		user.setUserCity("Pune");
		user.setUserStatus("SAP Consultant");

		User user1 = new User();
		user1.setUserName("Shashank Ninawe");
		user1.setUserCity("Nagpur");
		user1.setUserStatus("BusinessMan");

		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user);

		// userDao will save as well as return the list of objects or individual objects
		Iterable<User> users1 = userDao.saveAll(users);
		users1.forEach(u -> {
			System.out.println(u);
		});
//				OR
//		List<User> listusers = (List<User>) userDao.saveAll(users);
//		for (User u : listusers) {
//			System.out.println(u);
//		}

		// to update the user
		// 1. get user by id from database.
		// 2. set values in same object.
//		Optional<User> optionalUser = userDao.findById(1);
//		User user1 = optionalUser.get();
//		System.out.println(user1);
//		user1.setUserName("Bunty");
//		User finaluser = userDao.save(user1);
//		System.out.println(finaluser);

		// to get list of all Users
//		List<User> listusers = (List<User>) userDao.findAll();
//		for (User u : listusers) {
//			System.out.println(u);
//		}
		// OR
//		Iterable<User> itr = userDao.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}

		// to delete the userby id
//		userDao.deleteById(2);
//		Iterable<User> itr = userDao.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
//
//		// delete all users
//		Iterable<User> itr1 = userDao.findAll();
//		userDao.deleteAll(itr1);
	}

}
