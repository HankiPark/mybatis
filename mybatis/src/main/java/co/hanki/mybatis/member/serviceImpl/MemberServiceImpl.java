package co.hanki.mybatis.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.hanki.mybatis.comm.DataSource;
import co.hanki.mybatis.member.service.MemberMapper;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.service.MemberVO;

public class MemberServiceImpl implements MemberService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true); //auto-commit;
	private MemberMapper map= sqlSession.getMapper(MemberMapper.class); // 연결하고 mapper활용
	@Override
	public List<MemberVO> MemberSelectList() {
		// TODO Auto-generated method stub
		/* return sqlSession.selectList("MemberSelectList"); */ //mapper없이 사용할때
		return map.MemberSelectList();
	}

	@Override
	public MemberVO MemberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		/*
		 * return sqlSession.selectOne("memberSelect",vo);
		 */
		return map.MemberSelect(vo);}

	@Override
	public int MemberInsert(MemberVO vo) {

		return map.MemberInsert(vo);
	}

	@Override
	public int MemberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.MemberUpdate(vo);
	}

	@Override
	public int MemberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.MemberDelete(vo);
	}

	@Override
	public int IsIdCheck(MemberVO vo) {
		
		return map.IsIdCheck(vo);
	}
	


}
