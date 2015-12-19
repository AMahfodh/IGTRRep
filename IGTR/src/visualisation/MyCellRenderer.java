package visualisation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

class PartialPathCellRenderer extends JLabel implements ListCellRenderer<Object> {
	public PartialPathCellRenderer() {
		setOpaque(true);
	}

	public Component getListCellRendererComponent(JList<?> list,
			Object value,
			int index,
			boolean isSelected,
			boolean cellHasFocus) {

		setText(value.toString());

		Color background;

		// check if this cell represents the current DnD drop location
		JList.DropLocation dropLocation = list.getDropLocation();
		if (dropLocation != null
				&& !dropLocation.isInsert()
				&& dropLocation.getIndex() == index) {

			background = Color.BLUE;


			// check if this cell is selected
		} else if (isSelected) {
			background = new Color(238, 232, 170);

			// unselected, and not the DnD drop location
		} else {
			background = Color.WHITE;
		};

		setBackground(background);
		setBorder(new LineBorder(new Color(189, 183, 107), 1, true));
		setFont(new Font("Tahoma", Font.PLAIN, 15));


		return this;
	}
}







class ObjectAttributeCellRenderer extends JLabel implements ListCellRenderer<Object> {
	public ObjectAttributeCellRenderer() {
		setOpaque(true);
	}

	public Component getListCellRendererComponent(JList<?> list,
			Object value,
			int index,
			boolean isSelected,
			boolean cellHasFocus) {

		String strValue = value.toString();
		boolean isMinimal = false;

		if (strValue.startsWith("true#")){
			isMinimal =true;
			strValue = strValue.substring(5);
		}
		else if (strValue.startsWith("false#")){
			strValue = strValue.substring(6);
		}


		setText(" " + strValue);
		if (isSelected) {

			// this cell is selected
			setBackground(new Color(238, 232, 170));

		} 
		else if (isMinimal){
			// this is a minimal rule
			setBackground(new Color(243, 245, 211));
		}
		else 
		{
			// this is a required contexts
			setBackground(Color.white);

		}

		setBorder(new LineBorder(new Color(189, 183, 107), 1, true));
		setFont(new Font("Tahoma", Font.PLAIN, 15));


		return this;
	}
}