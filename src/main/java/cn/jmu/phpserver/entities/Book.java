package cn.jmu.phpserver.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 * 图书
 */
@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     */
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(insertable = false, name = "book_id", nullable = false)
    private String bookId;

    /**
     * 馆藏编号
     */
    @Column(name = "bdesc_id")
    private String bdescId;

    /**
     * 图书状态
     */
    @Column(name = "book_status")
    private String bookStatus;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "book")
    List<BookBorrowRec> BBRList;

}