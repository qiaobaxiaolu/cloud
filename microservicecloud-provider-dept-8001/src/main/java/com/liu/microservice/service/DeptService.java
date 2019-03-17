package com.liu.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liu.springcloud.entity.Dept;

@Service
public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
