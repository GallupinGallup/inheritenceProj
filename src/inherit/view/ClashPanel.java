package inherit.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import inherit.controller.InheritController;

import java.awt.Color;

import javax.swing.*;


public class ClashPanel extends JPanel
{
	private InheritController baseController;
	private SpringLayout baseLayout;
	private JButton archerButton;
	private JButton giantButton;
	private JButton goblinBarrelButton;
	private JButton miniDragonButton;
	private JButton barbariansButton;
	
	public ClashPanel()
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		archerButton = new JButton("Archer");
		
		
		giantButton = new JButton("Giant");
		
		
		goblinBarrelButton = new JButton("Goblin Barrel");
		
		
		miniDragonButton = new JButton("Mini Dragon");
		
		barbariansButton = new JButton("Barbarians");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(archerButton);
		this.add(giantButton);
		this.add(goblinBarrelButton);
		this.add(miniDragonButton);
		this.add(barbariansButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, archerButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, giantButton, 31, SpringLayout.SOUTH, archerButton);
		baseLayout.putConstraint(SpringLayout.WEST, giantButton, 0, SpringLayout.WEST, archerButton);
		baseLayout.putConstraint(SpringLayout.WEST, goblinBarrelButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, goblinBarrelButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, miniDragonButton, 29, SpringLayout.SOUTH, giantButton);
		baseLayout.putConstraint(SpringLayout.WEST, miniDragonButton, 0, SpringLayout.WEST, archerButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, barbariansButton, -261, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, archerButton, 34, SpringLayout.SOUTH, barbariansButton);
		baseLayout.putConstraint(SpringLayout.WEST, barbariansButton, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
		
	}
}