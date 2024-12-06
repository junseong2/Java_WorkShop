package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.dto.StudentDTO2;

// 비즈니스 로직 처리 및 트랜잭션 처리 담당.
public class StudentServiceImpl 
         implements StudentService {

	StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		    list = dao.findAll(session);
//		}catch(Exception e) {
//			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findName(String STUDENT_NAME) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		    list = dao.findName(session, STUDENT_NAME);
//		}catch(Exception e) {
//			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findYear(int startYear, int endYear) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		    list = dao.findYear(session,startYear, endYear);
//		}catch(Exception e) {
//			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findNo(List<String> studentNo) {
	    List<StudentDTO> list = null;
	    SqlSession session = MySqlSessionFactory.getSession();
	    try {
	        list = dao.findNo(session, studentNo);
	    } finally {
	        session.close();
	    }
	    return list;
	}

	public int updateabs(List<String> studentNos) {
        int n = 0;  
        SqlSession session = MySqlSessionFactory.getSession();
        try  {
            Map<String, Object> params = new HashMap<>();
            params.put("ABSENCE_YN", "N");
            params.put("studentNos", studentNos);
            n = session.update("com.config.StudentMapper.updateabs", params);
            session.commit();
        } finally {
			session.close();
        }
        return n;
	}

    @Override
    public int updatecapa() {
    	int n = 0;
	    SqlSession session = MySqlSessionFactory.getSession();
	    try {
			n = dao.updatecapa(session);
			session.commit();
		}finally {
			session.close();
		}
        return n;
    }

    @Override
    public List<StudentDTO2> stugra(List<String> studentNos) {
		List<StudentDTO2> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		    list = dao.stugra(session,studentNos);
//		}catch(Exception e) {
//			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
        }
    

    @Override
    public List<StudentDTO> paging(int curPage, int perPage) {
        List<StudentDTO> list = null;
        SqlSession session = MySqlSessionFactory.getSession();
        try {
            int skip = (curPage - 1) * perPage; 
            list = dao.paging(session, skip, perPage);
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public int getTotalCount() {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		    n = dao.getTotalCount(session);
//		}catch(Exception e) {
//			e.printStackTrace();
		}finally {
			session.close();
		}
		return n; 
    }



}