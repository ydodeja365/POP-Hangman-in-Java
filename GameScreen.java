/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yash
 */

public class GameScreen extends javax.swing.JFrame {
    class A implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
 //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
           int key = ke.getKeyCode();
        switch (key) {
            case KeyEvent.VK_Q:
                jButton1.doClick();
                break;
            case KeyEvent.VK_W:
                jButton4.doClick();
                break;
            case KeyEvent.VK_E:
                jButton2.doClick();
                break;
            case KeyEvent.VK_R:
                jButton3.doClick();
                break;
            case KeyEvent.VK_T:
                jButton8.doClick();
                break;
            case KeyEvent.VK_Y:
                jButton5.doClick();
                break;
            case KeyEvent.VK_U:
                jButton6.doClick();
                break;
            case KeyEvent.VK_I:
                jButton7.doClick();
                break;
            case KeyEvent.VK_O:
                jButton9.doClick();
                break;
            case KeyEvent.VK_P:
                jButton10.doClick();
                break;
            case KeyEvent.VK_A:
                jButton12.doClick();
                break;
            case KeyEvent.VK_S:
                jButton11.doClick();
                break;
            case KeyEvent.VK_D:
                jButton13.doClick();
                break;
            case KeyEvent.VK_F:
                jButton14.doClick();
                break;
            case KeyEvent.VK_G:
                jButton15.doClick();
                break;
            case KeyEvent.VK_H:
                jButton16.doClick();
                break;
            case KeyEvent.VK_J:
                jButton17.doClick();
                break;
            case KeyEvent.VK_K:
                jButton18.doClick();
                break;
            case KeyEvent.VK_L:
                jButton19.doClick();
                break;
            case KeyEvent.VK_Z:
                jButton20.doClick();
                break;
            case KeyEvent.VK_X:
                jButton21.doClick();
                break;
            case KeyEvent.VK_C:
                jButton23.doClick();
                break;
            case KeyEvent.VK_V:
                jButton22.doClick();
                break;
            case KeyEvent.VK_B:
                jButton24.doClick();
                break;
            case KeyEvent.VK_N:
                jButton25.doClick();
                break;
            case KeyEvent.VK_M:
                jButton26.doClick();
                break;
            default:
                break;
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    char[] w;int lives,counter=0,score,wordDone;
    String word;A key_in;
    //int initLives;
    /**
     * Creates new form GameScreen
     * @param wo
     * @param sc
     * @param l
     * @throws java.io.FileNotFoundException
     */

    public GameScreen(int wo,int sc,int l) throws FileNotFoundException, IOException {
        System.out.println("Score: "+sc);
        lives=l;
        initComponents();
        wordDone=wo;
        System.out.println("Round "+wordDone);
        score=sc;  
        jLabel3.setText("Score:"+score);
        //System.out.println(wordDone);
        ArrayList<String> list;
        //System.out.println(new File(".").getAbsoluteFile());
        try (BufferedReader bf = new BufferedReader(new FileReader("input.txt"))) {
            list = new ArrayList<>();
            String line;
            while((line=bf.readLine())!=null){
                list.add(line);
            }
        }
        Random r=new Random();
        word=list.get(r.nextInt(list.size()));
              w=word.toCharArray();
        String title="";
        //System.out.println(word);
        for(int i=0;i<w.length;i++)
        {
            if(w[i]==' ')
                title+="  ";
            else
                title+='_'+" ";
        }
        jLabel1.setText(title);
        jLabel2.setText(jLabel2.getText()+wordDone+": ");
        key_in=new A();
        setFocusable(true);
        addKeyListener(key_in);
        addKeyIn(key_in);
    }
        public void addKeyIn(KeyListener a)
    {
        jButton1.addKeyListener(a);
        jButton2.addKeyListener(a);
        jButton3.addKeyListener(a);
        jButton4.addKeyListener(a);
         jButton5.addKeyListener(a);
        jButton6.addKeyListener(a);
        jButton7.addKeyListener(a);
        jButton8.addKeyListener(a);
         jButton9.addKeyListener(a);
        jButton10.addKeyListener(a);
        jButton11.addKeyListener(a);
        jButton12.addKeyListener(a);
         jButton13.addKeyListener(a);
        jButton14.addKeyListener(a);
        jButton15.addKeyListener(a);
        jButton16.addKeyListener(a);
         jButton17.addKeyListener(a);
        jButton18.addKeyListener(a);
        jButton19.addKeyListener(a);
        jButton20.addKeyListener(a);
         jButton21.addKeyListener(a);
        jButton22.addKeyListener(a);
        jButton23.addKeyListener(a);
        jButton24.addKeyListener(a);
         jButton25.addKeyListener(a);
        jButton26.addKeyListener(a);
        jButton27.addKeyListener(a);
        jButton28.addKeyListener(a);
         jLabel1.addKeyListener(a);
        jLabel2.addKeyListener(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman Game");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton1.setText("q");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton2.setText("e");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton3.setText("r");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton4.setText("w");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton5.setText("y");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton6.setText("u");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton7.setText("i");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton8.setText("t");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton9.setText("o");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton10.setText("p");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton11.setText("s");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton12.setText("a");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton13.setText("d");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton14.setText("f");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton15.setText("g");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton16.setText("h");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton17.setText("j");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton18.setText("k");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton19.setText("l");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton20.setText("z");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton21.setText("x");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton22.setText("v");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton23.setText("c");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton24.setText("b");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton25.setText("n");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton26.setText("m");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("Go Back");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("Exit");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Here's your movie number ");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel3.setText("Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton27)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton4)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jButton12)
                                .addGap(26, 26, 26)
                                .addComponent(jButton11)
                                .addGap(27, 27, 27)
                                .addComponent(jButton13)
                                .addGap(26, 26, 26)
                                .addComponent(jButton14)
                                .addGap(30, 30, 30)
                                .addComponent(jButton15)
                                .addGap(28, 28, 28)
                                .addComponent(jButton16)
                                .addGap(26, 26, 26)
                                .addComponent(jButton17)
                                .addGap(26, 26, 26)
                                .addComponent(jButton18)
                                .addGap(29, 29, 29)
                                .addComponent(jButton19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jButton20)
                                .addGap(28, 28, 28)
                                .addComponent(jButton21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jButton23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton8)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButton22)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton24)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton25))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton26)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton9)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton10)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void replace(String buttonTitle){
    char[] existing=jLabel1.getText().toCharArray();
    String replaced="";
    int flag=0;
    for(int i=0;i<w.length;i++)
    {
        String x=Character.toString(w[i])+" ";
        String y=(Character.toString(existing[2*i])+Character.toString(existing[2*i+1]));
        if((x.equalsIgnoreCase(buttonTitle))){
            replaced+=x;flag=1;counter+=1;
        }
        else
            replaced+=y;
    }
    if(flag==1){
        
        //System.out.println(counter);
    jLabel1.setText(replaced);
    if(word.replaceAll("\\s+","").length()==counter){
       if(wordDone!=5){
           int x=JOptionPane.showConfirmDialog( null,"Word Guessed! Proceed to next word?","You Win!",JOptionPane.YES_NO_OPTION);
        if(x==0)
            {    try {
                System.out.println("Lives:"+lives);
                new GameScreen(wordDone+1,score+(lives)*4,5).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                 dispose();
            }
            else{
                score+=(lives)*4;
                MainScreen m=new MainScreen(true,score);
                m.setVisible(true);
                dispose();
            }
       }
       else{
           score+=lives*4;
            new ScoreScreen(score).setVisible(true);
            dispose();
        }
    }}
    else{
        lives-=1;
        if(lives==0)
        {
            try {
                jLabel1.setText(word);
                if(wordDone!=5){
                JOptionPane.showMessageDialog(this,"Your movie was "+word+"! Lives over...");
                new GameScreen(wordDone+1,score,5).setVisible(true);
                dispose();
                }
                else
                {
                    new ScoreScreen(score).setVisible(true);
                    dispose();
                }
            } catch (IOException ex) {
                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Wrong! You have "+(lives)+" attempts left...");
        }
        
   }
    //jLabel3.setText("Score:"+score);
    }
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
    MainScreen m=new MainScreen(true,score);
    m.setVisible(true);
    setVisible(false);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        int i=JOptionPane.showConfirmDialog(null, "Are you sure you want to Quit?", "Quit", JOptionPane.YES_NO_OPTION);
    if(i==JOptionPane.YES_OPTION)
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    replace(jButton1.getText()+" ");
    jButton1.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     replace(jButton4.getText()+" ");  
     jButton4.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         replace(jButton2.getText()+" ");  
     jButton2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        replace(jButton3.getText()+" ");  
     jButton3.setEnabled(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 replace(jButton8.getText()+" ");  
     jButton8.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 replace(jButton5.getText()+" ");  
     jButton5.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 replace(jButton6.getText()+" ");  
     jButton6.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 replace(jButton7.getText()+" ");  
     jButton7.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 replace(jButton9.getText()+" ");  
     jButton9.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 replace(jButton10.getText()+" ");  
     jButton10.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 replace(jButton12.getText()+" ");  
     jButton12.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 replace(jButton11.getText()+" ");  
     jButton11.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 replace(jButton13.getText()+" ");  
     jButton13.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
 replace(jButton14.getText()+" ");  
     jButton14.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
 replace(jButton15.getText()+" ");  
     jButton15.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
 replace(jButton16.getText()+" ");  
     jButton16.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
 replace(jButton17.getText()+" ");  
     jButton17.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
 replace(jButton18.getText()+" ");  
     jButton18.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
 replace(jButton19.getText()+" ");  
     jButton19.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
 replace(jButton20.getText()+" ");  
     jButton20.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
 replace(jButton21.getText()+" ");  
     jButton21.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
 replace(jButton23.getText()+" ");  
     jButton23.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
 replace(jButton22.getText()+" ");  
     jButton22.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
 replace(jButton24.getText()+" ");  
     jButton24.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
 replace(jButton25.getText()+" ");  
     jButton25.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
 replace(jButton26.getText()+" ");  
     jButton26.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed
/*
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            try {
//                new GameScreen(1,0).setVisible(true);
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
