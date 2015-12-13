public class Prism extends Rectangle implements Volume{
    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Prism "+getName()+" that is "+getLength()+" by "+getWidth()+" by "+getHeight();
    }
    public double getVolume(){
	return getLength() * getWidth() * getHeight();
    }
}
