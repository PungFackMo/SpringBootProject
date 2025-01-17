package com.DiaryApp.comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<CommentDto, Integer>{
	List<CommentDto> findByBoardId(Integer boardId);

}
