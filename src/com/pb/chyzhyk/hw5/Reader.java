package com.pb.chyzhyk.hw5;

public class Reader {
    private String name;
    private int number;
    private String faculty;
    private String hb;
    private String phone;

    public Reader() {
    }

    public Reader(String name, int number, String faculty, String hb, String phone) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.hb = hb;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(String name) {
        System.out.println(name + "взял 3 книги");
    }

    public void takeBook(String title, String name) {
        System.out.println(name + "взял книги: " + title);
    }

    public void takeBook(String... Books) {
        System.out.println("название книг");
        for (String Book : Books) {
            System.out.println(Book);
        }
        System.out.println("взял книги");
    }

    public void returnBook(String name) {
        System.out.println(name + "вернул 3 книги");
    }

    public void returnBook(String title, String name) {
        System.out.println(name + "вернул книги: " + title);
    }

    public void returnBook(String... Books) {
        System.out.println("название книг");
        for (String Book : Books) {
            System.out.println(Book);
        }
        System.out.println("вернул книги");
    }

    String getInfo() {
        return "[ФИО: " + name + ", номер читательского билета: " + number + ", факультет: "
                + faculty + ", день рождение: " + hb + ", номер телефона: " + phone + "]";

    }
}
