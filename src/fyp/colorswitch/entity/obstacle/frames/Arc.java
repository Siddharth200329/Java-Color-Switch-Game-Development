package fyp.colorswitch.entity.obstacle.frames;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

import fyp.colorswitch.Handler;
import fyp.colorswitch.entity.Entity;

public class Arc extends Arc2D { // extends Arc2D pour pouvoir appeler la m�thode setAngleStart(angle) d'Arc2D 
								// dans la classe Cercle
	
	private int diameter, colorType;
	private double currentAngle, angularSpeed;
	private Arc2D arc;
	private int type = 0; // type 0 for drawArc | type 1 for fillArc
	private float x, yPosition;
	private Handler handler;
	private float thickness;
	
	public Arc (Handler handler, float yPosition, int diameter, double currentAngle, int color) {
		this.handler = handler;
		this.x = handler.getWidth() / 2 - diameter / 2;
		this.yPosition = yPosition;
		this.diameter = diameter;
		this.currentAngle = currentAngle;
		this.colorType = color;
		this.angularSpeed = 1;
		this.thickness = 20;
		
		// initialisation d'arc
		arc = new Arc2D.Double(x, yPosition, diameter, diameter, (int) currentAngle, 90, 0);
	}

	public void tick() {
		
	}

	public void render(Graphics2D g) {
		int xPos = (int) x;
		int yPos = (int) (yPosition - handler.getGameCamera().getyOffset());
		
		arc.setArc(xPos, yPos, diameter, diameter, currentAngle, 90, 0);
		g.setStroke(new BasicStroke(thickness));
		g.setColor(Entity.colors[colorType]);
		if(type == 0)
			g.draw(arc);
		if(type == 1)
			g.fill(arc);
	}
	
	// Getters and Setters
	
	public Arc2D getArc() {
		return arc;
	}
	
	@Override
	public void setArc(Arc2D arc) {
		this.arc = arc;
	}
	
	public int getColorType() {
		return colorType;
	}

	public void setColorType(int colorType) {
		this.colorType = colorType;
	}

	@Override
	public double getAngleExtent() {
		// TODO Auto-generated method stub
		return 90;
	}

	@Override
	public double getAngleStart() {
		// TODO Auto-generated method stub
		return currentAngle;
	}

	@Override
	protected Rectangle2D makeBounds(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAngleExtent(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAngleStart(double arg0) {
		currentAngle = arg0;
		
	}

	@Override
	public void setArc(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5, int arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(this == null)
			return true;
		else 	
			return false;
	}

	

}
