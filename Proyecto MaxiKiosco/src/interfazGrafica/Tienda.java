package interfazGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JApplet;


public class Tienda extends javax.swing.JFrame {
    
    String [] productos = {"Coca cola","pepsi","lays","chetos","3D","caramelos","gomitas","cafe","galletas","chicles","cigarrillo"};
    int [] precios = {150,120,150,160,120,5,2,50,100,50,150};
    int iprecio = 0;
    double icantidad = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();
        public Tienda() {
        initComponents();
        this.setTitle("Maxi Kiosco");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        this.setIconImage(icono);
        this.setSize(700,800);
        this.setLocationRelativeTo(null); 
        Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/agregar.png"));
        agregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(50, 50,Image.SCALE_SMOOTH)));
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        seleccion.setModel(comboModel);
        CalcularPrecio();
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO P/ UNIDAD");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        tabla.getTableHeader().setFont(new Font("arial",1,16));
        tabla.getTableHeader().setForeground(Color.white);
        tabla.getTableHeader().setBackground(Color.black);
        actualizarTabla();
  
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        seleccion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Ltota = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        cantidadPrecio = new javax.swing.JLabel();
        liva = new javax.swing.JLabel();
        Lsubtotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        Reset = new javax.swing.JButton();
        Reset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("IMPORTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 30));

        precio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio.setText("PRECIO");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CANTIDAD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, 30));

        agregar.setBackground(new java.awt.Color(204, 255, 204));
        agregar.setForeground(new java.awt.Color(204, 255, 204));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 90, 60));

        seleccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });
        getContentPane().add(seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, 30));

        tabla.setBackground(new java.awt.Color(153, 153, 153));
        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "hola", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setRowHeight(35);
        tabla.setRowMargin(5);
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 620, 280));

        Ltota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ltota.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ltota.setText("$ 0.00 ARG");
        getContentPane().add(Ltota, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 120, 70));

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setText("TOTAL");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 110, 80));

        subtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtotal.setText("SUBTOTAL");
        getContentPane().add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 110, 80));

        iva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        iva.setText("IVA");
        getContentPane().add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 110, 80));

        cantidadPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cantidadPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cantidadPrecio.setText("$ 0.00 ARG");
        getContentPane().add(cantidadPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, 30));

        liva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        liva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        liva.setText("$ 0.00 ARG");
        getContentPane().add(liva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 120, 70));

        Lsubtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lsubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lsubtotal.setText("$ 0.00 ARG");
        getContentPane().add(Lsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 130, 70));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("MAXI KIOSCO LA ESQUINA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 590, 50));

        lblImporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("$ 0.00 ARG");
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 160, 30));

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("AGREGAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 30));

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 30.0d, 1.0d));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 30));

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 102, 102));
        Reset.setText("BORRAR ULTIMO ");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        Reset1.setBackground(new java.awt.Color(153, 0, 0));
        Reset1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reset1.setForeground(new java.awt.Color(0, 0, 0));
        Reset1.setText("BORRAR TODO");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(Reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        Venta venta = new Venta();
        boolean esta =true;
        int nuevaCantidad;
        venta.setId(seleccion.getSelectedIndex());
        venta.setDescripcion(seleccion.getSelectedItem().toString());
        venta.setPrecio(iprecio);
        venta.setCantidad(icantidad);
        venta.setImporte(iprecio*icantidad);
        for(Venta v : listaVentas){
            
            if(venta.getId()== v.getId()){
                System.out.println("dfsadsad");
                nuevaCantidad = (v.getCantidad() + venta.getCantidad());
                System.out.println(nuevaCantidad);
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                actualizarTabla();
                esta= false;
                break;
            }
        }           
        if(esta == true){
            listaVentas.add(venta);
            actualizarTabla();
            borrarVenta();
        }
 
    }//GEN-LAST:event_agregarActionPerformed
    public class jpColor extends javax.swing.JPanel{
    private Color color1 = new Color(0,0,0);
    private Color color2 = new Color(0,0,0);
    
    public jpColor(){
    }
    
    public jpColor(Color c1, Color c2){
        color1 = c1;
        color2 = c2;        
    }
    
    @Override
    public void paint(Graphics g) {    
        Graphics2D g2 = (Graphics2D) g.create();
        Rectangle clip = g2.getClipBounds();                        
        g2.setPaint(new GradientPaint(0.0f, 0.0f, color1.darker(),0.0f ,getHeight(), color2.darker()));        
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);        
    }
    
    public void setRandomColor(){
        Random rand = new Random();
        this.color1 = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
        this.color2 = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    }
    
    public void setVistaColor(){        
        this.color1 = new Color(66,111,166);
        this.color2 = new Color(103,174,118);        
    }
    
}
    
    
    public void borrarVenta(){
        iprecio = 0;
        icantidad = 1; 
        seleccion.setSelectedIndex(0);
        spnCantidad.setValue(1);
        CalcularPrecio();
    }
    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed
        CalcularPrecio();
    }//GEN-LAST:event_seleccionActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        CalcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        if (!listaVentas.isEmpty()){
            modelo.removeRow(modelo.getRowCount()-1);
            listaVentas.remove(listaVentas.size()-1);
                
        }
        
           
        
        
    }//GEN-LAST:event_ResetActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        if (!listaVentas.isEmpty()){
            int modelocantidad= modelo.getRowCount();
            for(int d = 0; d < modelocantidad; d++){
                modelo.removeRow(modelo.getRowCount()-1);
                listaVentas.remove(listaVentas.size()-1);
            }
        }
            
    }//GEN-LAST:event_Reset1ActionPerformed
    public void  CalcularPrecio(){
        iprecio = (int) precios[seleccion.getSelectedIndex()];
        icantidad = Double.parseDouble(spnCantidad.getValue().toString());
      
        cantidadPrecio.setText(AMoneda(iprecio,1));
        lblImporte.setText(AMoneda(iprecio, icantidad));

    } 
   public String AMoneda(int precio, double precio2){
        return "$ "+iprecio* precio2+ " ARG"; 
   }
   public void actualizarTabla(){
       while(modelo.getRowCount()>0){
           modelo.removeRow(0);
       }
       double isubtotal = 0;
       
       for(Venta v : listaVentas){
           Object[]x= new Object[4];
           x[0] = v.getDescripcion();
           x[1] = "$"+v.getPrecio()+" ARG";
           x[2] = v.getCantidad();
           x[3] = "$"+v.getImporte()+" ARG";
           isubtotal +=  v.getImporte();
           modelo.addRow(x);
           
       }
       
       double iva = Math.round((isubtotal*0.21)*100.0)/100.0;
       double itotal = isubtotal + iva;
       Lsubtotal.setText("$ "+ isubtotal +"ARG");
       liva.setText("$ "+ iva +"ARG");
       Ltota.setText("$ "+ itotal +"ARG");
       tabla.setModel(modelo);
   }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lsubtotal;
    private javax.swing.JLabel Ltota;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Reset1;
    private javax.swing.JButton agregar;
    private javax.swing.JLabel cantidadPrecio;
    private javax.swing.JLabel iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel liva;
    private javax.swing.JLabel precio;
    private javax.swing.JComboBox<String> seleccion;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
