package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, String>, JpaSpecificationExecutor<Author> {

}