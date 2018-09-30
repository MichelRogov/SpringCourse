package project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.bean.InboundChannel;
import project.bean.PropertySourcesPlaceholder;
import project.processor.SettingsMappingAnnotationBeanPostProcessor;

/**
 * Created by Rogov on 12.11.2017.
 */
@Configuration
public class ApplicationContextConfiguration {

    @Bean
    public SettingsMappingAnnotationBeanPostProcessor settingsMappingAnnotationBeanPostProcessor() {
        return new SettingsMappingAnnotationBeanPostProcessor();
    }

    @Bean
    public InboundChannel inboundChannel() {
        return new InboundChannel();
    }

    @Bean
    public PropertySourcesPlaceholder propertySourcesPlaceholder() {
        return new PropertySourcesPlaceholder();
    }

}
