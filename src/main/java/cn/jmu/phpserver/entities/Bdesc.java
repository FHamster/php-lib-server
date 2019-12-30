package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 图书描述
 */
@Table(name = "bdesc")
@Data
@Entity
public class Bdesc implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 馆藏编号
   */
  @Id
  @Column(name = "bdesc_id", insertable = false, nullable = false)
  private String bdescId;

  /**
   * 中图分类编号
   */
  @Column(name = "clasify_id")
  private String clasifyId;

  /**
   * 出版社编号
   */
  @Column(name = "pub_id")
  private String pubId;

  /**
   * ISBN
   */
  @Column(name = "ISBN", nullable = false)
  private String ISBN;

  /**
   * 书名
   */
  @Column(name = "bdesc_name")
  private String bdescName;

  /**
   * 购买价格
   */
  @Column(name = "bdesc_inprice")
  private BigDecimal bdescInprice;

  /**
   * 所属分馆
   */
  @Column(name = "bdesc_store_place")
  private String bdescStorePlace;

  
}