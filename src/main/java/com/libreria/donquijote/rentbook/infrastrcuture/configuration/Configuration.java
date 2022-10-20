package com.libreria.donquijote.rentbook.infrastrcuture.configuration;

import com.libreria.donquijote.rentbook.application.ServiceFindRentBook;
import com.libreria.donquijote.rentbook.application.rent.ServiceRentBookImpl;
import com.libreria.donquijote.rentbook.infrastrcuture.db.PostgresRentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.libreria.donquijote.rentbook.domain")
public class Configuration {


    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("h2DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);

    }

    @Bean
    public TransactionManager h2TransactionManage(@Qualifier("h2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public ServiceRentBookImpl serviceRentBook(PostgresRentRepository postgresRentRepositor, ApplicationEventPublisher applicationEventPublisher) {
        return new ServiceRentBookImpl(postgresRentRepositor, applicationEventPublisher);
    }

    @Bean
    public ServiceFindRentBook serviceFindRentBook(PostgresRentRepository postgresRentRepository) {
        return new ServiceFindRentBook(postgresRentRepository);
    }

}
