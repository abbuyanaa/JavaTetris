package BieDaalt;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tetris_main extends JFrame {

	private JLabel statusbar;

	public Tetris_main() {
		initUI();
	}

	private void initUI() {

		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.NORTH);
		Board board = new Board(this);
		add(board);
		board.start();

		setSize(200, 400);
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public JLabel getStatusBar() {
		return statusbar;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				Tetris_main game = new Tetris_main();
				game.setVisible(true);
			}
		});
	}
}