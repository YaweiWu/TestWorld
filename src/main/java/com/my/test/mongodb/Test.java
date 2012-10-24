package com.my.test.mongodb;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class Test {

	/**
	 * @param args
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException {

		 Mongo m = new Mongo("192.168.122.203", 27017);
		
		 DB db = m.getDB("ceilometer");


		 DBCollection first = db.getCollection("meter");

		 System.out.println(first.find().next());

//		DBObject test = BasicDBObjectBuilder.start().push("$set")
//				.add("project_id", "getProjectId").add("user_id", "getUserId")
//				.add("timestamp", "timestamp").add("metadata", "getMetadata")
//				.pop().push("$addToSet").push("meter")
//				.add("counter_name", "getName").add("counter_type", "getType")
//				.pop().pop().get();
//
//		DBObject meter = BasicDBObjectBuilder.start()
//				.add("source", "getSource()").add("name", "getName()")
//				.add("type", "getType()").add("volume", "getVolume()")
//				.add("project_id", "getProjectId()")
//				.add("user_id", "getUserId()")
//				.add("resource_id", "getResourceId()")
//				.add("timestamp", "getTimestamp()")
//				.add("metadata", "getMetadata()").get();

		 
		 
	}

}
