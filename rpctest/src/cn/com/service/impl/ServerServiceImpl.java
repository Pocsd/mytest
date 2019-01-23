package cn.com.service.impl;

import cn.com.service.ServerService;

public class ServerServiceImpl implements ServerService {

	@Override
	public void hello() {
		System.out.println("Hello !!!");
	}

	@Override
	public void hi() {
		System.out.println("Hi !!!");
	}

}
