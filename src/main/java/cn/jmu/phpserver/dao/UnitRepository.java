package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.Unit;

public interface UnitRepository extends JpaRepository<Unit, String>, JpaSpecificationExecutor<Unit> {

}