package com.ebatong.cross.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author bear01.xiong
 * @param <T>
 */
public class MongoGenDao<T> implements ApplicationContextAware {
	protected MongoTemplate mongoTemplate;
	/**
	 * @param t
	 * @return
	 */
	public void save(T t) {
		this.mongoTemplate.save(t);
		System.out.println("saved");
	}
	public boolean collectionExists(String name) {
		boolean r = this.mongoTemplate.collectionExists(name);
		System.out.println("collectionExists(" + name + ")=" + r);
		return r;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		mongoTemplate=applicationContext.getBean(MongoTemplate.class);
	} 
	
}