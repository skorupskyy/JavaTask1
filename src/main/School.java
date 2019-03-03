package main;

public class School extends EducationalInstitution {
    int number;
    int countOfStudents;

    School() {}
    School(String n, String a, int y, int num, int c){
        super(n, a, y);
        this.number = num;
        this.countOfStudents = c;
    }
}
