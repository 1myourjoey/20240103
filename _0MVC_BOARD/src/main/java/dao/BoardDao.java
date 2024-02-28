package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {
    private static Connection conn;
    private static BoardDao dao = new BoardDao();

    private BoardDao() {
        // 생성자에서 getConnection 호출
        getConnection();
    }

    public static BoardDao getInstance() {
        return dao;
    }

    private void getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Board> selectList() {
        ArrayList<Board> list = new ArrayList<>();
        String sql = "SELECT b.*, m.name AS name FROM board b JOIN member m ON b.memberno = m.memberno";
        
        try (
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()
        ) {
            while (rs.next()) {
                Board board = new Board();
                board.setNum(rs.getInt("num"));
                board.setTitle(rs.getString("title"));
                board.setContent(rs.getString("content"));
                board.setRegtime(rs.getString("regtime"));
                board.setHits(rs.getInt("hits"));
                board.setMemberno(rs.getInt("memberno"));
                board.setName(rs.getString("name"));


                list.add(board);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

       
    

    public Board selectOne(int num, boolean inc) {
        Board board = null;
        String sql = "SELECT b.*, m.name AS name FROM board b JOIN member m ON b.memberno = m.memberno WHERE b.num = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, num);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    board = new Board();
                    board.setNum(rs.getInt("num"));
                    board.setTitle(rs.getString("title"));
                    board.setContent(rs.getString("content"));
                    board.setRegtime(rs.getString("regtime"));
                    board.setHits(rs.getInt("hits"));
                    board.setMemberno(rs.getInt("memberno"));
                    board.setName(rs.getString("name"));
                    // 나머지 필드도 필요에 따라 추가
                }
                // inc에 대한 로직은 해당 테이블의 업데이트가 필요한 경우 수행
                if (inc) {
                    // 예를 들어 hits 필드를 업데이트해야 할 경우
                     pstmt.executeUpdate("update board set hits=hits+1 where num=" + num);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return board;
    }

    public int delete(int num) {
        int result = 0;
        try (
                PreparedStatement pstmt = conn.prepareStatement("delete from board where num=" + num);
        ) {
            // 쿼리 실행
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int insert(Board board) {
        String sql = "insert into board(num, title, content, regtime, hits, memberno) values (seq_board.nextval,?,?,SYSDATE,0,?)";
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            // 쿼리 실행
            pstmt.setString(1, board.getTitle());
            pstmt.setString(2, board.getContent());
            pstmt.setInt(3, board.getMemberno());
            
            return pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(Board board) {
        String sql = "update board set memberno=?, title=?, content=?, regtime=SYSDATE where num=?";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(sql);            
	    ) {
	        // 현재 시간 얻기
//	        String curTime = LocalDate.now() + " " + 
//	                         LocalTime.now().toString().substring(0, 8);
	        
	        // 쿼리 실행
	    	pstmt.setInt(1, board.getMemberno());
	    	pstmt.setString(2, board.getTitle());
	    	pstmt.setString(3, board.getContent());
	    	pstmt.setInt(4, board.getNum());
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
    public String getMemberNameByMemberNo(int memberNo) {
        String memberName = null;
        String sql = "SELECT name FROM member WHERE memberno = ?";
        
        try (
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setInt(1, memberNo);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    memberName = rs.getString("name");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return memberName;
    }
}
   

