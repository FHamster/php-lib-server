package cn.jmu.phpserver.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 编写book_author
 */

@Data
@Entity
@Table(name = "book_author")
public class BookAuthor implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     */
    @Id
    @Column(insertable = false, name = "bdesc_id", nullable = false)
    private String bookId;

    /**
     * 作者编号
     */
    @Id
    @Column(name = "author_id", insertable = false, nullable = false)
    private String authorId;
}
