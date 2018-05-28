/**
 * 
 */
package com.example.test.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

/**
 * @author zhangpengfei2
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceImpTest {

	@Autowired
	UserService userSerice;
	@MockBean
    private UserMapper mapper;
		
	    @Before
	    public void setup() {
	    	User user = new User();
			user.setId(0);
			user.setName("zhangsan");
			user.setAccount("9527");
			
			
	        //given(this.mapper.get(0)
	        //).willReturn( user);
	    }

		
		//return  user;
	
	
	@Test
	public void	testGetAll(){
		//org.junit.Assert.assertTrue(userSerice.getAll().equals(initUser()));
	}
}
