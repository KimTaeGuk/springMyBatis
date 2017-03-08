package tq.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import tq.spring.dto.BoardDto;

public class BoardDao implements BoardDaoImpl {

	@Autowired
	public JdbcTemplate template;
		
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public BoardDao(){}
	
	
	@Override
	public ArrayList<BoardDto> boardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void boardWrite(Integer bNum, String bId, String bTitle, String bContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDelete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void boardModify() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public Integer boardCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDto boardView(Integer bNum) {
		// TODO Auto-generated method stub
		return null;
	}
}
