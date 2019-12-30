package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 读者罚款记录
 */
@Entity
@Data
@Table(name = "findrecord")
public class Findrecord implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 罚款ID
   */
  @Id
  @Column(name = "find_id", insertable = false, nullable = false)
  private String findId;

  /**
   * 用户号
   */
  @Column(name = "user_id")
  private String userId;

  /**
   * 金额
   */
  @Column(name = "find_mon", nullable = false)
  private BigDecimal findMon;

  /**
   * 罚款原因
   */
  @Column(name = "find_desc")
  private String findDesc;

  
}