package com.fcant.springbootdata.repository;

import com.fcant.springbootdata.bean.UserCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserCartRepository
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 20:12 2019/12/4
 */
@Repository
public interface UserCartRepository extends JpaRepository<UserCart, Long> {
}
