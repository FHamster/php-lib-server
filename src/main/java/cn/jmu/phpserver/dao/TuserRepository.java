package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Tuser;

public interface TuserRepository extends JpaRepository<Tuser, String>, JpaSpecificationExecutor<Tuser> {

}