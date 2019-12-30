package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 单位
 */
@Data
@Table(name = "unit")
@Entity
public class Unit implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 单位编号
   */
  @Id
  @Column(name = "unit_id", insertable = false, nullable = false)
  private String unitId;

  /**
   * 单位名称
   */
  @Column(name = "unit_name", nullable = false)
  private String unitName;

  /**
   * 单位联系电话
   */
  @Column(name = "unit_tel")
  private String unitTel;

  
}