package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 借阅
 */
@Table(name = "book_borrow_rec")
@Entity
@Data
public class BookBorrowRec implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 用户号
   */
  @Column(name = "user_id")
  private String userId;

  /**
   * 图书ID
   */
  @Column(name = "book_id", nullable = false)
  private String bookId;

  /**
   * 借书日期
   */
  @Column(name = "brec_bordate")
  private Date brecBordate;

  /**
   * 应还书日期
   */
  @Column(name = "brec_req_backdate")
  private Date brecReqBackdate;

  /**
   * 还书日期
   */
  @Column(name = "brec_real_backdate")
  private Date brecRealBackdate;

  /**
   * 已续借否
   */
  @Column(name = "brec_rebor_status")
  private Integer brecReborStatus;

  /**
   * 借阅状态
   */
  @Column(name = "brec_borstatus")
  private String brecBorstatus;

  @Id
  @Column(name = "brec_rec_id", insertable = false, nullable = false)
  private String brecRecId;

  
}