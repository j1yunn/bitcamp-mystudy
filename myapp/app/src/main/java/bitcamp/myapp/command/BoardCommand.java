package bitcamp.myapp.command;

import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Board;
import bitcamp.myapp.vo.User;

import java.util.Date;

public class BoardCommand {

  private static final int MAX_SIZE = 100;
  private static Board[] boards = new Board[MAX_SIZE];
  private static int boardLength = 0;


  public static void executeBoardCommand(String command) {
    System.out.printf("[%s]\n", command);
    switch (command) {
      case "등록":
        addBoard();
        break;
      case "조회":
        viewBoard();
        break;
      case "목록":
        listBoard();
        break;
      case "변경":
        updateBoard();
        break;
      case "삭제":
        deleteBoard();
        break;
    }
  }

  private static void addBoard() {
    Board board = new Board();
    board.setTitle(Prompt.input("제목?"));
    board.setContent(Prompt.input("내용?"));
    board.setCreatedDate(new Date());
    boards[boardLength++] = board;
  }

  private static void listBoard() {
    System.out.println("번호 제목 작성일 조회수");
    for (int i = 0; i < boardLength; i++) {
      Board board = boards[i];
      System.out.printf("%d %s %s %d\n",
              (i + 1), board.getTitle(), board.getCreatedDate(), board.getViewCount());
    }
  }

  private static void viewBoard() {

  }

  private static void updateBoard() {
  }

  private static void deleteBoard() {
  }
}

