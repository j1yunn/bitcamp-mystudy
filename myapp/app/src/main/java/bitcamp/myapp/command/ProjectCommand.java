package bitcamp.myapp.command;

import bitcamp.myapp.vo.User;

public class ProjectCommand {

  private static final int MAX_SIZE = 100;
  private static User[] projects = new User[MAX_SIZE];
  private static int userLength = 0;

  public static void executeProjectCommand(String command) {
    System.out.printf("[%s]\n", command);
    switch (command) {
      case "등록":
        addProject();
        break;
      case "조회":
        viewProject();
        break;
      case "목록":
        listProject();
        break;
      case "변경":
        updateProject();
        break;
      case "삭제":
        deleteProject();
        break;
    }
  }

  private static void addProject() {
    Project project = new Project();
    project.setTitle(Prompt.input("프로젝트명?"));
    project.setDescription(Prompt.input("설명?"));
    project.setStartDate(Prompt.input("시작일?"));
    project.setEndDate(prompt.input("종료일?"));
    System.out.println("팀원: ");
    int userNo = Prompt 


    projects[projectslength++] = project;
    System.out.println("등록했습니다.");
  }

  private static void addProject() {
    System.out.println("프로젝트 등록...");
  }

  private static void listProject() {
    System.out.println("프로젝트 목록...");
  }

  private static void viewProject() {
    System.out.println("프로젝트 조회...");
  }



  private static void updateProject() {
    System.out.println("프로젝트 변경...");
  }

  private static void deleteProject() {
    System.out.println("프로젝트 삭제...");
  }

}
