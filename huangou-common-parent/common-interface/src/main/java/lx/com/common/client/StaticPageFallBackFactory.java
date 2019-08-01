package lx.com.common.client;


import feign.hystrix.FallbackFactory;
import lx.com.basic.util.AjaxResult;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StaticPageFallBackFactory implements FallbackFactory<StaticPageClient> {
    @Override
    public StaticPageClient create(Throwable throwable) {
        return new StaticPageClient() {
            @Override
            public AjaxResult genStaticPage(Map<String, Object> map) {
                return AjaxResult.me().setSuccess(false).setMessage("系统异常!");
            }
        };
    }
}
