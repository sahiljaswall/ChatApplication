public class Pair {
    private String name;
    private boolean notify;
    public Pair(String name,Boolean notify){
        this.name=name;
        this.notify=notify;
    }
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }
    public Boolean getNotify(){
        return notify;
    }
    public void SetNotify(Boolean notify){
        this.notify=notify;
    }
}
