package com.fcant.springbootexpand.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ValueProperty
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 9:23 2019/12/5
 */
@Component
@Data
public class ValueProperty {
    @Value("${fcant.check.code}")
    private String check_code;
}
