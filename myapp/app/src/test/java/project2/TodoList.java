package project2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<TodoItem> todos = new ArrayList<>();
    private ArrayList<String> goals = new ArrayList<>();
    private final String TODO_FILE = "todos.txt";
    private final String GOAL_FILE = "goals.txt";

    public void addTodo(Scanner scanner) {
        System.out.print("날짜 (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("카테고리: ");
        String category = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        System.out.print("완료 여부 (Y/N): ");
        boolean completed = scanner.nextLine().equalsIgnoreCase("Y");
        todos.add(new TodoItem(date, category, content, completed));
        System.out.println("할 일이 추가되었습니다.");
    }

    public void addGoal(Scanner scanner) {
        System.out.print("시작 날짜 (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("완료 날짜 (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        System.out.print("카테고리: ");
        String category = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        goals.add("[" + startDate + " - " + endDate + "]의 목표:\n" + content);
        System.out.println("목표가 추가되었습니다.");
    }

    public void viewDaily(Scanner scanner) {
        System.out.print("날짜 (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.println("[" + date + "]의 할 일:");
        boolean found = false;
        for (TodoItem todo : todos) {
            if (todo.getDate().equals(date)) {
                System.out.println(todo.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 날짜의 할 일이 없습니다.");
        }
    }

    public void viewMonthly(Scanner scanner) {
        System.out.print("날짜 (YYYY-MM): ");
        String month = scanner.nextLine();
        System.out.println("[" + month + "]의 할 일:");
        boolean found = false;
        for (TodoItem todo : todos) {
            if (todo.getDate().startsWith(month)) {
                System.out.println(todo.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 월의 할 일이 없습니다.");
        }
    }

    public void editTodo(Scanner scanner) {
        System.out.println("수정할 할 일을 선택하세요 (0을 입력하면 이전 메뉴로 돌아갑니다):");
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ". " + todos.get(i).toString());
        }
        int choice = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        if (choice > 0 && choice <= todos.size()) {
            TodoItem selectedTodo = todos.get(choice - 1);
            System.out.print("날짜 (YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.print("카테고리: ");
            String category = scanner.nextLine();
            System.out.print("내용: ");
            String content = scanner.nextLine();
            System.out.print("완료 여부 (Y/N, 현재: " + (selectedTodo.isCompleted() ? "Y)" : "N)"));
            boolean completed = scanner.nextLine().equalsIgnoreCase("Y");
            selectedTodo.setDate(date);
            selectedTodo.setCategory(category);
            selectedTodo.setContent(content);
            selectedTodo.setCompleted(completed);
            System.out.println("할 일이 수정되었습니다.");
        } else if (choice == 0) {
            return;
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    public void editGoal(Scanner scanner) {
        System.out.println("수정할 목표를 선택하세요 (0을 입력하면 이전 메뉴로 돌아갑니다):");
        for (int i = 0; i < goals.size(); i++) {
            System.out.println((i + 1) + ". " + goals.get(i));
        }
        int choice = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        if (choice > 0 && choice <= goals.size()) {
            System.out.print("시작 날짜 (YYYY-MM-DD): ");
            String startDate = scanner.nextLine();
            System.out.print("완료 날짜 (YYYY-MM-DD): ");
            String endDate = scanner.nextLine();
            System.out.print("카테고리: ");
            String category = scanner.nextLine();
            System.out.print("내용: ");
            String content = scanner.nextLine();
            goals.set(choice - 1, "[" + startDate + " - " + endDate + "]의 목표:\n" + content);
            System.out.println("목표가 수정되었습니다.");
        } else if (choice == 0) {
            return;
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    public void deleteTodo(Scanner scanner) {
        System.out.println("삭제할 할 일을 선택하세요 (0을 입력하면 이전 메뉴로 돌아갑니다):");
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ". " + todos.get(i).toString());
        }
        int choice = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        if (choice > 0 && choice <= todos.size()) {
            todos.remove(choice - 1);
            System.out.println("할 일이 삭제되었습니다.");
        } else if (choice == 0) {
            return;
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    public void deleteGoal(Scanner scanner) {
        System.out.println("삭제할 목표를 선택하세요 (0을 입력하면 이전 메뉴로 돌아갑니다):");
        for (int i = 0; i < goals.size(); i++) {
            System.out.println((i + 1) + ". " + goals.get(i));
        }
        int choice = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거
        if (choice > 0 && choice <= goals.size()) {
            goals.remove(choice - 1);
            System.out.println("목표가 삭제되었습니다.");
        } else if (choice == 0) {
            return;
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    public void loadData() {
        try (BufferedReader br = new BufferedReader(new FileReader(TODO_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String date = parts[0];
                String category = parts[1];
                String content = parts[2];
                boolean completed = Boolean.parseBoolean(parts[3]);
                todos.add(new TodoItem(date, category, content, completed));
            }
        } catch (IOException e) {
            System.out.println("할 일 데이터를 로드하는 중 오류가 발생했습니다.");
        }
    }

    public void saveData() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TODO_FILE))) {
            for (TodoItem todo : todos) {
                bw.write(todo.getDate() + ";" + todo.getCategory() + ";" + todo.getContent() + ";" + todo.isCompleted());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("할 일 데이터를 저장하는 중 오류가 발생했습니다.");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(GOAL_FILE))) {
            for (String goal : goals) {
                bw.write(goal);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("목표 데이터를 저장하는 중 오류가 발생했습니다.");
        }
    }

    // Inner class representing a Todo item
    private static class TodoItem {
        private String date;
        private String category;
        private String content;
        private boolean completed;

        public TodoItem(String date, String category, String content, boolean completed) {
            this.date = date;
            this.category = category;
            this.content = content;
            this.completed = completed;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }

        @Override
        public String toString() {
            return date + " - [" + category + "] " + content + " (" + (completed ? "완료" : "미완료") + ")";
        }
    }
}
