package info.sjd;

import java.util.ArrayList;
import java.util.List;

import info.sjd.entity.User;
import info.sjd.entity.UserList;
import info.sjd.service.ObjectConverter;

public class ApplicationRunner {

	public static void main(String[] args) {
		User user = new User();
		user.setLogin("ignatenko2207");
		user.setPass("22222");
		user.setFirstName("Alex");
		user.setLastName("Ignatenko");
		
		
		
		
		User user2 = new User();
		user2.setLogin("ignatenko220782");
		user2.setPass("2222244");
		user2.setFirstName("Alex");
		user2.setLastName("Ignatenko");
		
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user2);
		
		UserList userList = new UserList();
		userList.setUsers(users);
		
		ObjectConverter.convertToXml(userList);
	}
}
