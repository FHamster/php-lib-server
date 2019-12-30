package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Book;

public interface BookRepository extends JpaRepository<Book, String>, JpaSpecificationExecutor<Book> {

}