package com;
class Color{
	public void paint() {
		System.out.println("Color painting");
	}
}
class Green extends Color{
	public void paint() {
		System.out.println("Green Painting");
	}
}
class Blue extends Color{
	public void paint() {
	System.out.println("Blue Painting");
  }
}
class Red extends Color{
	public void paint() {
	System.out.println("Red Painting");
  }
}
class ColorFactory{
	public Color getInstance(String colorName) {
		if(colorName.equals("Red")) {
			return new Red();
		} else if(colorName.equals("Green")){
		    return new Green();
	} else if(colorName.equals("Blue")) {
		    return new Blue();
	} else {
		return null;
	}
	}
}

public class FactoryPatternTest {

	public static void main(String[] args) {
     ColorFactory cf = new ColorFactory();
     Color cc=cf.getInstance("Red");
     cc.paint();

	}

}
