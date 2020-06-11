package Commande.Bottin;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * FicheCelRenderer
 * Permet d'afficher une fiche dans une JList
 * Tiré de docs.oracle.com
 * @author Vincent Lacasse
 *
 */
@SuppressWarnings("serial")
public class FicheCelRenderer extends JLabel implements ListCellRenderer<Fiche> {
	
	public Component getListCellRendererComponent(JList<? extends Fiche> list, Fiche value, int index,
			boolean isSelected, boolean cellHasFocus) {
		
		setText(value.getElementListe());
		if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
	}
}
