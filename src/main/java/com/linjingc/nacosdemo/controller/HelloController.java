package com.linjingc.nacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@RefreshScope
public class HelloController {

	@Value("${hello.flag:1}")
	private String flag;
	@Value("${common.test:common}")
	private String common;
	@Value("${redis.test:redis}")
	private String redis;
	@Value("${greeting.test:greeting}")
	private String greeting;
	@Value("${author.test:author}")
	private String author;


	@RequestMapping("index")
	public String index() {
		StringBuffer index = new StringBuffer();
		index.append("hello.flag=>").append(flag).append("\n");
		index.append("common.test=>").append(common).append("\n");
		index.append("redis.test=>").append(redis).append("\n");
		index.append("greeting.test=>").append(greeting).append("\n");
		index.append("author.yaml=>").append(author).append("\n");
		return index.toString();
	}
}
