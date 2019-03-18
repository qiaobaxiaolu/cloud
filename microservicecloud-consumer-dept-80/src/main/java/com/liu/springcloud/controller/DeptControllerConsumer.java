package com.liu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.liu.springcloud.entity.Dept;

@RestController
public class DeptControllerConsumer {

	private static final String REST_URL_PRIFIX="http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(REST_URL_PRIFIX+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return restTemplate.getForObject(REST_URL_PRIFIX+"/dept/get/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list")
	public  List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PRIFIX+"/dept/list", List.class);
	}
	
	@RequestMapping(value="/consumer/dept/discovery")
	public  Object discovery(){
		return restTemplate.getForObject(REST_URL_PRIFIX+"/dept/discovery", Object.class);
	}
}
