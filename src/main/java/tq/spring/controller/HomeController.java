package tq.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tq.spring.dao.BoardDao;
import tq.spring.dao.BoardDaoImpl;

@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	private BoardDaoImpl BoardDaoImpl;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Board/boardList";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		System.out.println("controllerBoardList");
		
		BoardDaoImpl=sqlSession.getMapper(BoardDaoImpl.class);
		
		model.addAttribute("BoardList", BoardDaoImpl.boardList());
		
		return "Board/boardList";
	
	}
	
	@RequestMapping("/boardWrite")
	public String boardWrite() {
		
		System.out.println("controllerBoardWrite");
		
		return "Board/boardWrite";
	}
	@RequestMapping("/boardWriteProc")
	public String boardWriteProc(HttpServletRequest request, Model model) {
		
		System.out.println("controllerBoardWriteProc");
		
		BoardDaoImpl=sqlSession.getMapper(BoardDaoImpl.class);
		
		Integer bNum=BoardDaoImpl.boardCount()+1;		
		String bId=request.getParameter("bId");
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");

		BoardDaoImpl.boardWrite(bNum, bId, bTitle, bContent);
		
		return "redirect:boardList";
	}
	
	@RequestMapping(value="/boardView", method=RequestMethod.GET)
	public String boardView(HttpServletRequest request, Model model) {
	
		System.out.println("controllerBoardView");

		BoardDaoImpl=sqlSession.getMapper(BoardDaoImpl.class);
		
		Integer bNum=Integer.parseInt(request.getParameter("bNum"));
		
		model.addAttribute("BoardView", BoardDaoImpl.boardView(bNum));
		
		return "Board/boardView";
	
	}
	
	@RequestMapping("/boardModify")
	public String boardModify() {
		
		System.out.println("controllerBoardModify");
		
		return "Board/boardModify";
	
	}
	
	
	
}
