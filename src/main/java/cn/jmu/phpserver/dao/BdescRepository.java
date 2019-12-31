package cn.jmu.phpserver.dao;

import cn.jmu.phpserver.entities.Bdesc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface BdescRepository extends JpaRepository<Bdesc, String>, JpaSpecificationExecutor<Bdesc> {
    List<Bdesc> findByBdescNameContaining(String BdescName);
}