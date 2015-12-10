public class Driver{
    public static char letter(){
	return (char)('A'+(int)(Math.random()*26));
    }
    
    public static Area makeRandomAreaShape(){
	String name = ""+letter()+"-2d";
	double value =Math.round(Math.random()*10.0);
	if(Math.random() < 0.5){
	    return new Circle(value,name);
	}else{
	    double value2 =Math.round(Math.random()*10.0);
	    return new Rectangle(value,value2,name);
	}
    }
    
    
    public static void main(String[]args){
	  
	  Area[] twos = new Area[5];
      for(int i = 0; i < twos.length; i++){
	twos[i]=makeRandomAreaShape();
    }
    System.out.println("Area tests:");
    for(Area a : twos){
	System.out.println(a);
	System.out.println(a.getArea());
    }
    }
}

    
