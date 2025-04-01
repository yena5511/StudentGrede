package school;

import java.util.ArrayList;

public class School {
    private static School instance = new School();

    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Student> studnetList = new ArrayList<Student>();
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();

    private School() {
    }

    public static School getInstance() {
        if(instance == null)
            instance = new School();
        return instance;
    }

    public ArrayList<Student> getStudentList() {
        return studnetList;
    }

    public void addStudent(Student student) {
        studnetList.add(student);
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}