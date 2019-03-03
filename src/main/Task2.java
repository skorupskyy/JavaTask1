package main;

public class Task2 {
    public static void doTask(String str){
        str = str.replaceAll("t", "h");
        String[] arr;
        arr = str.split(",");
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
