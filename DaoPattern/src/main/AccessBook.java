package main;

import dao.BookDao;
import daoImpl.BookDaoImpl;
import model.Books;


public class AccessBook {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
            System.out.println("Book Name:"+book.getBookName() );
        }

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
       // bookDao.saveBook(book);
        bookDao.deleteBook(book);
    }
}