package com.DiaryApp.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
	
	@Autowired
	CommentRepo cRepo;
	
	//board - id값 검색 
	public List<CommentDto> getCommentsByBoardId(Integer boardId) {
		return cRepo.findByBoardId(boardId);
	}
	
	//디비에 저장
	public void putComment(CommentDto cDto) {
		cRepo.save(cDto);
	}
	
    
	//id 값을 이용하여 todo 삭제
	public void deleteComment(Integer id) {
		cRepo.deleteById(id);
	}
}
