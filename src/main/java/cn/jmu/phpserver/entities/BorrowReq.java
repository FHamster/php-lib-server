package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 借阅要求
 */
@Entity
@Table(name = "borrow_req")
@Data
public class BorrowReq implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 借阅种类编号
   */
  @Id
  @Column(name = "bor_id", insertable = false, nullable = false)
  private String borId;

  /**
   * 读者类别编号
   */
  @Column(name = "rder_id")
  private String rderId;

  /**
   * 最多可借册数
   */
  @Column(name = "bor_maxbor")
  private Integer borMaxbor;

  /**
   * 借数
   */
  @Column(name = "bor_curbor")
  private Integer borCurbor;

  /**
   * 借期
   */
  @Column(name = "bor_time")
  private Integer borTime;

  /**
   * 续期
   */
  @Column(name = "bor_rebor")
  private Integer borRebor;

  
}