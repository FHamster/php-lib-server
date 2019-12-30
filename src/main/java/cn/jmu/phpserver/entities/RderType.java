package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 读者类别
 */
@Data
@Entity
@Table(name = "rder_type")
public class RderType implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 读者类别编号
   */
  @Id
  @Column(insertable = false, name = "rder_id", nullable = false)
  private String rderId;

  /**
   * 读者类别说明
   */
  @Column(name = "rder_desc", nullable = false)
  private String rderDesc;

  
}