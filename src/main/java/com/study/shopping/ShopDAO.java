package com.study.shopping;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopDAO {
	int add(String userId, String psw, String name, String birth, String zipcode, String adress, String mobile,
			String mail, String gender, String sAdress); // 회원가입 db insert
	ArrayList<BoardCategoryDTO> category(); // 게시판 category select option
	int dologin(String id, String psw); // login 하기
	int adlogin(String id, String psw); // 관리자 로그인
	int idchk(String userId); // 아이디 중복체크
	ArrayList<MemberDTO> myLoad(String userId); //회원정보로드(실패)
	ArrayList<MemberDTO> orderData(String userId); //
	int modify(String userId, String name, String birth, String zipcode, String adress, String mobile,String mail); // 회원정보수정
	int myWrite(String title, String writer, String content, int category); // 관리자 글 작성
	int customerWrite(int memberid, int category,String title, String writer, String content,int answer); //고객 글 작성
	ArrayList<BoardDTO> boardList(int category);
	ArrayList<directQnADTO> directQnAList(int category);
	int modifyBoard(String title,String content,int uniq);
	int delete( int uniq);
	int deleteDirectQnA(int uniq);
	ArrayList<answerstateDTO> answerstate(); // 게시판 답변상태 option
	int comment(int directID, String qwriter, int category, String writer, String comment);
	ArrayList<directQnAanswerDTO> directQnAanswer();
	int QnAdelete(int comment_id);
	int commentModify(int comment_id, String content);
	int commentAnswer(int answer,int id);
	int modifyDirectQnA(String title, String content, int uniq);
}
