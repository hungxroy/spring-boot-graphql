//package com.hungnm.demos.graphql.resolver;
//
//import com.hungnm.demos.graphql.model.Book;
//import com.hungnm.demos.graphql.services.IBookService;
//import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@GraphQLApi
//public class BookResolver {
////    @Autowired
////    IBookService bookService;
//
////    @GraphQLQuery(name = "getBookWithTitle")
////    public Book getBookWithTitle(@GraphQLArgument(name = "title") String title) {
////        return bookService.getBookWithTitle(title);
////    }
////
////    @GraphQLQuery(name = "getAllBooks", description = "Get all books")
////    public List<Book> getAllBooks() {
////        return bookService.getAllBooks();
////    }
////
////    @GraphQLMutation(name = "addBook")
////    public Book addBook(@GraphQLArgument(name = "newBook") Book book) {
////        return bookService.addBook(book);
////    }
////
////    @GraphQLMutation(name = "updateBook")
////    public Book updateBook(@GraphQLArgument(name = "modifiedBook") Book book) {
////        return bookService.updateBook(book);
////    }
////
////    @GraphQLMutation(name = "deleteBook")
////    public void deleteBook(@GraphQLArgument(name = "book") Book book) {
////        bookService.deleteBook(book);
////    }
//}
