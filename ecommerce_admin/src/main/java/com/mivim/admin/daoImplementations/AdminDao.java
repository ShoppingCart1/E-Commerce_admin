package com.mivim.admin.daoImplementations;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mivim.admin.dao.IAdminDao;



public class AdminDao {
	@Autowired(required = true)
	@Qualifier("sqlSession")
	static SqlSessionTemplate sessionTemplate;
	
	public static int test(){
		System.out.println(sessionTemplate);
		if(sessionTemplate!=null){
			return 1;
		}
		
		return 0;
		
	}

	
}
