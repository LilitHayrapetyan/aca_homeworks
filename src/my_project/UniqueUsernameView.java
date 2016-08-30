package my_project;

public class UniqueUsernameView {

	UserName userName;
	
	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			UserName username = (UserName) object;
			if (this.userName.getUserName() != username.getUserName()) {
				result = false;
			}else 
				result=true;
		}
		return result;
	}

	@Override
	public int hashCode() {
		int hash = 1; 
		return hash + this.userName.hashCode();
		
	}
	public Boolean CheckUserName(UserName username){
		return this.userName.getUserName().equals(username.getUserName());
	
	}
}
