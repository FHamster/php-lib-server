package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

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
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @GeneratedValue(generator = "system-uuid")
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