public class Contact {
    private String name;
    private String phone;
    private String email;
    private String timeStamp;
    public Contact(String name,String phone,String email,String timeStamp){
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.timeStamp=timeStamp;
    }

    public String getName(){
        return name.toUpperCase();
    }
    public void setName(String name){
        this.name= name;
    }
    public String getPhone(){
        return phone;
    }
    public void setphone(String phone){
        this.phone=phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getTimeStamp(){
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp){
        this.timeStamp=timeStamp;
    }
    
    

    
}
