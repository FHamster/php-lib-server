package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Token;

public interface TokenRepository extends JpaRepository<Token, String>, JpaSpecificationExecutor<Token> {

}