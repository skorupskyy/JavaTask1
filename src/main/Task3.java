package main;

import java.util.Scanner;

public class Task3 {
    public static void bubbleSort(EducationalInstitution arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].yearOfFoundation > arr[j+1].yearOfFoundation)
                {
                    // swap arr[j+1] and arr[i]
                    EducationalInstitution temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void doTask(EducationalInstitution[] arr){
        //subtask1
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].name + " " + arr[i].yearOfFoundation);
        }
        
        
        //subtask2
        School schoolWithMinCountOfStudents = new School();
        int countOfSchools = 0, j = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] instanceof School){
                countOfSchools++;
            }
        }
        School[] schools = new School[countOfSchools];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] instanceof School){
                schools[j] = (School)arr[i];
                j++;
            }
        }
        schoolWithMinCountOfStudents = schools[0];
        for (int i = 1; i < schools.length; i++){
            if(schools[i].countOfStudents < schoolWithMinCountOfStudents.countOfStudents){
                schoolWithMinCountOfStudents = schools[i];
            }
        }
        System.out.println(schoolWithMinCountOfStudents.countOfStudents);
        
        
        //subtask3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter accreditation level: ");
        int a = sc.nextInt();

        int countOfUniversities = 0, m = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] instanceof University){
                countOfUniversities++;
                
            }
        }
        University[] universities = new University[countOfUniversities];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] instanceof University){
                universities[m] = (University)arr[i];
                m++;
            }
        }
        for (int i = 0; i < universities.length; i++){
            if(universities[i].accreditationLevel == a){
                System.out.println(universities[i].name);
            }
        }

    }
}
