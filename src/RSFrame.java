// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;

final class RSFrame extends Frame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RSFrame(RSApplet RSApplet_, int i, int j) {
		rsApplet = RSApplet_;
		setResizable(true);
		setVisible(true);
		setFocusTraversalKeysEnabled(false);
		toFront();
		setSize(i + 8, j + 28);
	}

	public Graphics getGraphics()
	{
		Graphics g = super.getGraphics();
		g.translate(4, 24);
		return g;
	}

	public void update(Graphics g)
	{
		rsApplet.update(g);
	}

	public void paint(Graphics g)
	{
		rsApplet.paint(g);
	}

	private final RSApplet rsApplet;
}
