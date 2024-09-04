package day1;

public class encapsulation {
    private String name;
    private int phno;
    public String setName(String name ){
        return this.name=name;
    }
    public int setPhno(int no){
        return this.phno=no;
    }
    public void getName(){
        System.out.println(name);
    }
    public void getPhno(){
        System.out.println(phno);
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setName("dinesh");
        obj.setPhno(9441712);
        obj.getName();
        obj.getPhno();
    }
}
