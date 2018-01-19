package com.picture;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author yank
 * 2018/1/19
 */
@Component
public class AbcService {
    @Reference(version = "1.0.0")
    public EchoService echoService;
}
