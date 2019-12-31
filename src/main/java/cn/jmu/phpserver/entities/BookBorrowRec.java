package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 借阅
 */
@Table(name = "book_borrow_rec")
@EntityListeners(AuditingEntityListener.class)
//@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Data
public class BookBorrowRec implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "brec_id", insertable = false, nullable = false)
    private String brecId;

    /**
     * 用户号
     */
    @Column(name = "user_id",insertable = false, updatable = false)
    private String userId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    Tuser tuser;

    /**
     * 图书ID
     */
    @Column(name = "book_id", insertable = false, updatable = false)
    private String bookId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    Book book;

    /**
     * 借书日期
     */
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "brec_bordate")
    private Date brecBordate;

    /**
     * 应还书日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "brec_req_backdate")
    private Date brecReqBackdate;

    /**
     * 还书日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "brec_real_backdate")
    private Date brec_RealBackdate;

    /**
     * 已续借否
     */
    @Column(name = "brec_rebor_status")
    private Integer brec_ReborStatus;

    /**
     * 借阅状态
     */
    @Column(name = "brec_borstatus")
    private String brec_Borstatus;


}