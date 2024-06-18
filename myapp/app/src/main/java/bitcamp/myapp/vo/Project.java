package bitcamp.myapp.vo;

public class Project {
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private User[] members = new User[10];
    private int memberSize;

    // 기본 생성자
    public Project() {
    }

    // Getter 및 Setter 메서드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public User[] getMembers() {
        return members;
    }

    public void setMembers(User[] members) {
        this.members = members;
    }

    public int getMemberSize() {
        return memberSize;
    }

    public void setMemberSize(int memberSize) {
        this.memberSize = memberSize;
    }

}
