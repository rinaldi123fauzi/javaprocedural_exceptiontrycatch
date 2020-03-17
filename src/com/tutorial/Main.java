package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {0,1,2,3};
        Scanner inputUser = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.println("nilai array ke : ");
        int index = inputUser.nextInt();

        //exception handling (try, catch, finally)

        //ini handling out of bound
//        System.out.println("Handling out of bound");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        }catch (Exception exception_message){
            System.err.println(exception_message);
        }

        //runtime error jika file tidak ada
        //handling IO not found
//        System.out.println("Handling IO not found");
        try {
            fileInput = new FileInputStream("input.text");
        } catch (IOException e){
            System.err.println(e);
        }

        //Menggabungkan dua buah exception
//        System.out.println("Menggabungkan dua buah exception");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.text");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("nilai index tidak ditemukan");
        }catch (IOException e) {
            System.err.println("file tidak ditemukan");
        }

        //Finally
//        System.out.println("Menambahkan Finally");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("nilai index tidak ditemukan");
        }finally {
            System.out.println("finally");
        }

        System.out.println("\nakhir program");
    }
}
