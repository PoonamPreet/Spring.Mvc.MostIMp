package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.userDao;
import springmvc.model.User;

@Service
public class UserService {

	@Autowired
	private userDao userDao;
	public int createUser(User user)
	{
		System.out.println("User dao "+userDao);
		System.out.println(user);
		return this.userDao.saveUser(user);
	}
}
