package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 出版社
 */
@Table(name = "pubilc")
@Entity
@Data
public class Pubilc implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 出版社编号
   */
  @Id
  @Column(insertable = false, name = "pub_id", nullable = false)
  private String pubId;

  /**
   * 出版社名称
   */
  @Column(name = "pub_name")
  private String pubName;

  
}