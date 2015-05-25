package code;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


public class MongoServlet {

	
	static DB db;

	static {
		MongoClient mongo;
		try {
			mongo = new MongoClient("localhost", 27017);
			db = mongo.getDB("Userdatabase");
		
		} catch (UnknownHostException e) {
			e.printStackTrace();

		}
	}

	@SuppressWarnings("deprecation")
	public static boolean authenticateUser(String user, String password) {

		boolean isValidUser = false;

			System.out.println(user);
			System.out.println(password);

			System.out.println("authenticating....");
		DBCollection collection = db.getCollection("users"); 
		BasicDBObject neQuery = new BasicDBObject();
		neQuery.put("uname", user);
		neQuery.put("pwd", password);
		DBCursor cursor = collection.find(neQuery);
		
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
			isValidUser = true;
		}
		return isValidUser;
	}


	
	public static List<DBObject> getAllUsers(int age) {
	
		DBCollection collection = db.getCollection("users"); 
		@SuppressWarnings("deprecation")
		AggregationOutput query = collection.aggregate(new BasicDBObject("$match",new BasicDBObject("age",new BasicDBObject("$gt",age))),
		           new BasicDBObject("$group",
		                   new BasicDBObject("_id", "$city").append("count", new BasicDBObject("$sum", 1))));
		
		List<DBObject> list = new ArrayList<DBObject>();
		for(DBObject result:query.results()) {
			list.add(result);
			System.out.println(result);
		}
		
		return list;
	}
	

	public static DBObject isDatabaseUp(){

		System.out.println("is databse working!");
		DBObject d = null;
		try {
			d = db.command("serverStatus");
			System.out.println(d.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Mongo db is not running");
			e.printStackTrace();

		}
		return d;
		}
	
}
