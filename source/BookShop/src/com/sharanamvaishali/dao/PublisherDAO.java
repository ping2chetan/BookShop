package com.sharanamvaishali.dao;

import com.sharanamvaishali.model.Book;
import com.sharanamvaishali.model.Publisher;
import java.util.List;

public interface PublisherDAO {
    public void savePublisher(Publisher publisher);
    public List<Publisher> listPublisher();
    public void removePublisher(Integer publisherNo);
    public Publisher getPublisherById(Integer publisherNo);
    public List<Publisher> listOurPublishers();
    public List<Book> getAllBooksByPublisher(Integer publisherNo);
}
