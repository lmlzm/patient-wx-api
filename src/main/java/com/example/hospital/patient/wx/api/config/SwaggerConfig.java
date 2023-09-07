package com.example.hospital.patient.wx.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author zcj
 * @description
 * @date 2021/05/2021/5/6
 **/
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment env) {

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .groupName("WX端")
                .enable(env.acceptsProfiles(Profiles.of("dev", "test")))
                .select()
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "渔港船员进出港管理API",
                "渔港船员进出港管理API",
                "V1.0.0",
                "www.yd.com",
                new Contact("烟台业达智慧城市运营科技有限公司", "www.yd.com", "0535-6957267"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());

    }
}
