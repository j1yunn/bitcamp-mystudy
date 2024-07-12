package project3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookClub {
    private List<Member> members;
    private final String fileName = "members.dat";

    public BookClub() {
        members = new ArrayList<>();
        loadMembers();
    }

    public void addMember(Member member) {
        members.add(member);
        saveMembers();
    }

    public void removeMember(String email) {
        members.removeIf(member -> member.getEmail().equals(email));
        saveMembers();
    }

    public List<Member> getMembers() {
        return members;
    }

    private void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            members = (List<Member>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("해당 멤버를 찾을 수 없습니다.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveMembers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(members);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
