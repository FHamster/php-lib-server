/*
package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

*/
/**
 * 角色-用户
 *//*

@Table(name = "role_user")
@Data
@Entity
public class RoleUser implements Serializable {
  private static final long serialVersionUID = 1L;

  */
/**
   * 角色id
   *//*

  @Id
  @Column(name = "role_id", insertable = false, nullable = false)
  private String roleId;

  @Id
  @Column(insertable = false, name = "user_id", nullable = false)
  private String userId;

  
}*/
