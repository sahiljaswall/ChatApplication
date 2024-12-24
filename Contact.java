public class Contact {
    private String name;
    private String phone;
    private String email;
    private String timeStamp;
    public Contact(String name,String phone,String email,String timeStamp){
        this.name=name;
        this.phone=email;
        this.timeStamp=timeStamp;
    }

    public String getName(){
        return name.toUpperCase();
    }
    public void setName(String name){
        this.name= name;
        
    }
    

    
}
