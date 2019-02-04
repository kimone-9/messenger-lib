import java.util.List;


public abstract class StorageProvider 
{
	private List<Message> message;
	
	public boolean save(Message m)
	{
		return false;
		
	}
	public List<Message> retrieveAll()
	{
		return message;
		
	}

}
