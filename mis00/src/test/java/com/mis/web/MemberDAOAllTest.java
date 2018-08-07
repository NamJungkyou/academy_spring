package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOAllTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testUpdateMember() throws Exception{
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user01");
		vo.setUserpw("1234");
		vo.setUsername("남정규");
		vo.setEmail("admain@aaa.com");
		
		dao.updateMember(vo);
	}
	
	@Test
	public void testSelectMember() throws Exception{
		System.out.println(dao.readMember("user01"));
	}
	
	@Test
	public void testReadWithPw() throws Exception{
		System.out.println(dao.readWithPw("user01", "1234"));
	}
	
	@Test
	public void testDeleteMember() throws Exception{
		dao.deleteMember("user00", "user00");
	}
}
