package com.fcant.springbootdata.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * UserCart
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 20:05 2019/12/4
 */
@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "HLS_USER")
public class UserCart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Column
    private String name;
    @JsonIgnore
    @NotBlank
    @Column
    private String account;
    @Column
    private String password;
    @Range(min = 1, max = 120)
    private Integer age;
}
