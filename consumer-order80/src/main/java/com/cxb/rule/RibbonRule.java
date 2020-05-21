package com.cxb.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dlkang
 * @date 2020/5/21 11:02
 * @description
 */
@Configuration
public class RibbonRule {

    @Bean
    public IRule getRule()
    {
        return new RandomRule();
    }
}
