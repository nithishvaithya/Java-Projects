import javax.swing.*;

public class TicTacToe {

    int boardWidth = 600;
    int boardHeight = 650; // extra 50px for the turns text

    JFrame frame = new JFrame();

    TicTacToe() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
    }

}
