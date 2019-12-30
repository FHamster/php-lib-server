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
 * 角色-权限
 *//*

@Data
@Entity
@Table(name = "role_auth")
public class RoleAuth implements Serializable {
  private static final long serialVersionUID = 1L;

  */
/**
   * 角色id
   *//*

  @Id
  @Column(name = "role_id", insertable = false, nullable = false)
  private String roleId;

  */
/**
   * 权限id
   *//*

  @Id
  @Column(name = "auth_id", insertable = false, nullable = false)
  private String authId;

  
}*/
