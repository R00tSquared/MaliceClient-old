import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.net.*;
import javax.swing.*;



public class Jframe extends Client implements ActionListener {

    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public static JFrame frame;
	public static JPanel gamePanel;

	public Jframe(String args[]) {
		super();
		try {
			sign.signlink.startpriv(InetAddress.getByName(Configuration.server), Configuration.cacheUpdatingON);
			initUI();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void initUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JPopupMenu.setDefaultLightWeightPopupEnabled(false);
			frame = new JFrame("Zarpor Client V"+Configuration.version);
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gamePanel = new JPanel();
			webclient = false;
			gamePanel.setLayout(new BorderLayout());
			gamePanel.add(this);
			//JMenu fileMenu = new JMenu("File");

			

			/*for (String name : mainButtons) {
				JMenuItem menuItem = new JMenuItem(name);
				if (name.equalsIgnoreCase("-")) {
					fileMenu.addSeparator();
				} else {
					menuItem.addActionListener(this);
					fileMenu.add(menuItem);
				}
			}*/

			new JMenuBar();
			new JMenuBar();
                  	Dimension dimension1 = new Dimension(781, 541);
			frame.setMinimumSize(dimension1);
			//frame.add(jmenubar);
			//menuBar.add(fileMenu);
			//frame.getContentPane().add(menuBar, BorderLayout.NORTH);
			setFocusTraversalKeysEnabled(false);
			frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
			frame.pack();

			frame.setVisible(true); // can see the client
			frame.setResizable(true); // resizeable frame
			init();
		} catch (Exception e) {
				e.printStackTrace();
		}
}
	public URL getCodeBase() {
		try {
			return new URL("http://" + Configuration.server + "/cache");
		} catch (Exception e) {
			return super.getCodeBase();
		}
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public void loadError(String s) {
		System.out.println("loadError: " + s);
	}

	public String getParameter(String key) {
			return "";
	}

	private static void openUpWebSite(String url) {
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI(url)); 	
		} catch (Exception e) {
		}
	}

	public void actionPerformed(ActionEvent evt) {
		String cmd = evt.getActionCommand();
		try {
			if (cmd != null) {
				if (cmd.equalsIgnoreCase("exit")) {
					System.exit(0);
				}
				if (cmd.equalsIgnoreCase("Forums")) {
					openUpWebSite("www.zarpor.com");
				}	
			}
		} catch (Exception e) {
		}
	}
}