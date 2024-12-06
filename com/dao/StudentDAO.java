package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.StudentDTO;
import com.dto.StudentDTO2;

// DAO 패턴 ( Data Access Object)
// DB 또는 파일등 데이터를 가지고 있는 외부자원과 연동하는 클래스. 
public class StudentDAO {
	private SqlSession session;
	
	

	public List<StudentDTO> findAll(SqlSession session) {
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findAll");
		return list;
	}
	public List<StudentDTO> findName(SqlSession session, String STUDENT_NAME) {
		List<StudentDTO> list = session.selectList("com.config.StudentMapper.findName",STUDENT_NAME);
		return list;
	}
	public List<StudentDTO> findYear(SqlSession session, int startYear, int endYear) {
	    Map<String, Object> params = new HashMap<>();
	    params.put("start_year", startYear);
	    params.put("end_year", endYear);
	    List<StudentDTO> list = session.selectList("com.config.StudentMapper.findYear", params);
	    return list;
	}
	public List<StudentDTO> findNo(SqlSession session, List<String> studentNo) {
	    return session.selectList("com.config.StudentMapper.findNo", studentNo);
	}
    public int updateabs(SqlSession session, HashMap<String, Integer> map) {
		int n = session.update("com.config.StudentMapper.update", map);
		return n;
    }
    public int updatecapa(SqlSession session) {
		int n = session.update("com.config.StudentMapper.updatecapa");
		return n;    
	}
    public List<StudentDTO2> stugra(SqlSession session, List<String> studentNos) {
        return session.selectList("com.config.StudentMapper.stugra", studentNos);
    }
    public List<StudentDTO> paging(SqlSession session, int skip, int perPage) {
        RowBounds rowBounds = new RowBounds(skip, perPage); 
        List<StudentDTO> list = session.selectList("com.config.StudentMapper.paging", null, rowBounds);
        return list;
    }
    public int getTotalCount(SqlSession session) {
        return session.selectOne("com.config.StudentMapper.getTotalCount");
    }

	

}