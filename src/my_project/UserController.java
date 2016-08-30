package my_project;

import java.util.Scanner;

public class UserController {

	public static String sIn = "Sign In";
	public static String sUp = "Sign Up";
	public static String addTelN = "Add Tel. Numb";
	public static String shTelN = "Show Tel. Numbers";
	public static String sOut = "sign Out";
	public static String help = "Help";
	public String str ;
	MessageUtil mess = new MessageUtil();
	User user =new User();
	
	public static String getsIn() {
		return sIn;
	}
	public static String getsUp() {
		return sUp;
	}
	public void userNamePassword(){
		mess.getMessage("Please.provide.your.username:");
		Scanner sc = new Scanner(System.in);
		String  userName = sc.nextLine();
		mess.getMessage("Please.provide.your.password:");
        String passw = sc.nextLine();
        //String passw = sc.next();
        //check username and passw
        
	}
	public void signUp(){
		userNamePassword();
	    mess.getMessage("You.have.successfully.created.user..Please.write.down.one.of.this.commands." + sIn +" .or. "+ sUp+ ".");	
	    Scanner sc = new Scanner(System.in);
	    str = sc.nextLine();
	    if(str == sOut){
	    	signOut();
	    }
	    if(str == sIn){
	    	signIn();
	    }else if (str == sUp){
	    	signUp();
	    }
	}
	public void signIn(){
		userNamePassword();
		mess.getMessage("You.are.successfully.logged.in");
	}
	public void addTelNum(String addTelN){
		this.addTelN = addTelN;
		mess.getMessage("Please.provide.your.telephone.number");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		telNumberChecker(addTelN);
		mess.getMessage("You.have.successfully.added.your.number.");
	}
	public void telNumber(){
		mess.getMessage("Now.you.can.write.down.one.of.this.commands." +addTelN + ". or." + shTelN +"'");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if(str == help){
			Help();
		}else if(str == addTelN){
			addTelNum(addTelN);
			mess.getMessage("If.you.want.to.add.one.more.please.write."+addTelN+ ".If.you.want.to.see.your.numbers.list.please.write."+ shTelN +"'");
			String addNewNum = sc.nextLine();
			if(addNewNum == addTelN){
				addTelNum(addTelN); 
			}else if(addNewNum == shTelN){
				//show all tel numbers
				showTelNumber();
			} else if(addNewNum == help){
				Help();
			}
		}else if(str == shTelN){
			showTelNumber();
		}
		//
	}
	public void telNumberChecker(String addTelN){
		if(addTelN.length()<12 || addTelN.length()>14 || addTelN.contains(("[a-zA-Z+]"))) {
			mess.getMessage("Please.correct.your.number");
		}
	}

	public void userNameChecker(){
	//check username
		
	}
	public void passwordChecker(){
	//password checker
	}

	public void signOut(){
		mess.getMessage("Please.write.down.one.of.this.commands." + sIn + " or "+ sUp + ".");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		if(str == sIn){
        	signIn();
        }else if(str == sUp){
        	signUp();
        }else if( str == help){
        	Help();
        }
	}
	
	public void showTelNumber(){
		//
		
	}
	public void Help(){
		mess.getMessage("Please, write down one of these valid commands");
		mess.getMessage(sIn); // should be description
		mess.getMessage(sUp);
		mess.getMessage(sOut);
		mess.getMessage(shTelN);
		mess.getMessage(addTelN);
	//	mess.getMessage(getsIn());
		
	//	mess.getMessage(sIn, sOut);
	}
}


