package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 权限表
 */
@Entity
@Table(name = "authority")
@Data
public class Authority implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 权限id
   */
  @Id
  @Column(name = "auth_id", insertable = false, nullable = false)
  private String authId;

  /**
   * 权限名称
   */
  @Column(name = "autu_name")
  private String autuName;

  /**
   * 简介
   */
  @Column(name = "auth_desc")
  private String authDesc;

  /**
   * url
   */
  @Column(name = "auth_url")
  private String authUrl;

  /**
   * http类型
   */
  @Column(name = "auth_httptype")
  private String authHttptype;

  /**
   * 父级权限
   */
  @Column(name = "auth_parent")
  private String authParent;

  /**
   * 创建时间
   */
  @Column(name = "auth_create_time")
  private Date authCreateTime;

  /**
   * 修改时间
   */
  @Column(name = "auth_update_time")
  private Date authUpdateTime;

  
}