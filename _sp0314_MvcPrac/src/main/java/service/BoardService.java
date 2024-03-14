package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import dto.BoardDto;

@Service
public class BoardService {

    private final BoardDao boardDao;

    @Autowired
    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public List<BoardDto> getAllBoardList() { // 여기 이름은 내 마음대로 설정
        return boardDao.selectAllList();
    }
   
}


