package com.libreria.donquijote.book.infrastructure.configuration;

import com.libreria.donquijote.book.domain.MyJsonType;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@org.hibernate.annotations.TypeDef(name = "MyJsonType", typeClass = MyJsonType.class)

@EnableTransactionManagement
@EntityScan(basePackages = "com.libreria.donquijote.book.domain")
public class Configuration {

}
