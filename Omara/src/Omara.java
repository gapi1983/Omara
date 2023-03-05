import javax.swing.*;
//paket za delo z dogodki
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Omara extends JFrame implements ActionListener {
    //deklariram zasebne lastnosti
    private JPanel povrsina;
    private JButton dodajJButton;
    private JTextField znamkaPolje,barvaPolje,tezaPolje;
    private JTable tabela;
    private TorbaTableModel modelTabele;
    public static void main(String[] args) {
        Omara m = new Omara("omara za torbe");
    }
    public Omara(String n){
        //konstruktor nadrazreda
        super(n);
        //prikažemo okno
        setVisible(true);
        //določimo velikost okna
        setSize(900,700);
        //ko kliknemo x se program ustavi
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //inicializiramom lastnosti
        povrsina = new JPanel();
        dodajJButton = new JButton("daj torbo v omaro");
        znamkaPolje = new JTextField(12);
        barvaPolje = new JTextField(12);
        tezaPolje = new JTextField(12);
        modelTabele = new TorbaTableModel();
        tabela = new JTable(modelTabele);

        //gumbu dodamo actionlistener
        dodajJButton.addActionListener(this);
        //dodamoi povrsino
        add(povrsina);
        //dodamo gumb in vnosna polja
        povrsina.add(new JLabel("znamka torbe"));
        povrsina.add(znamkaPolje);
        povrsina.add(new JLabel("barva torbe"));
        povrsina.add(barvaPolje);
        povrsina.add(new JLabel("teza torbe"));
        povrsina.add(tezaPolje);
        povrsina.add(dodajJButton);
        povrsina.add(tabela);

        setVisible(true);

    }

    //metoda ki jo predpisuje vmednik action listener
    @Override
    public void actionPerformed(ActionEvent ae) {

        //ustvarim lokalno spremenljivko torba
        Torba2 torba = new Torba2(znamkaPolje.getText(), barvaPolje.getText(), Double.parseDouble(tezaPolje.getText()));
        System.out.println(torba.znamka);
        System.out.println(torba.barva);
        System.out.println(torba.teza);
        //dodamo objekt v seznam
        modelTabele.addTorba(torba);
    }
}
