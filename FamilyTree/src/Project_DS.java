import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;


public class Project_DS{

    public static void main(String[] args) throws Exception {

//        new DataBase().create();

/**********************************************************************************************************************/
        JFrame frame=new JFrame("شجره نامه خانوادگی");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,800);
        frame.setLayout(null);
        frame.setVisible(true);


        JLabel l1 = new JLabel(" *** ساخت شجره نامه *** ");
        l1.setBounds(1000, 10, 200, 30);
        l1.setForeground(Color.red);

        frame.add(l1);


        JLabel lperson1 = new JLabel("فرد اول   ");
        lperson1.setBounds(1100, 60, 50, 30);
        frame.add(lperson1);
        JTextField tperson1 = new JTextField();
        tperson1.setBounds(1050, 60, 50, 30);
        frame.add(tperson1);

        JLabel idperson1 = new JLabel("آی دی ");
        idperson1.setBounds(1000, 60, 50, 30);
        frame.add(idperson1);
        JTextField idtperson1 = new JTextField();
        idtperson1.setBounds(950, 60, 50, 30);
        frame.add(idtperson1);

        JLabel Genderperson1 = new JLabel("جنسیت :");
        Genderperson1.setBounds(910, 60, 50, 30);
        frame.add(Genderperson1);
        JRadioButton girl=new JRadioButton("دختر");
        JRadioButton boy=new JRadioButton("پسر");
        ButtonGroup bg2=new ButtonGroup();
        girl.setBounds(860,60,50,30);
        boy.setBounds(815,60,50,30);
        bg2.add(girl);
        bg2.add(boy);
        frame.add(girl);
        frame.add(boy);


        JLabel Birthperson1 = new JLabel("تاریخ تولد ");
        Birthperson1.setBounds(760, 60, 50, 30);
        frame.add(Birthperson1);
        JTextField Birthtperson1 = new JTextField();
        Birthtperson1.setBounds(710, 60, 50, 30);
        frame.add(Birthtperson1);

        JLabel deadperson1 = new JLabel("تاریخ وفات ");
        deadperson1.setBounds(660, 60, 50, 30);
        frame.add(deadperson1);
        JTextField deadtperson1 = new JTextField();
        deadtperson1.setBounds(610, 60, 50, 30);
        frame.add(deadtperson1);

        JLabel Spouseidperson1 = new JLabel("شناسه همسر ");
        Spouseidperson1.setBounds(550, 60, 60, 30);
        frame.add(Spouseidperson1);
        JTextField Spouseidtperson1 = new JTextField();
        Spouseidtperson1.setBounds(500, 60, 50, 30);
        frame.add(Spouseidtperson1);



        JLabel lperson2 = new JLabel("فرد دوم   ");
        lperson2.setBounds(1100, 95, 50, 30);
        frame.add(lperson2);
        JTextField tperson2 = new JTextField();
        tperson2.setBounds(1050, 95, 50, 30);
        frame.add(tperson2);

        JLabel idperson2 = new JLabel("آی دی ");
        idperson2.setBounds(1000, 95, 50, 30);
        frame.add(idperson2);
        JTextField idtperson2 = new JTextField();
        idtperson2.setBounds(950, 95, 50, 30);
        frame.add(idtperson2);

        JLabel Genderperson2 = new JLabel("جنسیت :");
        Genderperson2.setBounds(910, 95, 50, 30);
        frame.add(Genderperson2);

        JRadioButton girl1=new JRadioButton("دختر");
        JRadioButton boy1=new JRadioButton("پسر");
        ButtonGroup bg1=new ButtonGroup();
        girl1.setBounds(860,95,50,30);
        boy1.setBounds(815,95,50,30);
        bg1.add(girl1);
        bg1.add(boy1);
        frame.add(girl1);
        frame.add(boy1);


        JLabel Birthperson2 = new JLabel("تاریخ تولد ");
        Birthperson2.setBounds(760, 95, 50, 30);
        frame.add(Birthperson2);
        JTextField Birthtperson2 = new JTextField();
        Birthtperson2.setBounds(710, 95, 50, 30);
        frame.add(Birthtperson2);

        JLabel deadperson2 = new JLabel("تاریخ وفات ");
        deadperson2.setBounds(660, 95, 50, 30);
        frame.add(deadperson2);
        JTextField deadtperson2 = new JTextField();
        deadtperson2.setBounds(610, 95, 50, 30);
        frame.add(deadtperson2);

        JLabel Spouseidperson2 = new JLabel("شناسه همسر ");
        Spouseidperson2.setBounds(550, 95, 60, 30);
        frame.add(Spouseidperson2);
        JTextField Spouseidtperson2 = new JTextField();
        Spouseidtperson2.setBounds(500, 95, 50, 30);
        frame.add(Spouseidtperson2);


        JRadioButton r1=new JRadioButton("مادر");
        JRadioButton r2=new JRadioButton("پدر");
        JRadioButton r3=new JRadioButton("خواهر");
        JRadioButton r4=new JRadioButton("برادر");
        JRadioButton r5=new JRadioButton("زن");
        JRadioButton r6=new JRadioButton("شوهر");
        JRadioButton r7=new JRadioButton("دختر");
        JRadioButton r8=new JRadioButton("پسر");
        JRadioButton r9=new JRadioButton("دايي");
        JRadioButton r10=new JRadioButton("خاله");
        JRadioButton r11=new JRadioButton("عمو");
        JRadioButton r12=new JRadioButton("عمه");
        JRadioButton r13=new JRadioButton("باجناق");
        JRadioButton r14=new JRadioButton("جاري");
        JRadioButton r15=new JRadioButton("هوو");


        r1.setBounds(10,55,50,30);
        r2.setBounds(60,55,50,30);
        r3.setBounds(110,55,50,30);
        r4.setBounds(160,55,50,30);

        r5.setBounds(160,85,50,30);
        r6.setBounds(210,85,50,30);
        r7.setBounds(60,85,50,30);
        r8.setBounds(10,85,50,30);
        r9.setBounds(210,55,50,30);

        r10.setBounds(10,115,50,30);
        r11.setBounds(60,115,50,30);
        r12.setBounds(110,85,50,30);
        r13.setBounds(160,115,50,30);

        r14.setBounds(210,115,50,30);
        r15.setBounds(110,115,50,30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
        bg.add(r6);
        bg.add(r7);
        bg.add(r8);
        bg.add(r9);
        bg.add(r10);
        bg.add(r11);
        bg.add(r12);
        bg.add(r13);
        bg.add(r14);
        bg.add(r15);

        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(r4);
        frame.add(r5);
        frame.add(r5);
        frame.add(r6);
        frame.add(r7);
        frame.add(r8);
        frame.add(r9);
        frame.add(r10);
        frame.add(r11);
        frame.add(r12);
        frame.add(r13);
        frame.add(r14);
        frame.add(r15);

        JButton bnext = new JButton("ثبت");
        bnext.setBounds(10,150,1150,30);
        bnext.setBackground(Color.yellow);
        frame.add(bnext);


        JButton bcreate = new JButton("بساز");
        bcreate.setBounds(10,190,1150,30);
        bcreate.setBackground(Color.pink);
        frame.add(bcreate);
/***********************************************************************************************************************/
        JLabel label = new JLabel("***نزدیک ترین نسبت***");
        label.setBounds(1000, 250, 300, 30);
        label.setForeground(Color.red);

        frame.add(label);

        JLabel sperson1 = new JLabel("فرد اول   ");
        sperson1.setBounds(1100, 300, 50, 30);
        frame.add(sperson1);
        JTextField stperson1 = new JTextField();
        stperson1.setBounds(1050, 300, 50, 30);
        frame.add(stperson1);

        JLabel sidperson1 = new JLabel("آی دی ");
        sidperson1.setBounds(1000, 300, 50, 30);
        frame.add(sidperson1);
        JTextField sidtperson1 = new JTextField();
        sidtperson1.setBounds(950, 300, 50, 30);
        frame.add(sidtperson1);

        JLabel sperson2 = new JLabel("فرد دوم   ");
        sperson2.setBounds(1100, 350, 50, 30);
        frame.add(sperson2);
        JTextField stperson2 = new JTextField();
        stperson2.setBounds(1050, 350, 50, 30);
        frame.add(stperson2);

        JLabel sidperson2 = new JLabel("آی دی ");
        sidperson2.setBounds(1000, 350, 50, 30);
        frame.add(sidperson2);
        JTextField sidtperson2 = new JTextField();
        sidtperson2.setBounds(950, 350, 50, 30);
        frame.add(sidtperson2);

        JButton bsearch = new JButton("تمام نسبت ها");
        bsearch.setBounds(10,300,445,80);
        bsearch.setBackground(Color.green);
        frame.add(bsearch);
        JButton nsearch = new JButton("نزدیک ترین نسبت");
        nsearch.setBounds(468,300,445,80);
        nsearch.setBackground(Color.magenta);
        frame.add(nsearch);
/**********************************************************************************************************************/
        JLabel labelf = new JLabel("***پيدا کردن فردي با نسبت داده شده***");
        labelf.setBounds(980, 450, 350, 30);
        labelf.setForeground(Color.red);

        frame.add(labelf);

        JLabel sperson1f = new JLabel("نام فرد ");
        sperson1f.setBounds(1100, 520, 50, 30);
        frame.add(sperson1f);
        JTextField stperson1f = new JTextField();
        stperson1f.setBounds(1050, 520, 50, 30);
        frame.add(stperson1f);

        JLabel sidperson1f = new JLabel("آی دی ");
        sidperson1f.setBounds(1000, 520, 50, 30);
        frame.add(sidperson1f);
        JTextField sidtperson1f = new JTextField();
        sidtperson1f.setBounds(950, 520, 50, 30);
        frame.add(sidtperson1f);


        JButton search = new JButton("بگرد");
        search.setBounds(10,620,1000,80);
        search.setBackground(Color.orange);
        frame.add(search);
        JButton max = new JButton("بیشترین فرزند ");
        max.setBounds(1020,620,120,80);
        max.setBackground(Color.CYAN);
        frame.add(max);

        JRadioButton nr1=new JRadioButton("مادر");
        JRadioButton nr2=new JRadioButton("پدر");
        JRadioButton nr3=new JRadioButton("خواهر");
        JRadioButton nr4=new JRadioButton("برادر");
        JRadioButton nr5=new JRadioButton("زن");
        JRadioButton nr6=new JRadioButton("شوهر");
        JRadioButton nr7=new JRadioButton("دختر");
        JRadioButton nr8=new JRadioButton("پسر");

        JRadioButton nr9=new JRadioButton("باجناق");
        JRadioButton nr10=new JRadioButton("جاری");

        JRadioButton nr11=new JRadioButton("مادربزرگ مادری");
        JRadioButton nr12=new JRadioButton("پدربزرگ مادری");

        JRadioButton nr13=new JRadioButton("خاله");
        JRadioButton nr14=new JRadioButton("دایی");
        JRadioButton nr15=new JRadioButton("عمو");
        JRadioButton nr16=new JRadioButton("عمه");

        JRadioButton nr17=new JRadioButton("دخترعمه");
        JRadioButton nr18=new JRadioButton("پسرعمه");
        JRadioButton nr19=new JRadioButton("دخترخاله");
        JRadioButton nr20=new JRadioButton("پسرخاله");
        JRadioButton nr21=new JRadioButton("دختردایی");
        JRadioButton nr22=new JRadioButton("پسردایی");
        JRadioButton nr23=new JRadioButton("دخترعمو");
        JRadioButton nr24=new JRadioButton("پسرعمو");

        JRadioButton nr25=new JRadioButton("مادربزرگ پدری");
        JRadioButton nr26=new JRadioButton("پدربزرگ پدری");
        JRadioButton nr27=new JRadioButton("هوو");



        nr1.setBounds(10,425,50,30);
        nr2.setBounds(60,425,50,30);
        nr3.setBounds(110,425,50,30);
        nr4.setBounds(160,425,50,30);
        nr5.setBounds(210,425,50,30);
        nr6.setBounds(10,455,50,30);
        nr7.setBounds(60,455,50,30);
        nr8.setBounds(110,455,50,30);
        nr9.setBounds(160,455,50,30);
        nr10.setBounds(210,455,50,30);
        nr13.setBounds(10,485,50,30);
        nr14.setBounds(60,485,50,30);
        nr15.setBounds(110,485,50,30);
        nr16.setBounds(160,485,50,30);
        nr27.setBounds(210,485,50,30);
        nr17.setBounds(10,515,60,30);
        nr18.setBounds(70,515,60,30);
        nr19.setBounds(130,515,60,30);
        nr20.setBounds(200,515,60,30);
        nr21.setBounds(10,550,60,30);
        nr22.setBounds(70,550,60,30);
        nr23.setBounds(130,550,60,30);
        nr24.setBounds(200,550,60,30);
        nr25.setBounds(10,580,90,30);
        nr26.setBounds(110,580,90,30);
        nr11.setBounds(210,580,95,30);
        nr12.setBounds(310,580,90,30);
        ButtonGroup b=new ButtonGroup();
        b.add(nr1);
        b.add(nr2);
        b.add(nr3);
        b.add(nr4);
        b.add(nr5);
        b.add(nr6);
        b.add(nr7);
        b.add(nr8);
        b.add(nr9);
        b.add(nr10);
        b.add(nr13);
        b.add(nr14);
        b.add(nr15);
        b.add(nr16);
        b.add(nr17);
        b.add(nr18);
        b.add(nr19);
        b.add(nr20);
        b.add(nr21);
        b.add(nr22);
        b.add(nr23);
        b.add(nr24);
        b.add(nr25);
        b.add(nr26);
        b.add(nr11);
        b.add(nr12);
        b.add(nr27);

        frame.add(nr1);
        frame.add(nr2);
        frame.add(nr3);
        frame.add(nr4);
        frame.add(nr5);
        frame.add(nr6);
        frame.add(nr7);
        frame.add(nr8);
        frame.add(nr9);
        frame.add(nr10);
        frame.add(nr13);
        frame.add(nr14);
        frame.add(nr15);
        frame.add(nr16);
        frame.add(nr17);
        frame.add(nr18);
        frame.add(nr19);
        frame.add(nr20);
        frame.add(nr21);
        frame.add(nr22);
        frame.add(nr23);
        frame.add(nr24);
        frame.add(nr25);
        frame.add(nr26);
        frame.add(nr11);
        frame.add(nr12);
        frame.add(nr27);

/***********************************************************************************************************************/
        DataBase dataBase = new DataBase();
        bnext.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //create graph
               ///////////person 1///////////
               Person person1 = new Person();
               person1.name = tperson1.getText();
               person1.id = idtperson1.getText();
               if(girl.isSelected()){
                   person1.gender = "دختر";
               }
               else if(boy.isSelected()){
                   person1.gender = "پسر";
               }
               person1.death = Birthtperson1.getText();
               person1.birth = deadtperson1.getText();
               person1.hamsar=Spouseidperson1.getText();
               ///////////person 2///////////
               Person person2 = new Person();
               person2.name = tperson2.getText();
               person2.id = idtperson2.getText();
               if(girl1.isSelected()){
                   person2.gender = "دختر";
               }
                else if(boy1.isSelected()){
                   person2.gender = "پسر";
               }
               person2.death = Birthtperson2.getText();
               person2.birth = deadtperson2.getText();
               person2.hamsar=Spouseidperson2.getText();

               ////////////////////////////////////////////////
                   if (r1.isSelected()) {//مادر
                       try {
                           Edge edge = new Edge();

                           edge.source = person1;
                           edge.destination = person2;
                           edge.weight = 1;
                           edge.relation = "مادر";
                           dataBase.insert(edge);

                           Edge edge1 = new Edge();
                           if (person1.gender == "دختر") {
                               edge1.source = person2;
                               edge1.destination = person1;
                               edge1.weight = 3;
                               edge1.relation = "دختر";
                           }
                           else if (person1.gender == "پسر") {
                               edge1.source = person2;
                               edge1.destination = person1;
                               edge1.weight = 4;
                               edge1.relation = "پسر";
                           }
                           dataBase.insert(edge1);

                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                   /*************************************/
                   else if (r2.isSelected()) {//پدر
                       try {
                           Edge edge = new Edge();
                           edge.source = person1;
                           edge.destination = person2;
                           edge.weight = 2;
                           edge.relation = "پدر";
                           dataBase.insert(edge);

                           Edge edge1 = new Edge();
                           if (person1.gender == "دختر") {
                               edge1.source = person2;
                               edge1.destination = person1;
                               edge1.weight = 3;
                               edge1.relation = "دختر";
                               dataBase.insert(edge1);

                           }
                           else if (person1.gender == "پسر") {
                               edge1.source = person2;
                               edge1.destination = person1;
                               edge1.weight = 4;
                               edge1.relation = "پسر";
                               dataBase.insert(edge1);
                           }

                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                   /******************************************/
                   else if (r3.isSelected()) {//خواهر
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 5;
                       edge.relation = "خواهر";
                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();

                           edge1.source = person2;
                           edge1.destination = person1;

                           if (person1.gender == "پسر") {
                               edge1.relation = "برادر";
                               edge1.weight = 6;
                           }
                           else if (person1.gender == "دختر") {
                               edge1.relation = "خواهر";
                               edge1.weight = 5;
                           }
                           dataBase.insert(edge1);
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                   /***********************************************/
                   else if (r4.isSelected()) {//برادر
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 6;
                       edge.relation = "برادر";

                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();

                           edge1.source = person2;
                           edge1.destination = person1;

                           if (person1.gender == "پسر") {
                               edge1.relation = "برادر";
                               edge1.weight = 6;
                           }
                           if (person1.gender == "دختر") {
                               edge1.relation = "خواهر";
                               edge1.weight = 5;
                           }
                           dataBase.insert(edge1);
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                   /***********************************************/
                   else if (r5.isSelected()) {//زن
                       Edge edge = new Edge();
                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight =8;
                       edge.relation = "زن";

                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();

                           edge1.source = person2;
                           edge1.destination = person1;
                           edge1.weight = 7;
                           edge1.relation = "شوهر";

                           dataBase.insert(edge1);
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                   /************************************************/
                   else if (r6.isSelected()) {//شوهر
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 7;
                       edge.relation = "شوهر";
                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();

                           edge1.source = person2;
                           edge1.destination = person1;
                           edge1.weight =8;
                           edge1.relation = "زن";
                           dataBase.insert(edge1);
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                   /*********************************************/
                   else if (r7.isSelected()) {//دختر
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 3;
                       edge.relation = "دختر";
                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();
                           edge1.source = person2;
                           edge1.destination = person1;
                           if (person1.gender == "دختر") {
                               edge1.weight = 1;
                               edge1.relation = "مادر";
                           }
                           if (person1.gender == "پسر") {
                               edge1.weight = 2;
                               edge1.relation = "پدر";
                           }
                           dataBase.insert(edge1);
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
                   /*********************************************/
                   else if (r8.isSelected()) {//پسر
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 4;
                       edge.relation = "پسر";
                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();
                           if (person1.gender == "دختر") {
                               edge1.source = person2;
                               edge1.weight = 1;
                               edge1.destination = person1;
                               edge1.relation = "مادر";
                           }
                           if (person1.gender == "پسر") {
                               edge1.source = person2;
                               edge1.destination = person1;
                               edge1.weight = 2;
                               edge1.relation = "پدر";
                           }
                           dataBase.insert(edge1);

                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }

                    /*********************************************/
                   else if (r9.isSelected()) {//دایی
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 9;
                       edge.relation = "دایی";
                       try {
                           dataBase.insert(edge);


                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }
                   }
                    /*********************************************/
                      else if (r10.isSelected()) {
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 10;
                       edge.relation = "خاله";
                       try {
                           dataBase.insert(edge);

                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
                   /*********************************************/
                   else if (r11.isSelected()) {
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 11;
                       edge.relation = "عمو";
                       try {
                           dataBase.insert(edge);

                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
                   /*********************************************/
                   else if (r12.isSelected()) {
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 12;
                       edge.relation = "عمه";
                       try {
                           dataBase.insert(edge);

                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
                   /*********************************************/
                   else if (r13.isSelected()) {
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 13;
                       edge.relation = "باجناق";
                       try {
                           Edge edge1 = new Edge();
                           dataBase.insert(edge);
                           edge1.source = person2;
                           edge1.destination = person1;
                           edge1.weight = 13;
                           edge1.relation = "باجناق";
                           dataBase.insert(edge1);


                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
                   /*********************************************/
                   else if (r14.isSelected()) {
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 14;
                       edge.relation = "جاري";
                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();
                           edge1.source = person2;
                           edge1.destination = person1;
                           edge1.weight = 14;
                           edge1.relation = "جاری";
                           dataBase.insert(edge1);
                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
                   /*********************************************/
                   else if (r15.isSelected()) {
                       Edge edge = new Edge();

                       edge.source = person1;
                       edge.destination = person2;
                       edge.weight = 15;
                       edge.relation = "هوو";
                       try {
                           dataBase.insert(edge);
                           Edge edge1 = new Edge();
                           edge1.source = person2;
                           edge1.destination = person1;
                           edge1.weight = 15;
                           edge1.relation = "هوو";
                           dataBase.insert(edge1);


                       } catch (Exception e1) {
                           e1.printStackTrace();
                       }

                   }
           }

       });
/***********************************************************************************************************************/
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = sidtperson1f.getText();
                ArrayList<Edge> list = null;
                Nesbat nesbat = new Nesbat();
                try {
                    list = dataBase.report();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                Graph graph = new Graph(100);
                LinkedList<Edge>[] directional = graph.addEgde(list);
                ArrayList<String> listw = new ArrayList <> ();
                if (nr1.isSelected()) {//مادر
                    listw.add("1");
                } 
                else if (nr2.isSelected()) {//پدر
                    listw.add("2");
                }
                /////////////////////////////////////////////////////
                else if (nr3.isSelected()) {//خواهر
                    listw.add("5");
                }
                //////////////////////////////////////////////////
                else if (nr4.isSelected()) {//برادر
                    listw.add("6");
                }
                /////////////////////////////////////////////////
                else if (nr5.isSelected()) {//زن
                    listw.add("8");
                }
                ///////////////////////////////////////////////////
                else if (nr6.isSelected()) {//شوهر
                    listw.add("7");
                }
                ///////////////////////////////////////////////////
                else if (nr7.isSelected()) {//دختر
                    listw.add("3");
                }
                /////////////////////////////////////////////////
                else if (nr8.isSelected()) {//پسر
                    listw.add("4");
                }
                //////////////////////////////////////////////
                else if (nr9.isSelected()) {//باجناق
                    listw.add("13");
                }
                ////////////////////////////////////////////////
                else if (nr10.isSelected()) {//جاری
                    listw.add("14");
                }

                /***********************************************/
                else if (nr13.isSelected()) {//خاله
                    listw.add("10");
                }
                else if (nr14.isSelected()) {//دایی
                    listw.add("9");//مادر

                }
                else if (nr15.isSelected()) {//عمو
                    listw.add("11");
                }
                else if (nr16.isSelected()) {//عمه
                    listw.add("12");
                }
                else if (nr11.isSelected()) {// مادری مادربزرگ
                    listw.add("1");
                    listw.add("1");
                }
                else if (nr12.isSelected()) {//پدربزرگ مادری
                    listw.add("1");
                    listw.add("2");
                }
                else if (nr25.isSelected()) {// پدری مادربزرگ
                    listw.add("2");
                    listw.add("1");
                }
                else if (nr26.isSelected()) {//پدربزرگ پدری
                    listw.add("2");
                    listw.add("2");
                }

                /********************************************/
                else if (nr17.isSelected()) {//دختر عمه
                    listw.add("12");
                    listw.add("3");
                }
                else if (nr18.isSelected()) {//پسر عمه
                    listw.add("12");
                    listw.add("4");
                }
                else if (nr19.isSelected()) {//دختر خاله
                    listw.add("10");
                    listw.add("3");
                }
                else if (nr20.isSelected()) {//پسر خاله
                    listw.add("10");
                    listw.add("4");
                }
                else if (nr21.isSelected()) {//دختر دايي
                    listw.add("9");
                    listw.add("3");
                }
                else if (nr22.isSelected()) {//پسر دايي
                    listw.add("9");
                    listw.add("4");
                }
                else if (nr23.isSelected()) {//دختر عمو
                    listw.add("11");
                    listw.add("3");
                }
                else if (nr24.isSelected()) {// پسر عمو
                    listw.add("11");
                    listw.add("4");
                }
                else if (nr27.isSelected()) {//هوو
                    listw.add("15");
                }
                List<String> result = nesbat.find(listw, directional, id);

                String word="";
                for(int i=0 ;i<result.size() ;i++){
                    word += result.get(i);
                    word += " ";
                }
                JFrame f1 = new JFrame("????");
                JOptionPane.showMessageDialog(f1,word,
                        "نتیجه", JOptionPane.WARNING_MESSAGE);
            }

    });

/**********************************************************************************************************************/
        bcreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //out put
                Graph graph =new Graph(100);
                ArrayList<Edge> list = null;
                try {
                     list  = dataBase.report();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                LinkedList<Edge>[] directional = graph.addEgde(list);


                Creation framegraph = new Creation(directional);
                framegraph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                framegraph.setSize(600, 900);
                framegraph.setVisible(true);

            }
        });
/**********************************************************************************************************************/
        bsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graph graph =new Graph(100);
                ArrayList<Edge> list = null;
                try {
                    list  = dataBase.report();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                LinkedList<Edge>[] directional = graph.addEgde(list);
                ArrayList<Edge> nesbat = new ArrayList<>();
                String p = " " ;

                /** for warshal **/
//                java.util.List<String> resultlist ;
//                String nesbat=" ";
//                java.util.List<Integer> resultlist ;
//                resultlist = nearest.search();
//                String nesbat=" ";
//                int n = resultlist.size();
//
//                for(int i=0 ; i<=n-1 ;i++){
//                    System.out.println("i" + i  );
//                    System.out.println("w" + resultlist.get(i) );
//                    if (resultlist.get(i)==1) {//مادر
//                        nesbat = nesbat +  "مادر";
//                    }
//                    if (resultlist.get(i)==2) {
//                       nesbat = nesbat + " پدر " ;
//                    }
//                    if (resultlist.get(i)==3) {
//                        nesbat = nesbat +  " دختر ";
//
//                    }
//                    if (resultlist.get(i)==4) {
//                        nesbat = nesbat +  " پسر ";
//
//                    }
//                    if (resultlist.get(i)==5) {
//                        nesbat = nesbat +  " خواهر ";
//
//                    }
//                    if (resultlist.get(i)==6) {
//                        nesbat = nesbat +  " برادر ";
//
//                    }
//                    if (resultlist.get(i)==7) {
//                        nesbat = nesbat +  " شوهر ";
//
//                    }
//                    if (resultlist.get(i)==8) {
//                        nesbat = nesbat +  " زن ";
//
//                    }
//
//                }
                Nearest nearest = new Nearest(directional, sidtperson1.getText(), sidtperson2.getText(), stperson1.getText(), stperson2.getText(), nesbat);
                    ArrayList<Edge> n = nearest.printAllPaths(Integer.valueOf(sidtperson1.getText()), Integer.valueOf(sidtperson2.getText()));
                    Edge edge = new Edge();
                    edge.weight = 999;
                    for (int i = 0; i < n.size(); i++) {
                        p += n.get(i).relation;
                        System.out.println(n.get(i).relation);
                        p += "\n";
                        if (n.get(i).weight < edge.weight) {
                            edge.weight = n.get(i).weight;
                            edge.relation = n.get(i).relation;
                        }
                    }
                JFrame f1 = new JFrame("تمام نسبت ها");
                JOptionPane.showMessageDialog(f1,p,
                        "نتیجه", JOptionPane.WARNING_MESSAGE);
            }
        });

/**********************************************************************************************************************/
        nsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graph graph =new Graph(100);
                ArrayList<Edge> list = null;
                try {
                    list  = dataBase.report();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                String p = "" ;
                LinkedList<Edge>[] directional = graph.addEgde(list);
                ArrayList<Edge> nesbat = new ArrayList<>();
                LinkedList<Edge> linkedList = directional[Integer.parseInt(sidtperson1.getText())] ;
                boolean flag = false ;
                Edge edge = new Edge();
                //اول ببینیم جزو نسبت های مستقیم هست یا نه
                for( int i=0 ; i < linkedList.size() ; i++ ){
                    if(linkedList.get(i).destination.id.equals(sidtperson2.getText())){
                        edge.relation=linkedList.get(i).relation;
                        edge.weight=linkedList.get(i).weight;
                        flag =true ;
                    }
                }
                if(!flag) {//اگر جزو نسبت های مستقیم نبود غیر مستقیم رو جست و جو میکنیم

                    Nearest nearest = new Nearest(directional, sidtperson1.getText(), sidtperson2.getText(), stperson1.getText(), stperson2.getText(), nesbat);
                    ArrayList<Edge> n = nearest.printAllPaths(Integer.valueOf(sidtperson1.getText()), Integer.valueOf(sidtperson2.getText()));
                    edge.weight = 999;
                    for (int i = 0; i < n.size(); i++) {
                        p += n.get(i).relation;
                        p += "\n";
                        if (n.get(i).weight < edge.weight) {
                            edge.weight = n.get(i).weight;
                            edge.relation = n.get(i).relation;
                        }
                    }
                }

                System.out.println(" : نزدیک ترین نسبت با وزن " +  edge.weight);

                JFrame f1 = new JFrame("نزدیک ترین نسبت");
                JOptionPane.showMessageDialog(f1,edge.relation,
                        "نتیجه", JOptionPane.WARNING_MESSAGE);
            }



        });
/**********************************************************************************************************************/
        max.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graph graph =new Graph(100);
                ArrayList<Edge> list = null;
                try {
                    list  = dataBase.report();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                LinkedList<Edge>[] directional = graph.addEgde(list);
                Computing computing = new Computing(directional);

                Children maxchilde = new Children();
                int max = 0;

                for(int i=0 ;i<100 ;i++){//به تعداد ادم ها فاميل
                    if(directional[i].size()!=0){
                        Children children = new Children();
                        children.Number_of_children=computing.max(directional[i].get(0).source.id);
                        children.id=directional[i].get(0).source.id;
                        children.name=directional[i].get(0).source.name;
                        if(children.Number_of_children > max){
                            maxchilde.id=children.id;
                            maxchilde.name=children.name;
                            maxchilde.Number_of_children=children.Number_of_children;
                            max=children.Number_of_children;
                        }


                    }
                }
                JFrame f1 = new JFrame("بیشترین نواده ");
                JOptionPane.showMessageDialog(f1,  maxchilde.name +" با "+ max + " نواده " ,
                        "نتیجه", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}