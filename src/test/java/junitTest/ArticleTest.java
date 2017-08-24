package junitTest;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ebatong.cross.base.MongoGenDao;
import com.ebatong.cross.dao.ArticleDao;
import com.ebatong.cross.model.Article;
import com.google.gson.Gson;

/**
 * @author bear01.xiong
 */
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(value="classpath*:/spring_test.xml")
public class ArticleTest {
	static Logger logger = Logger.getLogger(ArticleTest.class.getName());
	Gson gson = new Gson();
	@Autowired MongoGenDao<Article> articleDao;
	@Test
	@Rollback(false)
	public void saveTest() {
		try{
			Article art = new Article();
			art.setAuth_id(151);
			art.setAuthType("333-----");
			art.setFlowStatus("100");
			art.setUuid("1616131548adfwergagas");
			articleDao.save(art);
			System.out.println("ok");
			articleDao.collectionExists("testabc");
			articleDao.collectionExists("test");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
