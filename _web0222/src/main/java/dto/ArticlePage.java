package dto;

import java.util.List;

public class ArticlePage {
	
	private int total; // 전체 게시글 개수
	private int currentPage;
	private List<Board> content; // 멤버관리 한다치면 board에 memeber를 넣어서 대치 가능
	private int totalPages; // 전체 페이지 개수
	private int startPage;
	private	int endPage;
	
	// size : 한 페이지당 보여줄 목록의 개수
	
	public ArticlePage(int total, int currentPage,int size, List<Board> content) {
		this.total = total;
		this.currentPage = currentPage;
		this.content = content;
		if(total == 0) {
			totalPages=0;
			startPage=0;
			endPage = 0;
		} else {
			totalPages = total / size ;
			if (total % size > 0) { // 나머지 계산 즉 0보다 크면 토탈페이지 1증가
				totalPages++;
			}
			int modVal = currentPage % 5; // 나머지 계산
			startPage = currentPage / 5 * 5 + 1;
			if(modVal==0) startPage -= 5;
			//startPage,endPage: 화면 하단 보여줄 ㅔㅍ이지 이동 링크의 시작 번호와 끝 번호
			endPage = startPage+4;
			if(endPage>totalPages) endPage = totalPages;
		
		}
	}
	public boolean hasNoArticles() {
		return total == 0;
	}
	public boolean hasArticles() {
		return total > 0;
	}
	public int getTotal() {
		return total;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public List<Board> getContent() {
		return content;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public int getStartPage() {
		return startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	
}

