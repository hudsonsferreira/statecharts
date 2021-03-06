/**
 * Copyright (c) 2016 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package traffic.light;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JPanel;

/**
 * 
 * @author Tesch
 *
 */

public class PedestrianLight extends JPanel {

	private static final long serialVersionUID = 1L;

	boolean white = false;
	boolean red = false;
	boolean green = false;
	private Alignment alignment;

	public enum Alignment {
		HORIZONTAL(50, 25), VERTICAL(25, 50);

		private int width;
		private int height;

		Alignment(int width, int height) {
			this.width = width;
			this.height = height;
		}

		public int getWidth() {
			return width;
		}

		public int getHeight() {
			return height;
		}

	}

	public PedestrianLight(Alignment alignment) {
		this.alignment = alignment;
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}

	public boolean isRed() {
		return red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}

	public boolean isGreen() {
		return green;
	}

	public void setGreen(boolean green) {
		this.green = green;
	}

	public void updatePosition(Point position) {
		setBounds(new Rectangle(position.x, position.y, alignment.getWidth(), alignment.getHeight()));
	}

	@Override
	public void paint(Graphics graphics) {
		Rectangle bounds = getBounds();
		graphics.setColor(Color.black);
		graphics.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);

		if (alignment == Alignment.HORIZONTAL) {

			graphics.setColor(white ? Color.white : Color.black);
			graphics.fillRect(bounds.x + ((bounds.width - (3 * (bounds.height / 3))) / 4),
					bounds.y + ((bounds.width - (3 * (bounds.height / 3))) / 4), bounds.width / 4, bounds.width / 4);

			graphics.setColor(red ? Color.red : Color.black);
			graphics.fillOval(bounds.x + (2 * ((bounds.width - (3 * (bounds.height / 3))) / 4)) + (bounds.height / 3),
					bounds.y + ((bounds.width - (3 * (bounds.height / 3))) / 4), bounds.width / 4, bounds.width / 4);

			graphics.setColor(green ? Color.green : Color.black);
			graphics.fillOval(
					bounds.x + (3 * ((bounds.width - (3 * (bounds.height / 3))) / 4)) + (2 * (bounds.height / 3)),
					bounds.y + ((bounds.width - (3 * (bounds.height / 3))) / 4), bounds.width / 4, bounds.width / 4);

		} else if (alignment == Alignment.VERTICAL) {

			graphics.setColor(white ? Color.white : Color.black);
			graphics.fillRect(bounds.x + 7, bounds.y + 2, bounds.height / 4, bounds.height / 4);

			graphics.setColor(red ? Color.red : Color.black);
			graphics.fillOval(bounds.x + 7, bounds.y + 2 * bounds.height / 5, bounds.height / 4, bounds.height / 4);

			graphics.setColor(green ? Color.green : Color.black);
			graphics.fillOval((bounds.x + (bounds.width / 2) - ((bounds.height / 5) / 2)),
					bounds.y + bounds.height - (bounds.height / 5) - 5, bounds.height / 4, bounds.height / 4);
		}
	}

}
