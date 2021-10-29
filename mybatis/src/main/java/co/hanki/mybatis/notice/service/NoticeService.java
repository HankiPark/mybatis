package co.hanki.mybatis.notice.service;

import java.util.List;

import co.hanki.mybatis.member.service.MemberVO;

public interface NoticeService {
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	int hitUp(NoticeVO vo);
	List<NoticeVO> noticeSelectTiList(NoticeVO vo);
	List<NoticeVO> noticeSelectNaList(NoticeVO vo);
	List<NoticeVO> noticeId(MemberVO vo);
}
