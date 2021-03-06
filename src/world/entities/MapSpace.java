package world.entities;

import java.awt.Color;
import java.awt.Graphics;

import world.HXClickable;
import world.HXEntity;
import world.HXWorld;

public class MapSpace extends HXEntity implements HXClickable{

	private final int DEFAULT_WIDTH = 25, DEFAULT_HEIGHT = 25;
	
	/**
	 * Template for creating a new entiity. Should always override drawing, to have
	 * some sort of visual appearence in the world. But should still call super.draw()
	 * Constructor should always call init() method of HXEntity
	 * @param xPos
	 * @param yPos
	 * @param xVel
	 * @param yVel
	 * @param w
	 */
	public MapSpace(int xPos, int yPos, HXWorld w) {
		init(xPos, yPos, DEFAULT_WIDTH, DEFAULT_HEIGHT, w);
	}
	
	/**
	 * Unless it has no visuals, it should override draw() but still call super.draw()
	 */
	@Override
	public void draw(Graphics g, float interpolation) {
		super.draw(g, interpolation);
		
		g.setColor(Color.gray);
		g.drawRect(getLastDraw_xPos() * getScale() + getxPan(), getLastDraw_yPos() * getScale() + getyPan(), getScaledWidth(), getScaledHeight());
	}

	@Override
	public void update() {
		super.update();
	}

	/**
	 * From the HXClickable interface. Add functionality for what happens when the object is clicked on in world
	 */
	@Override
	public void mouseIntersection() {
		// TODO Auto-generated method stub
		
	}
}