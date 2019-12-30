package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 角色表
 */
@Entity
@Data
@Table(name = "role")
public class Role implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 角色id
   */
  @Id
  @Column(name = "role_id", insertable = false, nullable = false)
  private String roleId;

  /**
   * 角色名
   */
  @Column(name = "role_name")
  private String roleName;

  /**
   * 说明
            说明
            
   */
  @Column(name = "role_description")
  private String roleDescription;

  /**
   * 启用状态
   */
  @Column(name = "role_status")
  private Integer roleStatus;

  /**
   * 创建时间
   */
  @Column(name = "role_create_time")
  private Date roleCreateTime;

  /**
   * 修改时间
   */
  @Column(name = "role_update_time")
  private Date roleUpdateTime;

  
}