
package pacInterface;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pacDAO.HorarioDAO;
import pacLogica.Horario;
       



public class TelaHorario extends javax.swing.JFrame {
    
    public List<Horario> turmas = new ArrayList<>();
    
    public List<Horario> aulas1 = new ArrayList<>();
    public List<Horario> aulas2 = new ArrayList<>();
    public List<Horario> aulas3 = new ArrayList<>();
    public List<Horario> aulas4 = new ArrayList<>();
    public List<Horario> aulas5 = new ArrayList<>();
    public List<Horario> aulas6 = new ArrayList<>();
    public List<Horario> aulas7 = new ArrayList<>();
    public List<Horario> aulas8 = new ArrayList<>();
    public List<Horario> aulas9 = new ArrayList<>();
    public List<Horario> aulas10 = new ArrayList<>();
    
    int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
    
    public TelaHorario() throws SQLException {
        initComponents();
        this.turmas();
    }

    public void verificar() throws SQLException{
        HorarioDAO dao = new HorarioDAO();              
        aulas1 = dao.listaHorario1();
        aulas2 = dao.listaHorario2();
        aulas3 = dao.listaHorario3();
        aulas4 = dao.listaHorario4();
        aulas5 = dao.listaHorario5();
        aulas6 = dao.listaHorario6();
        aulas7 = dao.listaHorario7();
        aulas8 = dao.listaHorario8();
        aulas9 = dao.listaHorario9();
        aulas10 = dao.listaHorario10();
        
        a1 = 45 - aulas1.size();
        a2 = 45 - aulas2.size();
        a3 = 45 - aulas3.size();
        a4 = 45 - aulas4.size();
        a5 = 45 - aulas5.size();
        a6 = 45 - aulas6.size();
        a7 = 45 - aulas7.size();
        a8 = 45 - aulas8.size();
        a9 = 45 - aulas9.size();
        a10 = 45 - aulas10.size();
    }
    
    public void gerar() throws SQLException{
        Collections.shuffle(aulas1);        Collections.shuffle(aulas2);
        Collections.shuffle(aulas3);        Collections.shuffle(aulas4);
        Collections.shuffle(aulas5);        Collections.shuffle(aulas6);
        Collections.shuffle(aulas7);        Collections.shuffle(aulas8);
        Collections.shuffle(aulas9);        Collections.shuffle(aulas10);
        
        aulas1();aulas2();aulas3();aulas4();aulas5();aulas6();aulas7();aulas8();aulas9();aulas10();
    }
    
    public void aulas1(){
            ctA1.setText(aulas1.get(0).getNome());ctA2.setText(aulas1.get(1).getNome());ctA3.setText(aulas1.get(2).getNome());
            ctA4.setText(aulas1.get(3).getNome());ctA5.setText(aulas1.get(4).getNome());ctA6.setText(aulas1.get(5).getNome());
            ctA7.setText(aulas1.get(6).getNome());ctA8.setText(aulas1.get(7).getNome());ctA9.setText(aulas1.get(8).getNome());
            
            ctA10.setText(aulas1.get(9).getNome());ctA11.setText(aulas1.get(10).getNome());ctA12.setText(aulas1.get(11).getNome());
            ctA13.setText(aulas1.get(12).getNome());ctA14.setText(aulas1.get(13).getNome());ctA15.setText(aulas1.get(14).getNome());
            ctA16.setText(aulas1.get(15).getNome());ctA17.setText(aulas1.get(16).getNome());ctA18.setText(aulas1.get(17).getNome());
            
            ctA19.setText(aulas1.get(18).getNome());ctA20.setText(aulas1.get(19).getNome());ctA21.setText(aulas1.get(20).getNome());
            ctA22.setText(aulas1.get(21).getNome());ctA23.setText(aulas1.get(22).getNome());ctA24.setText(aulas1.get(23).getNome());
            ctA25.setText(aulas1.get(24).getNome());ctA26.setText(aulas1.get(25).getNome());ctA27.setText(aulas1.get(26).getNome());
            
            ctA28.setText(aulas1.get(27).getNome());ctA29.setText(aulas1.get(28).getNome());ctA30.setText(aulas1.get(29).getNome());
            ctA31.setText(aulas1.get(30).getNome());ctA32.setText(aulas1.get(31).getNome());ctA33.setText(aulas1.get(32).getNome());
            ctA34.setText(aulas1.get(33).getNome());ctA35.setText(aulas1.get(34).getNome());ctA36.setText(aulas1.get(35).getNome());
            
            ctA37.setText(aulas1.get(36).getNome());ctA38.setText(aulas1.get(37).getNome());ctA39.setText(aulas1.get(38).getNome());
            ctA40.setText(aulas1.get(39).getNome());ctA41.setText(aulas1.get(40).getNome());ctA42.setText(aulas1.get(41).getNome());
            ctA43.setText(aulas1.get(42).getNome());ctA44.setText(aulas1.get(43).getNome());ctA45.setText(aulas1.get(44).getNome());
    }
    
    public void aulas2(){       
            ctB1.setText(aulas2.get(0).getNome());ctB2.setText(aulas2.get(1).getNome());ctB3.setText(aulas2.get(2).getNome());
            ctB4.setText(aulas2.get(3).getNome());ctB5.setText(aulas2.get(4).getNome());ctB6.setText(aulas2.get(5).getNome());
            ctB7.setText(aulas2.get(6).getNome());ctB8.setText(aulas2.get(7).getNome());ctB9.setText(aulas2.get(8).getNome());
            
            ctB10.setText(aulas2.get(9).getNome());ctB11.setText(aulas2.get(10).getNome());ctB12.setText(aulas2.get(11).getNome());
            ctB13.setText(aulas2.get(12).getNome());ctB14.setText(aulas2.get(13).getNome());ctB15.setText(aulas2.get(14).getNome());
            ctB16.setText(aulas2.get(15).getNome());ctB17.setText(aulas2.get(16).getNome());ctB18.setText(aulas2.get(17).getNome());
            
            ctB19.setText(aulas2.get(18).getNome());ctB20.setText(aulas2.get(19).getNome());ctB21.setText(aulas2.get(20).getNome());
            ctB22.setText(aulas2.get(21).getNome());ctB23.setText(aulas2.get(22).getNome());ctB24.setText(aulas2.get(23).getNome());
            ctB25.setText(aulas2.get(24).getNome());ctB26.setText(aulas2.get(25).getNome());ctB27.setText(aulas2.get(26).getNome());
            
            ctB28.setText(aulas2.get(27).getNome());ctB29.setText(aulas2.get(28).getNome());ctB30.setText(aulas2.get(29).getNome());
            ctB31.setText(aulas2.get(30).getNome());ctB32.setText(aulas2.get(31).getNome());ctB33.setText(aulas2.get(32).getNome());
            ctB34.setText(aulas2.get(33).getNome());ctB35.setText(aulas2.get(34).getNome());ctB36.setText(aulas2.get(35).getNome());
            
            ctB37.setText(aulas2.get(36).getNome());ctB38.setText(aulas2.get(37).getNome());ctB39.setText(aulas2.get(38).getNome());
            ctB40.setText(aulas2.get(39).getNome());ctB41.setText(aulas2.get(40).getNome());ctB42.setText(aulas2.get(41).getNome());
            ctB43.setText(aulas2.get(42).getNome());ctB44.setText(aulas2.get(43).getNome());ctB45.setText(aulas2.get(44).getNome());
    }
    
    public void aulas3(){       
            ctC1.setText(aulas3.get(0).getNome());ctC2.setText(aulas3.get(1).getNome());ctC3.setText(aulas3.get(2).getNome());
            ctC4.setText(aulas3.get(3).getNome());ctC5.setText(aulas3.get(4).getNome());ctC6.setText(aulas3.get(5).getNome());
            ctC7.setText(aulas3.get(6).getNome());ctC8.setText(aulas3.get(7).getNome());ctC9.setText(aulas3.get(8).getNome());
    
            ctC10.setText(aulas3.get(9).getNome());ctC11.setText(aulas3.get(10).getNome());ctC12.setText(aulas3.get(11).getNome());
            ctC13.setText(aulas3.get(12).getNome());ctC14.setText(aulas3.get(13).getNome());ctC15.setText(aulas3.get(14).getNome());
            ctC16.setText(aulas3.get(15).getNome());ctC17.setText(aulas3.get(16).getNome());ctC18.setText(aulas3.get(17).getNome());
            
            ctC19.setText(aulas3.get(18).getNome());ctC20.setText(aulas3.get(19).getNome());ctC21.setText(aulas3.get(20).getNome());
            ctC22.setText(aulas3.get(21).getNome());ctC23.setText(aulas3.get(22).getNome());ctC24.setText(aulas3.get(23).getNome());
            ctC25.setText(aulas3.get(24).getNome());ctC26.setText(aulas3.get(25).getNome());ctC27.setText(aulas3.get(26).getNome());
            
            ctC28.setText(aulas3.get(27).getNome());ctC29.setText(aulas3.get(28).getNome());ctC30.setText(aulas3.get(29).getNome());
            ctC31.setText(aulas3.get(30).getNome());ctC32.setText(aulas3.get(31).getNome());ctC33.setText(aulas3.get(32).getNome());
            ctC34.setText(aulas3.get(33).getNome());ctC35.setText(aulas3.get(34).getNome());ctC36.setText(aulas3.get(35).getNome());
            
            ctC37.setText(aulas3.get(36).getNome());ctC38.setText(aulas3.get(37).getNome());ctC39.setText(aulas3.get(38).getNome());
            ctC40.setText(aulas3.get(39).getNome());ctC41.setText(aulas3.get(40).getNome());ctC42.setText(aulas3.get(41).getNome());
            ctC43.setText(aulas3.get(42).getNome());ctC44.setText(aulas3.get(43).getNome());ctC45.setText(aulas3.get(44).getNome());
    }
    
    public void aulas4(){       
            ctD1.setText(aulas4.get(0).getNome());ctD2.setText(aulas4.get(1).getNome());ctD3.setText(aulas4.get(2).getNome());
            ctD4.setText(aulas4.get(3).getNome());ctD5.setText(aulas4.get(4).getNome());ctD6.setText(aulas4.get(5).getNome());
            ctD7.setText(aulas4.get(6).getNome());ctD8.setText(aulas4.get(7).getNome());ctD9.setText(aulas4.get(8).getNome());
    
            ctD10.setText(aulas4.get(9).getNome());ctD11.setText(aulas4.get(10).getNome());ctD12.setText(aulas4.get(11).getNome());
            ctD13.setText(aulas4.get(12).getNome());ctD14.setText(aulas4.get(13).getNome());ctD15.setText(aulas4.get(14).getNome());
            ctD16.setText(aulas4.get(15).getNome());ctD17.setText(aulas4.get(16).getNome());ctD18.setText(aulas4.get(17).getNome());
            
            ctD19.setText(aulas4.get(18).getNome());ctD20.setText(aulas4.get(19).getNome());ctD21.setText(aulas4.get(20).getNome());
            ctD22.setText(aulas4.get(21).getNome());ctD23.setText(aulas4.get(22).getNome());ctD24.setText(aulas4.get(23).getNome());
            ctD25.setText(aulas4.get(24).getNome());ctD26.setText(aulas4.get(25).getNome());ctD27.setText(aulas4.get(26).getNome());
            
            ctD28.setText(aulas4.get(27).getNome());ctD29.setText(aulas4.get(28).getNome());ctD30.setText(aulas4.get(29).getNome());
            ctD31.setText(aulas4.get(30).getNome());ctD32.setText(aulas4.get(31).getNome());ctD33.setText(aulas4.get(32).getNome());
            ctD34.setText(aulas4.get(33).getNome());ctD35.setText(aulas4.get(34).getNome());ctD36.setText(aulas4.get(35).getNome());
            
            ctD37.setText(aulas4.get(36).getNome());ctD38.setText(aulas4.get(37).getNome());ctD39.setText(aulas4.get(38).getNome());
            ctD40.setText(aulas4.get(39).getNome());ctD41.setText(aulas4.get(40).getNome());ctD42.setText(aulas4.get(41).getNome());
            ctD43.setText(aulas4.get(42).getNome());ctD44.setText(aulas4.get(43).getNome());ctD45.setText(aulas4.get(44).getNome());
    }
    
    
    
    public void aulas5(){       
            ctE1.setText(aulas5.get(0).getNome());ctE2.setText(aulas5.get(1).getNome());ctE3.setText(aulas5.get(2).getNome());
            ctE4.setText(aulas5.get(3).getNome());ctE5.setText(aulas5.get(4).getNome());ctE6.setText(aulas5.get(5).getNome());
            ctE7.setText(aulas5.get(6).getNome());ctE8.setText(aulas5.get(7).getNome());ctE9.setText(aulas5.get(8).getNome());
    
            ctE10.setText(aulas5.get(9).getNome());ctE11.setText(aulas5.get(10).getNome());ctE12.setText(aulas5.get(11).getNome());
            ctE13.setText(aulas5.get(12).getNome());ctE14.setText(aulas5.get(13).getNome());ctE15.setText(aulas5.get(14).getNome());
            ctE16.setText(aulas5.get(15).getNome());ctE17.setText(aulas5.get(16).getNome());ctE18.setText(aulas5.get(17).getNome());
            
            ctE19.setText(aulas5.get(18).getNome());ctE20.setText(aulas5.get(19).getNome());ctE21.setText(aulas5.get(20).getNome());
            ctE22.setText(aulas5.get(21).getNome());ctE23.setText(aulas5.get(22).getNome());ctE24.setText(aulas5.get(23).getNome());
            ctE25.setText(aulas5.get(24).getNome());ctE26.setText(aulas5.get(25).getNome());ctE27.setText(aulas5.get(26).getNome());
            
            ctE28.setText(aulas5.get(27).getNome());ctE29.setText(aulas5.get(28).getNome());ctE30.setText(aulas5.get(29).getNome());
            ctE31.setText(aulas5.get(30).getNome());ctE32.setText(aulas5.get(31).getNome());ctE33.setText(aulas5.get(32).getNome());
            ctE34.setText(aulas5.get(33).getNome());ctE35.setText(aulas5.get(34).getNome());ctE36.setText(aulas5.get(35).getNome());
            
            ctE37.setText(aulas5.get(36).getNome());ctE38.setText(aulas5.get(37).getNome());ctE39.setText(aulas5.get(38).getNome());
            ctE40.setText(aulas5.get(39).getNome());ctE41.setText(aulas5.get(40).getNome());ctE42.setText(aulas5.get(41).getNome());
            ctE43.setText(aulas5.get(42).getNome());ctE44.setText(aulas5.get(43).getNome());ctE45.setText(aulas5.get(44).getNome());
    }
    
    public void aulas6(){       
            ctF1.setText(aulas6.get(0).getNome());ctF2.setText(aulas6.get(1).getNome());ctF3.setText(aulas6.get(2).getNome());
            ctF4.setText(aulas6.get(3).getNome());ctF5.setText(aulas6.get(4).getNome());ctF6.setText(aulas6.get(5).getNome());
            ctF7.setText(aulas6.get(6).getNome());ctF8.setText(aulas6.get(7).getNome());ctF9.setText(aulas6.get(8).getNome());
    
            ctF10.setText(aulas6.get(9).getNome());ctF11.setText(aulas6.get(10).getNome());ctF12.setText(aulas6.get(11).getNome());
            ctF13.setText(aulas6.get(12).getNome());ctF14.setText(aulas6.get(13).getNome());ctF15.setText(aulas6.get(14).getNome());
            ctF16.setText(aulas6.get(15).getNome());ctF17.setText(aulas6.get(16).getNome());ctF18.setText(aulas6.get(17).getNome());
            
            ctF19.setText(aulas6.get(18).getNome());ctF20.setText(aulas6.get(19).getNome());ctF21.setText(aulas6.get(20).getNome());
            ctF22.setText(aulas6.get(21).getNome());ctF23.setText(aulas6.get(22).getNome());ctF24.setText(aulas6.get(23).getNome());
            ctF25.setText(aulas6.get(24).getNome());ctF26.setText(aulas6.get(25).getNome());ctF27.setText(aulas6.get(26).getNome());
            
            ctF28.setText(aulas6.get(27).getNome());ctF29.setText(aulas6.get(28).getNome());ctF30.setText(aulas6.get(29).getNome());
            ctF31.setText(aulas6.get(30).getNome());ctF32.setText(aulas6.get(31).getNome());ctF33.setText(aulas6.get(32).getNome());
            ctF34.setText(aulas6.get(33).getNome());ctF35.setText(aulas6.get(34).getNome());ctF36.setText(aulas6.get(35).getNome());
            
            ctF37.setText(aulas6.get(36).getNome());ctF38.setText(aulas6.get(37).getNome());ctF39.setText(aulas6.get(38).getNome());
            ctF40.setText(aulas6.get(39).getNome());ctF41.setText(aulas6.get(40).getNome());ctF42.setText(aulas6.get(41).getNome());
            ctF43.setText(aulas6.get(42).getNome());ctF44.setText(aulas6.get(43).getNome());ctF45.setText(aulas6.get(44).getNome());
    }
    
    public void aulas7(){       
            ctG1.setText(aulas7.get(0).getNome());ctG2.setText(aulas7.get(1).getNome());ctG3.setText(aulas7.get(2).getNome());
            ctG4.setText(aulas7.get(3).getNome());ctG5.setText(aulas7.get(4).getNome());ctG6.setText(aulas7.get(5).getNome());
            ctG7.setText(aulas7.get(6).getNome());ctG8.setText(aulas7.get(7).getNome());ctG9.setText(aulas7.get(8).getNome());
            
            ctG10.setText(aulas7.get(9).getNome());ctG11.setText(aulas7.get(10).getNome());ctG12.setText(aulas7.get(11).getNome());
            ctG13.setText(aulas7.get(12).getNome());ctG14.setText(aulas7.get(13).getNome());ctG15.setText(aulas7.get(14).getNome());
            ctG16.setText(aulas7.get(15).getNome());ctG17.setText(aulas7.get(16).getNome());ctG18.setText(aulas7.get(17).getNome());
    
            ctG19.setText(aulas7.get(18).getNome());ctG20.setText(aulas7.get(19).getNome());ctG21.setText(aulas7.get(20).getNome());
            ctG22.setText(aulas7.get(21).getNome());ctG23.setText(aulas7.get(22).getNome());ctG24.setText(aulas7.get(23).getNome());
            ctG25.setText(aulas7.get(24).getNome());ctG26.setText(aulas7.get(25).getNome());ctG27.setText(aulas7.get(26).getNome());
            
            ctG28.setText(aulas7.get(27).getNome());ctG29.setText(aulas7.get(28).getNome());ctG30.setText(aulas7.get(29).getNome());
            ctG31.setText(aulas7.get(30).getNome());ctG32.setText(aulas7.get(31).getNome());ctG33.setText(aulas7.get(32).getNome());
            ctG34.setText(aulas7.get(33).getNome());ctG35.setText(aulas7.get(34).getNome());ctG36.setText(aulas7.get(35).getNome());
            
            ctG37.setText(aulas7.get(36).getNome());ctG38.setText(aulas7.get(37).getNome());ctG39.setText(aulas7.get(38).getNome());
            ctG40.setText(aulas7.get(39).getNome());ctG41.setText(aulas7.get(40).getNome());ctG42.setText(aulas7.get(41).getNome());
            ctG43.setText(aulas7.get(42).getNome());ctG44.setText(aulas7.get(43).getNome());ctG45.setText(aulas7.get(44).getNome());
    }
    
    public void aulas8(){       
            ctH1.setText(aulas8.get(0).getNome());ctH2.setText(aulas8.get(1).getNome());ctH3.setText(aulas8.get(2).getNome());
            ctH4.setText(aulas8.get(3).getNome());ctH5.setText(aulas8.get(4).getNome());ctH6.setText(aulas8.get(5).getNome());
            ctH7.setText(aulas8.get(6).getNome());ctH8.setText(aulas8.get(7).getNome());ctH9.setText(aulas8.get(8).getNome());
    
            ctH10.setText(aulas8.get(9).getNome());ctH11.setText(aulas8.get(10).getNome());ctH12.setText(aulas8.get(11).getNome());
            ctH13.setText(aulas8.get(12).getNome());ctH14.setText(aulas8.get(13).getNome());ctH15.setText(aulas8.get(14).getNome());
            ctH16.setText(aulas8.get(15).getNome());ctH17.setText(aulas8.get(16).getNome());ctH18.setText(aulas8.get(17).getNome());
            
            ctH19.setText(aulas8.get(18).getNome());ctH20.setText(aulas8.get(19).getNome());ctH21.setText(aulas8.get(20).getNome());
            ctH22.setText(aulas8.get(21).getNome());ctH23.setText(aulas8.get(22).getNome());ctH24.setText(aulas8.get(23).getNome());
            ctH25.setText(aulas8.get(24).getNome());ctH26.setText(aulas8.get(25).getNome());ctH27.setText(aulas8.get(26).getNome());
            
            ctH28.setText(aulas8.get(27).getNome());ctH29.setText(aulas8.get(28).getNome());ctH30.setText(aulas8.get(29).getNome());
            ctH31.setText(aulas8.get(30).getNome());ctH32.setText(aulas8.get(31).getNome());ctH33.setText(aulas8.get(32).getNome());
            ctH34.setText(aulas8.get(33).getNome());ctH35.setText(aulas8.get(34).getNome());ctH36.setText(aulas8.get(35).getNome());
            
            ctH37.setText(aulas8.get(36).getNome());ctH38.setText(aulas8.get(37).getNome());ctH39.setText(aulas8.get(38).getNome());
            ctH40.setText(aulas8.get(39).getNome());ctH41.setText(aulas8.get(40).getNome());ctH42.setText(aulas8.get(41).getNome());
            ctH43.setText(aulas8.get(42).getNome());ctH44.setText(aulas8.get(43).getNome());ctH45.setText(aulas8.get(44).getNome());
    }
    
    public void aulas9(){       
            ctI1.setText(aulas9.get(0).getNome());ctI2.setText(aulas9.get(1).getNome());ctI3.setText(aulas9.get(2).getNome());
            ctI4.setText(aulas9.get(3).getNome());ctI5.setText(aulas9.get(4).getNome());ctI6.setText(aulas9.get(5).getNome());
            ctI7.setText(aulas9.get(6).getNome());ctI8.setText(aulas9.get(7).getNome());ctI9.setText(aulas9.get(8).getNome());
    
            ctI10.setText(aulas9.get(9).getNome());ctI11.setText(aulas9.get(10).getNome());ctI12.setText(aulas9.get(11).getNome());
            ctI13.setText(aulas9.get(12).getNome());ctI14.setText(aulas9.get(13).getNome());ctI15.setText(aulas9.get(14).getNome());
            ctI16.setText(aulas9.get(15).getNome());ctI17.setText(aulas9.get(16).getNome());ctI18.setText(aulas9.get(17).getNome());
            
            ctI19.setText(aulas9.get(18).getNome());ctI20.setText(aulas9.get(19).getNome());ctI21.setText(aulas9.get(20).getNome());
            ctI22.setText(aulas9.get(21).getNome());ctI23.setText(aulas9.get(22).getNome());ctI24.setText(aulas9.get(23).getNome());
            ctI25.setText(aulas9.get(24).getNome());ctI26.setText(aulas9.get(25).getNome());ctI27.setText(aulas9.get(26).getNome());
            
            ctI28.setText(aulas9.get(27).getNome());ctI29.setText(aulas9.get(28).getNome());ctI30.setText(aulas9.get(29).getNome());
            ctI31.setText(aulas9.get(30).getNome());ctI32.setText(aulas9.get(31).getNome());ctI33.setText(aulas9.get(32).getNome());
            ctI34.setText(aulas9.get(33).getNome());ctI35.setText(aulas9.get(34).getNome());ctI36.setText(aulas9.get(35).getNome());
            
            ctI37.setText(aulas9.get(36).getNome());ctI38.setText(aulas9.get(37).getNome());ctI39.setText(aulas9.get(38).getNome());
            ctI40.setText(aulas9.get(39).getNome());ctI41.setText(aulas9.get(40).getNome());ctI42.setText(aulas9.get(41).getNome());
            ctI43.setText(aulas9.get(42).getNome());ctI44.setText(aulas9.get(43).getNome());ctI45.setText(aulas9.get(44).getNome());
    }
    
    public void aulas10(){       
            ctJ1.setText(aulas10.get(0).getNome());ctJ2.setText(aulas10.get(1).getNome());ctJ3.setText(aulas10.get(2).getNome());
            ctJ4.setText(aulas10.get(3).getNome());ctJ5.setText(aulas10.get(4).getNome());ctJ6.setText(aulas10.get(5).getNome());
            ctJ7.setText(aulas10.get(6).getNome());ctJ8.setText(aulas10.get(7).getNome());ctJ9.setText(aulas10.get(8).getNome());
    
            ctJ10.setText(aulas10.get(9).getNome());ctJ11.setText(aulas10.get(10).getNome());ctJ12.setText(aulas10.get(11).getNome());
            ctJ13.setText(aulas10.get(12).getNome());ctJ14.setText(aulas10.get(13).getNome());ctJ15.setText(aulas10.get(14).getNome());
            ctJ16.setText(aulas10.get(15).getNome());ctJ17.setText(aulas10.get(16).getNome());ctJ18.setText(aulas10.get(17).getNome());
            
            ctJ19.setText(aulas10.get(18).getNome());ctJ20.setText(aulas10.get(19).getNome());ctJ21.setText(aulas10.get(20).getNome());
            ctJ22.setText(aulas10.get(21).getNome());ctJ23.setText(aulas10.get(22).getNome());ctJ24.setText(aulas10.get(23).getNome());
            ctJ25.setText(aulas10.get(24).getNome());ctJ26.setText(aulas10.get(25).getNome());ctJ27.setText(aulas10.get(26).getNome());
            
            ctJ28.setText(aulas10.get(27).getNome());ctJ29.setText(aulas10.get(28).getNome());ctJ30.setText(aulas10.get(29).getNome());
            ctJ31.setText(aulas10.get(30).getNome());ctJ32.setText(aulas10.get(31).getNome());ctJ33.setText(aulas10.get(32).getNome());
            ctJ34.setText(aulas10.get(33).getNome());ctJ35.setText(aulas10.get(34).getNome());ctJ36.setText(aulas10.get(35).getNome());
            
            ctJ37.setText(aulas10.get(36).getNome());ctJ38.setText(aulas10.get(37).getNome());ctJ39.setText(aulas10.get(38).getNome());
            ctJ40.setText(aulas10.get(39).getNome());ctJ41.setText(aulas10.get(40).getNome());ctJ42.setText(aulas10.get(41).getNome());
            ctJ43.setText(aulas10.get(42).getNome());ctJ44.setText(aulas10.get(43).getNome());ctJ45.setText(aulas10.get(44).getNome());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ctA1 = new javax.swing.JTextField();
        ctA2 = new javax.swing.JTextField();
        ctA3 = new javax.swing.JTextField();
        ctA4 = new javax.swing.JTextField();
        ctA5 = new javax.swing.JTextField();
        ctA6 = new javax.swing.JTextField();
        ctA7 = new javax.swing.JTextField();
        ctA8 = new javax.swing.JTextField();
        ctA9 = new javax.swing.JTextField();
        ctB1 = new javax.swing.JTextField();
        ctB2 = new javax.swing.JTextField();
        ctB3 = new javax.swing.JTextField();
        ctB4 = new javax.swing.JTextField();
        ctB5 = new javax.swing.JTextField();
        ctB6 = new javax.swing.JTextField();
        ctB7 = new javax.swing.JTextField();
        ctB8 = new javax.swing.JTextField();
        ctB9 = new javax.swing.JTextField();
        lbA1 = new javax.swing.JLabel();
        lbA2 = new javax.swing.JLabel();
        ctC1 = new javax.swing.JTextField();
        ctC2 = new javax.swing.JTextField();
        ctC3 = new javax.swing.JTextField();
        ctC4 = new javax.swing.JTextField();
        ctC5 = new javax.swing.JTextField();
        ctC6 = new javax.swing.JTextField();
        ctC7 = new javax.swing.JTextField();
        ctC8 = new javax.swing.JTextField();
        ctC9 = new javax.swing.JTextField();
        lbA3 = new javax.swing.JLabel();
        ctD1 = new javax.swing.JTextField();
        ctD2 = new javax.swing.JTextField();
        ctD3 = new javax.swing.JTextField();
        ctD4 = new javax.swing.JTextField();
        ctD5 = new javax.swing.JTextField();
        ctD6 = new javax.swing.JTextField();
        ctD7 = new javax.swing.JTextField();
        ctD8 = new javax.swing.JTextField();
        ctD9 = new javax.swing.JTextField();
        ctE1 = new javax.swing.JTextField();
        ctE2 = new javax.swing.JTextField();
        ctE3 = new javax.swing.JTextField();
        ctE4 = new javax.swing.JTextField();
        ctE5 = new javax.swing.JTextField();
        ctE6 = new javax.swing.JTextField();
        ctE7 = new javax.swing.JTextField();
        ctE8 = new javax.swing.JTextField();
        ctE9 = new javax.swing.JTextField();
        lbA5 = new javax.swing.JLabel();
        ctF1 = new javax.swing.JTextField();
        ctF2 = new javax.swing.JTextField();
        ctF3 = new javax.swing.JTextField();
        ctF4 = new javax.swing.JTextField();
        ctF5 = new javax.swing.JTextField();
        ctF6 = new javax.swing.JTextField();
        ctF7 = new javax.swing.JTextField();
        ctF8 = new javax.swing.JTextField();
        ctF9 = new javax.swing.JTextField();
        ctG1 = new javax.swing.JTextField();
        ctG2 = new javax.swing.JTextField();
        ctG3 = new javax.swing.JTextField();
        ctG4 = new javax.swing.JTextField();
        ctG5 = new javax.swing.JTextField();
        ctG6 = new javax.swing.JTextField();
        ctG7 = new javax.swing.JTextField();
        ctG8 = new javax.swing.JTextField();
        ctG9 = new javax.swing.JTextField();
        lbA6 = new javax.swing.JLabel();
        lbA7 = new javax.swing.JLabel();
        ctH1 = new javax.swing.JTextField();
        ctH2 = new javax.swing.JTextField();
        ctH3 = new javax.swing.JTextField();
        ctH4 = new javax.swing.JTextField();
        ctH5 = new javax.swing.JTextField();
        ctH6 = new javax.swing.JTextField();
        ctH7 = new javax.swing.JTextField();
        ctH8 = new javax.swing.JTextField();
        ctH9 = new javax.swing.JTextField();
        lbA8 = new javax.swing.JLabel();
        ctI1 = new javax.swing.JTextField();
        ctI2 = new javax.swing.JTextField();
        ctI3 = new javax.swing.JTextField();
        ctI4 = new javax.swing.JTextField();
        ctI5 = new javax.swing.JTextField();
        ctI6 = new javax.swing.JTextField();
        ctI7 = new javax.swing.JTextField();
        ctI8 = new javax.swing.JTextField();
        ctI9 = new javax.swing.JTextField();
        ctJ1 = new javax.swing.JTextField();
        ctJ2 = new javax.swing.JTextField();
        ctJ3 = new javax.swing.JTextField();
        ctJ4 = new javax.swing.JTextField();
        ctJ5 = new javax.swing.JTextField();
        ctJ6 = new javax.swing.JTextField();
        ctJ7 = new javax.swing.JTextField();
        ctJ8 = new javax.swing.JTextField();
        ctJ9 = new javax.swing.JTextField();
        lbA9 = new javax.swing.JLabel();
        lbA10 = new javax.swing.JLabel();
        lbA4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ctA10 = new javax.swing.JTextField();
        ctA11 = new javax.swing.JTextField();
        ctA12 = new javax.swing.JTextField();
        ctA13 = new javax.swing.JTextField();
        ctA14 = new javax.swing.JTextField();
        ctA15 = new javax.swing.JTextField();
        ctA16 = new javax.swing.JTextField();
        ctA17 = new javax.swing.JTextField();
        ctA18 = new javax.swing.JTextField();
        ctB10 = new javax.swing.JTextField();
        ctB11 = new javax.swing.JTextField();
        ctB12 = new javax.swing.JTextField();
        ctB13 = new javax.swing.JTextField();
        ctB14 = new javax.swing.JTextField();
        ctB15 = new javax.swing.JTextField();
        ctB16 = new javax.swing.JTextField();
        ctB17 = new javax.swing.JTextField();
        ctB18 = new javax.swing.JTextField();
        ctC10 = new javax.swing.JTextField();
        ctC11 = new javax.swing.JTextField();
        ctC12 = new javax.swing.JTextField();
        ctC13 = new javax.swing.JTextField();
        ctC14 = new javax.swing.JTextField();
        ctC15 = new javax.swing.JTextField();
        ctC16 = new javax.swing.JTextField();
        ctC17 = new javax.swing.JTextField();
        ctC18 = new javax.swing.JTextField();
        ctD10 = new javax.swing.JTextField();
        ctD11 = new javax.swing.JTextField();
        ctD12 = new javax.swing.JTextField();
        ctD13 = new javax.swing.JTextField();
        ctD14 = new javax.swing.JTextField();
        ctD15 = new javax.swing.JTextField();
        ctD16 = new javax.swing.JTextField();
        ctD17 = new javax.swing.JTextField();
        ctD18 = new javax.swing.JTextField();
        ctE10 = new javax.swing.JTextField();
        ctE11 = new javax.swing.JTextField();
        ctE12 = new javax.swing.JTextField();
        ctE13 = new javax.swing.JTextField();
        ctE14 = new javax.swing.JTextField();
        ctE15 = new javax.swing.JTextField();
        ctE16 = new javax.swing.JTextField();
        ctE17 = new javax.swing.JTextField();
        ctE18 = new javax.swing.JTextField();
        ctF10 = new javax.swing.JTextField();
        ctF11 = new javax.swing.JTextField();
        ctF12 = new javax.swing.JTextField();
        ctF13 = new javax.swing.JTextField();
        ctF14 = new javax.swing.JTextField();
        ctF15 = new javax.swing.JTextField();
        ctF16 = new javax.swing.JTextField();
        ctF17 = new javax.swing.JTextField();
        ctF18 = new javax.swing.JTextField();
        ctG10 = new javax.swing.JTextField();
        ctG11 = new javax.swing.JTextField();
        ctG12 = new javax.swing.JTextField();
        ctG13 = new javax.swing.JTextField();
        ctG14 = new javax.swing.JTextField();
        ctG15 = new javax.swing.JTextField();
        ctG16 = new javax.swing.JTextField();
        ctG17 = new javax.swing.JTextField();
        ctG18 = new javax.swing.JTextField();
        ctH10 = new javax.swing.JTextField();
        ctH11 = new javax.swing.JTextField();
        ctH12 = new javax.swing.JTextField();
        ctH13 = new javax.swing.JTextField();
        ctH14 = new javax.swing.JTextField();
        ctH15 = new javax.swing.JTextField();
        ctH16 = new javax.swing.JTextField();
        ctH17 = new javax.swing.JTextField();
        ctH18 = new javax.swing.JTextField();
        ctI10 = new javax.swing.JTextField();
        ctI11 = new javax.swing.JTextField();
        ctI12 = new javax.swing.JTextField();
        ctI13 = new javax.swing.JTextField();
        ctI14 = new javax.swing.JTextField();
        ctI15 = new javax.swing.JTextField();
        ctI16 = new javax.swing.JTextField();
        ctI17 = new javax.swing.JTextField();
        ctI18 = new javax.swing.JTextField();
        ctJ10 = new javax.swing.JTextField();
        ctJ11 = new javax.swing.JTextField();
        ctJ12 = new javax.swing.JTextField();
        ctJ13 = new javax.swing.JTextField();
        ctJ14 = new javax.swing.JTextField();
        ctJ15 = new javax.swing.JTextField();
        ctJ16 = new javax.swing.JTextField();
        ctJ17 = new javax.swing.JTextField();
        ctJ18 = new javax.swing.JTextField();
        lbA11 = new javax.swing.JLabel();
        lbA12 = new javax.swing.JLabel();
        lbA13 = new javax.swing.JLabel();
        lbA14 = new javax.swing.JLabel();
        lbA15 = new javax.swing.JLabel();
        lbA16 = new javax.swing.JLabel();
        lbA17 = new javax.swing.JLabel();
        lbA18 = new javax.swing.JLabel();
        lbA19 = new javax.swing.JLabel();
        lbA20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbA21 = new javax.swing.JLabel();
        lbA22 = new javax.swing.JLabel();
        lbA23 = new javax.swing.JLabel();
        lbA24 = new javax.swing.JLabel();
        lbA25 = new javax.swing.JLabel();
        lbA26 = new javax.swing.JLabel();
        lbA27 = new javax.swing.JLabel();
        lbA28 = new javax.swing.JLabel();
        lbA29 = new javax.swing.JLabel();
        lbA30 = new javax.swing.JLabel();
        ctA19 = new javax.swing.JTextField();
        ctA20 = new javax.swing.JTextField();
        ctA21 = new javax.swing.JTextField();
        ctA22 = new javax.swing.JTextField();
        ctA23 = new javax.swing.JTextField();
        ctA24 = new javax.swing.JTextField();
        ctA25 = new javax.swing.JTextField();
        ctA26 = new javax.swing.JTextField();
        ctA27 = new javax.swing.JTextField();
        ctB19 = new javax.swing.JTextField();
        ctB20 = new javax.swing.JTextField();
        ctB21 = new javax.swing.JTextField();
        ctB22 = new javax.swing.JTextField();
        ctB23 = new javax.swing.JTextField();
        ctB24 = new javax.swing.JTextField();
        ctB25 = new javax.swing.JTextField();
        ctB26 = new javax.swing.JTextField();
        ctB27 = new javax.swing.JTextField();
        ctC19 = new javax.swing.JTextField();
        ctC20 = new javax.swing.JTextField();
        ctC21 = new javax.swing.JTextField();
        ctC22 = new javax.swing.JTextField();
        ctC23 = new javax.swing.JTextField();
        ctC24 = new javax.swing.JTextField();
        ctC25 = new javax.swing.JTextField();
        ctC26 = new javax.swing.JTextField();
        ctC27 = new javax.swing.JTextField();
        ctD19 = new javax.swing.JTextField();
        ctD20 = new javax.swing.JTextField();
        ctD21 = new javax.swing.JTextField();
        ctD22 = new javax.swing.JTextField();
        ctD23 = new javax.swing.JTextField();
        ctD24 = new javax.swing.JTextField();
        ctD25 = new javax.swing.JTextField();
        ctD26 = new javax.swing.JTextField();
        ctD27 = new javax.swing.JTextField();
        ctE19 = new javax.swing.JTextField();
        ctE20 = new javax.swing.JTextField();
        ctE21 = new javax.swing.JTextField();
        ctE22 = new javax.swing.JTextField();
        ctE23 = new javax.swing.JTextField();
        ctE24 = new javax.swing.JTextField();
        ctE25 = new javax.swing.JTextField();
        ctE26 = new javax.swing.JTextField();
        ctE27 = new javax.swing.JTextField();
        ctF19 = new javax.swing.JTextField();
        ctF20 = new javax.swing.JTextField();
        ctF21 = new javax.swing.JTextField();
        ctF22 = new javax.swing.JTextField();
        ctF23 = new javax.swing.JTextField();
        ctF24 = new javax.swing.JTextField();
        ctF25 = new javax.swing.JTextField();
        ctF26 = new javax.swing.JTextField();
        ctF27 = new javax.swing.JTextField();
        ctG19 = new javax.swing.JTextField();
        ctG20 = new javax.swing.JTextField();
        ctG21 = new javax.swing.JTextField();
        ctG22 = new javax.swing.JTextField();
        ctG23 = new javax.swing.JTextField();
        ctG24 = new javax.swing.JTextField();
        ctG25 = new javax.swing.JTextField();
        ctG26 = new javax.swing.JTextField();
        ctG27 = new javax.swing.JTextField();
        ctH19 = new javax.swing.JTextField();
        ctH20 = new javax.swing.JTextField();
        ctH21 = new javax.swing.JTextField();
        ctH22 = new javax.swing.JTextField();
        ctH23 = new javax.swing.JTextField();
        ctH24 = new javax.swing.JTextField();
        ctH25 = new javax.swing.JTextField();
        ctH26 = new javax.swing.JTextField();
        ctH27 = new javax.swing.JTextField();
        ctI19 = new javax.swing.JTextField();
        ctI20 = new javax.swing.JTextField();
        ctI21 = new javax.swing.JTextField();
        ctI22 = new javax.swing.JTextField();
        ctI23 = new javax.swing.JTextField();
        ctI24 = new javax.swing.JTextField();
        ctI25 = new javax.swing.JTextField();
        ctI26 = new javax.swing.JTextField();
        ctI27 = new javax.swing.JTextField();
        ctJ19 = new javax.swing.JTextField();
        ctJ20 = new javax.swing.JTextField();
        ctJ21 = new javax.swing.JTextField();
        ctJ22 = new javax.swing.JTextField();
        ctJ23 = new javax.swing.JTextField();
        ctJ24 = new javax.swing.JTextField();
        ctJ25 = new javax.swing.JTextField();
        ctJ26 = new javax.swing.JTextField();
        ctJ27 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbA31 = new javax.swing.JLabel();
        lbA32 = new javax.swing.JLabel();
        lbA33 = new javax.swing.JLabel();
        lbA34 = new javax.swing.JLabel();
        lbA35 = new javax.swing.JLabel();
        lbA36 = new javax.swing.JLabel();
        lbA37 = new javax.swing.JLabel();
        lbA38 = new javax.swing.JLabel();
        lbA39 = new javax.swing.JLabel();
        lbA40 = new javax.swing.JLabel();
        ctA28 = new javax.swing.JTextField();
        ctA29 = new javax.swing.JTextField();
        ctA30 = new javax.swing.JTextField();
        ctA31 = new javax.swing.JTextField();
        ctA32 = new javax.swing.JTextField();
        ctA33 = new javax.swing.JTextField();
        ctA34 = new javax.swing.JTextField();
        ctA35 = new javax.swing.JTextField();
        ctA36 = new javax.swing.JTextField();
        ctB28 = new javax.swing.JTextField();
        ctB29 = new javax.swing.JTextField();
        ctB30 = new javax.swing.JTextField();
        ctB31 = new javax.swing.JTextField();
        ctB32 = new javax.swing.JTextField();
        ctB33 = new javax.swing.JTextField();
        ctB34 = new javax.swing.JTextField();
        ctB35 = new javax.swing.JTextField();
        ctB36 = new javax.swing.JTextField();
        ctC28 = new javax.swing.JTextField();
        ctC29 = new javax.swing.JTextField();
        ctC30 = new javax.swing.JTextField();
        ctC31 = new javax.swing.JTextField();
        ctC32 = new javax.swing.JTextField();
        ctC33 = new javax.swing.JTextField();
        ctC34 = new javax.swing.JTextField();
        ctC35 = new javax.swing.JTextField();
        ctC36 = new javax.swing.JTextField();
        ctD28 = new javax.swing.JTextField();
        ctD29 = new javax.swing.JTextField();
        ctD30 = new javax.swing.JTextField();
        ctD31 = new javax.swing.JTextField();
        ctD32 = new javax.swing.JTextField();
        ctD33 = new javax.swing.JTextField();
        ctD34 = new javax.swing.JTextField();
        ctD35 = new javax.swing.JTextField();
        ctD36 = new javax.swing.JTextField();
        ctE28 = new javax.swing.JTextField();
        ctE29 = new javax.swing.JTextField();
        ctE30 = new javax.swing.JTextField();
        ctE31 = new javax.swing.JTextField();
        ctE32 = new javax.swing.JTextField();
        ctE33 = new javax.swing.JTextField();
        ctE34 = new javax.swing.JTextField();
        ctE35 = new javax.swing.JTextField();
        ctE36 = new javax.swing.JTextField();
        ctF28 = new javax.swing.JTextField();
        ctF29 = new javax.swing.JTextField();
        ctF30 = new javax.swing.JTextField();
        ctF31 = new javax.swing.JTextField();
        ctF32 = new javax.swing.JTextField();
        ctF33 = new javax.swing.JTextField();
        ctF34 = new javax.swing.JTextField();
        ctF35 = new javax.swing.JTextField();
        ctF36 = new javax.swing.JTextField();
        ctG28 = new javax.swing.JTextField();
        ctG29 = new javax.swing.JTextField();
        ctG30 = new javax.swing.JTextField();
        ctG31 = new javax.swing.JTextField();
        ctG32 = new javax.swing.JTextField();
        ctG33 = new javax.swing.JTextField();
        ctG34 = new javax.swing.JTextField();
        ctG35 = new javax.swing.JTextField();
        ctG36 = new javax.swing.JTextField();
        ctH28 = new javax.swing.JTextField();
        ctH29 = new javax.swing.JTextField();
        ctH30 = new javax.swing.JTextField();
        ctH31 = new javax.swing.JTextField();
        ctH32 = new javax.swing.JTextField();
        ctH33 = new javax.swing.JTextField();
        ctH34 = new javax.swing.JTextField();
        ctH35 = new javax.swing.JTextField();
        ctH36 = new javax.swing.JTextField();
        ctI28 = new javax.swing.JTextField();
        ctI29 = new javax.swing.JTextField();
        ctI30 = new javax.swing.JTextField();
        ctI31 = new javax.swing.JTextField();
        ctI32 = new javax.swing.JTextField();
        ctI33 = new javax.swing.JTextField();
        ctI34 = new javax.swing.JTextField();
        ctI35 = new javax.swing.JTextField();
        ctI36 = new javax.swing.JTextField();
        ctJ28 = new javax.swing.JTextField();
        ctJ29 = new javax.swing.JTextField();
        ctJ30 = new javax.swing.JTextField();
        ctJ31 = new javax.swing.JTextField();
        ctJ32 = new javax.swing.JTextField();
        ctJ33 = new javax.swing.JTextField();
        ctJ34 = new javax.swing.JTextField();
        ctJ35 = new javax.swing.JTextField();
        ctJ36 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbA41 = new javax.swing.JLabel();
        lbA42 = new javax.swing.JLabel();
        lbA43 = new javax.swing.JLabel();
        lbA44 = new javax.swing.JLabel();
        lbA45 = new javax.swing.JLabel();
        lbA46 = new javax.swing.JLabel();
        lbA47 = new javax.swing.JLabel();
        lbA48 = new javax.swing.JLabel();
        lbA49 = new javax.swing.JLabel();
        lbA50 = new javax.swing.JLabel();
        ctA37 = new javax.swing.JTextField();
        ctA38 = new javax.swing.JTextField();
        ctA39 = new javax.swing.JTextField();
        ctA40 = new javax.swing.JTextField();
        ctA41 = new javax.swing.JTextField();
        ctA42 = new javax.swing.JTextField();
        ctA43 = new javax.swing.JTextField();
        ctA44 = new javax.swing.JTextField();
        ctA45 = new javax.swing.JTextField();
        ctB37 = new javax.swing.JTextField();
        ctB38 = new javax.swing.JTextField();
        ctB39 = new javax.swing.JTextField();
        ctB40 = new javax.swing.JTextField();
        ctB41 = new javax.swing.JTextField();
        ctB42 = new javax.swing.JTextField();
        ctB43 = new javax.swing.JTextField();
        ctB44 = new javax.swing.JTextField();
        ctB45 = new javax.swing.JTextField();
        ctC37 = new javax.swing.JTextField();
        ctC38 = new javax.swing.JTextField();
        ctC39 = new javax.swing.JTextField();
        ctC40 = new javax.swing.JTextField();
        ctC41 = new javax.swing.JTextField();
        ctC42 = new javax.swing.JTextField();
        ctC43 = new javax.swing.JTextField();
        ctC44 = new javax.swing.JTextField();
        ctC45 = new javax.swing.JTextField();
        ctD37 = new javax.swing.JTextField();
        ctD38 = new javax.swing.JTextField();
        ctD39 = new javax.swing.JTextField();
        ctD40 = new javax.swing.JTextField();
        ctD41 = new javax.swing.JTextField();
        ctD42 = new javax.swing.JTextField();
        ctD43 = new javax.swing.JTextField();
        ctD44 = new javax.swing.JTextField();
        ctD45 = new javax.swing.JTextField();
        ctE37 = new javax.swing.JTextField();
        ctE38 = new javax.swing.JTextField();
        ctE39 = new javax.swing.JTextField();
        ctE40 = new javax.swing.JTextField();
        ctE41 = new javax.swing.JTextField();
        ctE42 = new javax.swing.JTextField();
        ctE43 = new javax.swing.JTextField();
        ctE44 = new javax.swing.JTextField();
        ctE45 = new javax.swing.JTextField();
        ctF37 = new javax.swing.JTextField();
        ctF38 = new javax.swing.JTextField();
        ctF39 = new javax.swing.JTextField();
        ctF40 = new javax.swing.JTextField();
        ctF41 = new javax.swing.JTextField();
        ctF42 = new javax.swing.JTextField();
        ctF43 = new javax.swing.JTextField();
        ctF44 = new javax.swing.JTextField();
        ctF45 = new javax.swing.JTextField();
        ctG37 = new javax.swing.JTextField();
        ctG38 = new javax.swing.JTextField();
        ctG39 = new javax.swing.JTextField();
        ctG40 = new javax.swing.JTextField();
        ctG41 = new javax.swing.JTextField();
        ctG42 = new javax.swing.JTextField();
        ctG43 = new javax.swing.JTextField();
        ctG44 = new javax.swing.JTextField();
        ctG45 = new javax.swing.JTextField();
        ctH37 = new javax.swing.JTextField();
        ctH38 = new javax.swing.JTextField();
        ctH39 = new javax.swing.JTextField();
        ctH40 = new javax.swing.JTextField();
        ctH41 = new javax.swing.JTextField();
        ctH42 = new javax.swing.JTextField();
        ctH43 = new javax.swing.JTextField();
        ctH44 = new javax.swing.JTextField();
        ctH45 = new javax.swing.JTextField();
        ctI37 = new javax.swing.JTextField();
        ctI38 = new javax.swing.JTextField();
        ctI39 = new javax.swing.JTextField();
        ctI40 = new javax.swing.JTextField();
        ctI41 = new javax.swing.JTextField();
        ctI42 = new javax.swing.JTextField();
        ctI43 = new javax.swing.JTextField();
        ctI44 = new javax.swing.JTextField();
        ctI45 = new javax.swing.JTextField();
        ctJ37 = new javax.swing.JTextField();
        ctJ38 = new javax.swing.JTextField();
        ctJ39 = new javax.swing.JTextField();
        ctJ40 = new javax.swing.JTextField();
        ctJ41 = new javax.swing.JTextField();
        ctJ42 = new javax.swing.JTextField();
        ctJ43 = new javax.swing.JTextField();
        ctJ44 = new javax.swing.JTextField();
        ctJ45 = new javax.swing.JTextField();
        btGerar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela - Horários");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 0));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ctA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 112, -1));

        ctA2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 112, -1));

        ctA3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 112, -1));

        ctA4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 112, -1));

        ctA5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 112, -1));

        ctA6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 112, -1));

        ctA7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 112, -1));

        ctA8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 112, -1));

        ctA9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, 112, -1));

        ctB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, 112, -1));

        ctB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 69, 112, -1));

        ctB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 107, 112, -1));

        ctB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 133, 112, -1));

        ctB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 159, 112, -1));

        ctB6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 197, 112, -1));

        ctB7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 223, 112, -1));

        ctB8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 261, 112, -1));

        ctB9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 287, 112, -1));

        lbA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA1.setForeground(new java.awt.Color(0, 153, 0));
        lbA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 71, 19));

        lbA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA2.setForeground(new java.awt.Color(0, 153, 0));
        lbA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 18, 71, 19));

        ctC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 43, 112, -1));

        ctC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 69, 112, -1));

        ctC3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 107, 112, -1));

        ctC4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 133, 112, -1));

        ctC5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 159, 112, -1));

        ctC6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 197, 112, -1));

        ctC7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 223, 112, -1));

        ctC8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 112, -1));

        ctC9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 287, 112, -1));

        lbA3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA3.setForeground(new java.awt.Color(0, 153, 0));
        lbA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 18, 71, 19));

        ctD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 43, 112, -1));

        ctD2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 69, 112, -1));

        ctD3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 107, 112, -1));

        ctD4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 133, 112, -1));

        ctD5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 159, 112, -1));

        ctD6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 197, 112, -1));

        ctD7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 223, 112, -1));

        ctD8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 261, 112, -1));

        ctD9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctD9, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 287, 112, -1));

        ctE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 43, 112, -1));

        ctE2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 69, 112, -1));

        ctE3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 107, 112, -1));

        ctE4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 133, 112, -1));

        ctE5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 159, 112, -1));

        ctE6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 197, 112, -1));

        ctE7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 223, 112, -1));

        ctE8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 261, 112, -1));

        ctE9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctE9, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 287, 112, -1));

        lbA5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA5.setForeground(new java.awt.Color(0, 153, 0));
        lbA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 18, 71, 19));

        ctF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 43, 112, -1));

        ctF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 69, 112, -1));

        ctF3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 107, 112, -1));

        ctF4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 133, 112, -1));

        ctF5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 159, 112, -1));

        ctF6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 197, 112, -1));

        ctF7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 223, 112, -1));

        ctF8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 261, 112, -1));

        ctF9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 287, 112, -1));

        ctG1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 43, 112, -1));

        ctG2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 69, 112, -1));

        ctG3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 107, 112, -1));

        ctG4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, 112, -1));

        ctG5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG5, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 159, 112, -1));

        ctG6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG6, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 197, 112, -1));

        ctG7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG7, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 223, 112, -1));

        ctG8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG8, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 261, 112, -1));

        ctG9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctG9, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 287, 112, -1));

        lbA6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA6.setForeground(new java.awt.Color(0, 153, 0));
        lbA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 18, 71, 19));

        lbA7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA7.setForeground(new java.awt.Color(0, 153, 0));
        lbA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 18, 71, 19));

        ctH1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 43, 112, -1));

        ctH2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 69, 112, -1));

        ctH3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 107, 112, -1));

        ctH4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 133, 112, -1));

        ctH5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 159, 112, -1));

        ctH6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 197, 112, -1));

        ctH7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 223, 112, -1));

        ctH8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 261, 112, -1));

        ctH9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 287, 112, -1));

        lbA8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA8.setForeground(new java.awt.Color(0, 153, 0));
        lbA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 18, 71, 19));

        ctI1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 43, 112, -1));

        ctI2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 69, 112, -1));

        ctI3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 107, 112, -1));

        ctI4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI4, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 133, 112, -1));

        ctI5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI5, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 159, 112, -1));

        ctI6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI6, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 197, 112, -1));

        ctI7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI7, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 223, 112, -1));

        ctI8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI8, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 261, 112, -1));

        ctI9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctI9, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 287, 112, -1));

        ctJ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 43, 112, -1));

        ctJ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 69, 112, -1));

        ctJ3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 107, 112, -1));

        ctJ4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 133, 112, -1));

        ctJ5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 159, 112, -1));

        ctJ6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 197, 112, -1));

        ctJ7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 223, 112, -1));

        ctJ8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 261, 112, -1));

        ctJ9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ctJ9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 287, 112, -1));

        lbA9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA9.setForeground(new java.awt.Color(0, 153, 0));
        lbA9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 18, 71, 19));

        lbA10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA10.setForeground(new java.awt.Color(0, 153, 0));
        lbA10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 18, 71, 19));

        lbA4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA4.setForeground(new java.awt.Color(0, 153, 0));
        lbA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 18, 71, 19));

        jTabbedPane1.addTab("Segunda", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ctA10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 112, -1));

        ctA11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 112, -1));

        ctA12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 112, -1));

        ctA13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 112, -1));

        ctA14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 112, -1));

        ctA15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 112, -1));

        ctA16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 112, -1));

        ctA17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 112, -1));

        ctA18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctA18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, 112, -1));

        ctB10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, 112, -1));

        ctB11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 69, 112, -1));

        ctB12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 107, 112, -1));

        ctB13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 133, 112, -1));

        ctB14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB14, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 159, 112, -1));

        ctB15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB15, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 197, 112, -1));

        ctB16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB16, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 223, 112, -1));

        ctB17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB17, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 261, 112, -1));

        ctB18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctB18, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 287, 112, -1));

        ctC10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 43, 112, -1));

        ctC11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 69, 112, -1));

        ctC12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC12, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 107, 112, -1));

        ctC13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 133, 112, -1));

        ctC14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC14, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 159, 112, -1));

        ctC15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC15, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 197, 112, -1));

        ctC16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC16, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 223, 112, -1));

        ctC17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC17, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 112, -1));

        ctC18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctC18, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 287, 112, -1));

        ctD10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD10, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 43, 112, -1));

        ctD11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD11, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 69, 112, -1));

        ctD12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD12, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 107, 112, -1));

        ctD13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD13, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 133, 112, -1));

        ctD14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD14, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 159, 112, -1));

        ctD15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD15, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 197, 112, -1));

        ctD16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD16, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 223, 112, -1));

        ctD17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD17, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 261, 112, -1));

        ctD18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctD18, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 287, 112, -1));

        ctE10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 43, 112, -1));

        ctE11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE11, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 69, 112, -1));

        ctE12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE12, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 107, 112, -1));

        ctE13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE13, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 133, 112, -1));

        ctE14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE14, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 159, 112, -1));

        ctE15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE15, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 197, 112, -1));

        ctE16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE16, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 223, 112, -1));

        ctE17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE17, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 261, 112, -1));

        ctE18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctE18, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 287, 112, -1));

        ctF10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 43, 112, -1));

        ctF11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 69, 112, -1));

        ctF12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 107, 112, -1));

        ctF13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 133, 112, -1));

        ctF14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 159, 112, -1));

        ctF15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 197, 112, -1));

        ctF16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 223, 112, -1));

        ctF17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 261, 112, -1));

        ctF18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctF18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 287, 112, -1));

        ctG10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG10, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 43, 112, -1));

        ctG11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG11, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 69, 112, -1));

        ctG12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG12, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 107, 112, -1));

        ctG13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, 112, -1));

        ctG14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG14, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 159, 112, -1));

        ctG15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG15, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 197, 112, -1));

        ctG16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG16, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 223, 112, -1));

        ctG17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG17, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 261, 112, -1));

        ctG18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctG18, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 287, 112, -1));

        ctH10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 43, 112, -1));

        ctH11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 69, 112, -1));

        ctH12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 107, 112, -1));

        ctH13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH13, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 133, 112, -1));

        ctH14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH14, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 159, 112, -1));

        ctH15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH15, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 197, 112, -1));

        ctH16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH16, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 223, 112, -1));

        ctH17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH17, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 261, 112, -1));

        ctH18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctH18, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 287, 112, -1));

        ctI10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI10, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 43, 112, -1));

        ctI11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI11, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 69, 112, -1));

        ctI12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI12, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 107, 112, -1));

        ctI13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI13, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 133, 112, -1));

        ctI14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI14, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 159, 112, -1));

        ctI15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI15, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 197, 112, -1));

        ctI16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI16, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 223, 112, -1));

        ctI17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 261, 112, -1));

        ctI18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctI18, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 287, 112, -1));

        ctJ10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 43, 112, -1));

        ctJ11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 69, 112, -1));

        ctJ12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 107, 112, -1));

        ctJ13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 133, 112, -1));

        ctJ14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 159, 112, -1));

        ctJ15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 197, 112, -1));

        ctJ16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 223, 112, -1));

        ctJ17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 261, 112, -1));

        ctJ18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(ctJ18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 287, 112, -1));

        lbA11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA11.setForeground(new java.awt.Color(0, 153, 0));
        lbA11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 71, 19));

        lbA12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA12.setForeground(new java.awt.Color(0, 153, 0));
        lbA12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 18, 71, 19));

        lbA13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA13.setForeground(new java.awt.Color(0, 153, 0));
        lbA13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 18, 71, 19));

        lbA14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA14.setForeground(new java.awt.Color(0, 153, 0));
        lbA14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA14, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 18, 71, 19));

        lbA15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA15.setForeground(new java.awt.Color(0, 153, 0));
        lbA15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA15, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 18, 71, 19));

        lbA16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA16.setForeground(new java.awt.Color(0, 153, 0));
        lbA16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 18, 71, 19));

        lbA17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA17.setForeground(new java.awt.Color(0, 153, 0));
        lbA17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA17, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 18, 71, 19));

        lbA18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA18.setForeground(new java.awt.Color(0, 153, 0));
        lbA18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA18, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 18, 71, 19));

        lbA19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA19.setForeground(new java.awt.Color(0, 153, 0));
        lbA19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 18, 71, 19));

        lbA20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA20.setForeground(new java.awt.Color(0, 153, 0));
        lbA20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbA20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 18, 71, 19));

        jTabbedPane1.addTab("Terça", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbA21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA21.setForeground(new java.awt.Color(0, 153, 0));
        lbA21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 71, 19));

        lbA22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA22.setForeground(new java.awt.Color(0, 153, 0));
        lbA22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA22, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 18, 71, 19));

        lbA23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA23.setForeground(new java.awt.Color(0, 153, 0));
        lbA23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA23, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 18, 71, 19));

        lbA24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA24.setForeground(new java.awt.Color(0, 153, 0));
        lbA24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA24, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 18, 71, 19));

        lbA25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA25.setForeground(new java.awt.Color(0, 153, 0));
        lbA25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA25, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 18, 71, 19));

        lbA26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA26.setForeground(new java.awt.Color(0, 153, 0));
        lbA26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 18, 71, 19));

        lbA27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA27.setForeground(new java.awt.Color(0, 153, 0));
        lbA27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA27, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 18, 71, 19));

        lbA28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA28.setForeground(new java.awt.Color(0, 153, 0));
        lbA28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA28, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 18, 71, 19));

        lbA29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA29.setForeground(new java.awt.Color(0, 153, 0));
        lbA29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 18, 71, 19));

        lbA30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA30.setForeground(new java.awt.Color(0, 153, 0));
        lbA30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbA30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 18, 71, 19));

        ctA19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 112, -1));

        ctA20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 112, -1));

        ctA21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 112, -1));

        ctA22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 112, -1));

        ctA23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 112, -1));

        ctA24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 112, -1));

        ctA25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 112, -1));

        ctA26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 112, -1));

        ctA27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctA27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, 112, -1));

        ctB19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB19, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, 112, -1));

        ctB20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 69, 112, -1));

        ctB21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 107, 112, -1));

        ctB22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB22, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 133, 112, -1));

        ctB23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 159, 112, -1));

        ctB24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB24, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 197, 112, -1));

        ctB25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB25, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 223, 112, -1));

        ctB26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB26, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 261, 112, -1));

        ctB27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctB27, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 287, 112, -1));

        ctC19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC19, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 43, 112, -1));

        ctC20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC20, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 69, 112, -1));

        ctC21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC21, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 107, 112, -1));

        ctC22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC22, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 133, 112, -1));

        ctC23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC23, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 159, 112, -1));

        ctC24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC24, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 197, 112, -1));

        ctC25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC25, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 223, 112, -1));

        ctC26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC26, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 112, -1));

        ctC27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctC27, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 287, 112, -1));

        ctD19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD19, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 43, 112, -1));

        ctD20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD20, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 69, 112, -1));

        ctD21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD21, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 107, 112, -1));

        ctD22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD22, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 133, 112, -1));

        ctD23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD23, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 159, 112, -1));

        ctD24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD24, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 197, 112, -1));

        ctD25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD25, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 223, 112, -1));

        ctD26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD26, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 261, 112, -1));

        ctD27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctD27, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 287, 112, -1));

        ctE19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE19, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 43, 112, -1));

        ctE20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE20, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 69, 112, -1));

        ctE21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE21, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 107, 112, -1));

        ctE22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE22, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 133, 112, -1));

        ctE23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE23, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 159, 112, -1));

        ctE24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE24, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 197, 112, -1));

        ctE25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE25, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 223, 112, -1));

        ctE26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE26, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 261, 112, -1));

        ctE27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctE27, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 287, 112, -1));

        ctF19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 43, 112, -1));

        ctF20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 69, 112, -1));

        ctF21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 107, 112, -1));

        ctF22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 133, 112, -1));

        ctF23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 159, 112, -1));

        ctF24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 197, 112, -1));

        ctF25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 223, 112, -1));

        ctF26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 261, 112, -1));

        ctF27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctF27, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 287, 112, -1));

        ctG19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG19, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 43, 112, -1));

        ctG20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG20, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 69, 112, -1));

        ctG21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG21, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 107, 112, -1));

        ctG22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG22, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, 112, -1));

        ctG23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG23, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 159, 112, -1));

        ctG24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG24, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 197, 112, -1));

        ctG25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG25, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 223, 112, -1));

        ctG26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG26, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 261, 112, -1));

        ctG27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctG27, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 287, 112, -1));

        ctH19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH19, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 43, 112, -1));

        ctH20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH20, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 69, 112, -1));

        ctH21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH21, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 107, 112, -1));

        ctH22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH22, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 133, 112, -1));

        ctH23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH23, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 159, 112, -1));

        ctH24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH24, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 197, 112, -1));

        ctH25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH25, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 223, 112, -1));

        ctH26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH26, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 261, 112, -1));

        ctH27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctH27, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 287, 112, -1));

        ctI19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI19, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 43, 112, -1));

        ctI20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI20, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 69, 112, -1));

        ctI21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI21, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 107, 112, -1));

        ctI22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI22, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 133, 112, -1));

        ctI23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI23, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 159, 112, -1));

        ctI24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI24, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 197, 112, -1));

        ctI25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI25, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 223, 112, -1));

        ctI26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI26, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 261, 112, -1));

        ctI27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctI27, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 287, 112, -1));

        ctJ19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 287, 112, -1));

        ctJ20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 261, 112, -1));

        ctJ21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 223, 112, -1));

        ctJ22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 197, 112, -1));

        ctJ23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 159, 112, -1));

        ctJ24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 133, 112, -1));

        ctJ25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 107, 112, -1));

        ctJ26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 69, 112, -1));

        ctJ27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(ctJ27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 43, 112, -1));

        jTabbedPane1.addTab("Quarta", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbA31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA31.setForeground(new java.awt.Color(0, 153, 0));
        lbA31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 71, 19));

        lbA32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA32.setForeground(new java.awt.Color(0, 153, 0));
        lbA32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA32, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 18, 71, 19));

        lbA33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA33.setForeground(new java.awt.Color(0, 153, 0));
        lbA33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA33, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 18, 71, 19));

        lbA34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA34.setForeground(new java.awt.Color(0, 153, 0));
        lbA34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA34, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 18, 71, 19));

        lbA35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA35.setForeground(new java.awt.Color(0, 153, 0));
        lbA35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA35, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 18, 71, 19));

        lbA36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA36.setForeground(new java.awt.Color(0, 153, 0));
        lbA36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA36, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 18, 71, 19));

        lbA37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA37.setForeground(new java.awt.Color(0, 153, 0));
        lbA37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA37, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 18, 71, 19));

        lbA38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA38.setForeground(new java.awt.Color(0, 153, 0));
        lbA38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA38, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 18, 71, 19));

        lbA39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA39.setForeground(new java.awt.Color(0, 153, 0));
        lbA39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 18, 71, 19));

        lbA40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA40.setForeground(new java.awt.Color(0, 153, 0));
        lbA40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbA40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 18, 71, 19));

        ctA28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 112, -1));

        ctA29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 112, -1));

        ctA30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 112, -1));

        ctA31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 112, -1));

        ctA32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 112, -1));

        ctA33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 112, -1));

        ctA34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 112, -1));

        ctA35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 112, -1));

        ctA36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctA36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, 112, -1));

        ctB28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB28, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, 112, -1));

        ctB29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB29, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 69, 112, -1));

        ctB30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB30, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 107, 112, -1));

        ctB31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB31, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 133, 112, -1));

        ctB32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB32, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 159, 112, -1));

        ctB33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB33, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 197, 112, -1));

        ctB34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB34, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 223, 112, -1));

        ctB35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB35, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 261, 112, -1));

        ctB36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctB36, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 287, 112, -1));

        ctC28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC28, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 43, 112, -1));

        ctC29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC29, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 69, 112, -1));

        ctC30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC30, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 107, 112, -1));

        ctC31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC31, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 133, 112, -1));

        ctC32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC32, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 159, 112, -1));

        ctC33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC33, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 197, 112, -1));

        ctC34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC34, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 223, 112, -1));

        ctC35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC35, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 112, -1));

        ctC36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctC36, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 287, 112, -1));

        ctD28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD28, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 43, 112, -1));

        ctD29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD29, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 69, 112, -1));

        ctD30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD30, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 107, 112, -1));

        ctD31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD31, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 133, 112, -1));

        ctD32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD32, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 159, 112, -1));

        ctD33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD33, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 197, 112, -1));

        ctD34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD34, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 223, 112, -1));

        ctD35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD35, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 261, 112, -1));

        ctD36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctD36, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 287, 112, -1));

        ctE28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE28, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 43, 112, -1));

        ctE29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE29, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 69, 112, -1));

        ctE30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE30, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 107, 112, -1));

        ctE31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE31, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 133, 112, -1));

        ctE32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE32, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 159, 112, -1));

        ctE33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE33, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 197, 112, -1));

        ctE34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE34, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 223, 112, -1));

        ctE35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE35, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 261, 112, -1));

        ctE36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctE36, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 287, 112, -1));

        ctF28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF28, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 43, 112, -1));

        ctF29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 69, 112, -1));

        ctF30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 107, 112, -1));

        ctF31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 133, 112, -1));

        ctF32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF32, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 159, 112, -1));

        ctF33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF33, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 197, 112, -1));

        ctF34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF34, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 223, 112, -1));

        ctF35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF35, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 261, 112, -1));

        ctF36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctF36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 287, 112, -1));

        ctG28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG28, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 43, 112, -1));

        ctG29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG29, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 69, 112, -1));

        ctG30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG30, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 107, 112, -1));

        ctG31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG31, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, 112, -1));

        ctG32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG32, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 159, 112, -1));

        ctG33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG33, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 197, 112, -1));

        ctG34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG34, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 223, 112, -1));

        ctG35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG35, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 261, 112, -1));

        ctG36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctG36, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 287, 112, -1));

        ctH28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH28, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 43, 112, -1));

        ctH29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH29, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 69, 112, -1));

        ctH30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH30, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 107, 112, -1));

        ctH31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH31, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 133, 112, -1));

        ctH32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH32, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 159, 112, -1));

        ctH33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH33, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 197, 112, -1));

        ctH34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH34, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 223, 112, -1));

        ctH35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH35, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 261, 112, -1));

        ctH36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctH36, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 287, 112, -1));

        ctI28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI28, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 43, 112, -1));

        ctI29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI29, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 69, 112, -1));

        ctI30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI30, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 107, 112, -1));

        ctI31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI31, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 133, 112, -1));

        ctI32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI32, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 159, 112, -1));

        ctI33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI33, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 197, 112, -1));

        ctI34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI34, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 223, 112, -1));

        ctI35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI35, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 261, 112, -1));

        ctI36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctI36, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 287, 112, -1));

        ctJ28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 43, 112, -1));

        ctJ29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 69, 112, -1));

        ctJ30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 107, 112, -1));

        ctJ31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 133, 112, -1));

        ctJ32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 159, 112, -1));

        ctJ33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 197, 112, -1));

        ctJ34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 223, 112, -1));

        ctJ35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 261, 112, -1));

        ctJ36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ctJ36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 287, 112, -1));

        jTabbedPane1.addTab("Quinta", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbA41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA41.setForeground(new java.awt.Color(0, 153, 0));
        lbA41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 71, 19));

        lbA42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA42.setForeground(new java.awt.Color(0, 153, 0));
        lbA42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA42, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 18, 71, 19));

        lbA43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA43.setForeground(new java.awt.Color(0, 153, 0));
        lbA43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA43, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 18, 71, 19));

        lbA44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA44.setForeground(new java.awt.Color(0, 153, 0));
        lbA44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA44, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 18, 71, 19));

        lbA45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA45.setForeground(new java.awt.Color(0, 153, 0));
        lbA45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA45, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 18, 71, 19));

        lbA46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA46.setForeground(new java.awt.Color(0, 153, 0));
        lbA46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA46, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 18, 71, 19));

        lbA47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA47.setForeground(new java.awt.Color(0, 153, 0));
        lbA47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA47, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 18, 71, 19));

        lbA48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA48.setForeground(new java.awt.Color(0, 153, 0));
        lbA48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA48, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 18, 71, 19));

        lbA49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA49.setForeground(new java.awt.Color(0, 153, 0));
        lbA49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 18, 71, 19));

        lbA50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbA50.setForeground(new java.awt.Color(0, 153, 0));
        lbA50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbA50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 18, 71, 19));

        ctA37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 112, -1));

        ctA38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 112, -1));

        ctA39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 112, -1));

        ctA40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 112, -1));

        ctA41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 112, -1));

        ctA42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 112, -1));

        ctA43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 112, -1));

        ctA44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 112, -1));

        ctA45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctA45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, 112, -1));

        ctB37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB37, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, 112, -1));

        ctB38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB38, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 69, 112, -1));

        ctB39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB39, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 107, 112, -1));

        ctB40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB40, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 133, 112, -1));

        ctB41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB41, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 159, 112, -1));

        ctB42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB42, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 197, 112, -1));

        ctB43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB43, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 223, 112, -1));

        ctB44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB44, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 261, 112, -1));

        ctB45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctB45, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 287, 112, -1));

        ctC37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC37, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 43, 112, -1));

        ctC38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC38, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 69, 112, -1));

        ctC39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC39, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 107, 112, -1));

        ctC40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC40, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 133, 112, -1));

        ctC41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC41, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 159, 112, -1));

        ctC42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC42, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 197, 112, -1));

        ctC43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC43, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 223, 112, -1));

        ctC44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC44, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 112, -1));

        ctC45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctC45, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 287, 112, -1));

        ctD37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD37, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 43, 112, -1));

        ctD38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD38, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 69, 112, -1));

        ctD39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD39, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 107, 112, -1));

        ctD40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD40, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 133, 112, -1));

        ctD41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD41, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 159, 112, -1));

        ctD42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD42, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 197, 112, -1));

        ctD43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD43, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 223, 112, -1));

        ctD44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD44, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 261, 112, -1));

        ctD45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctD45, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 287, 112, -1));

        ctE37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE37, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 43, 112, -1));

        ctE38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE38, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 69, 112, -1));

        ctE39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE39, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 107, 112, -1));

        ctE40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE40, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 133, 112, -1));

        ctE41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE41, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 159, 112, -1));

        ctE42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE42, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 197, 112, -1));

        ctE43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE43, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 223, 112, -1));

        ctE44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE44, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 261, 112, -1));

        ctE45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctE45, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 287, 112, -1));

        ctF37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 43, 112, -1));

        ctF38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF38, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 69, 112, -1));

        ctF39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF39, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 107, 112, -1));

        ctF40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF40, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 133, 112, -1));

        ctF41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 159, 112, -1));

        ctF42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF42, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 197, 112, -1));

        ctF43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF43, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 223, 112, -1));

        ctF44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF44, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 261, 112, -1));

        ctF45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctF45, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 287, 112, -1));

        ctG37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG37, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 43, 112, -1));

        ctG38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG38, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 69, 112, -1));

        ctG39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG39, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 107, 112, -1));

        ctG40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG40, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, 112, -1));

        ctG41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG41, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 159, 112, -1));

        ctG42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG42, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 197, 112, -1));

        ctG43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG43, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 223, 112, -1));

        ctG44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG44, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 261, 112, -1));

        ctG45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctG45, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 287, 112, -1));

        ctH37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH37, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 43, 112, -1));

        ctH38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH38, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 69, 112, -1));

        ctH39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH39, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 107, 112, -1));

        ctH40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH40, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 133, 112, -1));

        ctH41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH41, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 159, 112, -1));

        ctH42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH42, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 197, 112, -1));

        ctH43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH43, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 223, 112, -1));

        ctH44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH44, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 261, 112, -1));

        ctH45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctH45, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 287, 112, -1));

        ctI37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI37, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 43, 112, -1));

        ctI38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI38, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 69, 112, -1));

        ctI39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI39, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 107, 112, -1));

        ctI40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI40, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 133, 112, -1));

        ctI41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI41, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 159, 112, -1));

        ctI42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI42, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 197, 112, -1));

        ctI43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI43, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 223, 112, -1));

        ctI44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI44, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 261, 112, -1));

        ctI45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctI45, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 287, 112, -1));

        ctJ37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 43, 112, -1));

        ctJ38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 69, 112, -1));

        ctJ39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 107, 112, -1));

        ctJ40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 133, 112, -1));

        ctJ41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 159, 112, -1));

        ctJ42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 197, 112, -1));

        ctJ43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 223, 112, -1));

        ctJ44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 261, 112, -1));

        ctJ45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(ctJ45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 287, 112, -1));

        jTabbedPane1.addTab("Sexta", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 1233, 341));

        btGerar.setBackground(new java.awt.Color(255, 255, 255));
        btGerar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btGerar.setForeground(new java.awt.Color(0, 153, 0));
        btGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/time_add.png"))); // NOI18N
        btGerar.setText("Gerar Horário");
        btGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarActionPerformed(evt);
            }
        });
        getContentPane().add(btGerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 28));

        btMenu.setBackground(new java.awt.Color(255, 255, 255));
        btMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btMenu.setForeground(new java.awt.Color(0, 153, 0));
        btMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/door_out.png"))); // NOI18N
        btMenu.setText("Menu");
        btMenu.setIconTextGap(10);
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1131, 13, 102, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 510, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 500, 410));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacImagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        this.dispose();
        new TelaMenu().setVisible(true);
    }//GEN-LAST:event_btMenuActionPerformed

    private void btGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarActionPerformed
        try {
            verificar();
            if(a1 > 0 || a2 > 0 || a3 > 0 || a4 > 0 || a5 > 0 || a6 > 0 || a7 > 0 || a8 > 0 || a9 > 0 || a10 > 0 ){
                JOptionPane.showMessageDialog(null,"Para gerar o horário: \n\n"
                      + " Adicione " + a1 + " aulas na turma " + lbA1.getText() +" \n"
                      + " Adicione " + a2 + " aulas na turma " + lbA2.getText() +" \n"
                      + " Adicione " + a3 + " aulas na turma " + lbA3.getText() +" \n"
                      + " Adicione " + a4 + " aulas na turma " + lbA4.getText() +" \n"
                      + " Adicione " + a5 + " aulas na turma " + lbA5.getText() +" \n"
                      + " Adicione " + a6 + " aulas na turma " + lbA6.getText() +" \n"
                      + " Adicione " + a7 + " aulas na turma " + lbA7.getText() +" \n"
                      + " Adicione " + a8 + " aulas na turma " + lbA8.getText() +" \n"
                      + " Adicione " + a9 + " aulas na turma " + lbA9.getText() +" \n"
                      + " Adicione " + a10 + " aulas na turma " + lbA10.getText()+" \n"
               );
            }else{
                gerar();
            }         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar!");
        }

    }//GEN-LAST:event_btGerarActionPerformed

    public void turmas() throws SQLException{
        HorarioDAO dao = new HorarioDAO();
        turmas = dao.listaTurmas();
        
        lbA1.setText(turmas.get(0).getNome());lbA2.setText(turmas.get(1).getNome());
        lbA3.setText(turmas.get(2).getNome());lbA4.setText(turmas.get(3).getNome());
        lbA5.setText(turmas.get(4).getNome());lbA6.setText(turmas.get(5).getNome());  
        lbA7.setText(turmas.get(6).getNome());lbA8.setText(turmas.get(7).getNome());
        lbA9.setText(turmas.get(8).getNome());lbA10.setText(turmas.get(9).getNome());
        
        lbA11.setText(turmas.get(0).getNome());lbA12.setText(turmas.get(1).getNome());
        lbA13.setText(turmas.get(2).getNome());lbA14.setText(turmas.get(3).getNome());
        lbA15.setText(turmas.get(4).getNome());lbA16.setText(turmas.get(5).getNome());  
        lbA17.setText(turmas.get(6).getNome());lbA18.setText(turmas.get(7).getNome());
        lbA19.setText(turmas.get(8).getNome());lbA20.setText(turmas.get(9).getNome());
        
        lbA21.setText(turmas.get(0).getNome());lbA22.setText(turmas.get(1).getNome());
        lbA23.setText(turmas.get(2).getNome());lbA24.setText(turmas.get(3).getNome());
        lbA25.setText(turmas.get(4).getNome());lbA26.setText(turmas.get(5).getNome());  
        lbA27.setText(turmas.get(6).getNome());lbA28.setText(turmas.get(7).getNome());
        lbA29.setText(turmas.get(8).getNome());lbA30.setText(turmas.get(9).getNome());
        
        lbA31.setText(turmas.get(0).getNome());lbA32.setText(turmas.get(1).getNome());
        lbA33.setText(turmas.get(2).getNome());lbA34.setText(turmas.get(3).getNome());
        lbA35.setText(turmas.get(4).getNome());lbA36.setText(turmas.get(5).getNome());  
        lbA37.setText(turmas.get(6).getNome());lbA38.setText(turmas.get(7).getNome());
        lbA39.setText(turmas.get(8).getNome());lbA40.setText(turmas.get(9).getNome());
        
        lbA41.setText(turmas.get(0).getNome());lbA42.setText(turmas.get(1).getNome());
        lbA43.setText(turmas.get(2).getNome());lbA44.setText(turmas.get(3).getNome());
        lbA45.setText(turmas.get(4).getNome());lbA46.setText(turmas.get(5).getNome());  
        lbA47.setText(turmas.get(6).getNome());lbA48.setText(turmas.get(7).getNome());
        lbA49.setText(turmas.get(8).getNome());lbA50.setText(turmas.get(9).getNome());
    }
    
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
            java.util.logging.Logger.getLogger(TelaHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaHorario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaHorario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGerar;
    private javax.swing.JButton btMenu;
    private javax.swing.JTextField ctA1;
    private javax.swing.JTextField ctA10;
    private javax.swing.JTextField ctA11;
    private javax.swing.JTextField ctA12;
    private javax.swing.JTextField ctA13;
    private javax.swing.JTextField ctA14;
    private javax.swing.JTextField ctA15;
    private javax.swing.JTextField ctA16;
    private javax.swing.JTextField ctA17;
    private javax.swing.JTextField ctA18;
    private javax.swing.JTextField ctA19;
    private javax.swing.JTextField ctA2;
    private javax.swing.JTextField ctA20;
    private javax.swing.JTextField ctA21;
    private javax.swing.JTextField ctA22;
    private javax.swing.JTextField ctA23;
    private javax.swing.JTextField ctA24;
    private javax.swing.JTextField ctA25;
    private javax.swing.JTextField ctA26;
    private javax.swing.JTextField ctA27;
    private javax.swing.JTextField ctA28;
    private javax.swing.JTextField ctA29;
    private javax.swing.JTextField ctA3;
    private javax.swing.JTextField ctA30;
    private javax.swing.JTextField ctA31;
    private javax.swing.JTextField ctA32;
    private javax.swing.JTextField ctA33;
    private javax.swing.JTextField ctA34;
    private javax.swing.JTextField ctA35;
    private javax.swing.JTextField ctA36;
    private javax.swing.JTextField ctA37;
    private javax.swing.JTextField ctA38;
    private javax.swing.JTextField ctA39;
    private javax.swing.JTextField ctA4;
    private javax.swing.JTextField ctA40;
    private javax.swing.JTextField ctA41;
    private javax.swing.JTextField ctA42;
    private javax.swing.JTextField ctA43;
    private javax.swing.JTextField ctA44;
    private javax.swing.JTextField ctA45;
    private javax.swing.JTextField ctA5;
    private javax.swing.JTextField ctA6;
    private javax.swing.JTextField ctA7;
    private javax.swing.JTextField ctA8;
    private javax.swing.JTextField ctA9;
    private javax.swing.JTextField ctB1;
    private javax.swing.JTextField ctB10;
    private javax.swing.JTextField ctB11;
    private javax.swing.JTextField ctB12;
    private javax.swing.JTextField ctB13;
    private javax.swing.JTextField ctB14;
    private javax.swing.JTextField ctB15;
    private javax.swing.JTextField ctB16;
    private javax.swing.JTextField ctB17;
    private javax.swing.JTextField ctB18;
    private javax.swing.JTextField ctB19;
    private javax.swing.JTextField ctB2;
    private javax.swing.JTextField ctB20;
    private javax.swing.JTextField ctB21;
    private javax.swing.JTextField ctB22;
    private javax.swing.JTextField ctB23;
    private javax.swing.JTextField ctB24;
    private javax.swing.JTextField ctB25;
    private javax.swing.JTextField ctB26;
    private javax.swing.JTextField ctB27;
    private javax.swing.JTextField ctB28;
    private javax.swing.JTextField ctB29;
    private javax.swing.JTextField ctB3;
    private javax.swing.JTextField ctB30;
    private javax.swing.JTextField ctB31;
    private javax.swing.JTextField ctB32;
    private javax.swing.JTextField ctB33;
    private javax.swing.JTextField ctB34;
    private javax.swing.JTextField ctB35;
    private javax.swing.JTextField ctB36;
    private javax.swing.JTextField ctB37;
    private javax.swing.JTextField ctB38;
    private javax.swing.JTextField ctB39;
    private javax.swing.JTextField ctB4;
    private javax.swing.JTextField ctB40;
    private javax.swing.JTextField ctB41;
    private javax.swing.JTextField ctB42;
    private javax.swing.JTextField ctB43;
    private javax.swing.JTextField ctB44;
    private javax.swing.JTextField ctB45;
    private javax.swing.JTextField ctB5;
    private javax.swing.JTextField ctB6;
    private javax.swing.JTextField ctB7;
    private javax.swing.JTextField ctB8;
    private javax.swing.JTextField ctB9;
    private javax.swing.JTextField ctC1;
    private javax.swing.JTextField ctC10;
    private javax.swing.JTextField ctC11;
    private javax.swing.JTextField ctC12;
    private javax.swing.JTextField ctC13;
    private javax.swing.JTextField ctC14;
    private javax.swing.JTextField ctC15;
    private javax.swing.JTextField ctC16;
    private javax.swing.JTextField ctC17;
    private javax.swing.JTextField ctC18;
    private javax.swing.JTextField ctC19;
    private javax.swing.JTextField ctC2;
    private javax.swing.JTextField ctC20;
    private javax.swing.JTextField ctC21;
    private javax.swing.JTextField ctC22;
    private javax.swing.JTextField ctC23;
    private javax.swing.JTextField ctC24;
    private javax.swing.JTextField ctC25;
    private javax.swing.JTextField ctC26;
    private javax.swing.JTextField ctC27;
    private javax.swing.JTextField ctC28;
    private javax.swing.JTextField ctC29;
    private javax.swing.JTextField ctC3;
    private javax.swing.JTextField ctC30;
    private javax.swing.JTextField ctC31;
    private javax.swing.JTextField ctC32;
    private javax.swing.JTextField ctC33;
    private javax.swing.JTextField ctC34;
    private javax.swing.JTextField ctC35;
    private javax.swing.JTextField ctC36;
    private javax.swing.JTextField ctC37;
    private javax.swing.JTextField ctC38;
    private javax.swing.JTextField ctC39;
    private javax.swing.JTextField ctC4;
    private javax.swing.JTextField ctC40;
    private javax.swing.JTextField ctC41;
    private javax.swing.JTextField ctC42;
    private javax.swing.JTextField ctC43;
    private javax.swing.JTextField ctC44;
    private javax.swing.JTextField ctC45;
    private javax.swing.JTextField ctC5;
    private javax.swing.JTextField ctC6;
    private javax.swing.JTextField ctC7;
    private javax.swing.JTextField ctC8;
    private javax.swing.JTextField ctC9;
    private javax.swing.JTextField ctD1;
    private javax.swing.JTextField ctD10;
    private javax.swing.JTextField ctD11;
    private javax.swing.JTextField ctD12;
    private javax.swing.JTextField ctD13;
    private javax.swing.JTextField ctD14;
    private javax.swing.JTextField ctD15;
    private javax.swing.JTextField ctD16;
    private javax.swing.JTextField ctD17;
    private javax.swing.JTextField ctD18;
    private javax.swing.JTextField ctD19;
    private javax.swing.JTextField ctD2;
    private javax.swing.JTextField ctD20;
    private javax.swing.JTextField ctD21;
    private javax.swing.JTextField ctD22;
    private javax.swing.JTextField ctD23;
    private javax.swing.JTextField ctD24;
    private javax.swing.JTextField ctD25;
    private javax.swing.JTextField ctD26;
    private javax.swing.JTextField ctD27;
    private javax.swing.JTextField ctD28;
    private javax.swing.JTextField ctD29;
    private javax.swing.JTextField ctD3;
    private javax.swing.JTextField ctD30;
    private javax.swing.JTextField ctD31;
    private javax.swing.JTextField ctD32;
    private javax.swing.JTextField ctD33;
    private javax.swing.JTextField ctD34;
    private javax.swing.JTextField ctD35;
    private javax.swing.JTextField ctD36;
    private javax.swing.JTextField ctD37;
    private javax.swing.JTextField ctD38;
    private javax.swing.JTextField ctD39;
    private javax.swing.JTextField ctD4;
    private javax.swing.JTextField ctD40;
    private javax.swing.JTextField ctD41;
    private javax.swing.JTextField ctD42;
    private javax.swing.JTextField ctD43;
    private javax.swing.JTextField ctD44;
    private javax.swing.JTextField ctD45;
    private javax.swing.JTextField ctD5;
    private javax.swing.JTextField ctD6;
    private javax.swing.JTextField ctD7;
    private javax.swing.JTextField ctD8;
    private javax.swing.JTextField ctD9;
    private javax.swing.JTextField ctE1;
    private javax.swing.JTextField ctE10;
    private javax.swing.JTextField ctE11;
    private javax.swing.JTextField ctE12;
    private javax.swing.JTextField ctE13;
    private javax.swing.JTextField ctE14;
    private javax.swing.JTextField ctE15;
    private javax.swing.JTextField ctE16;
    private javax.swing.JTextField ctE17;
    private javax.swing.JTextField ctE18;
    private javax.swing.JTextField ctE19;
    private javax.swing.JTextField ctE2;
    private javax.swing.JTextField ctE20;
    private javax.swing.JTextField ctE21;
    private javax.swing.JTextField ctE22;
    private javax.swing.JTextField ctE23;
    private javax.swing.JTextField ctE24;
    private javax.swing.JTextField ctE25;
    private javax.swing.JTextField ctE26;
    private javax.swing.JTextField ctE27;
    private javax.swing.JTextField ctE28;
    private javax.swing.JTextField ctE29;
    private javax.swing.JTextField ctE3;
    private javax.swing.JTextField ctE30;
    private javax.swing.JTextField ctE31;
    private javax.swing.JTextField ctE32;
    private javax.swing.JTextField ctE33;
    private javax.swing.JTextField ctE34;
    private javax.swing.JTextField ctE35;
    private javax.swing.JTextField ctE36;
    private javax.swing.JTextField ctE37;
    private javax.swing.JTextField ctE38;
    private javax.swing.JTextField ctE39;
    private javax.swing.JTextField ctE4;
    private javax.swing.JTextField ctE40;
    private javax.swing.JTextField ctE41;
    private javax.swing.JTextField ctE42;
    private javax.swing.JTextField ctE43;
    private javax.swing.JTextField ctE44;
    private javax.swing.JTextField ctE45;
    private javax.swing.JTextField ctE5;
    private javax.swing.JTextField ctE6;
    private javax.swing.JTextField ctE7;
    private javax.swing.JTextField ctE8;
    private javax.swing.JTextField ctE9;
    private javax.swing.JTextField ctF1;
    private javax.swing.JTextField ctF10;
    private javax.swing.JTextField ctF11;
    private javax.swing.JTextField ctF12;
    private javax.swing.JTextField ctF13;
    private javax.swing.JTextField ctF14;
    private javax.swing.JTextField ctF15;
    private javax.swing.JTextField ctF16;
    private javax.swing.JTextField ctF17;
    private javax.swing.JTextField ctF18;
    private javax.swing.JTextField ctF19;
    private javax.swing.JTextField ctF2;
    private javax.swing.JTextField ctF20;
    private javax.swing.JTextField ctF21;
    private javax.swing.JTextField ctF22;
    private javax.swing.JTextField ctF23;
    private javax.swing.JTextField ctF24;
    private javax.swing.JTextField ctF25;
    private javax.swing.JTextField ctF26;
    private javax.swing.JTextField ctF27;
    private javax.swing.JTextField ctF28;
    private javax.swing.JTextField ctF29;
    private javax.swing.JTextField ctF3;
    private javax.swing.JTextField ctF30;
    private javax.swing.JTextField ctF31;
    private javax.swing.JTextField ctF32;
    private javax.swing.JTextField ctF33;
    private javax.swing.JTextField ctF34;
    private javax.swing.JTextField ctF35;
    private javax.swing.JTextField ctF36;
    private javax.swing.JTextField ctF37;
    private javax.swing.JTextField ctF38;
    private javax.swing.JTextField ctF39;
    private javax.swing.JTextField ctF4;
    private javax.swing.JTextField ctF40;
    private javax.swing.JTextField ctF41;
    private javax.swing.JTextField ctF42;
    private javax.swing.JTextField ctF43;
    private javax.swing.JTextField ctF44;
    private javax.swing.JTextField ctF45;
    private javax.swing.JTextField ctF5;
    private javax.swing.JTextField ctF6;
    private javax.swing.JTextField ctF7;
    private javax.swing.JTextField ctF8;
    private javax.swing.JTextField ctF9;
    private javax.swing.JTextField ctG1;
    private javax.swing.JTextField ctG10;
    private javax.swing.JTextField ctG11;
    private javax.swing.JTextField ctG12;
    private javax.swing.JTextField ctG13;
    private javax.swing.JTextField ctG14;
    private javax.swing.JTextField ctG15;
    private javax.swing.JTextField ctG16;
    private javax.swing.JTextField ctG17;
    private javax.swing.JTextField ctG18;
    private javax.swing.JTextField ctG19;
    private javax.swing.JTextField ctG2;
    private javax.swing.JTextField ctG20;
    private javax.swing.JTextField ctG21;
    private javax.swing.JTextField ctG22;
    private javax.swing.JTextField ctG23;
    private javax.swing.JTextField ctG24;
    private javax.swing.JTextField ctG25;
    private javax.swing.JTextField ctG26;
    private javax.swing.JTextField ctG27;
    private javax.swing.JTextField ctG28;
    private javax.swing.JTextField ctG29;
    private javax.swing.JTextField ctG3;
    private javax.swing.JTextField ctG30;
    private javax.swing.JTextField ctG31;
    private javax.swing.JTextField ctG32;
    private javax.swing.JTextField ctG33;
    private javax.swing.JTextField ctG34;
    private javax.swing.JTextField ctG35;
    private javax.swing.JTextField ctG36;
    private javax.swing.JTextField ctG37;
    private javax.swing.JTextField ctG38;
    private javax.swing.JTextField ctG39;
    private javax.swing.JTextField ctG4;
    private javax.swing.JTextField ctG40;
    private javax.swing.JTextField ctG41;
    private javax.swing.JTextField ctG42;
    private javax.swing.JTextField ctG43;
    private javax.swing.JTextField ctG44;
    private javax.swing.JTextField ctG45;
    private javax.swing.JTextField ctG5;
    private javax.swing.JTextField ctG6;
    private javax.swing.JTextField ctG7;
    private javax.swing.JTextField ctG8;
    private javax.swing.JTextField ctG9;
    private javax.swing.JTextField ctH1;
    private javax.swing.JTextField ctH10;
    private javax.swing.JTextField ctH11;
    private javax.swing.JTextField ctH12;
    private javax.swing.JTextField ctH13;
    private javax.swing.JTextField ctH14;
    private javax.swing.JTextField ctH15;
    private javax.swing.JTextField ctH16;
    private javax.swing.JTextField ctH17;
    private javax.swing.JTextField ctH18;
    private javax.swing.JTextField ctH19;
    private javax.swing.JTextField ctH2;
    private javax.swing.JTextField ctH20;
    private javax.swing.JTextField ctH21;
    private javax.swing.JTextField ctH22;
    private javax.swing.JTextField ctH23;
    private javax.swing.JTextField ctH24;
    private javax.swing.JTextField ctH25;
    private javax.swing.JTextField ctH26;
    private javax.swing.JTextField ctH27;
    private javax.swing.JTextField ctH28;
    private javax.swing.JTextField ctH29;
    private javax.swing.JTextField ctH3;
    private javax.swing.JTextField ctH30;
    private javax.swing.JTextField ctH31;
    private javax.swing.JTextField ctH32;
    private javax.swing.JTextField ctH33;
    private javax.swing.JTextField ctH34;
    private javax.swing.JTextField ctH35;
    private javax.swing.JTextField ctH36;
    private javax.swing.JTextField ctH37;
    private javax.swing.JTextField ctH38;
    private javax.swing.JTextField ctH39;
    private javax.swing.JTextField ctH4;
    private javax.swing.JTextField ctH40;
    private javax.swing.JTextField ctH41;
    private javax.swing.JTextField ctH42;
    private javax.swing.JTextField ctH43;
    private javax.swing.JTextField ctH44;
    private javax.swing.JTextField ctH45;
    private javax.swing.JTextField ctH5;
    private javax.swing.JTextField ctH6;
    private javax.swing.JTextField ctH7;
    private javax.swing.JTextField ctH8;
    private javax.swing.JTextField ctH9;
    private javax.swing.JTextField ctI1;
    private javax.swing.JTextField ctI10;
    private javax.swing.JTextField ctI11;
    private javax.swing.JTextField ctI12;
    private javax.swing.JTextField ctI13;
    private javax.swing.JTextField ctI14;
    private javax.swing.JTextField ctI15;
    private javax.swing.JTextField ctI16;
    private javax.swing.JTextField ctI17;
    private javax.swing.JTextField ctI18;
    private javax.swing.JTextField ctI19;
    private javax.swing.JTextField ctI2;
    private javax.swing.JTextField ctI20;
    private javax.swing.JTextField ctI21;
    private javax.swing.JTextField ctI22;
    private javax.swing.JTextField ctI23;
    private javax.swing.JTextField ctI24;
    private javax.swing.JTextField ctI25;
    private javax.swing.JTextField ctI26;
    private javax.swing.JTextField ctI27;
    private javax.swing.JTextField ctI28;
    private javax.swing.JTextField ctI29;
    private javax.swing.JTextField ctI3;
    private javax.swing.JTextField ctI30;
    private javax.swing.JTextField ctI31;
    private javax.swing.JTextField ctI32;
    private javax.swing.JTextField ctI33;
    private javax.swing.JTextField ctI34;
    private javax.swing.JTextField ctI35;
    private javax.swing.JTextField ctI36;
    private javax.swing.JTextField ctI37;
    private javax.swing.JTextField ctI38;
    private javax.swing.JTextField ctI39;
    private javax.swing.JTextField ctI4;
    private javax.swing.JTextField ctI40;
    private javax.swing.JTextField ctI41;
    private javax.swing.JTextField ctI42;
    private javax.swing.JTextField ctI43;
    private javax.swing.JTextField ctI44;
    private javax.swing.JTextField ctI45;
    private javax.swing.JTextField ctI5;
    private javax.swing.JTextField ctI6;
    private javax.swing.JTextField ctI7;
    private javax.swing.JTextField ctI8;
    private javax.swing.JTextField ctI9;
    private javax.swing.JTextField ctJ1;
    private javax.swing.JTextField ctJ10;
    private javax.swing.JTextField ctJ11;
    private javax.swing.JTextField ctJ12;
    private javax.swing.JTextField ctJ13;
    private javax.swing.JTextField ctJ14;
    private javax.swing.JTextField ctJ15;
    private javax.swing.JTextField ctJ16;
    private javax.swing.JTextField ctJ17;
    private javax.swing.JTextField ctJ18;
    private javax.swing.JTextField ctJ19;
    private javax.swing.JTextField ctJ2;
    private javax.swing.JTextField ctJ20;
    private javax.swing.JTextField ctJ21;
    private javax.swing.JTextField ctJ22;
    private javax.swing.JTextField ctJ23;
    private javax.swing.JTextField ctJ24;
    private javax.swing.JTextField ctJ25;
    private javax.swing.JTextField ctJ26;
    private javax.swing.JTextField ctJ27;
    private javax.swing.JTextField ctJ28;
    private javax.swing.JTextField ctJ29;
    private javax.swing.JTextField ctJ3;
    private javax.swing.JTextField ctJ30;
    private javax.swing.JTextField ctJ31;
    private javax.swing.JTextField ctJ32;
    private javax.swing.JTextField ctJ33;
    private javax.swing.JTextField ctJ34;
    private javax.swing.JTextField ctJ35;
    private javax.swing.JTextField ctJ36;
    private javax.swing.JTextField ctJ37;
    private javax.swing.JTextField ctJ38;
    private javax.swing.JTextField ctJ39;
    private javax.swing.JTextField ctJ4;
    private javax.swing.JTextField ctJ40;
    private javax.swing.JTextField ctJ41;
    private javax.swing.JTextField ctJ42;
    private javax.swing.JTextField ctJ43;
    private javax.swing.JTextField ctJ44;
    private javax.swing.JTextField ctJ45;
    private javax.swing.JTextField ctJ5;
    private javax.swing.JTextField ctJ6;
    private javax.swing.JTextField ctJ7;
    private javax.swing.JTextField ctJ8;
    private javax.swing.JTextField ctJ9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbA1;
    private javax.swing.JLabel lbA10;
    private javax.swing.JLabel lbA11;
    private javax.swing.JLabel lbA12;
    private javax.swing.JLabel lbA13;
    private javax.swing.JLabel lbA14;
    private javax.swing.JLabel lbA15;
    private javax.swing.JLabel lbA16;
    private javax.swing.JLabel lbA17;
    private javax.swing.JLabel lbA18;
    private javax.swing.JLabel lbA19;
    private javax.swing.JLabel lbA2;
    private javax.swing.JLabel lbA20;
    private javax.swing.JLabel lbA21;
    private javax.swing.JLabel lbA22;
    private javax.swing.JLabel lbA23;
    private javax.swing.JLabel lbA24;
    private javax.swing.JLabel lbA25;
    private javax.swing.JLabel lbA26;
    private javax.swing.JLabel lbA27;
    private javax.swing.JLabel lbA28;
    private javax.swing.JLabel lbA29;
    private javax.swing.JLabel lbA3;
    private javax.swing.JLabel lbA30;
    private javax.swing.JLabel lbA31;
    private javax.swing.JLabel lbA32;
    private javax.swing.JLabel lbA33;
    private javax.swing.JLabel lbA34;
    private javax.swing.JLabel lbA35;
    private javax.swing.JLabel lbA36;
    private javax.swing.JLabel lbA37;
    private javax.swing.JLabel lbA38;
    private javax.swing.JLabel lbA39;
    private javax.swing.JLabel lbA4;
    private javax.swing.JLabel lbA40;
    private javax.swing.JLabel lbA41;
    private javax.swing.JLabel lbA42;
    private javax.swing.JLabel lbA43;
    private javax.swing.JLabel lbA44;
    private javax.swing.JLabel lbA45;
    private javax.swing.JLabel lbA46;
    private javax.swing.JLabel lbA47;
    private javax.swing.JLabel lbA48;
    private javax.swing.JLabel lbA49;
    private javax.swing.JLabel lbA5;
    private javax.swing.JLabel lbA50;
    private javax.swing.JLabel lbA6;
    private javax.swing.JLabel lbA7;
    private javax.swing.JLabel lbA8;
    private javax.swing.JLabel lbA9;
    // End of variables declaration//GEN-END:variables
}
