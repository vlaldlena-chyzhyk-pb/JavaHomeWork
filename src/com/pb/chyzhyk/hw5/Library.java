package com.pb.chyzhyk.hw5;

public class Library {

    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Book("Дом странных детей, ", "Ренсом Риггз, ", "2012");
        books[1] = new Book("Гарри Поттер и философский камень, ", "Джоан Роулинг, ", "1997");
        books[2] = new Book("Цветы для Элджеронона, ", "Дэниел Киз, ", "1959");

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов И. И., " , "1, " , "Исторический, " , "13.05.2003, " , "0506543210");
        readers[1] = new Reader("Петров П. П., " , "2, " , "Технический, " , "25.09.2001, " , "0965344343");
        readers[2] = new Reader("Семёнов С. С., " , "3, " , "Экономический, " , "04.01.2002, " , "0668483434");

        System.out.println(books[0].getInfo());
        System.out.println(books[1].getInfo());
        System.out.println(books[2].getInfo());

        System.out.println(readers[0].getInfo());
        System.out.println(readers[1].getInfo());
        System.out.println(readers[2].getInfo());
    }
}
