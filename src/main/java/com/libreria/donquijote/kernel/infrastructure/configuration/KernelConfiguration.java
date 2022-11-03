package com.libreria.donquijote.kernel.infrastructure.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/*@Configuration
public class KernelConfiguration {

@Bean
@ConfigurationProperties(prefix = "spring.datasource")
public DataSource h2DataSource() {
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("org.h2.Driver");
    dataSourceBuilder.url("jdbc:h2:mem:testdb");
    dataSourceBuilder.username("sa");
    dataSourceBuilder.password("password");
    return dataSourceBuilder.build();
}


@Bean
public DataSource mysql() {
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("org.postgresql.Driver");
    dataSourceBuilder.url("jdbc:postgresql://localhost:5433/administrationportal");
    dataSourceBuilder.username("genkin");
    dataSourceBuilder.password("genkin");
    return dataSourceBuilder.build();
}




}
*/
@EnableTransactionManagement
@EntityScan(basePackages = {"com.libreria.donquijote.book.domain", "com.libreria.donquijote.bookprojection.domain"})
@Configuration
public class KernelConfiguration {

}
