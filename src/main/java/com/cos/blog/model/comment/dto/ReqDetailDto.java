package com.cos.blog.model.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ReqDetailDto {
	private int id;//key값 반환을 위해
	private int userId;
	private int postId;
	private String content;
	
	public ReqDetailDto() {
		System.out.println("리퀘스트디테일디티오");
	}
	
	

}
