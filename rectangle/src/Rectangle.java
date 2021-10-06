public class Rectangle{

    private int len;
    private int wid;
    private int area;


    public Rectangle(int theLen, int theWid){
        len = theLen;
        wid = theWid;
    }

    public int getLen(){
        return len;
    }

    public int getWid() { return wid; }

    public int calculateArea(){
        area = getLen() * getWid();
        return area;
    }
}