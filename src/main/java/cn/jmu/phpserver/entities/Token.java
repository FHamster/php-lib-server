package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "token")
public class Token implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "token", insertable = false, nullable = false)
  private String token;

  @Column(name = "auth")
  private String auth;

  @Column(name = "user_id")
  private String userId;

  
}