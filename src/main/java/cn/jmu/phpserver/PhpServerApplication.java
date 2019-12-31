package cn.jmu.phpserver;

import cn.jmu.phpserver.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableJpaAuditing
@CrossOrigin
public class PhpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhpServerApplication.class, args);
    }

    //暴露id字段设置
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(
                repositoryRestConfiguration -> {
                    repositoryRestConfiguration.exposeIdsFor(BookBorrowRec.class);
                    repositoryRestConfiguration.exposeIdsFor(Token.class);
                    repositoryRestConfiguration.exposeIdsFor(Bdesc.class);
                    repositoryRestConfiguration.exposeIdsFor(Book.class);
                    repositoryRestConfiguration.exposeIdsFor(Tuser.class);
                    repositoryRestConfiguration.exposeIdsFor(ClassifyCn.class);
//                    repositoryRestConfiguration.exposeIdsFor(BookBorrowRec.class);
                }

        );
    }
}
