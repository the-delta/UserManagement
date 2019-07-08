package usermanagement.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> Users = new ArrayList<>(Arrays.asList(
				new User(1, "Utkarsh"),
				new User(2, "Vipul"),
				new User(3, "Sourabh")
				));
	
	public List<User> allUsers(){
		return Users;
	}
	
	public User getUser(int id) {
		return Users.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addUser(User user) {
		Users.add(user);
	}

	public void updateUser(User user, int id) {
		Users.stream().filter(t -> t.getId() == id).findFirst().get().setName(user.getName());
	}

	public void deleteUser(int id) {
		Users.removeIf(t-> t.getId() == id);
	}
}
