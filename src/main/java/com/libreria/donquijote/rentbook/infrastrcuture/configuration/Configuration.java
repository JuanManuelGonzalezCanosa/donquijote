package com.libreria.donquijote.rentbook.infrastrcuture.configuration;

import com.libreria.donquijote.rentbook.application.ServiceFindRentBook;
import com.libreria.donquijote.rentbook.application.ServiceRentBookImpl;
import com.libreria.donquijote.rentbook.infrastrcuture.db.PostgresRentRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.libreria.donquijote.rentbook.domain")
public class Configuration {

    @Bean
    public ServiceRentBookImpl serviceRentBook(PostgresRentRepository postgresRentRepository) {
        return new ServiceRentBookImpl(postgresRentRepository);
    }

    @Bean
    public ServiceFindRentBook serviceFindRentBook(PostgresRentRepository postgresRentRepository) {
        return new ServiceFindRentBook(postgresRentRepository);
    }

}
