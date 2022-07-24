package com.bosonit.BS41.Bs41profiles;


import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:miconfiguracion.properties")
public class MyConfiguracion {
    //Damos valor a las dos variables
    @Value("${valor1}")
    private String valor1;

    @Value("${valor2}")
    private String valor2;
}
