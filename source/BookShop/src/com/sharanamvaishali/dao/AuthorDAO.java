package com.sharanamvaishali.dao;

import com.sharanamvaishali.model.Author;
import com.sharanamvaishali.model.Book;
import java.util.List;

public interface AuthorDAO {
    public void saveAuthor(Author author);
    public List<Author> listAuthor();
    public void removeAuthor(Integer authorNo);
    public Author getAuthorById(Integer authorNo);
    public List<Author> listOurAuthors();
    public List<Book> getAllBooksByAuthor(Integer authorNo);
}
