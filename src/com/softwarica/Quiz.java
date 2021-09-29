
package com.softwarica;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener{

    JButton next,submit,quit;
    public static int count = 0;
    public static int timer= 20;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno,question;
    JRadioButton opt1, opt2, opt3, opt4;
    String q[][] = new String[10][5];
    String pa[][] = new String [10][1];
    String qa[][] = new String [10][2];
    String username;
    ButtonGroup options;
    JFrame frame;
    JPanel panel;
    public Quiz(String username){
        frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        this.username = username;
        frame.setBounds(250,50,1200, 800);
        panel.setBounds(0,0,1200, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //quiz image
        ImageIcon i1 = new ImageIcon("src/images/quiz.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1200,500 );
        panel.add(l1);

        //questions
        qno = new JLabel("");
        qno.setFont(new Font("Tahome",Font.PLAIN,24));
        qno.setBounds(100,450,40,30);
        panel.add(qno);

        question = new JLabel("What is your name?");
        question.setFont(new Font("Tahome",Font.PLAIN,24));
        question.setBounds(120,450,700,30);
        panel.add(question);

        //questions
        q[0][0] = "Which University is Softwarica partnered with?";
        q[0][1] = "Coventry University";
        q[0][2] = "London Metro University";
        q[0][3] = "Tribhuvan University";
        q[0][4] = "Harvard University";

        q[1][0] = "What is the name of Softwarica's chairman?";
        q[1][1] = "Samyam Katwal";
        q[1][2] = "Bigyan Shrestha";
        q[1][3] = "Mahabir Pun";
        q[1][4] = "Elon Musk";

        q[2][0] = "How many Courses are there in Softwarica?";
        q[2][1] = "1";
        q[2][2] = "2";
        q[2][3] = "3";
        q[2][4] = "4";

        q[3][0] = "Where is Softwarica located?";
        q[3][1] = "DilliBazar";
        q[3][2] = "Banepa";
        q[3][3] = "Jhapa";
        q[3][4] = "Chabel";

        q[4][0] = "How many canteens are there in Softwarica?";
        q[4][1] = "1";
        q[4][2] = "2";
        q[4][3] = "3";
        q[4][4] = "0";

        q[5][0] = "How long are the courses?";
        q[5][1] = "2 years";
        q[5][2] = "3 years";
        q[5][3] = "5 years";
        q[5][4] = "7 years";

        q[6][0] = "How many modules are there in the course?";
        q[6][1] = "40";
        q[6][2] = "81";
        q[6][3] = "63";
        q[6][4] = "47";

        q[7][0] = "What is the total credits of all modules?";
        q[7][1] = "180";
        q[7][2] = "90";
        q[7][3] = "360";
        q[7][4] = "720";

        q[8][0] = "Who teaches Programming and Algorithms?";
        q[8][1] = "Manoj Shrestha";
        q[8][2] = "Bikash Ghimirey";
        q[8][3] = "Shyam Sundar Khatiwada";
        q[8][4] = "Palisha Bajracharya";

        q[9][0] = "Which of the following is taught at first semester in Softwarica?";
        q[9][1] = "Object Oriented Programming";
        q[9][2] = "Mathematics for Computer Science";
        q[9][3] = "Database System";
        q[9][4] = "Software design";

        qa[0][1] = "Coventry University";
        qa[1][1] = "Bigyan Shrestha";
        qa[2][1] = "2";
        qa[3][1] = "DilliBazar";
        qa[4][1] = "0";
        qa[5][1] = "3 years";
        qa[6][1] = "47";
        qa[7][1] = "360";
        qa[8][1] = "Shyam Sundar Khatiwada";
        qa[9][1] = "Mathematics for Computer Science";

        //options
        opt1 = new JRadioButton("");
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        opt1.setBackground(Color.WHITE);
        opt1.setBounds(170,500,700,30);
        panel.add(opt1);

        opt2 = new JRadioButton("");
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        opt2.setBackground(Color.WHITE);
        opt2.setBounds(170,550,700,30);
        panel.add(opt2);

        opt3 = new JRadioButton("");
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        opt3.setBackground(Color.WHITE);
        opt3.setBounds(170,600,700,30);
        panel.add(opt3);

        opt4 = new JRadioButton("");
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        opt4.setBackground(Color.WHITE);
        opt4.setBounds(170,650,700,30);
        panel.add(opt4);


        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);

        next = new JButton("Next");
        next.setFont(new Font("Tahoma",Font.PLAIN,20));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);

        next.setBounds(700,680,200,40);
        panel.add(next);


        //submit button
        submit = new JButton("Submit");
        submit.setEnabled(false);
        submit.setFont(new Font("Tahoma",Font.PLAIN,20));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(700,722,200,40);
        submit.addActionListener(this);
        panel.add(submit);

        quit = new JButton("Quit");
        quit.setFont(new Font("Tahoma",Font.PLAIN,20));
        quit.setBackground(new Color(30,144,255));
        quit.setForeground(Color.WHITE);
        quit.setBounds(905,722,200,40);
        quit.addActionListener(this);
        panel.add(quit);

        start(0);
        frame.setLayout(null);
        panel.setLayout(null);
        frame.setVisible(true);
    }//buttons

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            ans_given = 1;
            if(options.getSelection() == null){

                pa[count][0] = "";


            }else{

                pa[count][0]= options.getSelection().getActionCommand();

            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            if(options.getSelection() == null){

                pa[count][0] = "";


            }else{

                pa[count][0]= options.getSelection().getActionCommand();

            }
            for(int i = 0; i <pa.length; i++){
                if(pa[i][0].equals(qa[i][1])){

                    score += 10;



                }else{

                    score += 0;
                }

            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);


        }else if(ae.getSource() == quit){

            System.exit(0);

        }



    }

    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left -" + timer;
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));



        if(timer > 0){
            g.drawString(time, 1000,500);

        }else{

            g.drawString("Times UP!!",1000,500);
        }

        timer--;



        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){ }

        if(ans_given == 1){
            ans_given = 0;
            timer = 20;
        }

        if(timer < 0){
            timer = 15;

            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){

                    pa[count][0] = "";


                }else{

                    pa[count][0]= options.getSelection().getActionCommand();

                }
                for(int i = 0; i <pa.length; i++){
                    if(pa[i][0].equals(qa[i][1])){

                        score += 10;



                    }else{

                        score += 0;
                    }

                }
                this.setVisible(false);
                new Score(username,score).setVisible(true);
            }else{
                if(options.getSelection() == null){

                    pa[count][0] = "";


                }else{

                    pa[count][0]= options.getSelection().getActionCommand();

                }
                count++;
                start(count);
            }
        }

    }
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();



    }
    public static void main(String[] args){

        new Quiz("").setVisible(true);
    }
}
