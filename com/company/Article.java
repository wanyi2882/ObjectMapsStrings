package com.company;
import java.util.*;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void rename(String title) {
        this.title = title;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void overrideToString(String title, String content, String author){
        System.out.printf("%s - %s:%s", title, content, author);
    }

//    public static void main(String[] args) {
//        // write your code here
//        Scanner sc = new Scanner(System.in);
//
//        String[] articles = sc.nextLine().split(", ");
//        String title = articles[0];
//        String content = articles[1];
//        String author = articles[2];
//        Article article = new Article(title, content, author);
//
//        int n = Integer.parseInt(sc.nextLine());
//
//        for(int i = 0; i < n; i++){
//            String[] command = sc.nextLine().split(": ");
//
//            if(command[0].equals("Edit")){
//                article.setContent(command[1]);
//            }
//            else if(command[0].equals("ChangeAuthor")){
//                article.setAuthor(command[1]);
//            }
//            else if(command[0].equals("Rename")){
//                article.setTitle(command[1]);
//            }
//        }
//
//        System.out.printf("%s - %s:%s", article.getTitle(), article.getContent(), article.getAuthor());
//    }
}
