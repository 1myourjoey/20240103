package dao;

import dto.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDao {
	private static Connection conn;
	private static MemberDao dao = new MemberDao();
	private MemberDao() {} // 생성자
	public static MemberDao getInstance() {
		MemberDao.getConnection();
		return dao;
	}
	
	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
    

    public Member selectForLogin(String id, String email) {
        Member member = null;
        String sql = "select * from member where id = ? and email = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, email);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"),
                        rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;

    }

    public Member select(String id) {
        Member member = null;
        String sql = "select * from member where id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                member = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("email"),
                        rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;

    }

    public int insert(Member member) {
		String sql = "insert into member(memberno,id,email,name) values(SEQ_MEMBER.nextval,?,?,?)";
		try ( 
		    PreparedStatement pstmt = conn.prepareStatement(sql);            
		) {
		    pstmt.setString(1, member.getId());
		    pstmt.setString(2, member.getEmail());
		    pstmt.setString(3, member.getName());

		    return pstmt.executeUpdate();
		    
		} catch(Exception e) {
		    e.printStackTrace();
		} 
		return 0;
	}
    public int update(Member member) {
        String sql = "update member set email = ?, name = ? where id = ?";
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {

            // 쿼리 실행
            pstmt.setString(1, member.getEmail());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getId());
            return pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

   
}
