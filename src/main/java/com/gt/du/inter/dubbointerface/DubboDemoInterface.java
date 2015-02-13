package com.gt.du.inter.dubbointerface;

/**
 * 定义dubbo接口
 * @author journal
 *
 */
public interface DubboDemoInterface {
	
	/**
	 * 该接口需要被provider实现
	 * @param name
	 * @return
	 */
	public String sayHello(String name);
}
