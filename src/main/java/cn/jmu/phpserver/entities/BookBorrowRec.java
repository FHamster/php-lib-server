package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 借阅
 */
@Table(name = "book_borrow_rec")
@JsonInclude(JsonInclude.Include.NON_NULL)
@EntityListeners(AuditingEntityListener.class)
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
//    @Column(name = "user_id")
//    private String userId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    Tuser tuser;

    /**
     * 图书ID
     */
//    @Column(name = "book_id", nullable = false)
//    private String bookId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    Book book;

    /**
     * 借书日期
     */
    @CreatedDate
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


}