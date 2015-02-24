import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Our "Copy" action.
 */
public class CopyAction extends AbstractAction {
	public CopyAction(String name, ImageIcon icon, String shortDescription,
			Integer mnemonic) {
		super(name, icon);
		putValue(SHORT_DESCRIPTION, shortDescription);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,
				"Would have done the 'Copy' action.");
	}

	public static CopyAction copyActionFactory() {
		return new CopyAction("Copy", null, "Copy stuff to the clipboard",
				new Integer(KeyEvent.VK_COPY));
	}
}