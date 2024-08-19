package bitcamp.myapp.dao.mysql;

import bitcamp.bitbatis.SqlSession;
import bitcamp.myapp.dao.UserDao;
import bitcamp.myapp.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class UserDaoImpl implements UserDao {

  private Connection con;
  private SqlSession sqlSession;

  public UserDaoImpl(Connection con, SqlSession sqlSession) {
    this.con = con;
    this.sqlSession = sqlSession;
  }

  @Override
  public boolean insert(User user) throws Exception {
    sqlSession.insert(
        "insert into myapp_users(name, email, pwd, tel) values (?, ?, sha1(?), ?)",
        user.getName(),
        user.getEmail(),
        user.getPassword(),
        user.getTel());
    return true;
  }

  @Override
  public List<User> list() throws Exception {
    return sqlSession.selectList(
        "select "
            + " user_id as no,"
            + " name,"
            + " email"
            + " from myapp_users order by user_id asc",
        User.class);
  }

  @Override
  public User findBy(int no) throws Exception {
    return sqlSession.selectOne(
        "select user_id, name, email, tel from myapp_users where user_id=?",
        no);
  }

  @Override
  public User findByEmailAndPassword(String email, String password) throws Exception {
    try (PreparedStatement stmt = con.prepareStatement(
        "select user_id, name, email, tel from myapp_users where email=? and pwd=sha1(?)")) {
      stmt.setString(1, email);
      stmt.setString(2, password);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          User user = new User();
          user.setNo(rs.getInt("user_id"));
          user.setName(rs.getString("name"));
          user.setEmail(rs.getString("email"));
          user.setTel(rs.getString("tel"));
          return user;
        }
        return null;
      }
    }
  }

  @Override
  public boolean update(User user) throws Exception {
    try (PreparedStatement stmt = con.prepareStatement(
        "update myapp_users set name=?, email=?, pwd=sha1(?), tel=? where user_id=?")) {
      stmt.setString(1, user.getName());
      stmt.setString(2, user.getEmail());
      stmt.setString(3, user.getPassword());
      stmt.setString(4, user.getTel());
      stmt.setInt(5, user.getNo());
      return stmt.executeUpdate() > 0;
    }
  }

  @Override
  public boolean delete(int no) throws Exception {
    try (PreparedStatement stmt = con.prepareStatement("delete from myapp_users where user_id=?")) {
      stmt.setInt(1, no);
      return stmt.executeUpdate() > 0;
    }
  }
}
