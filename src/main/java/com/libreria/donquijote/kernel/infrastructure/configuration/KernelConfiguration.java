package com.libreria.donquijote.kernel.infrastructure.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KernelConfiguration {

    /*
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



     */
}
