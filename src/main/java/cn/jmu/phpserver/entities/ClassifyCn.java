package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 中图分类
 */
@Entity
@Table(name = "classify_cn")
@Data
public class ClassifyCn implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 中图分类编号
   */
  @Id
  @Column(name = "clasify_id", insertable = false, nullable = false)
  private String clasifyId;

  /**
   * 中图分类说明
   */
  @Column(name = "clasify_desc")
  private String clasifyDesc;

  /**
   * 上级中图分类编号
   */
  @Column(name = "clasify_parent")
  private String clasifyParent;

  
}