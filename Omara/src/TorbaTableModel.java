import javax.swing.table.DefaultTableModel;

/*
* ime datoteke:TorbaTableModel
* avtor GAsper zivalic
* */
public class TorbaTableModel extends DefaultTableModel {
    //konstruktor
    public TorbaTableModel(){
        //konstruktor nadrazreda
        super();
        // dodamo stolpce
        addColumn("Znamka Torbe");
        addColumn("barva Torbe");
        addColumn("Teza torbe");

        Object[] vrstica = new Object[] {"Znamka ", "barva","teza"};
        //DODAMO V TABEKLO
        addRow(vrstica);
    }
    //metoda ki doda torbo v tabelo
    //vhodni parameter - torba
    public void addTorba(Torba2 t){
        //dodamo vrstico v tabelo
        //statični seznam
        Object[] vrstica = new Object[] {t.getZnamka(), t.getBarva(),t.getTeza()};
        //dodamo v tabelo
        addRow(vrstica);
    }

}
