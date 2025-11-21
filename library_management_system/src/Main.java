
import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        JFrame f=new JFrame("Library System");
        f.setSize(400,300);
        f.setLayout(new FlowLayout());

        JButton add=new JButton("Add Book");
        JButton view=new JButton("View Books");

        f.add(add);
        f.add(view);

        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame a=new JFrame("Add");
                a.setSize(300,300);
                a.setLayout(new GridLayout(4,2));

                JTextField t=new JTextField();
                JTextField au=new JTextField();
                JTextField c=new JTextField();
                JButton s=new JButton("Save");

                a.add(new JLabel("Title"));
                a.add(t);
                a.add(new JLabel("Author"));
                a.add(au);
                a.add(new JLabel("Copies"));
                a.add(c);
                a.add(s);

                s.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        new BookDAO().addBook(t.getText(),au.getText(),Integer.parseInt(c.getText()));
                        a.dispose();
                    }
                });

                a.setVisible(true);
            }
        });

        view.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame v=new JFrame("Books");
                v.setSize(400,400);

                JTextArea area=new JTextArea();
                List list=(List) new BookDAO().getBooks();
                StringBuilder sb=new StringBuilder();
                for (Book b : list) {
                    sb.append(b.getId() + " " + b.getTitle() + " " + b.getAuthor() + " " + b.getCopies() + "\n");
                }

                area.setText(sb.toString());

                v.add(area);
                v.setVisible(true);
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
