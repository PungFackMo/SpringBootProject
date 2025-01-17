package com.DiaryApp.todo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoRepoTest {

	@Autowired
	TodoRepo tRepo;
	
	@Test
	void test() {
		for(int i=0;i<125;i++) {
			TodoDto tDto=new TodoDto();
			tDto.setContent("테스트" +i);
			tDto.setStartDate(LocalDate.now().minusDays(125).plusDays(i));
			tDto.setEndDate(null);
			tDto.setCompleted(false);
			tRepo.save(tDto);
			i++;
			TodoDto tDto2=new TodoDto();
			tDto2.setContent("테스트"+i);
			tDto2.setStartDate(LocalDate.now().minusDays(125).plusDays(i));
			tDto2.setEndDate(null);
			tDto2.setCompleted(false);
			tRepo.save(tDto2);
			
		}
	}

}