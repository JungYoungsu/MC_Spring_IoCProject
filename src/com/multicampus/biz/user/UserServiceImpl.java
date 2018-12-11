package com.multicampus.biz.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 4. Service ���� Ŭ����
@Component("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	public UserServiceImpl() {
		System.out.println("===> UserServiceImpl ����");
	}
	
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}

	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	public List<UserVO> getUserList(UserVO vo) {
		return userDAO.getUserList(vo);
	}

}
