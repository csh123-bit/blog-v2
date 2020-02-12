package com.cos.blog.model.user.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//제이슨 데이터 확인
//메시지 컨버터(Jackson mapper)는 세터를 호출한다
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqLoginDto {

	@Pattern(regexp="^[a-zA-Z0-9]*$", message="유저네임에는 한글을입력 할수 없습니다.")
	@Size(max=15, message = "유저네임의 길이가 잘못되었습니다.")
	@NotBlank(message="유저네임을 입력하세요.")
	private String username;
	
	@Size(max=15, message = "패스워드 길이가 잘못되었습니다.")
	@NotBlank(message="패스워드를 입력하세요.")
	private String password;
	
	

	}

