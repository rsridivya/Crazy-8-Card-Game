/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.util.ArrayList;
import java.util.Random;

public class FourPlayers extends javax.swing.JFrame {

     Deck d = new Deck();
       
    int z=0;
    int i=0;
    int sp=0;
    int hv=0;
    int av=0;
    String name="";
    String hs="";
    String as="";
    int mValue=0;
    String mSuit="";
    int pValue=0;
    String pSuit="";
    int ai=4;
    int temp=0;
    int temp2=0;
    String temp3="";
    String temp1="";
    int humanScore=0;
    int aiScore1=0;
    int aiScore2=0;
    int aiScore3=0;
    int flag=0;
    ArrayList<Integer> bt = new ArrayList<Integer>();
     
    int[] humanValue = new int[125];
    String[] humanSuit = new String[125];
    // AI Player 1
    int[] aiValue1 = new int[125];
    String[] aiSuit1 = new String[125];
    //AI Player 2
    int[] aiValue2 = new int[125];
    String[] aiSuit2 = new String[125];
    //AI Player 3
    int[] aiValue3 = new int[125];
    String[] aiSuit3 = new String[125];
    public FourPlayers() {
      
    }
    
    public FourPlayers(String playerName){
        bt.add(5);
        bt.add(6);
        bt.add(7);
        bt.add(8);
        bt.add(9);
        bt.add(10);
        bt.add(11);
        bt.add(12);
      
        //Initializing the values and suits
        for(int a=0;a<125;a++)
        {
            humanValue[a]=-1;
            humanSuit[a]="empty";
        }
        //AI Player 1
        for(int a=0;a<125;a++)
        {
            aiValue1[a]=-1;
            aiSuit1[a]="empty";
        }
        //AI Player 2
        for(int a=0;a<125;a++)
        {
            aiValue2[a]=-1;
            aiSuit2[a]="empty";
        }
         //AI Player 3
        for(int a=0;a<125;a++)
        {
            aiValue3[a]=-1;
            aiSuit3[a]="empty";
        }
        
        initComponents();
        jLabel3.setText(playerName);
        name=jLabel3.getText();
        //error label if player drops wrong card
        jLabel12.setVisible(false);
      
        d.shuffle();
        
        jButton6.setVisible(false);
        jButton5.setVisible(false);
        jButton4.setVisible(false);
        jButton15.setVisible(false);
        jButton14.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
     
     
        //distributing cards to the human player
        Card c1 = d.deck.get(i);
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c1.getImage())));
        i++;        
        
        Card c2 = d.deck.get(i);
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c2.getImage())));
        i++;
        
        Card c3 = d.deck.get(i);
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c3.getImage())));
        i++;
        
        Card c4 = d.deck.get(i);
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c4.getImage())));
        i++;
   
      //Storing human values
      humanValue[0]=c1.getValue();
      humanValue[1]=c2.getValue();
      humanValue[2]=c3.getValue();
      humanValue[3]=c4.getValue();
   
      //Stroring human suit
      humanSuit[0]=c1.getSuit();
      humanSuit[1]=c2.getSuit();
      humanSuit[2]=c3.getSuit();
      humanSuit[3]=c4.getSuit();
        
     //Distributing cards to the AI player1
      Card c13 = d.deck.get(i);
      i++;
      Card c14 = d.deck.get(i);
      i++;
      Card c15 = d.deck.get(i);
      i++;
      Card c16 = d.deck.get(i);
      i++;
   
      //Storing ai values
      
      aiValue1[0]=c13.getValue();
      aiValue1[1]=c14.getValue();
      aiValue1[2]=c15.getValue();
      aiValue1[3]=c16.getValue();
    
      //Stroring ai suit
      aiSuit1[0]=c13.getSuit();
      aiSuit1[1]=c14.getSuit();
      aiSuit1[2]=c15.getSuit();
      aiSuit1[3]=c16.getSuit();
      
      //Distributing cards to the AI player2
      Card c80 = d.deck.get(i);
      i++;
      Card c81 = d.deck.get(i);
      i++;
      Card c82 = d.deck.get(i);
      i++;
      Card c83 = d.deck.get(i);
      i++;
   
      //Storing ai values
      
      aiValue2[0]=c80.getValue();
      aiValue2[1]=c81.getValue();
      aiValue2[2]=c82.getValue();
      aiValue2[3]=c83.getValue();
    
      //Stroring ai suit
      aiSuit2[0]=c80.getSuit();
      aiSuit2[1]=c81.getSuit();
      aiSuit2[2]=c82.getSuit();
      aiSuit2[3]=c83.getSuit();
    
      //Distributing cards to the AI player3
      Card c90 = d.deck.get(i);
      i++;
      Card c91 = d.deck.get(i);
      i++;
      Card c92 = d.deck.get(i);
      i++;
      Card c93 = d.deck.get(i);
      i++;
   
      //Storing ai3 values
      
      aiValue3[0]=c90.getValue();
      aiValue3[1]=c91.getValue();
      aiValue3[2]=c92.getValue();
      aiValue3[3]=c93.getValue();
    
      //Stroring ai3 suit
      aiSuit3[0]=c90.getSuit();
      aiSuit3[1]=c91.getSuit();
      aiSuit3[2]=c92.getSuit();
      aiSuit3[3]=c93.getSuit();
    
      //initial middle card
       Card c20 = d.deck.get(i);
       jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c20.getImage())));
       i++;
     // Initial middle card value and suit
        mValue=c20.getValue();
        System.out.println("MiddleValue:"+mValue);
        mSuit=c20.getSuit();
    }
    //AI Player 1
    public void aiDrop1()
    {   
        int drop1=0;
        int b=0;
        for(b=0; b<125; b++)
        {            
            if(mValue==aiValue1[b] || mSuit==aiSuit1[b])
            {
                    if(aiSuit1[b]=="Spades")
                        sp=0;
                    else if(aiSuit1[b]=="Diamonds")
                        sp=1;
                    else if(aiSuit1[b]=="Hearts")
                        sp=2;
                    else if(aiSuit1[b]=="Clubs")
                        sp=3;
                    System.out.println("ai: 1111 "+(aiValue1[b]));
                    System.out.println("ai: 1111 "+sp);
                   // v=aiValue[b];
                    Card ac = new Card(sp,aiValue1[b]-1);
                    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + ac.getImage()))); // Middle Card
                    mValue=aiValue1[b];
                    mSuit=aiSuit1[b];
                    temp1=mSuit;
                    temp2=mValue;
                    aiValue1[b] = -1;
                    aiSuit1[b] = "empty";
                    
                    //checking if ai won
                    int check=0;
                    for(int c=0;c<125;c++)
                    {
                        if(aiValue1[c]==-1)
                        check++;
                    }
                    if(check==125)
                    {
                        for(int h=0;h<125;h++)
                        {
                            if(humanValue[h]>0)
                            {
                                humanScore=humanScore+humanValue[h];
                               
                            }
                            if(aiValue2[h]>0)
                            {
                                aiScore2=aiScore2+aiValue2[h];
                               
                            }
                            if(aiValue3[h]>0)
                            {
                                aiScore3=aiScore3+aiValue3[h];
                               
                            }
                        }
                        flag=1;
                        AIWinnerScreen111 awin111 = new AIWinnerScreen111(humanScore,aiScore2,aiScore3,name);
                        awin111.setVisible(true);
                        dispose();
                    }
                    drop1=1;
                    
                    break;
        }      }
            if(drop1==1)
            {
                
                if(temp2==8)
                {
                 System.out.println("***********************");   
                    Random rn = new Random();
                    int sPower = rn.nextInt(4);
                    System.out.println("sPower : "+sPower);   
                    
                    if(sPower==0)
                    {
                        mSuit="Spades";
                       
                    }
                    else if(sPower==1)
                    {
                        mSuit="Diamonds";
                     
                    }
                    else if(sPower==2)
                    {
                        mSuit="Hearts";
                     
                    }
                    else
                    {
                        mSuit="Clubs";
                     
                    }
                    mValue=100;
                }
               
                
            }
            else
            {
              
                Card c21 = d.deck.get(i);
                i++;
                aiValue1[ai]=c21.getValue();
                aiSuit1[ai]=c21.getSuit();
                ai++;
           
             System.out.println("pick v 1111:"+aiValue1[ai-1]);
             System.out.println("pick S 1111:"+aiSuit1[ai-1]);
             
             if(mValue==120)
             {
                 mValue=temp;
                 mSuit=temp3;
             }
             
        }
    }
    //AI Player 2
    public void aiDrop2()
    {   
        int drop1=0;
        int b=0;
        for(b=0; b<125; b++)
        {            
            if(mValue==aiValue2[b] || mSuit==aiSuit2[b])
            {
                    if(aiSuit2[b]=="Spades")
                        sp=0;
                    else if(aiSuit2[b]=="Diamonds")
                        sp=1;
                    else if(aiSuit2[b]=="Hearts")
                        sp=2;
                    else if(aiSuit2[b]=="Clubs")
                        sp=3;
                    System.out.println("ai222: "+(aiValue2[b]));
                    System.out.println("ai222: "+sp);
                   // v=aiValue[b];
                    Card ac = new Card(sp,aiValue2[b]-1);
                    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + ac.getImage()))); // Middle Card
                    mValue=aiValue2[b];
                    mSuit=aiSuit2[b];
                    temp1=mSuit;
                    temp2=mValue;
                    aiValue2[b] = -1;
                    aiSuit2[b] = "empty";
                    
                    //checking if ai won
                    int check=0;
                    for(int c=0;c<125;c++)
                    {
                        if(aiValue2[c]==-1)
                        check++;
                    }
                    if(check==125)
                    {
                        for(int h=0;h<125;h++)
                        {
                            if(humanValue[h]>0)
                            {
                                humanScore=humanScore+humanValue[h];
                            }
                            if(aiValue1[h]>0)
                            {
                                aiScore1=aiScore1+aiValue1[h];
                               
                            }
                            if(aiValue3[h]>0)
                            {
                                aiScore3=aiScore3+aiValue3[h];
                               
                            }
                        }
                        flag=2;
                        AIWinnerScreen222 awin222 = new AIWinnerScreen222(humanScore,aiScore1,aiScore3,name);
                        awin222.setVisible(true);
                        dispose();
                    }
                    drop1=1;
                    
                    break;
        }      }
            if(drop1==1)
            {
                
                if(temp2==8)
                {
                 System.out.println("***********************");   
                    Random rn = new Random();
                    int sPower = rn.nextInt(4);
                    System.out.println("sPower : "+sPower);   
                    
                    if(sPower==0)
                    {
                        mSuit="Spades";
                       
                    }
                    else if(sPower==1)
                    {
                        mSuit="Diamonds";
                       
                    }
                    else if(sPower==2)
                    {
                        mSuit="Hearts";
                       
                      
                    }
                    else
                    {
                        mSuit="Clubs";
                      
                    }
                    mValue=110;
                }
               
                
            }
            else
            {
              
                Card c21 = d.deck.get(i);
                i++;
                aiValue2[ai]=c21.getValue();
                aiSuit2[ai]=c21.getSuit();
                ai++;
           
             System.out.println("pick v 2222:"+aiValue2[ai-1]);
             System.out.println("pick S 2222:"+aiSuit2[ai-1]);
              if(mValue==100)
              {
                    mValue=temp2;
                    mSuit=temp1;
              }
        }
    }
    
    
    //AI Player 3
    public void aiDrop3()
    {   
        int drop1=0;
        int b=0;
        for(b=0; b<125; b++)
        {            
            if(mValue==aiValue3[b] || mSuit==aiSuit3[b])
            {
                    if(aiSuit3[b]=="Spades")
                        sp=0;
                    else if(aiSuit3[b]=="Diamonds")
                        sp=1;
                    else if(aiSuit3[b]=="Hearts")
                        sp=2;
                    else if(aiSuit3[b]=="Clubs")
                        sp=3;
                    System.out.println("ai333: "+(aiValue3[b]));
                    System.out.println("ai333: "+sp);
                    Card ac = new Card(sp,aiValue3[b]-1);
                    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + ac.getImage()))); // Middle Card
                    mValue=aiValue3[b];
                    mSuit=aiSuit3[b];
                    temp1=mSuit;
                    temp2=mValue;
                    aiValue3[b] = -1;
                    aiSuit3[b] = "empty";
                    
                    //checking if ai won
                    int check=0;
                    for(int c=0;c<125;c++)
                    {
                        if(aiValue3[c]==-1)
                        check++;
                    }
                    if(check==125)
                    {
                        for(int h=0;h<125;h++)
                        {
                            if(humanValue[h]>0)
                            {
                                humanScore=humanScore+humanValue[h];
                            }
                            if(aiValue1[h]>0)
                            {
                                aiScore1=aiScore1+aiValue1[h];
                               
                            }
                            if(aiValue2[h]>0)
                            {
                                aiScore2=aiScore2+aiValue2[h];
                               
                            }
                        }
                        flag=3;
                        AIWinnerScreen333 awin333 = new AIWinnerScreen333(humanScore,aiScore1,aiScore2,name);
                        awin333.setVisible(true);
                        dispose();
                    }
                    drop1=1;
                    
                    break;
        }      }
            if(drop1==1)
            {
                
                if(temp2==8)
                {
                 System.out.println("***********************");   
                    Random rn = new Random();
                    int sPower = rn.nextInt(4);
                    System.out.println("sPower : "+sPower);   
                    
                    if(sPower==0)
                    {
                        mSuit="Spades";
                        jLabel14.setVisible(true);
                        jLabel14.setText("Please drop "+mSuit+" card");
                    }
                    else if(sPower==1)
                    {
                        mSuit="Diamonds";
                        jLabel14.setVisible(true);
                        jLabel14.setText("Please drop "+mSuit+" card");
                    }
                    else if(sPower==2)
                    {
                        mSuit="Hearts";
                        jLabel14.setVisible(true);
                        jLabel14.setText("Please drop "+mSuit+" card");
                    }
                    else
                    {
                        mSuit="Clubs";
                        jLabel14.setVisible(true);
                        jLabel14.setText("Please drop "+mSuit+" card");
                    }
                    mValue=130;
                }
               
                
            }
            else
            {
              
                Card c21 = d.deck.get(i);
                i++;
                aiValue3[ai]=c21.getValue();
                aiSuit3[ai]=c21.getSuit();
                ai++;
           
             System.out.println("pick v 3333:"+aiValue3[ai-1]);
             System.out.println("pick S 3333:"+aiSuit3[ai-1]);
              if(mValue==110)
              {
                    mValue=temp2;
                    mSuit=temp1;
              }
        }
    }
    
    //checking if human won
    public void checkWinner()
    {
        int check=0;
        for(int b=0;b<125;b++)
        {
            if(humanValue[b]==-1)
               check++;
        }
        if(check==125)
        {
            for(int h=0;h<125;h++)
            {
                if(aiValue1[h]>0)
                {
                    aiScore1=aiScore1+aiValue1[h];
                }
                if(aiValue2[h]>0)
                {
                    aiScore2=aiScore2+aiValue2[h];
                }
                if(aiValue3[h]>0)
                {
                    aiScore3=aiScore3+aiValue3[h];
                }
            }
             flag=4;           
            WinnerScreen3 win3 = new WinnerScreen3(aiScore1,aiScore2,aiScore3,name);
            win3.setVisible(true);
            dispose();
        }
    }
    public void dropCard(int button)
    {
       
      // System.out.println("pValue: "+pValue);
        jLabel14.setVisible(false);
        //present values
        hv=humanValue[button-1];
        hs=humanSuit[button-1];
           
       if(hs=="Spades")
           sp=0;
       else if(hs=="Diamonds")
           sp=1;
       else if(hs=="Hearts")
           sp=2;
       else if(hs=="Clubs")
           sp=3;
    
        Card dc = new Card(sp,hv-1);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + dc.getImage()))); // Middle Card
        humanValue[button-1]=-1;
        humanSuit[button-1]="empty";
        checkWinner();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("AI Player 1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 170, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 490, 140, 30);

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(550, 360, 70, 100);

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(520, 360, 70, 100);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(490, 360, 70, 100);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(460, 360, 70, 100);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(430, 360, 70, 100);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(400, 360, 70, 100);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(370, 360, 70, 100);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(340, 360, 70, 100);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(310, 360, 70, 100);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(280, 360, 70, 100);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(250, 360, 70, 100);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(220, 360, 70, 100);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 220, 70, 100);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Instructions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(700, 20, 150, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(410, 220, 70, 100);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 20, 80, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Please Drop the correct Card");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(370, 330, 180, 20);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/S.PNG"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(510, 170, 40, 30);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/D.PNG"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(560, 170, 40, 30);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H.PNG"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(610, 170, 40, 30);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C.PNG"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(660, 170, 40, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Super Power!!!! Nominate a suit ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(510, 140, 210, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(280, 170, 200, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 200, 100, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel10.setText("jLabel9");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 230, 100, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel11.setText("jLabel9");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 260, 100, 70);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel15.setText("jLabel9");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 290, 100, 70);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel17.setText("jLabel9");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(800, 200, 100, 70);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel18.setText("jLabel9");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(800, 230, 100, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel19.setText("jLabel9");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(800, 260, 100, 70);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fh.png"))); // NOI18N
        jLabel20.setText("jLabel9");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(800, 290, 100, 70);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("AI Player 3");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(820, 170, 100, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 40, 70, 90);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 40, 70, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 40, 70, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 40, 70, 90);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("AI Player 2");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(350, 10, 90, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/game screen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Deck
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(mValue==130)
        {
            mValue=temp2;
            mSuit=temp1;
        }
        if(bt.isEmpty())
        {
            jLabel12.setVisible(false);
            jLabel14.setVisible(false);
            if(!(jButton13.isVisible()))
            {
                jButton13.setVisible(true);
                Card c1 = d.deck.get(i);
                i++;
                humanValue[0]=c1.getValue();
                humanSuit[0]=c1.getSuit();
                jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c1.getImage())));
                              
            }
            else if(!(jButton12.isVisible()))
            {
                jButton12.setVisible(true);
                Card c2 = d.deck.get(i);
                i++;
                humanValue[1]=c2.getValue();
                humanSuit[1]=c2.getSuit();
                jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c2.getImage())));
                       
            }
            else if(!(jButton11.isVisible()))
            {
                jButton11.setVisible(true);
                Card c3 = d.deck.get(i);
                i++;
                humanValue[2]=c3.getValue();
                humanSuit[2]=c3.getSuit();
                jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c3.getImage())));
                       
            }
            else if(!(jButton10.isVisible()))
            {
                jButton10.setVisible(true);
                Card c4 = d.deck.get(i);
                i++;
                humanValue[3]=c4.getValue();
                humanSuit[3]=c4.getSuit();
                jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c4.getImage())));
                       
            }
            else if(!(jButton9.isVisible()))
            {
                jButton9.setVisible(true);
                Card c5 = d.deck.get(i);
                i++;
                humanValue[4]=c5.getValue();
                humanSuit[4]=c5.getSuit();
                jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c5.getImage())));
                       
            }
            else if(!(jButton8.isVisible()))
            {
                jButton8.setVisible(true);
                Card c6 = d.deck.get(i);
                i++;
                humanValue[5]=c6.getValue();
                humanSuit[5]=c6.getSuit();
                jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c6.getImage())));
                       
            }
            else if(!(jButton7.isVisible()))
            {
                jButton7.setVisible(true);
                Card c7 = d.deck.get(i);
                i++;
                humanValue[6]=c7.getValue();
                humanSuit[6]=c7.getSuit();
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c7.getImage())));
                       
            }
            else if(!(jButton6.isVisible()))
            {
                jButton6.setVisible(true);
                Card c8 = d.deck.get(i);
                i++;
                humanValue[7]=c8.getValue();
                humanSuit[7]=c8.getSuit();
                jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c8.getImage())));
                       
            }
            else if(!(jButton5.isVisible()))
            {
                jButton5.setVisible(true);
                Card c9 = d.deck.get(i);
                i++;
                humanValue[8]=c9.getValue();
                humanSuit[8]=c9.getSuit();
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c9.getImage())));
                       
            }
            else if(!(jButton4.isVisible()))
            {
                jButton4.setVisible(true);
                Card c10 = d.deck.get(i);
                i++;
                humanValue[9]=c10.getValue();
                humanSuit[9]=c10.getSuit();
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c10.getImage())));
                       
            }
            else if(!(jButton15.isVisible()))
            {
                jButton15.setVisible(true);
                Card c11 = d.deck.get(i);
                i++;
                humanValue[10]=c11.getValue();
                humanSuit[10]=c11.getSuit();
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c11.getImage())));
                       
            }
            else if(!(jButton14.isVisible()))
            {
                jButton14.setVisible(true);
                Card c12 = d.deck.get(i);
                i++;
                humanValue[11]=c12.getValue();
                humanSuit[11]=c12.getSuit();
                jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c12.getImage())));
                       
            }
        }
        else
        {
        if(bt.get(0)==5)
        {
            jButton9.setVisible(true);
            Card c5 = d.deck.get(i);
            i++;
            humanValue[4]=c5.getValue();
            humanSuit[4]=c5.getSuit();
         //   mSuit=c8.getSuit();
         //   mValue=c8.getValue();
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c5.getImage())));
            bt.remove(0);
        }
        
        else if(bt.get(0)==6)
        {
            jButton8.setVisible(true);
            Card c6 = d.deck.get(i);
            i++;
            humanValue[5]=c6.getValue();
            humanSuit[5]=c6.getSuit();
         //   mSuit=c8.getSuit();
         //   mValue=c8.getValue();
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c6.getImage())));
            bt.remove(0);
        }
        
        else if(bt.get(0)==7)
        {
            jButton7.setVisible(true);
            Card c7 = d.deck.get(i);
            i++;
            humanValue[6]=c7.getValue();
            humanSuit[6]=c7.getSuit();
         //   mSuit=c8.getSuit();
         //   mValue=c8.getValue();
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c7.getImage())));
            bt.remove(0);
        }
        
        else if(bt.get(0)==8)
        {
            jButton6.setVisible(true);
            Card c8 = d.deck.get(i);
            i++;
            humanValue[7]=c8.getValue();
            humanSuit[7]=c8.getSuit();
         //   mSuit=c8.getSuit();
         //   mValue=c8.getValue();
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c8.getImage())));
            bt.remove(0);
        }
        else if(bt.get(0)==9)
        {
            jButton5.setVisible(true);
            Card c9 = d.deck.get(i);
            i++;
            humanValue[8]=c9.getValue();
            humanSuit[8]=c9.getSuit();
          //  mSuit=c9.getSuit();
          //  mValue=c9.getValue();
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c9.getImage())));
            bt.remove(0);
        }
        else if(bt.get(0)==10)
        {
            jButton4.setVisible(true);
            Card c10 = d.deck.get(i);
            i++;
            humanValue[9]=c10.getValue();
            humanSuit[9]=c10.getSuit();
        //    mSuit=c10.getSuit();
        //    mValue=c10.getValue();
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c10.getImage())));
            bt.remove(0);
        }
        else if(bt.get(0)==11)
        {
            jButton15.setVisible(true);
            Card c11 = d.deck.get(i);
            i++;
            humanValue[10]=c11.getValue();
            humanSuit[10]=c11.getSuit();
        //    mSuit=c11.getSuit();
        //    mValue=c11.getValue();
            jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c11.getImage())));
            bt.remove(0);
        }
        else if(bt.get(0)==12)
        {
            jButton14.setVisible(true);
            Card c12 = d.deck.get(i);
            i++;
            humanValue[11]=c12.getValue();
            humanSuit[11]=c12.getSuit();
        //    mSuit=c12.getSuit();
        //    mValue=c12.getValue();
            jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c12.getImage())));
            bt.remove(0);
        }}
       aiDrop1(); 
       aiDrop2();
       aiDrop3();
    }//GEN-LAST:event_jButton2ActionPerformed
    // Quit Button 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          MainScreen main = new MainScreen();
          main.setVisible(true);
          
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void superPower()
    {
        mValue=pValue;
           mSuit=pSuit;
           temp3=mSuit;
     
              jButton16.setVisible(true);
              jButton17.setVisible(true);
              jButton18.setVisible(true);
              jButton19.setVisible(true);
              jLabel13.setVisible(true); 
        
    }

// First Card
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        // TODO add your handling code here:
       // System.out.println("mValue: "+mValue);
       jLabel12.setVisible(false);
       pValue=humanValue[0];
       pSuit=humanSuit[0];
       if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
       if(pValue==8)
       {
           dropCard(1);
           superPower();           
           jButton13.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {    
           mValue=pValue;
           mSuit=pSuit;
           dropCard(1);
           jButton13.setVisible(false); 
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
                 
        
    }//GEN-LAST:event_jButton13ActionPerformed
    // Instructions Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GameInstructions gameins = new GameInstructions();
        gameins.setVisible(true);
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        //System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[11];
       pSuit=humanSuit[11];
       if(pValue==8)
       {
           dropCard(12);
           superPower();           
           jButton14.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(12);
           jButton14.setVisible(false);   
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
      
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        //System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[2];
       pSuit=humanSuit[2];
       if(pValue==8)
       {
           dropCard(3);
           superPower();           
           jButton11.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(3);
           jButton11.setVisible(false); 
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
        
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        //System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
       jLabel12.setVisible(false);
       pValue=humanValue[1];
       pSuit=humanSuit[1];
       if(pValue==8)
       {
           dropCard(2);
           superPower();           
           jButton12.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
            mValue=pValue;
            mSuit=pSuit;
            dropCard(2);
            jButton12.setVisible(false);
            if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
       // System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[3];
       pSuit=humanSuit[3];
       if(pValue==8)
       {
           dropCard(4);
           superPower();           
           jButton10.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(4);
           jButton10.setVisible(false);  
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       // System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[4];
       pSuit=humanSuit[4];
       if(pValue==8)
       {
           dropCard(5);
           superPower();           
           jButton9.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(5);
           jButton9.setVisible(false);     
          if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
       // System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[5];
       pSuit=humanSuit[5];
       if(pValue==8)
       {
           dropCard(6);
           superPower();           
           jButton8.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(6);
           jButton8.setVisible(false);     
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       // System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[6];
       pSuit=humanSuit[6];
       if(pValue==8)
       {
           dropCard(7);
           superPower();           
           jButton7.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(7);
           jButton7.setVisible(false);     
          if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[7];
       pSuit=humanSuit[7];
       if(pValue==8)
       {
           dropCard(8);
           superPower();           
           jButton6.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(8);
           jButton6.setVisible(false);   
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[8];
       pSuit=humanSuit[8];
       if(pValue==8)
       {
           dropCard(9);
           superPower();           
           jButton5.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(9);
           jButton5.setVisible(false);  
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       // System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[9];
       pSuit=humanSuit[9];
       if(pValue==8)
       {
           dropCard(10);
           superPower();           
           jButton4.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(10);
           jButton4.setVisible(false);       
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        //System.out.println("mValue: "+mValue);
        if(mValue==120)
        {
            mValue=temp;
            mSuit=temp3;
        }
         jLabel12.setVisible(false);
       pValue=humanValue[10];
       pSuit=humanSuit[10];
       if(pValue==8)
       {
           dropCard(11);
           superPower();           
           jButton15.setVisible(false);   
       }
       else if(pValue==mValue || pSuit==mSuit)
       {
           mValue=pValue;
           mSuit=pSuit;
           dropCard(11);
           jButton15.setVisible(false);   
           if(flag!=4)
           {    
                aiDrop1(); 
                if(flag!=1)
                {    
                    aiDrop2();
                    if(flag!=2)
                    aiDrop3();
                }
           }
       }
       else
           jLabel12.setVisible(true);
     
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        mSuit="Spades";
        temp=mValue;
        
        mValue=120;
        aiDrop1(); 
        aiDrop2();
        aiDrop3();
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jLabel13.setVisible(false);
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        mSuit="Diamonds";
        temp=mValue;
        mValue=120;
        aiDrop1(); 
        aiDrop2();
        aiDrop3();
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        mSuit="Hearts";
        temp=mValue;
        mValue=120;
        aiDrop1(); 
        aiDrop2();
        aiDrop3();
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        mSuit="Clubs";
        temp=mValue;
        mValue=120;
        aiDrop1(); 
        aiDrop2();
        aiDrop3();
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TwoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       //         new TwoPlayers().setVisible(true);
            }
        });
    }

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
