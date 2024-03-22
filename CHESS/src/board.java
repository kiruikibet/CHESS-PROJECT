import java.awt.*;


import javax.swing.*;


public class board {
    JFrame b =new JFrame();
    JPanel squares [][] =new JPanel [8][8];
    board(){
        b.setTitle("GM KIRUI");
        b.setSize(600,600);
        b.setLayout(new GridLayout(8,8));
        b.setVisible(true);
        b.setResizable(false);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0;i<8;i++){
            for(int j=0;j <8;j++){
                squares[i][j]= new JPanel();
                if((i+j)%2==0){
                    squares[i][j]=new JPanel();
                    squares[i][j].setBackground(Color.BLUE);

                }
               else squares[i][j].setBackground(Color.WHITE);
               b.add(squares[i][j]);
            }

        }

       
          

    }


    
}
