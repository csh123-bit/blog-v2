package com.cos.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.model.ReturnCode;
import com.cos.blog.model.user.User;
import com.cos.blog.model.user.dto.ReqJoinDto;
import com.cos.blog.model.user.dto.ReqLoginDto;
import com.cos.blog.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	
	public int 회원가입(ReqJoinDto dto) {
		
		//DML할때만 롤백해주기때문
		try {
			System.out.println("서비스 들어옴??");
			int result=userRepository.findByUsername(dto.getUsername());
			
			if(result==1) {
				return ReturnCode.아이디중복;
			}else {
				return userRepository.save(dto);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}


	}
	public User 로그인(ReqLoginDto dto) {
		return userRepository.findByUsernameAndPassword(dto);
	}

}
