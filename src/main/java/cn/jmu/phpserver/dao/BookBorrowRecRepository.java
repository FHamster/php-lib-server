package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.BookBorrowRec;

public interface BookBorrowRecRepository extends JpaRepository<BookBorrowRec, String>, JpaSpecificationExecutor<BookBorrowRec> {

}