package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 图书
 */
@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 图书ID
   */
  @Id
  @Column(insertable = false, name = "book_id", nullable = false)
  private String bookId;

  /**
   * 馆藏编号
   */
  @Column(name = "bdesc_id")
  private String bdescId;

  /**
   * 图书状态
   */
  @Column(name = "book_status")
  private String bookStatus;

  
}