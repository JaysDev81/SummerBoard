package smboard.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import smboard.board.dao.BoardDao;
import smboard.board.model.BoardCommentModel;
import smboard.board.model.BoardModel;

public class BoardService implements BoardDao {
	
		private SqlMapClientTemplate sqlMapClientTemplate;
	
		private HashMap<String, Object> valueMap = new HashMap<String, Object>();
		
		public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate){
				this.sqlMapClientTemplate = sqlMapClientTemplate;
		}
		
		@Override
		public List<BoardModel> getBoardList(int startArticleNum, int endArticleNum) {
				valueMap.put("startArticleNum", startArticleNum);
				valueMap.put("endArticleNum", endArticleNum);
				return sqlMapClientTemplate.queryForList("board.getBoardList", valueMap);
		}
		
		@Override
		public BoardModel getOneArticle(int idx){
				return (BoardModel) sqlMapClientTemplate.queryForObject("board.getOneArticle", idx);
		}

}
