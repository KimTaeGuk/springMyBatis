package tq.spring.dao;

import java.util.ArrayList;

import tq.spring.dto.BoardDto;

public interface BoardDaoImpl {
	public ArrayList<BoardDto> boardList();
	public void boardWrite(Integer bNum, String bId, String bTitle, String bContent);
	public void boardDelete();
	public void boardModify();
	public Integer boardCount();
	public BoardDto boardView(Integer bNum);
}
