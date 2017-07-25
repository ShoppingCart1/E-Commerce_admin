package com.mivim.admin.daoImplementations;
import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mivim.admin.dao.IAdminDao;
import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.data.dao.ItemMapper;
import com.mivim.data.dao.UserMapper;
import com.mivim.data.model.User;
import com.mivim.data.model.UserExample;

@Repository
@Resource(name="adminDao")
public class AdminDao implements IAdminDao{

	
	@Autowired
	private UserMapper userMapper;
	
	
	@Autowired(required=true)
	@Qualifier("userExample")
	UserExample userExample;
	
	@Autowired
	@Qualifier("user")
	User user;
	
	@Override
	public AdminLoginDto authentication(AdminLoginDto dto) {

		userExample.or().andEmailEqualTo(dto.getEmail());
		userExample.or().andPasswordEqualTo(dto.getPassword());

		List<User> userList = userMapper.selectByExample(userExample);
		AdminLoginDto adminLoginDto = new AdminLoginDto();
		for (User user : userList) {
			if (user.getEmail().equals(dto.getEmail()) && user.getPassword().equals(dto.getPassword())) {
				adminLoginDto.setId(user.getId());
				adminLoginDto.setEmail(user.getEmail());
				adminLoginDto.setUsername(user.getUsername());

			}
		}

		return adminLoginDto;

	}
	
}
