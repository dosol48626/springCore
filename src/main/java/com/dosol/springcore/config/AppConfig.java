package com.dosol.springcore.config;

import com.dosol.springcore.sample.SampleDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SampleDTO myDTO1(){
        SampleDTO dto = new SampleDTO();
            String[] hobbys = {"잠자기", "여행"};
            return new SampleDTO("윤요섭", 25, hobbys);
    }
    @Bean
    public SampleDTO myDTO2(){
        SampleDTO dto = new SampleDTO();
        String[] hobbys = {"등산", "여행"};
        return new SampleDTO("박경미", 20, hobbys);
    }
}
