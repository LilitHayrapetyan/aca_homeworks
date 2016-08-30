package my_project;

public class MessageUtil {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
    public void getMessage(String str){
    	System.out.println(str.split("."));
    }
}
