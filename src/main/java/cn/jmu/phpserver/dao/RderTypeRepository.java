package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.RderType;

public interface RderTypeRepository extends JpaRepository<RderType, String>, JpaSpecificationExecutor<RderType> {

}