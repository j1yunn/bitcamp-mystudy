package bitcamp.myapp.dao.mysql;

import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.Board;
import java.sql.Connection;
import java.util.List;

public class BoardDaoImpl implements BoardDao {

  private Connection con;

  public BoardDaoImpl(Connection con) {
    this.con = con;
  }

  @Override
  public boolean insert(Board board) throws Exception {
    return false;
  }

  @Override
  public List<Board> list() throws Exception {
    return List.of();
  }

  @Override
  public Board findBy(int no) throws Exception {
    return null;
  }

  @Override
  public boolean update(Board board) throws Exception {
    return false;
  }

  @Override
  public boolean delete(int no) throws Exception {
    return false;
  }
}
