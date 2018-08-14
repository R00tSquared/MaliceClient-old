import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import sign.signlink;

public class RSApplet extends Applet implements Runnable, MouseListener,
		MouseMotionListener, MouseWheelListener, KeyListener, FocusListener,
		WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int hotKey = 508;
	public boolean resizing;
	private int anInt4;
	private int delayTime;
	int minDelay;
	private final long aLongArray7[] = new long[10];
	int fps;
	boolean shouldDebug;
	int myWidth;
	int myHeight;
	Graphics graphics;
	RSImageProducer fullGameScreen;
	RSFrame gameFrame;
	private boolean shouldClearScreen;
	boolean awtFocus;
	int idleTime;
	int clickMode2;
	public static int mouseX;
	public static int mouseY;
	protected int clickMode1;
	private int clickX;
	private int clickY;
	private long clickTime;
	int clickMode3;
	int saveClickX;
	int saveClickY;
	long aLong29;
	final int keyArray[] = new int[128];
	private final int charQueue[] = new int[128];
	private int readIndex;
	private int writeIndex;
	public static int anInt34;

	public void setCursor(int id) {
		try {
			Image image = getGameComponent().getToolkit().createImage(
					FileOperations.ReadFile(id == 0 ? signlink.findcachedir()
							+ "Sprites/Cursors/Cursor 0.PNG" : signlink.findcachedir()
							+ "Sprites/Cursors/Cursor " + id + ".PNG"));
			getGameComponent().setCursor(
					getGameComponent().getToolkit().createCustomCursor(image,
							new Point(0, 0), null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final void createClientFrame(int i, int j) {
		setFocusTraversalKeysEnabled(false);
		setFocusable(false);
		myWidth = j;
		myHeight = i;
		gameFrame = new RSFrame(this, myWidth, myHeight);
		graphics = getGameComponent().getGraphics();
		fullGameScreen = new RSImageProducer(myWidth, myHeight,
				getGameComponent());
		startRunnable(this, 1);
	}

	final void initClientFrame(int i, int j) {
		myWidth = j;
		myHeight = i;
		graphics = getGameComponent().getGraphics();
		fullGameScreen = new RSImageProducer(myWidth, myHeight,
				getGameComponent());
		startRunnable(this, 1);
	}

	public void run() {
		getGameComponent().addMouseListener(this);
		getGameComponent().addMouseMotionListener(this);
		getGameComponent().addKeyListener(this);
		getGameComponent().addFocusListener(this);
		getGameComponent().addMouseWheelListener(this);
		setFocusTraversalKeysEnabled(false);
		if (gameFrame != null) {
			gameFrame.addWindowListener(this);
		}
		// drawLoadingText(0, "Loading...");
		startUp();
		int i = 0;
		int j = 256;
		int k = 1;
		int l = 0;
		int i1 = 0;
		for (int j1 = 0; j1 < 10; j1++) {
			aLongArray7[j1] = System.currentTimeMillis();
		}

		System.currentTimeMillis();
		do {
			if (anInt4 < 0) {
				break;
			}
			if (anInt4 > 0) {
				anInt4--;
				if (anInt4 == 0) {
					exit();
					return;
				}
			}
			int k1 = j;
			int i2 = k;
			j = 300;
			k = 1;
			long l2 = System.currentTimeMillis();
			if (aLongArray7[i] == 0L) {
				j = k1;
				k = i2;
			} else if (l2 > aLongArray7[i]) {
				j = (int) ((long) (2560 * delayTime) / (l2 - aLongArray7[i]));
			}
			if (j < 25) {
				j = 25;
			}
			if (j > 256) {
				j = 256;
				k = (int) ((long) delayTime - (l2 - aLongArray7[i]) / 10L);
			}
			if (k > delayTime) {
				k = delayTime;
			}
			aLongArray7[i] = l2;
			i = (i + 1) % 10;
			if (k > 1) {
				for (int j2 = 0; j2 < 10; j2++) {
					if (aLongArray7[j2] != 0L) {
						aLongArray7[j2] += k;
					}
				}

			}
			if (k < minDelay) {
				k = minDelay;
			}
			try {
				Thread.sleep(k);
			} catch (InterruptedException interruptedexception) {
				i1++;
			}
			for (; l < 256; l += j) {
				clickMode3 = clickMode1;
				saveClickX = clickX;
				saveClickY = clickY;
				aLong29 = clickTime;
				clickMode1 = 0;
				processGameLoop();
				readIndex = writeIndex;
			}

			l &= 0xff;
			if (delayTime > 0) {
				fps = (1000 * j) / (delayTime * 256);
			}
			processDrawing();
			if (shouldDebug) {
				System.out.println((new StringBuilder()).append("ntime:")
						.append(l2).toString());
				for (int k2 = 0; k2 < 10; k2++) {
					int i3 = ((i - k2 - 1) + 20) % 10;
					System.out.println((new StringBuilder()).append("otim")
							.append(i3).append(":").append(aLongArray7[i3])
							.toString());
				}

				System.out.println((new StringBuilder()).append("fps:")
						.append(fps).append(" ratio:").append(j)
						.append(" count:").append(l).toString());
				System.out.println((new StringBuilder()).append("del:")
						.append(k).append(" deltime:").append(delayTime)
						.append(" mindel:").append(minDelay).toString());
				System.out.println((new StringBuilder()).append("intex:")
						.append(i1).append(" opos:").append(i).toString());
				shouldDebug = false;
				i1 = 0;
			}
		} while (true);
		if (anInt4 == -1) {
			exit();
		}
	}

	private void exit() {
		anInt4 = -2;
		cleanUpForQuit();
		if (gameFrame != null) {
			try {
				Thread.sleep(1000L);
			} catch (Exception exception) {
			}
			try {
				System.exit(0);
			} catch (Throwable throwable) {
			}
		}
	}

	final void method4(int i) {
		delayTime = 1000 / i;
	}

	public final void start() {
		if (anInt4 >= 0) {
			anInt4 = 0;
		}
	}

	public final void stop() {
		if (anInt4 >= 0) {
			anInt4 = 4000 / delayTime;
		}
	}

	public final void destroy() {
		anInt4 = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception exception) {
		}
		if (anInt4 == -1) {
			exit();
		}
	}

	public final void update(Graphics g) {
		if (graphics == null) {
			graphics = g;
		}
		shouldClearScreen = true;
		raiseWelcomeScreen();
	}

	public final void paint(Graphics g) {
		if (graphics == null) {
			graphics = g;
		}
		shouldClearScreen = true;
		raiseWelcomeScreen();
	}

	/*
	 * public void mouseWheelMoved(MouseWheelEvent mousewheelevent) { int i =
	 * mousewheelevent.getWheelRotation(); if(Client.loggedIn) { if(mouseY >
	 * 206+Client.extraHeight && mouseY < 467+Client.extraHeight && mouseX >
	 * 548+Client.extraWidth && mouseX < 738+Client.extraWidth) {
	 * if(Client.tabInterfaceIDs[Client.tabID] == 5065) {
	 * RSInterface.interfaceCache[5066].scrollPosition += i * 30; }
	 * if(Client.tabInterfaceIDs[Client.tabID] == 147) {
	 * RSInterface.interfaceCache[148].scrollPosition += i * 30; }
	 * if(Client.tabInterfaceIDs[Client.tabID] == 638) {
	 * RSInterface.interfaceCache[639].scrollPosition += i * 30; }
	 * if(Client.tabInterfaceIDs[Client.tabID] == 18128) {
	 * RSInterface.interfaceCache[18143].scrollPosition += i * 30; }
	 * if(Client.tabInterfaceIDs[Client.tabID] == 5715) {
	 * RSInterface.interfaceCache[5716].scrollPosition += i * 30; } }
	 * if(mouseX+Client.extraWidth > 0 && mouseY > 340+Client.extraHeight &&
	 * mouseX < 510+Client.extraWidth && mouseY < 500+Client.extraHeight) {
	 * Client.anInt1089 -= i * 15; } if(mouseX > 0+Client.extraWidth && mouseX <
	 * 512+Client.extraWidth && mouseY > 0+Client.extraHeight && mouseY <
	 * 334+Client.extraHeight) { if(Client.openInterfaceID == -1 && resizing) {
	 * Client.Zoom -= i * 30; } if(Client.openInterfaceID == 5292) {
	 * RSInterface.interfaceCache[5385].scrollPosition += i *30; } } } }
	 */

	public void mouseWheelMoved(MouseWheelEvent event) {
		int rotation = event.getWheelRotation();
		boolean scrolled = handleInterfaceScrolling(event);
		if (mouseX > 0 && mouseX < 512 && mouseY > Client.clientHeight - 165
				&& mouseY < Client.clientHeight - 25) {
			int scrollPos = Client.anInt1089;

			scrollPos -= rotation * 30;
			if (scrollPos < 0)
				scrollPos = 0;
			if (Client.GESearchVisible) {
				if (Client.totalItemResults <= 8)
					return;
				if (Client.itemResultScrollPos > 14 * Client.totalItemResults - 128)
					Client.itemResultScrollPos = 14 * Client.totalItemResults - 128;
				if (rotation == -1) {
					Client.itemResultScrollPos -= scrollPos;
					if (Client.itemResultScrollPos < 0)
						Client.itemResultScrollPos = 0;
					else if (Client.itemResultScrollPos > 14 * Client.totalItemResults - 128) {
						Client.itemResultScrollPos = 14 * Client.totalItemResults - 128;
					}
				} else
					Client.itemResultScrollPos += rotation * 30;
				if (Client.itemResultScrollPos < 0)
					Client.itemResultScrollPos = 0;
			} else {
				if (scrollPos > Client.anInt1211 - 110)
					scrollPos = Client.anInt1211 - 110;
			}

			if (Client.anInt1089 != scrollPos) {
				Client.anInt1089 = scrollPos;
				Client.inputTaken = true;
			}
		} else {
			if (!scrolled && mouseX < 516 && mouseY < 336) {
				if(RSInterface.interfaceCache[18418].message.equalsIgnoreCase("1")){
					int zoom = Integer
							.parseInt(RSInterface.interfaceCache[18416].message);
					if (rotation == -1) {
						if (zoom > 200)
							zoom -= 30;
					} else {
						if (zoom < 1500)
							zoom += 30;
					}
					RSInterface.interfaceCache[18416].message = String
							.valueOf(zoom);
					Client.zoomUpdate = 1000;
				}
			}
		}
	}

	public boolean handleInterfaceScrolling(MouseWheelEvent event) {
		int rotation = event.getWheelRotation();
		int positionX = 0;
		int positionY = 0;
		int width = 0;
		int height = 0;
		int offsetX = 0;
		int offsetY = 0;
		int childID = 0;
		/* Tab interface scrolling */
		int tabInterfaceID = Client.tabInterfaceIDs[Client.tabID];
		if (tabInterfaceID != -1) {
			RSInterface tab = RSInterface.interfaceCache[tabInterfaceID];
			offsetX = !Client.isFullScreen ? Client.clientWidth - 218
					: (!Client.isFullScreen ? 28 : Client.clientWidth - 197);
			offsetY = !Client.isFullScreen ? Client.clientHeight - 298
					: (!Client.isFullScreen ? 37 : Client.clientHeight
							- (Client.clientWidth >= 900 ? 37 : 74) - 267);
			for (int index = 0; index < tab.children.length; index++) {
				if (RSInterface.interfaceCache[tab.children[index]].scrollMax > 0) {
					childID = index;
					positionX = tab.childX[index];
					positionY = tab.childY[index];
					width = RSInterface.interfaceCache[tab.children[index]].width;
					height = RSInterface.interfaceCache[tab.children[index]].height;
					break;
				}
			}
			if (mouseX > offsetX + positionX && mouseY > offsetY + positionY
					&& mouseX < offsetX + positionX + width
					&& mouseY < offsetY + positionY + height) {
				RSInterface.interfaceCache[tab.children[childID]].scrollPosition += rotation * 30;
				return true;
			}
		}
		/* Main interface scrolling */
		if (Client.openInterfaceID != -1) {
			RSInterface rsi = RSInterface.interfaceCache[Client.openInterfaceID];
			offsetX = !Client.isFullScreen ? 4 : (Client.clientWidth / 2) - 256;
			offsetY = !Client.isFullScreen ? 4
					: (Client.clientHeight / 2) - 167;
			for (int index = 0; index < rsi.children.length; index++) {
				if (RSInterface.interfaceCache[rsi.children[index]].scrollMax > 0) {
					childID = index;
					positionX = rsi.childX[index];
					positionY = rsi.childY[index];
					width = RSInterface.interfaceCache[rsi.children[index]].width;
					height = RSInterface.interfaceCache[rsi.children[index]].height;
					break;
				}
			}
			if (mouseX > offsetX + positionX && mouseY > offsetY + positionY
					&& mouseX < offsetX + positionX + width
					&& mouseY < offsetY + positionY + height) {
				RSInterface.interfaceCache[rsi.children[childID]].scrollPosition += rotation * 30;
				return true;
			}
		}
		return false;
	}

	public final void mousePressed(MouseEvent mouseevent) {
		int i = mouseevent.getX();
		int j = mouseevent.getY();
		int k = mouseevent.getButton();
		if (k == 2 && mouseX > 0 + Client.extraWidth
				&& mouseX < 512 + Client.extraWidth
				&& mouseY > 0 + Client.extraHeight
				&& mouseY < 334 + Client.extraHeight && resizing
				&& Client.loggedIn) {
			Client.Zoom = 0;
		}
		if (gameFrame != null) {
			i -= 4;
			j -= 22;
		}
		idleTime = 0;
		clickX = i;
		clickY = j;
		clickTime = System.currentTimeMillis();
		if (mouseevent.isMetaDown()) {
			clickMode1 = 2;
			clickMode2 = 2;
		} else {
			clickMode1 = 1;
			clickMode2 = 1;
		}
	}

	public final void mouseReleased(MouseEvent mouseevent) {
		idleTime = 0;
		clickMode2 = 0;
	}

	public final void mouseClicked(MouseEvent mouseevent) {
	}

	public final void mouseEntered(MouseEvent mouseevent) {
	}

	public final void mouseExited(MouseEvent mouseevent) {
		idleTime = 0;
		mouseX = -1;
		mouseY = -1;
	}

	public final void mouseDragged(MouseEvent mouseevent) {
		int i = mouseevent.getX();
		int j = mouseevent.getY();
		if (gameFrame != null) {
			i -= 4;
			j -= 22;
		}
		idleTime = 0;
		mouseX = i;
		mouseY = j;
	}

	public final void mouseMoved(MouseEvent mouseevent) {
		int i = mouseevent.getX();
		int j = mouseevent.getY();
		if (gameFrame != null) {
			i -= 4;
			j -= 22;
		}
		idleTime = 0;
		mouseX = i;
		mouseY = j;
	}

	private int lastKey = 0;

	public final void keyPressed(KeyEvent keyevent) {
		idleTime = 0;
		int i = keyevent.getKeyCode();
		int j = keyevent.getKeyChar();
		// System.out.println("hotkey "+i);
		/*if (i == 83 && lastKey == 17) {
			try {
				Robot robot = new Robot();
				Point point = getLocationOnScreen();
				Rectangle rectangle = new Rectangle(point.x, point.y,
						getWidth(), getHeight());
				BufferedImage image = robot.createScreenCapture(rectangle);
				Uploader.upload(image);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		if (Client.loggedIn) {
			if (i == 17) {
				resizing = true;
			} else {
				resizing = false;
			}
		}
		/*
		 * if(hotKey == 508) { if(i == 27) { Client.setTab(3); } else if(i ==
		 * 112) { Client.setTab(0); } else if(i == 113) { Client.setTab(1); }
		 * else if(i == 114) { Client.setTab(2); } else if(i == 115) {
		 * Client.setTab(3); } else if(i == 116) { Client.setTab(4); } else if(i
		 * == 117) { Client.setTab(5); } else if(i == 118) { Client.setTab(6); }
		 * else if(i == 119) { Client.setTab(7); } else if(i == 120) {
		 * Client.setTab(8); } else if(i == 121) { Client.setTab(9); } else if(i
		 * == 122) { Client.setTab(10); } else if(i == 123) { Client.setTab(11);
		 * } } else if(i == 27) { Client.setTab(0); } else if(i == 112) {
		 * Client.setTab(3); } else if(i == 113) { Client.setTab(1); } else if(i
		 * == 114) { Client.setTab(2); } else if(i == 115) { Client.setTab(3); }
		 * else if(i == 116) { Client.setTab(4); } else if(i == 117) {
		 * Client.setTab(5); } else if(i == 118) { Client.setTab(6); } else if(i
		 * == 119) { Client.setTab(7); } else if(i == 120) { Client.setTab(8); }
		 * else if(i == 121) { Client.setTab(9); } else if(i == 122) {
		 * Client.setTab(10); } else if(i == 123) { Client.setTab(11); }
		 */
		if (keyevent.isControlDown())
			Client.controlIsDown = true;
		if(i == KeyEvent.VK_ESCAPE && Client.openInterfaceID > 0){
			Client.openInterfaceID = -1;
			Client.closeWindows = true;
		}
		if (i == KeyEvent.VK_PAGE_UP && !Client.loggedIn) {
			Configuration.staffClient = !Configuration.staffClient;
			if (Configuration.staffClient) {
				System.out.println("Beta Server toggled on.");
				Configuration.server = Client.getSCIP();
			} else {
				System.out.println("Beta Server toggled off.");
				Configuration.server = Configuration.serverReg;
			}
		}
		if (i == KeyEvent.VK_PAGE_DOWN && !Client.loggedIn) {
			Configuration.staffClient = !Configuration.staffClient;
			if (Configuration.staffClient) {
				System.out.println("Localhost Server toggled on.");
				Configuration.server = "localhost";
			} else {
				System.out.println("Localhost Server toggled off.");
				Configuration.server = Configuration.serverReg;
			}
		}
		if (i == 112) {
			Client.setTab(3);
		} else if (i == 113) {
			Client.setTab(4);
		} else if (i == 114) {
			Client.setTab(5);
		} else if (i == 115) {
			Client.setTab(6);
		} else if (i == 116) {
			Client.setTab(0);
		}
		if (j < 30) {
			j = 0;
		}
		if (i == 37) {
			j = 1;
		}
		if (i == 39) {
			j = 2;
		}
		if (i == 38) {
			j = 3;
		}
		if (i == 40) {
			j = 4;
		}
		if (i == 17) {
			j = 5;
		}
		if (i == 8) {
			j = 8;
		}
		if (i == 127) {
			j = 8;
		}
		if (i == 9) {
			j = 9;
		}
		if (i == 10) {
			j = 10;
		}
		if (i >= 112 && i <= 123) {
			j = (1008 + i) - 112;
		}
		if (i == 36) {
			j = 1000;
		}
		if (i == 35) {
			j = 1001;
		}
		if (i == 33) {
			j = 1002;
		}
		if (i == 34) {
			j = 1003;
		}
		if (j > 0 && j < 128) {
			keyArray[j] = 1;
		}
		if (j > 4) {
			charQueue[writeIndex] = j;
			writeIndex = writeIndex + 1 & 0x7f;
		}
		lastKey = i;
	}

	public final void keyReleased(KeyEvent keyevent) {
		idleTime = 0;
		int i = keyevent.getKeyCode();
		char c = keyevent.getKeyChar();
		if (i == KeyEvent.VK_CONTROL) {
			Client.controlIsDown = false;
		}
		if (i == 17) {
			resizing = false;
		}
		if (c < '\036') {
			c = '\0';
		}
		if (i == 37) {
			c = '\001';
		}
		if (i == 39) {
			c = '\002';
		}
		if (i == 38) {
			c = '\003';
		}
		if (i == 40) {
			c = '\004';
		}
		if (i == 17) {
			c = '\005';
		}
		if (i == 8) {
			c = '\b';
		}
		if (i == 127) {
			c = '\b';
		}
		if (i == 9) {
			c = '\t';
		}
		if (i == 10) {
			c = '\n';
		}
		if (c > 0 && c < '\200') {
			keyArray[c] = 0;
		}
	}

	public final void keyTyped(KeyEvent keyevent) {
	}

	final int readChar(int i) {
		while (i >= 0) {
			int j = 1;
			while (j > 0) {
				j++;
			}
		}
		int k = -1;
		if (writeIndex != readIndex) {
			k = charQueue[readIndex];
			readIndex = readIndex + 1 & 0x7f;
		}
		return k;
	}

	public final void focusGained(FocusEvent focusevent) {
		awtFocus = true;
		shouldClearScreen = true;
		raiseWelcomeScreen();
	}

	public final void focusLost(FocusEvent focusevent) {
		awtFocus = false;
		for (int i = 0; i < 128; i++) {
			keyArray[i] = 0;
		}

	}

	public final void windowActivated(WindowEvent windowevent) {
	}

	public final void windowClosed(WindowEvent windowevent) {
	}

	public final void windowClosing(WindowEvent windowevent) {
		destroy();

	}

	public final void windowDeactivated(WindowEvent windowevent) {
	}

	public final void windowDeiconified(WindowEvent windowevent) {
	}

	public final void windowIconified(WindowEvent windowevent) {
	}

	public final void windowOpened(WindowEvent windowevent) {
	}

	void startUp() {
	}

	void processGameLoop() {
	}

	void cleanUpForQuit() {
	}

	void processDrawing() {
	}

	void raiseWelcomeScreen() {
	}

	Component getGameComponent() {
		if (gameFrame != null) {
			return gameFrame;
		} else {
			return this;
		}
	}

	public void startRunnable(Runnable runnable, int i) {
		Thread thread = new Thread(runnable);
		thread.start();
		thread.setPriority(i);
	}

	void drawLoadingText(int i, String s) {
		while (graphics == null) {
			graphics = getGameComponent().getGraphics();
			try {
				getGameComponent().repaint();
			} catch (Exception exception) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception exception1) {
			}
		}
		Font font = new Font("Helvetica", 1, 13);
		FontMetrics fontmetrics = getGameComponent().getFontMetrics(font);
		Font font1 = new Font("Helvetica", 0, 13);
		getGameComponent().getFontMetrics(font1);
		if (shouldClearScreen) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, myWidth, myHeight);
			shouldClearScreen = false;
		}
		Color color = new Color(140, 17, 17);
		int j = myHeight / 2 - 18;
		graphics.setColor(color);
		graphics.drawRect(myWidth / 2 - 152, j, 304, 33);
		graphics.fillRect(myWidth / 2 - 150, j + 2, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.fillRect((myWidth / 2 - 150) + i * 3, j + 2, 300 - i * 3, 30);
		graphics.setFont(font);
		graphics.setColor(Color.white);
		graphics.drawString("Loading...",
				(myWidth - fontmetrics.stringWidth("Loading...")) / 2, j - 11);
		graphics.drawString(s, (myWidth - fontmetrics.stringWidth(s)) / 2,
				j + 22);
	}

	void drawSmallLoad(int i, String s) {
		while (graphics == null) {
			graphics = getGameComponent().getGraphics();
			try {
				getGameComponent().repaint();
			} catch (Exception exception) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception exception1) {
			}
		}
		Font font = new Font("Helvetica", 1, 13);
		FontMetrics fontmetrics = getGameComponent().getFontMetrics(font);
		Font font1 = new Font("Helvetica", 0, 13);
		getGameComponent().getFontMetrics(font1);
		if (shouldClearScreen) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, myWidth, myHeight);
			shouldClearScreen = false;
		}
		Color color = new Color(140, 17, 17);
		int j = myHeight / 2 - 18;
		graphics.setColor(color);
		graphics.setFont(font);
		graphics.setColor(Color.white);
		graphics.drawString("Loading...",
				(myWidth - fontmetrics.stringWidth("Loading...")) / 2, j - 11);
		graphics.drawString(s, (myWidth - fontmetrics.stringWidth(s)) / 2,
				j + 22);
	}

	RSApplet() {
		resizing = false;
		delayTime = 20;
		minDelay = 1;
		shouldDebug = false;
		shouldClearScreen = true;
		awtFocus = true;
	}

}
