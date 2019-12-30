package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Bdesc;

public interface BdescRepository extends JpaRepository<Bdesc, String>, JpaSpecificationExecutor<Bdesc> {

}