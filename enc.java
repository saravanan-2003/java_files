

public class enc {
    private String s;
    public String getname(){
        return s;
    }
    public void setname(String new){
        this.s=new;
    }
    public static void main(String[] args){
        enc obj1=new enc();
        obj1.s="saro";
        System.out.println(obj1.s);
    }}

