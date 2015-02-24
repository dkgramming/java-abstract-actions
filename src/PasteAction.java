import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Our "Paste" action.
 */
public class PasteAction extends AbstractAction {
	public PasteAction(String name, ImageIcon icon, String shortDescription,
			Integer mnemonic) {
		super(name, icon);
		putValue(SHORT_DESCRIPTION, shortDescription);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,
				"Would have done the 'Paste' action.");
	}

	public static PasteAction pasteActionFactory() {
		return new PasteAction("Paste", null,
				"Paste whatever is on the clipboard", new Integer(
						KeyEvent.VK_PASTE));
	}
}