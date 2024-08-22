package system_Design;



public class online_Streaming_Application {
	
	public class VideoConsumingService{
		private Database database;
		public int seekTime(String userId, String videoId) {
			watchVideo watchedV = database.getWatchedVideo(userId, videoId);
			return watchedV.getSeekTime();
			//for this to work we need a database
			
		}
		
	}
	
	
	class videoService{
		
		
		private FileSystem filesystem;
		
		public Frame getFrame(String videoId, int timestamp) {
			Video video = filesystem.getVideo(videoId);
			return video.getFrame(timestamp);
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	class FileSystem {

		public Video getVideo(String videoId) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	class Database{

		public watchVideo getWatchedVideo(String userId, String videoId) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class Video{
		
		
		String id;
		Frame[] frames;
		
		String jsonMetaData;
		
		public Frame getFrame(int timestamp) {
			for(int i=0;i<frames.length;i++) {
				if(frames[i].startTimestamp<=timestamp && frames[i].endTimestamp+Frame.frameTime > timestamp) {
					return frames[i];
				}
			}
			throw new IndexOutOfBoundsException();
			
		}
	}
	
	class Frame{
		public static int frameTime = 10;
		byte[] bytes;
		int startTimestamp;
		int endTimestamp;
	}
	
	
	 class User{
		 String id;
		 String name;
		 String email;
		 
		 
		 
		 
		 public String getId() {
			 return id;
			 
		 }
	 }
	 
	 class watchVideo{
		 String id;
		 String videoId;
		 String userId;
		 int seekTime;
		 
		 
		 public int getSeekTime() {
			 return seekTime;
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
