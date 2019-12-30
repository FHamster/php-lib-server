package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Resource;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import jdk.Exported;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * 图书描述
 */
@Table(name = "bdesc")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Bdesc implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 馆藏编号
     */
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "bdesc_id", insertable = false, nullable = false)
    private String bdescId;

    /**
     * 中图分类编号
     */
    @Column(name = "clasify_id")
    private String clasifyId;
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "clasify_id")
//    private ClassifyCn classifyCn;

    /**
     * 出版社编号
     */
    @Column(name = "pub_id")
    private String pubId;

    /**
     * ISBN
     */
    @Column(name = "ISBN", nullable = false)
    private String bdesISBN;

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


    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;
}