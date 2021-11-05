package com.example.Manytomanyuni.Repository;

import com.example.Manytomanyuni.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
