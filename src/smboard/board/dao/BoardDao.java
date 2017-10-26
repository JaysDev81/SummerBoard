package smboard.board.dao;

import java.util.List;

import smboard.board.model.BoardCommentModel;
import smboard.board.model.BoardModel;

public interface BoardDao {
		
		List<BoardModel> getBoardList(int startArticleNum, int showArticleLimit);

		BoardModel getOneArticle(int idx);
		
		List<BoardModel> searchArticle(String type, String keyword, int startArticleNum, int endArticleNum);
		
		List<BoardCommentModel> getCommentList(int idx);
		
		BoardCommentModel getOneComment(int idx);
		
		boolean modifyArticle(BoardModel board);
		
		boolean writeArticle(BoardModel board);
		
		void updateHitcount(int hitcount, int idx);
		
		void updateRecommendCount(int recommnedcount, int idx);
		
		int getTotalNum();
		
		int getSearchTotalNum(String type, String keyword);
		
		void deleteComment(int idx);
		
		void deleteArticle(int idx);
}
