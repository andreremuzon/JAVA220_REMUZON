package com.example.demineur;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.example.swing.FrameForDemoMaker;

public class Demineur extends FrameForDemoMaker {
	private static final int ROW_COUNT = 10;
	private static final int COLUMN_COUNT = 10;

	public Demineur() throws IOException {
		super("Mémoire");
		setDefaultBounds(100, 100, 900, 600);
	}

	@Override
	public void init(JFrame frame) {
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(ROW_COUNT, COLUMN_COUNT));
		for (int i = 0; i < ROW_COUNT; i++) {
			for (int j = 0; j < COLUMN_COUNT; j++) {
				ComposantCase composantCase = new ComposantCase();
				cp.add(composantCase);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Demineur example = new Demineur();
		SwingUtilities.invokeLater(example);
	}

}
