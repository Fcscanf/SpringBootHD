package com.fcant.springbootexpand.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * PropertySourceProperty
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 9:53 2019/12/5
 */
@Data
@Component
@PropertySource("classpath:fcant.properties")
public class PropertySourceProperty {

    @Value("${fcant.property:default}")
    private String property;
}
