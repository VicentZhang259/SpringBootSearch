/**
 * 
 */
package com.example.test.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.mockito.BDDMockito;

/**
 * @author zhangpengfei2
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestServiceImpl {

	@Autowired
	UserService userSerice;
	
	List<User> userList = new ArrayList<User>();
	
	@MockBean
	UserMapper userDao;
	@Test
	public void	testGetAll(){
		
		
		User user = new User();
		user.setName("huaAn");
		user.setId(0);
		user.setAccount("9527");
		
		BDDMockito.given(this.userDao.get(0)).willReturn(user);	
		org.junit.Assert.assertTrue(userSerice.getUser(0).equals(user));
	}
	

	@Test(expected=ArithmeticException.class)	 
	 public void testDivide(){
	       assertEquals(4, 12/0);
	   }

}
