package main;

import java.util.Scanner;

public class Task1 {
    Task1() {}
    public static void doTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("task 1");
        System.out.println("enter n and m:");
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [] vec = new int [n];
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            vec[i] = 11;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < (m/2)+1; j++){
                if(arr[i][j] == arr[i][m-j-1]){
                    if(arr[i][j] < vec[i]){
                        vec[i] = arr[i][j];
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            if(vec[i] == 11){
                vec[i] = 0;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(vec[i] + " ");
        }
        System.out.println();
    }
}
