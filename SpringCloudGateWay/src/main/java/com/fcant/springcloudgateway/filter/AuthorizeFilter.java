package com.fcant.springcloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;

/**
 * AuthorizeFilter
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 19:23 2019/12/8
 */
@Component
public class AuthorizeFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizeFilter.class);
    private static String accessToken;

    public AuthorizeFilter() {
        accessToken = UUID.randomUUID().toString();
        LOGGER.info("==> accessToken : {}", accessToken);
    }

    /**
     * 外部请求 -> zuul:pre -> 选择路由的服务:routing -> 请求服务:post -> zuul
     * pre: 在请求路由之前执行
     * routing: 在请求路由之后执行
     * post: 在请求到路由对应的服务之后执行
     * error: 在其他阶段发生错误时执行
     *
     * @return filterType
     * @author Fcant 20:59 2019/12/8
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行的顺序：数字越小优先级约高
     *
     * @return 返回代表过滤器执行顺序等级的数字
     * @author Fcant 21:07 2019/12/8
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 需不需要执行此过滤器
     *
     * @return True为执行
     * @author Fcant 21:07 2019/12/8
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体的过滤逻辑
     *
     * @return 返回值被忽略
     * @author Fcant 21:08 2019/12/8
     */
    @Override
    public Object run() throws ZuulException {
        // 获取请求的上下文，注意导入时导入zuul包下的，而非apache包下的
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String accessToken = request.getParameter("access_token");
        // 模拟accessToken验证授权
        // 使用Objects.equals(Object1, Object2)比较两个对象的一直性更具安全性
        if (!Objects.equals(accessToken, AuthorizeFilter.accessToken)) {
            currentContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            currentContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            // 此处设置停止路由，因为模拟请求未做其他API转发处理
            currentContext.setSendZuulResponse(false);
        }
        return null;
    }
}
