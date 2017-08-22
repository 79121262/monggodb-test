package junitTest;

import java.util.*;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.MongoClientOptions;
//import com.mongodb.client.MongoDatabase;

//import com.mongodb.client.MongoDatabase;
public class TestMongodb {
	public static void main(String args[]) {
		try {
//			MongoClientOptions.Builder
//			MongoClientOptions opton = new MongoClientOptions(null);
			MongoClient mongoClient = new MongoClient("localhost", 27017);
//			MongoClient mongoClient = new MongoClient("idev.ebatong.com", 27017);

			DB db1 = mongoClient.getDB("test");
//			MongoDatabase mongoDatabase = (MongoDatabase) mongoClient.getDB("mycol");
			List<String> dbNames = mongoClient.getDatabaseNames();
			for (String name : dbNames) {
				System.out.println(name);
			}
			Set<String> names = db1.getCollectionNames();
			for (String name : names) {
				System.out.println(name);
			}
			DB db2 = mongoClient.getDB("local");
			Set<String> names2 = db2.getCollectionNames();
			for (String name : names2) {
				System.out.println(name);
			}
			DB db3 = mongoClient.getDB("mongo_test");
			Set<String> names3 = db3.getCollectionNames();
			for (String name : names3) {
				System.out.println(name);
			}
			System.out.println("Connect to database successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}
