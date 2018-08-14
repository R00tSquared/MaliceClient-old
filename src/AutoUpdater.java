import java.net.URL;
import java.net.URLConnection;
import java.io.*;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * @author Requiem-Reborn
 *
 ***/

public class AutoUpdater implements Runnable {

	public static final String FILEEXE_URL = "https://www.zarpor.com/Zarpor%20Client.exe";
	public static final String FILEJAR_URL = "https://www.zarpor.com/ZarporClient.jar";
	public static final String VERSION_URL = "https://www.zarpor.com/client.version";

	private AutoUpdater.GUI g;

	public static String getNewestVersion() {
		try {
			URLConnection conn = new URL(VERSION_URL).openConnection();
			conn.setConnectTimeout(1500);
			conn.setReadTimeout(1500);
			// URL tmp = new URL(VERSION_URL);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			return br.readLine();
		} catch (Exception e) {
			alert("Connection Error",
					"Failed to connect to site, client will continue to load.",
					true);
			// handleException(e);
			return "";
		}
	}

	private void handleException(Exception e) {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("Please screenshot this message, and send it to an administrator!\r\n\r\n");
		strBuff.append(e.getClass().getName() + " \"" + e.getMessage()
				+ "\"\r\n");
		for (StackTraceElement s : e.getStackTrace())
			strBuff.append(s.toString() + "\r\n");
		alert("Exception [" + e.getClass().getSimpleName() + "]",
				strBuff.toString(), true);
	}

	private boolean alert(String msg) {
		return alert("Message", msg, false);
	}

	private static boolean alert(String title, String msg, boolean error) {
		return JOptionPane.showOptionDialog(null, msg, title,
				JOptionPane.OK_CANCEL_OPTION, error ? JOptionPane.ERROR_MESSAGE
						: JOptionPane.PLAIN_MESSAGE, null, null, null) == JOptionPane.OK_OPTION;
	}

	@Override
	public void run() {
		try {
			int newest = Integer.parseInt(getNewestVersion().replaceAll("\\.",
					""));
			int current = Integer.parseInt(Configuration.version.replaceAll(
					"\\.", ""));
			int retval = Integer.compare(newest, current);
			if (retval > 0) {
				String newVersion = Integer.toString(newest);
				String finalVersion = newVersion.substring(0, 1) + "."
						+ newVersion.substring(1, 2) + "."
						+ newVersion.substring(2);
				int n = JOptionPane.showConfirmDialog(null,
						"You are currently on version " + Configuration.version
								+ " of the client\r\n"
								+ "The newest version is " + finalVersion
								+ " would you like to update?",
						"Update found!", JOptionPane.YES_NO_OPTION);
				if (n == 0) {
					g = new AutoUpdater.GUI();
					g.setLocationRelativeTo(null);
					g.setVisible(true);
					Boolean typeEXE = updateClientEXE();
					g.setVisible(false);
					if (alert("Zarpor Client has been updated; it will automatically restart now!")) {
						if (typeEXE)
							Runtime.getRuntime().exec("Zarpor Client.exe",
									null, new File("Zarpor Client.exe"));
						else
							Runtime.getRuntime().exec(
									"java -jar ZarporClient.jar");
					}
					System.exit(0);
				} else {
					alert("Please be aware that the client may not be able to connect!");
				}
			}
		} catch (Exception e) {
			// handleException(e);
		}
	}

	private boolean updateClientEXE() {
		if (new File("Zarpor Client.exe").exists()) {
			downloadClient();
			return true;
		} else {
			downloadClientJar();
			return false;
		}
	}

	private File downloadClient() {
		g.setStatus("Downloading...");
		File ret = new File("Zarpor Client.exe");
		try {
			OutputStream out = new FileOutputStream(ret);
			URLConnection conn = new URL(FILEEXE_URL).openConnection();
			InputStream in = conn.getInputStream();
			long max = conn.getContentLength();
			long curr = 0;
			byte[] b = new byte[1024];
			int len;
			while ((len = in.read(b, 0, b.length)) > -1) {
				out.write(b, 0, len);
				curr += len;
				g.setPercent((int) ((curr * 100) / max));
			}
			out.flush();
			out.close();
			in.close();
			return ret;
		} catch (Exception e) {
			handleException(e);
			ret.delete();
			return null;
		}
	}

	private File downloadClientJar() {
		g.setStatus("Downloading...");
		File ret = new File("ZarporClient.jar");
		try {
			OutputStream out = new FileOutputStream(ret);
			URLConnection conn = new URL(FILEJAR_URL).openConnection();
			InputStream in = conn.getInputStream();
			long max = conn.getContentLength();
			long curr = 0;
			byte[] b = new byte[1024];
			int len;
			while ((len = in.read(b, 0, b.length)) > -1) {
				out.write(b, 0, len);
				curr += len;
				g.setPercent((int) ((curr * 100) / max));
			}
			out.flush();
			out.close();
			in.close();
			return ret;
		} catch (Exception e) {
			handleException(e);
			ret.delete();
			return null;
		}
	}

	public class GUI extends javax.swing.JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/** Creates new form GUI */
		public GUI() {
			try {
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
			} catch (Exception ignored) {
			}
			initComponents();
		}

		/**
		 * This method is called from within the constructor to initialize the
		 * form. WARNING: Do NOT modify this code. The content of this method is
		 * always regenerated by the Form Editor.
		 */
		private void initComponents() {

			jProgressBar1 = new javax.swing.JProgressBar();
			jLabel1 = new javax.swing.JLabel();
			jLabel2 = new javax.swing.JLabel();
			jLabel3 = new javax.swing.JLabel();

			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			setTitle("Auto-Updater");
			addWindowListener(new java.awt.event.WindowAdapter() {
				public void windowClosing(java.awt.event.WindowEvent evt) {
					formWindowClosing(evt);
				}
			});

			jLabel1.setText("Status:");

			jLabel2.setText("N/A");

			jLabel3.setText("0%");

			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
					getContentPane());
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(
							layout.createSequentialGroup()
									.addContainerGap()
									.addGroup(
											layout.createParallelGroup(
													javax.swing.GroupLayout.Alignment.LEADING)
													.addGroup(
															layout.createSequentialGroup()
																	.addComponent(
																			jLabel1)
																	.addPreferredGap(
																			javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																	.addComponent(
																			jLabel2)
																	.addPreferredGap(
																			javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																			304,
																			Short.MAX_VALUE)
																	.addComponent(
																			jLabel3))
													.addComponent(
															jProgressBar1,
															javax.swing.GroupLayout.Alignment.TRAILING,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															380,
															Short.MAX_VALUE))
									.addContainerGap()));
			layout.setVerticalGroup(layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(
							layout.createSequentialGroup()
									.addContainerGap()
									.addGroup(
											layout.createParallelGroup(
													javax.swing.GroupLayout.Alignment.LEADING,
													false)
													.addGroup(
															layout.createParallelGroup(
																	javax.swing.GroupLayout.Alignment.BASELINE)
																	.addComponent(
																			jLabel2,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			Short.MAX_VALUE)
																	.addComponent(
																			jLabel3))
													.addComponent(
															jLabel1,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															Short.MAX_VALUE))
									.addPreferredGap(
											javax.swing.LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(
											jProgressBar1,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											30,
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(
											javax.swing.GroupLayout.DEFAULT_SIZE,
											Short.MAX_VALUE)));

			pack();
		}// </editor-fold>//GEN-END:initComponents

		private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

		}// GEN-LAST:event_formWindowClosing

		private int percent = 0;

		public void setStatus(String s) {
			jLabel2.setText(s);
		}

		public String getStatus() {
			return jLabel2.getText();
		}

		public void setPercent(int amount) {
			percent = amount;
			jLabel3.setText(amount + "%");
			jProgressBar1.setValue(amount);
		}

		public int getPercent() {
			return percent;
		}

		// Variables declaration - do not modify//GEN-BEGIN:variables
		private javax.swing.JLabel jLabel1;
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel jLabel3;
		private javax.swing.JProgressBar jProgressBar1;
		// End of variables declaration//GEN-END:variables

	}

}