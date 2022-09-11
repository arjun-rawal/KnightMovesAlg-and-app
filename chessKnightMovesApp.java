package com.chessalg.knight;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.*;


public class chessKnightMovesApp{
    public static void main(String[] args){
        
        

        JFrame frame = new JFrame();
        
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JLabel label = new JLabel(); 
        label.setIcon(new ImageIcon("C:\\Users\\pinki\\Downloads\\chessboard_blank.png"));        
        label.setBounds(100, 100, 602, 602); 
        frame.add(label);

        JLabel Instructions = new JLabel("Click two spots on this chess board");
        Instructions.setBounds(270,1, 300, 100);
        Instructions.setHorizontalAlignment(SwingConstants.LEFT);
        Instructions.setFont(new Font("Serif", Font.BOLD, 20));
        frame.add(Instructions);

        JButton a8 = new JButton();
        a8.setBounds(100, 130, 68, 66);
        a8.setOpaque(false);
        frame.add(a8);

        JButton a7 = new JButton();
        a7.setBounds(100, 200, 68, 66);
        a7.setOpaque(false);
        frame.add(a7);

        JButton a6 = new JButton();
        a6.setBounds(100, 270, 68, 66);
        a6.setOpaque(false);
        frame.add(a6);

        JButton a5 = new JButton();
        a5.setBounds(100, 335, 68, 66);
        a5.setOpaque(false);
        frame.add(a5);

        JButton a4 = new JButton();
        a4.setBounds(100, 404, 68, 66);
        a4.setOpaque(false);
        frame.add(a4);

        JButton a3 = new JButton();
        a3.setBounds(100, 474, 68, 66);
        a3.setOpaque(false);
        frame.add(a3);

        JButton a2 = new JButton();
        a2.setBounds(100, 544, 68, 66);
        a2.setOpaque(false);
        frame.add(a2);

        JButton a1 = new JButton();
        a1.setBounds(100, 610, 68, 66);
        a1.setOpaque(false);
        frame.add(a1);

        JButton b8 = new JButton();
        b8.setBounds(170, 130, 68, 66);
        b8.setOpaque(false);
        frame.add(b8);

        JButton b7 = new JButton();
        b7.setBounds(170, 200, 68, 66);
        b7.setOpaque(false);
        frame.add(b7);

        JButton b6 = new JButton();
        b6.setBounds(170, 270, 68, 66);
        b6.setOpaque(false);
        frame.add(b6);

        JButton b5 = new JButton();
        b5.setBounds(170, 335, 68, 66);
        b5.setOpaque(false);
        frame.add(b5);

        JButton b4 = new JButton();
        b4.setBounds(170, 404, 68, 66);
        b4.setOpaque(false);
        frame.add(b4);

        JButton b3 = new JButton();
        b3.setBounds(170, 474, 68, 66);
        b3.setOpaque(false);
        frame.add(b3);

        JButton b2 = new JButton();
        b2.setBounds(170, 544, 68, 66);
        b2.setOpaque(false);
        frame.add(b2);

        JButton b1 = new JButton();
        b1.setBounds(170, 610, 68, 66);
        b1.setOpaque(false);
        frame.add(b1);

        JButton c8 = new JButton();
        c8.setBounds(240, 130, 68, 66);
        c8.setOpaque(false);
        frame.add(c8);

        JButton c7 = new JButton();
        c7.setBounds(240, 200, 68, 66);
        c7.setOpaque(false);
        frame.add(c7);

        JButton c6 = new JButton();
        c6.setBounds(240, 270, 68, 66);
        c6.setOpaque(false);
        frame.add(c6);

        JButton c5 = new JButton();
        c5.setBounds(240, 335, 68, 66);
        c5.setOpaque(false);
        frame.add(c5);

        JButton c4 = new JButton();
        c4.setBounds(240, 404, 68, 66);
        c4.setOpaque(false);
        frame.add(c4);

        JButton c3 = new JButton();
        c3.setBounds(240, 474, 68, 66);
        c3.setOpaque(false);
        frame.add(c3);

        JButton c2 = new JButton();
        c2.setBounds(240, 544, 68, 66);
        c2.setOpaque(false);
        frame.add(c2);

        JButton c1 = new JButton();
        c1.setBounds(240, 610, 68, 66);
        c1.setOpaque(false);
        frame.add(c1);

        // c-d 

        JButton d8 = new JButton();
        d8.setBounds(310, 130, 68, 66);
        d8.setOpaque(false);
        frame.add(d8);

        JButton d7 = new JButton();
        d7.setBounds(310, 200, 68, 66);
        d7.setOpaque(false);
        frame.add(d7);

        JButton d6 = new JButton();
        d6.setBounds(310, 270, 68, 66);
        d6.setOpaque(false);
        frame.add(d6);

        JButton d5 = new JButton();
        d5.setBounds(310, 335, 68, 66);
        d5.setOpaque(false);
        frame.add(d5);

        JButton d4 = new JButton();
        d4.setBounds(310, 404, 68, 66);
        d4.setOpaque(false);
        frame.add(d4);

        JButton d3 = new JButton();
        d3.setBounds(310, 474, 68, 66);
        d3.setOpaque(false);
        frame.add(d3);

        JButton d2 = new JButton();
        d2.setBounds(310, 544, 68, 66);
        d2.setOpaque(false);
        frame.add(d2);

        JButton d1 = new JButton();
        d1.setBounds(310, 610, 68, 66);
        d1.setOpaque(false);
        frame.add(d1);

        //d-e

        JButton e8 = new JButton();
        e8.setBounds(380, 130, 68, 66);
        e8.setOpaque(false);
        frame.add(e8);

        JButton e7 = new JButton();
        e7.setBounds(380, 200, 68, 66);
        e7.setOpaque(false);
        frame.add(e7);

        JButton e6 = new JButton();
        e6.setBounds(380, 270, 68, 66);
        e6.setOpaque(false);
        frame.add(e6);

        JButton e5 = new JButton();
        e5.setBounds(380, 335, 68, 66);
        e5.setOpaque(false);
        frame.add(e5);

        JButton e4 = new JButton();
        e4.setBounds(380, 404, 68, 66);
        e4.setOpaque(false);
        frame.add(e4);

        JButton e3 = new JButton();
        e3.setBounds(380, 474, 68, 66);
        e3.setOpaque(false);
        frame.add(e3);

        JButton e2 = new JButton();
        e2.setBounds(380, 544, 68, 66);
        e2.setOpaque(false);
        frame.add(e2);

        JButton e1 = new JButton();
        e1.setBounds(380, 610, 68, 66);
        e1.setOpaque(false);
        frame.add(e1);
        frame.setVisible(true);

        //e-f
        JButton f8 = new JButton();
        f8.setBounds(450, 130, 68, 66);
        f8.setOpaque(false);
        frame.add(f8);

        JButton f7 = new JButton();
        f7.setBounds(450, 200, 68, 66);
        f7.setOpaque(false);
        frame.add(f7);

        JButton f6 = new JButton();
        f6.setBounds(450, 270, 68, 66);
        f6.setOpaque(false);
        frame.add(f6);

        JButton f5 = new JButton();
        f5.setBounds(450, 335, 68, 66);
        f5.setOpaque(false);
        frame.add(f5);

        JButton f4 = new JButton();
        f4.setBounds(450, 404, 68, 66);
        f4.setOpaque(false);
        frame.add(f4);

        JButton f3 = new JButton();
        f3.setBounds(450, 474, 68, 66);
        f3.setOpaque(false);
        frame.add(f3);

        JButton f2 = new JButton();
        f2.setBounds(450, 544, 68, 66);
        f2.setOpaque(false);
        frame.add(f2);

        JButton f1 = new JButton();
        f1.setBounds(450, 610, 68, 66);
        f1.setOpaque(false);
        frame.add(f1);
        frame.setVisible(true);

        //f-g

        JButton g8 = new JButton();
        g8.setBounds(520, 130, 68, 66);
        g8.setOpaque(false);
        frame.add(g8);

        JButton g7 = new JButton();
        g7.setBounds(520, 200, 68, 66);
        g7.setOpaque(false);
        frame.add(g7);

        JButton g6 = new JButton();
        g6.setBounds(520, 270, 68, 66);
        g6.setOpaque(false);
        frame.add(g6);

        JButton g5 = new JButton();
        g5.setBounds(520, 335, 68, 66);
        g5.setOpaque(false);
        frame.add(g5);

        JButton g4 = new JButton();
        g4.setBounds(520, 404, 68, 66);
        g4.setOpaque(false);
        frame.add(g4);

        JButton g3 = new JButton();
        g3.setBounds(520, 474, 68, 66);
        g3.setOpaque(false);
        frame.add(g3);

        JButton g2 = new JButton();
        g2.setBounds(520, 544, 68, 66);
        g2.setOpaque(false);
        frame.add(g2);

        JButton g1 = new JButton();
        g1.setBounds(520, 610, 68, 66);
        g1.setOpaque(false);
        frame.add(g1);

        //g-h
        JButton h8 = new JButton();
        h8.setBounds(590, 130, 68, 66);
        h8.setOpaque(false);
        h8.setBackground(Color.white);
        h8.setContentAreaFilled(false);
        frame.add(h8);

        JButton h7 = new JButton();
        h7.setBounds(590, 200, 68, 66);
        h7.setOpaque(false);
        frame.add(h7);

        JButton h6 = new JButton();
        h6.setBounds(590, 270, 68, 66);
        h6.setOpaque(false);
        frame.add(h6);

        JButton h5 = new JButton();
        h5.setBounds(590, 335, 68, 66);
        h5.setOpaque(false);
        frame.add(h5);

        JButton h4 = new JButton();
        h4.setBounds(590, 404, 68, 66);
        h4.setOpaque(false);
        frame.add(h4);

        JButton h3 = new JButton();
        h3.setBounds(590, 474, 68, 66);
        h3.setOpaque(false);
        frame.add(h3);

        JButton h2 = new JButton();
        h2.setBounds(590, 544, 68, 66);
        h2.setOpaque(false);
        frame.add(h2);

        JButton h1 = new JButton();
        h1.setBounds(590, 610, 68, 66);
        h1.setOpaque(false);

        frame.add(h1);

        h1.setContentAreaFilled(false);
        h1.setBorderPainted(false);
        h2.setContentAreaFilled(false);
        h2.setBorderPainted(false);
        h3.setContentAreaFilled(false);
        h3.setBorderPainted(false);
        h4.setContentAreaFilled(false);
        h4.setBorderPainted(false);
        h5.setContentAreaFilled(false);
        h5.setBorderPainted(false);
        h6.setContentAreaFilled(false);
        h6.setBorderPainted(false);
        h7.setContentAreaFilled(false);
        h7.setBorderPainted(false);
        h8.setContentAreaFilled(false);
        h8.setBorderPainted(false);
        // a1.setContentAreaFilled(false);
        // a1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        c1.setContentAreaFilled(false);
        c1.setBorderPainted(false);
        d1.setContentAreaFilled(false);
        d1.setBorderPainted(false);
        e1.setContentAreaFilled(false);
        e1.setBorderPainted(false);
        f1.setContentAreaFilled(false);
        f1.setBorderPainted(false);
        g1.setContentAreaFilled(false);
        g1.setBorderPainted(false);
        String[]s = new String[2];
        
        a1.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a1";
           }
           else{
            s[1]= "a1";
           }
            });

        a2.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a2";
           }
           else{
            s[1]= "a2";
           }
            });

        a3.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a3";
           }
           else{
            s[1]= "a3";
           }
            });
        a4.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a4";
            a4.setOpaque(false);
            a4.setBackground(Color.green);
           }
           else{
            s[1]= "a4";
           }
            });
        a5.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a5";
           }
           else{
            s[1]= "a5";
           }
            });
        a6.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a6";
           }
           else{
            s[1]= "a6";
           }
            });
        a7.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a7";
           }
           else{
            s[1]= "a7";
           }
            });
        a8.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "a8";
           }
           else{
            s[1]= "a8";
           }
            });

        b1.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b1";
                }
                else{
                 s[1]= "b1";
                }
                 });
     
         b2.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b2";
                }
                else{
                 s[1]= "b2";
                }
                 });
     
             b3.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b3";
                }
                else{
                 s[1]= "b3";
                }
                 });
             b4.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b4";
                }
                else{
                 s[1]= "b4";
                }
                 });
             b5.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b5";
                }
                else{
                 s[1]= "b5";
                }
                 });
             b6.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b6";
                }
                else{
                 s[1]= "b6";
                }
                 });
             b7.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b7";
                }
                else{
                 s[1]= "b7";
                }
                 });
             b8.addActionListener(e -> {
                if (s[0] == null){
                 s[0] = "b8";
                }
                else{
                 s[1]= "b8";
                }
                 });
                 c1.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c1";
                    }
                    else{
                     s[1]= "c1";
                    }
                     });
         
             c2.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c2";
                    }
                    else{
                     s[1]= "c2";
                    }
                     });
         
                 c3.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c3";
                    }
                    else{
                     s[1]= "c3";
                    }
                     });
                 c4.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c4";
                    }
                    else{
                     s[1]= "c4";
                    }
                     });
                 c5.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c5";
                    }
                    else{
                     s[1]= "c5";
                    }
                     });
                 c6.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c6";
                    }
                    else{
                     s[1]= "c6";
                    }
                     });
                 c7.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c7";
                    }
                    else{
                     s[1]= "c7";
                    }
                     });
                 c8.addActionListener(e -> {
                    if (s[0] == null){
                     s[0] = "c8";
                    }
                    else{
                     s[1]= "c8";
                    }
                     });    

                     d1.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d1";
                        }
                        else{
                         s[1]= "d1";
                        }
                         });
             
                 d2.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d2";
                        }
                        else{
                         s[1]= "d2";
                        }
                         });
             
                     d3.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d3";
                        }
                        else{
                         s[1]= "d3";
                        }
                         });
                     d4.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d4";
                        }
                        else{
                         s[1]= "d4";
                        }
                         });
                     d5.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d5";
                        }
                        else{
                         s[1]= "d5";
                        }
                         });
                     d6.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d6";
                        }
                        else{
                         s[1]= "d6";
                        }
                         });
                     d7.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d7";
                        }
                        else{
                         s[1]= "d7";
                        }
                         });
                     d8.addActionListener(e -> {
                        if (s[0] == null){
                         s[0] = "d8";
                        }
                        else{
                         s[1]= "d8";
                        }
                         });
                         e1.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e1";
                            }
                            else{
                             s[1]= "e1";
                            }
                             });
                 
                         e2.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e2";
                            }
                            else{
                             s[1]= "e2";
                            }
                             });
                 
                         e3.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e3";
                            }
                            else{
                             s[1]= "e3";
                            }
                             });
                         e4.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e4";
                            }
                            else{
                             s[1]= "e4";
                            }
                             });
                         e5.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e5";
                            }
                            else{
                             s[1]= "e5";
                            }
                             });
                         e6.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e6";
                            }
                            else{
                             s[1]= "e6";
                            }
                             });
                         e7.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e7";
                            }
                            else{
                             s[1]= "e7";
                            }
                             });
                         e8.addActionListener(e -> {
                            if (s[0] == null){
                             s[0] = "e8";
                            }
                            else{
                             s[1]= "e8";
                            }
                             });
        
         f1.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f1";
           }
           else{
            s[1]= "f1";
           }
            });

        f2.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f2";
           }
           else{
            s[1]= "f2";
           }
            });

        f3.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f3";
           }
           else{
            s[1]= "f3";
           }
            });
        f4.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f4";
           }
           else{
            s[1]= "f4";
           }
            });
        f5.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f5";
           }
           else{
            s[1]= "f5";
           }
            });
        f6.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f6";
           }
           else{
            s[1]= "f6";
           }
            });
        f7.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f7";
           }
           else{
            s[1]= "f7";
           }
            });
        f8.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "f8";
           }
           else{
            s[1]= "f8";
           }
            });
         
        g1.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g1";
           }
           else{
            s[1]= "g1";
           }
            });

        g2.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g2";
           }
           else{
            s[1]= "g2";
           }
            });

        g3.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g3";
           }
           else{
            s[1]= "g3";
           }
            });
        g4.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g4";
           }
           else{
            s[1]= "g4";
           }
            });
        g5.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g5";
           }
           else{
            s[1]= "g5";
           }
            });
        g6.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g6";
           }
           else{
            s[1]= "g6";
           }
            });
        g7.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g7";
           }
           else{
            s[1]= "g7";
           }
            });
        g8.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "g8";
           }
           else{
            s[1]= "g8";
           }
            });
        

        h1.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h1";
           }
           else{
            
            s[1]= "h1";
           }
            });

        h2.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h2";
           }
           else{
            s[1]= "h2";
           }
            });

        h3.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h3";
           }
           else{
            s[1]= "h3";
           }
            });
        h4.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h4";
           }
           else{
            s[1]= "h4";
           }
            });
        h5.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h5";
           }
           else{
            s[1]= "h5";
           }
            });
        h6.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h6";
           }
           else{
            s[1]= "h6";
           }
            });
        h7.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h7";
           }
           else{
            s[1]= "h7";
           }
            });
        h8.addActionListener(e -> {
           if (s[0] == null){
            s[0] = "h8";
           }
           else{
            s[1]= "h8";
           }
           System.out.println(s[0]);
           System.out.println("2:" + s[1]);
            });


        int x =1;
        int y =0;
        JLabel Last = new JLabel();
        Last.setBounds(270,1, 300, 100);
        Last.setFont(new Font("Serif", Font.BOLD, 20));
        while (x == 1){
        if (s[1] != null){     
        System.out.println("HERE");
        x++;
        y = knight(s[0], s[1]);
        
        String z = String.valueOf(y);
        System.out.println(z);
 
        Instructions.setText("The knight took " +z+ " moves!");
        frame.add(Last);
        s[0] = null;
        s[1] = null;
        x--;
        }

    }

        };













    public static int knight(String start, String  finish) {
        int totalMoves = 0;
        int y =0;
        int x =0;
        char[] startingPos = start.toCharArray();
        char[] endingPos = finish.toCharArray();
        switch (startingPos[0]){
            case 'a': x = 0;
            break;
            case 'b': x = 1;
            break;
            case 'c': x=2;
            break;
            case 'd': x=3;
            break;
            case 'e': x=4;
            break;
            case 'f': x=5;
            break;
            case 'g': x=6;
            break;
            case 'h': x=7;
        }
        y = 8 - Character.getNumericValue(startingPos[1]);
        
        int knightY=0;
        int knightX =0;
        switch (endingPos[0]){
            case 'a': knightX = 0; 
            break;
            case 'b': knightX = 1;
            break;
            case 'c': knightX=2;
            break;
            case 'd': knightX=3;
            break;
            case 'e': knightX=4;
            break;
            case 'f': knightX=5;
            break;
            case 'g': knightX=6;
            break;
            case 'h': knightX=7;
        }
        knightY = 8  - Character.getNumericValue(endingPos[1]);
       
        

        int[][] grid = new int[8][8];
        grid[knightY][knightX] = 1;
        grid[y][x] = 0;

        int knightMoves= 0;
        
        while (grid[y][x] == 0){
            int abc = 0;
            int abc1=0;
            knightMoves ++;
            for( abc = 0; abc< 8; abc++){
                for( abc1 = 0; abc1<8; abc1++){
                    if (grid[abc][abc1] == knightMoves){
                        totalMoves = knightMoves + 1;
                        knightY = abc;
                        knightX = abc1;
                        if ((knightX<6) && (knightY<7)){
                            if (grid[knightY+1][knightX + 2] < 1){
                            grid[knightY+1][knightX + 2] = totalMoves;
                            }
                            if (knightY>0){
                                if (grid[knightY-1][knightX + 2] < 1){
                                grid[knightY-1][knightX + 2] = totalMoves;
                                }
                            }
                        }
                        if ((knightX>1) && (knightY<7)){
                            if (grid[knightY+1][knightX - 2] < 1){
                            grid[knightY+1][knightX - 2] = totalMoves;
                            }
                            if (knightY>0){
                                if (grid[knightY-1][knightX - 2] < 1){
                                grid[knightY-1][knightX - 2] = totalMoves;
                                }
                            }
                        }
                        if ((knightX<7) && (knightY<6)){
                            if (grid[knightY+2][knightX + 1] < 1){
                            grid[knightY+2][knightX + 1] = totalMoves;
                            }
                            if (knightX>0){
                                if (grid[knightY+2][knightX -1] < 1){
                                grid[knightY+2][knightX -1] = totalMoves;
                                }
                            }
                        }
                        if ((knightX<7) && (knightY>1)){
                            if (grid[knightY-2][knightX + 1] < 1){
                            grid[knightY-2][knightX + 1] = totalMoves;
                            }
                            if (knightX>0){
                                if (grid[knightY-2][knightX -1] < 1){
                                grid[knightY-2][knightX - 1] = totalMoves;
                                }
                            }
                        }
                        totalMoves++;
                   }
                }
            }
        }
        for (int qwe = 0; qwe<8; qwe++){
            System.out.println("");
            for (int qw1e = 0; qw1e<8; qw1e++){
                System.out.print(grid[qwe][qw1e]);
            }
        }







        return knightMoves;
    }
}