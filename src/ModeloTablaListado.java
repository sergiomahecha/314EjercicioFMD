
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergio
 */
public class ModeloTablaListado extends DefaultTableModel{
    private Abono[] gestora;

    public ModeloTablaListado(Abono[] gestora) {
        this.gestora = gestora;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Abono a=gestora[row];
        if(column==0){
            return a.getElAbonado().getDni();
        }if(column==1){
            return a.getElAbonado().getNombre();
        }if(column==2){
            return a.getElAbonado().getFechaDeNacimiento();
        }if(column==3){
            return a.getElAbonado().isEmpadronado();
        }if(column==4){
            return a.getTipo().getTexto();
        }if(column==5){
            return a.getMesDeAlta();
        }if(column==6){
            return a.costePrimerCuatrimestre();
        }if(column==7){
            return a.costeSegundoCuatrimestre();
        }else{
            return a.costeTercerCuatrimestre();
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        String[] nombres={"DNI","NOMBRE","EDAD","EMPADRONADO","ABONO","MES DE ALTA","CUATRIMESTRE1","CUATRIMESTRE2","CUATRIMESTRE3"};
        return nombres[column];
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public int getRowCount() {
        return gestora==null?0:gestora.length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?>[] clases={String.class,String.class,Date.class,Boolean.class,String.class,String.class,Float.class,Float.class,Float.class};
        return clases[columnIndex];
    }
    
}
