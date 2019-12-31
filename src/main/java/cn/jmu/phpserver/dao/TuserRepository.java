package cn.jmu.phpserver.dao;

import cn.jmu.phpserver.entities.Tuser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface TuserRepository extends JpaRepository<Tuser, String>, JpaSpecificationExecutor<Tuser> {

    Page<Tuser> findByUserName(String UserName, Pageable pageable);
}