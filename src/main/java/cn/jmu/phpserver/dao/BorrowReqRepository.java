package cn.jmu.phpserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.jmu.phpserver.entities.BorrowReq;

public interface BorrowReqRepository extends JpaRepository<BorrowReq, String>, JpaSpecificationExecutor<BorrowReq> {

}