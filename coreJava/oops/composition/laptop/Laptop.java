package composition.laptop;

import composition.laptopcomponents.*;

public class Laptop {
 
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard graphicCard;
	private String opticalDrive;
	private String keyboard;
 
	public Laptop() {
 
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicCard = new GraphicCard();
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}
 
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = new Processor();   // this type of objects are called as nameless objects or anonymous objects  
                                            // objects can explicitly can call the toSting without actually calling them that's why their is no actual call for toString method .
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicCard = new GraphicCard();
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicCard=" + graphicCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

    public Processor getProcessor() {
		return processor;
	}
 
	public float getScreen() {
		return screen;
	}
 
	public String getRam() {
		return ram;
	}
 
	public String getHardDrive() {
		return hardDrive;
	}
 
	public GraphicCard getGraphicsCard() {
		return graphicCard;
	}
 
	public String getOpticalDrive() {
		return opticalDrive;
	}
 
	public String getKeyboard() {
		return keyboard;
	}
 
}
