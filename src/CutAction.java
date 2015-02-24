import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Our "Cut" action.
 */
public class CutAction extends AbstractAction {
	public CutAction(String name, ImageIcon icon, String shortDescription,
			Integer mnemonic) {
		super(name, icon);
		putValue(SHORT_DESCRIPTION, shortDescription);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane
				.showMessageDialog(null, "Would have done the 'Cut' action.");
	}
	
	public static CutAction cutActionFactory() {
		return new CutAction("Cut", null, "Cut stuff onto the clipboard",
				new Integer(KeyEvent.VK_CUT));
	}
}