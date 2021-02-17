package com.company.Java_sem1.lab3;
import java.util.*;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String name = sc1.next();
        String author = sc1.next();
        int year = sc2.nextInt();
        int pages = sc2.nextInt();
        book.setName(name);
        book.setAuthor(author);
        book.setYear(year);
        book.setPages(pages);
        System.out.println("Название книги:" + book.getName() + ", Автор книги:" + book.getAuthor());
        System.out.println("Год издания:" + book.getYear() + ", Количество страниц:" + book.getPages());

    }
}
