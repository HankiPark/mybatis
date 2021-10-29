package co.hanki.mybatis.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.hanki.mybatis.comm.DataSource;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.notice.service.NoticeMapper;
import co.hanki.mybatis.notice.service.NoticeService;
import co.hanki.mybatis.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {

private SqlSession sqlSession = DataSource.getInstance().openSession(true);
private NoticeMapper map = sqlSession.getMapper(NoticeMapper.class);
	
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		hitUp(vo);
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		return map.noticeDelete(vo);
	}

	@Override
	public int hitUp(NoticeVO vo) {
		return map.hitUp(vo);
	}

	@Override
	public List<NoticeVO> noticeSelectTiList(NoticeVO vo) {
		return map.noticeSelectTiList(vo);
	}

	@Override
	public List<NoticeVO> noticeSelectNaList(NoticeVO vo) {
		return map.noticeSelectNaList(vo);
	}

	@Override
	public List<NoticeVO> noticeId(MemberVO vo) {
		return map.noticeId(vo);
	}
	


}
