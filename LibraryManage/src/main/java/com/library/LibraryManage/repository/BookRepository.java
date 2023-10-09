package com.library.LibraryManage.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.LibraryManage.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}
