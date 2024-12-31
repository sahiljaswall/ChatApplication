public class Message{
    private String text;
    private Contact sender;
    private Contact receiver;
    private String timing;
    public Message(String text,Contact sender,Contact receiver,String timing){
        this.text=text;
        this.sender=sender;
        this.receiver=receiver;
        this.timing=timing;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
    public String getSender(){
        return sender.getName();
    }
    public void setSender(Contact sender){
        this.sender=sender;
    }
    public String getReceiver(){
        return receiver.getName();
    }
    public void setReceiver(Contact receiver){
        this.receiver=receiver;
    }
    public String getTiming(){
        return timing;
    }
    public void setTiming(String timing){
        this.timing=timing;
    }
}
