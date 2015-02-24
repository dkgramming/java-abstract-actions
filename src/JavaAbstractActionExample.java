import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class JavaAbstractActionExample extends JPanel {
	// our actions
	Action cutAction, copyAction, pasteAction;

	// our icons for the actions
	ImageIcon cutIcon, copyIcon, pasteIcon;

	public JavaAbstractActionExample() {
		super(new BorderLayout());
		createActions();
	}

	private void createActions() {
		// create our actions
		cutAction = CutAction.cutActionFactory();
		copyAction = CopyAction.copyActionFactory();
		pasteAction = PasteAction.pasteActionFactory();
	}

	/**
	 * Create a JMenuBar, populating it with our Actions.
	 */
	private JMenuBar createMenuBar() {
		// create the menubar
		JMenuBar menuBar = new JMenuBar();

		// create our main menu
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");

		// create our menu items, using the same actions the toolbar buttons use
		JMenuItem cutMenuItem = new JMenuItem(cutAction);
		JMenuItem copyMenuItem = new JMenuItem(copyAction);
		JMenuItem pasteMenuItem = new JMenuItem(pasteAction);

		// add the menu items to the Edit menu
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);

		// add the menus to the menubar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);

		return menuBar;
	}

	/**
	 * Create a JToolBar using our Actions.
	 */
	private JToolBar createToolBar() {
		// create our toolbar
		JToolBar toolBar = new JToolBar();

		// create our toolbar buttons, using the same actions the menuitems use
		JButton cutButton = new JButton(cutAction);
		JButton copyButton = new JButton(copyAction);
		JButton pasteButton = new JButton(pasteAction);

		// add our buttons to the toolbar
		toolBar.add(cutButton);
		toolBar.add(copyButton);
		toolBar.add(pasteButton);

		return toolBar;
	}

	private static void createAndShowGUI() {
		// create a simple jframe
		JFrame frame = new JFrame("Java AbstractAction Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// construct our panel, including our toolbar
		JavaAbstractActionExample panel = new JavaAbstractActionExample();
		panel.add(panel.createToolBar(), BorderLayout.PAGE_START);
		panel.setOpaque(true);
		frame.setContentPane(panel);

		// add the menubar to the jframe
		frame.setJMenuBar(panel.createMenuBar());

		// show the jframe
		frame.setPreferredSize(new Dimension(450, 300));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}