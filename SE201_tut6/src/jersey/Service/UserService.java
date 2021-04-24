package jersey.Service;

import java.util.ArrayList;
import java.util.List;

import jersey.model.User;

public class UserService {
	public List<User> getAllUsers() {
		User u1 = new User (1, "Pham Hang", "0966256730", "HCM");
		User u2 = new User (2, "Phuong Mai", "0988888888", "Ha Noi");
		User u3 = new User (3, "Khue Dinh", "0966666666", "Da Nang");
		
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
		
	}

}
