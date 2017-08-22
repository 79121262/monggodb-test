package com.ebatong.cross.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.ebatong.cross.base.MongoGenDao;
import com.ebatong.cross.model.Article;

@Repository
public class ArticleDao extends MongoGenDao<Article> {
	@Autowired
	protected MongoTemplate mongoTemplate;
	protected Class<Article> getEntityClass() {
		return Article.class;
	}
}
