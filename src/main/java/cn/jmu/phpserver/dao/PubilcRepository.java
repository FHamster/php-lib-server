package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Pubilc;

public interface PubilcRepository extends JpaRepository<Pubilc, String>, JpaSpecificationExecutor<Pubilc> {

}