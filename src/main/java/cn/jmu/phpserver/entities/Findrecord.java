package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

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
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @GeneratedValue(generator = "system-uuid")
  @JoinColumn(name = "user_id")
  Tuser tuser;

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