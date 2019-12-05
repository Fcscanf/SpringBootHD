package com.fcant.springbootexpand.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * BeanProperty
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 9:45 2019/12/5
 */
@Data
@Component
@ConfigurationProperties(prefix = "fcant")
public class BeanProperty {

    private String tel;

    private boolean exist;
}
