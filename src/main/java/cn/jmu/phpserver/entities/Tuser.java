package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 用户
 */
@Entity
@Table(name = "tuser")
@Data
public class Tuser implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 用户号
   */
  @Id
  @Column(insertable = false, name = "user_id", nullable = false)
  private String userId;

  /**
   * 读者类别编号
   */
  @Column(name = "utype_id")
  private String utypeId;

  /**
   * 单位编号
   */
  @Column(name = "unit_id")
  private String unitId;

  /**
   * 用户密码
   */
  @Column(name = "user_psw")
  private String userPsw;

  /**
   * 读者姓名
   */
  @Column(name = "user_name")
  private String userName;

  /**
   * 读者性别
   */
  @Column(name = "user_gender")
  private Integer userGender;

  /**
   * 读者邮箱
   */
  @Column(name = "user_email")
  private String userEmail;

  /**
   * 读者状态
   */
  @Column(name = "user_status")
  private Integer userStatus;

  /**
   * 读者电话
   */
  @Column(name = "user_tel")
  private String userTel;

  
}