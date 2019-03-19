package com.liu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
	
	/**
	 * 自定义的Ribbon
	 * @return
	 */
	@Bean
	public IRule myRule() {
		return new MySelfRule_ZDY();
	}
}
