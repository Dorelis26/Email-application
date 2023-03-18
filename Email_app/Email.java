import java.util.Scanner;

public class Email{
    //Email object fields
    private String fistName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultpasswordlength = 10;
    private String email;
    private String companySuffix = "Dorelis.com";
// constructor to receive the first name and latname
public Email(String firstName, String lastName)
{
    this.fistName = firstName;
    this.lastName = lastName;

    System.out.println("Email created " + this.fistName + " "+ this.lastName);
    this.department = setDepartment();

    // call a method that returns a random password
this.password = randomPassword(defaultpasswordlength);
System.out.println("\nyour password is "+ this.password);


//combine elements to generate an email. 
/* email = firstName.toLowerCase() + "."+ lastName.toLowerCase()+ "@"+ department +"."+ companySuffix;
 System.out.println("\nYour Email is "+ email);*/
}



//ask for department
private String setDepartment()
{
    System.out.println("enter the department\n 1. for sales\n 2. for Development\n 3. for Accaunting\n 0. for none");
    Scanner scan =new Scanner(System.in);
    int choice =scan.nextInt();
    scan.close();
    String sales= "sales";
    String Acct= "Acct";
    String Dev= "Dev";
    String nothing= "";
    if(choice ==1){return sales; }
    else if(choice ==2){return Dev; }
    else if(choice==3){return Acct; }
    else {return nothing;}

};
//generate random password
private String randomPassword(int length){
    String paswordset ="ABCDEFGHIJKLMNOPQRSTUXYZ0123456789!@$#%";
    char[] password = new char[length];
    for (int i = 0 ; i<length;i++){
      int rand = (int ) (Math.random() * paswordset.length());
      password[i]=paswordset.charAt(rand);
    }
    return new String(password);
}





//set mailbox capacity
public void setMailboxCapacity(int capacity)
{
    this.mailBoxCapacity = capacity;
}


//set alternative email

public void setAlternativEemail(String altEmail)
{
    this.alternateEmail = altEmail;
}


//change password
public void changePassword(String password)
{
    this.password = password;
}
//get alternative email
public String getAlternativeemail()
{
    return alternateEmail;
}

// get mailbox capacity
public int getMailBoxCapacity()
{
    
    return mailBoxCapacity;
}

//get password
public String getEmail(){return email;}

//show information
public String showinfo ()
{
    return "\nDisplay name : "+ fistName + " "+ lastName +"\n"+
     "\nYour email is : " + email+ "\n"+
     "\nYour mailbox capacity is equal to : " + mailBoxCapacity;


}



}