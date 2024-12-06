package com.service;

import java.util.List;

import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.dto.StudentDTO2;

public interface StudentService {

	public abstract void setDao(StudentDAO dao);
	public abstract List<StudentDTO> findAll();
	public abstract List<StudentDTO> findName(String STUDENT_NAME);
	public abstract List<StudentDTO> findYear(int startYear, int endYear);
	public abstract List<StudentDTO> findNo(List<String> studentNo);
	public abstract int updateabs(List<String> studentNos);
	public abstract int updatecapa();
	public abstract List<StudentDTO2> stugra(List<String> studentNos);
	public abstract List<StudentDTO> paging(int curPage, int perPage);
	public abstract int getTotalCount();
}