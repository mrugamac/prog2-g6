package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import controlador.ControladorFactura;

public class FacturaVista extends JFrame {

    private JTextField txtCliente;
    private JTextField txtFecha;
    private JComboBox<String> cmbModoPago;
    private JTable tablaProductos;
    private DefaultTableModel modeloTabla;
    private JLabel lblTotal;
    private JButton btnNuevaFactura;
    private JButton btnAgregarProducto;
    private JButton btnEliminarProducto;
    private JButton btnFinalizarFactura;

    public FacturaVista() {
        setTitle("Sistema de Facturación - Factura");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
        new ControladorFactura(this); // Aquí conectamos el controlador
    }

    private void inicializarComponentes() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelSuperior = new JPanel(new GridLayout(2, 2, 10, 10));

        txtCliente = new JTextField();
        txtFecha = new JTextField();
        cmbModoPago = new JComboBox<>(new String[]{"Efectivo", "Tarjeta de Crédito", "Tarjeta de Débito", "Credix"});

        panelSuperior.add(new JLabel("Cliente:"));
        panelSuperior.add(txtCliente);
        panelSuperior.add(new JLabel("Fecha:"));
        panelSuperior.add(txtFecha);
        panelSuperior.add(new JLabel("Modo de Pago:"));
        panelSuperior.add(cmbModoPago);

        panel.add(panelSuperior, BorderLayout.NORTH);

        modeloTabla = new DefaultTableModel(new Object[]{"Producto", "Cantidad", "Precio Unitario", "Subtotal"}, 0);
        tablaProductos = new JTable(modeloTabla);

        panel.add(new JScrollPane(tablaProductos), BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        lblTotal = new JLabel("Total: ₡0.00");
        lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
        lblTotal.setForeground(Color.RED);

        btnNuevaFactura = new JButton("Nueva Factura");
        btnAgregarProducto = new JButton("Agregar Producto");
        btnEliminarProducto = new JButton("Eliminar Producto");
        btnFinalizarFactura = new JButton("Finalizar Factura");

        panelInferior.add(lblTotal);
        panelInferior.add(btnNuevaFactura);
        panelInferior.add(btnAgregarProducto);
        panelInferior.add(btnEliminarProducto);
        panelInferior.add(btnFinalizarFactura);

        panel.add(panelInferior, BorderLayout.SOUTH);

        add(panel);
    }

    // Métodos getters para el controlador
    public JTextField getTxtCliente() {
        return txtCliente;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public JComboBox<String> getCmbModoPago() {
        return cmbModoPago;
    }

    public JTable getTablaProductos() {
        return tablaProductos;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public JButton getBtnNuevaFactura() {
        return btnNuevaFactura;
    }

    public JButton getBtnAgregarProducto() {
        return btnAgregarProducto;
    }

    public JButton getBtnEliminarProducto() {
        return btnEliminarProducto;
    }

    public JButton getBtnFinalizarFactura() {
        return btnFinalizarFactura;
    }
}
