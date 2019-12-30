package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.ClassifyCn;

public interface ClassifyCnRepository extends JpaRepository<ClassifyCn, String>, JpaSpecificationExecutor<ClassifyCn> {

}