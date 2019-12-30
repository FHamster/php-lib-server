package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 作者
 */
@Entity
@Data
@Table(name = "author")
public class Author implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 作者编号
   */
  @Id
  @Column(name = "author_id", insertable = false, nullable = false)
  private String authorId;

  /**
   * 作者姓名
   */
  @Column(name = "author_name", nullable = false)
  private String authorName;

  
}