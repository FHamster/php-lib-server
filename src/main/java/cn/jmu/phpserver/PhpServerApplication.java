package cn.jmu.phpserver;

import cn.jmu.phpserver.entities.BookBorrowRec;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
@EnableJpaAuditing
public class PhpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhpServerApplication.class, args);
    }

    //暴露id字段设置
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(
                repositoryRestConfiguration -> repositoryRestConfiguration.exposeIdsFor(BookBorrowRec.class)
        );
    }
}
