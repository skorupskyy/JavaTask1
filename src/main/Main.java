package main;

public class Main {

    public static void main(String[] args) {
        //Task1.doTask();

        Task2.doTask("cat,hat,tornado,tom,tttt");

        EducationalInstitution [] arr = new EducationalInstitution[6];
        arr[0] = new School("LPML1", "karajycha1", 1994, 45, 459);
        arr[1] = new University("univer1", "universytetska1", 1997, 4, 12);
        arr[2] = new University("univer2", "universytetska2", 1993, 3, 18);
        arr[3] = new School("LPML2", "karajycha2", 1995, 12, 357);
        arr[4] = new University("univer3", "universytetska3", 1998, 2, 15);
        arr[5] = new School("LPML3", "karajycha3", 1996, 23, 189);
        arr[4] = new University("univer4", "universytetska4", 1998, 3, 15);
        //Task3.doTask(arr);

    }
}
