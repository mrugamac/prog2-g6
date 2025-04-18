package vista;

import javax.swing.*;
import java.awt.*;

public class FacturaVista extends JFrame {

    // Componentes principales
    private JTextField txtCliente;
    private JTextField txtFecha;
    private JComboBox<String> comboModoPago;
    private JTable tablaDetalles;
    private JLabel lblTotal;
    private JButton btnNuevaFactura;
    private JButton btnAgregarProducto;
    private JButton btnEliminarProducto;
    private JButton btnFinalizarFactura;

    public FacturaVista() {
        setTitle("Sistema de Facturación - Factura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Colores Red Hat - Oracle
        Color rojoPrincipal = new Color(179, 0, 0); // Rojo elegante
        Color grisClaro = new Color(245, 245, 245);
        Color grisOscuro = new Color(50, 50, 50);

        // Panel superior para datos del cliente y factura
        JPanel panelSuperior = new JPanel(new GridBagLayout());
        panelSuperior.setBackground(grisClaro);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);

        JLabel lblCliente = new JLabel("Cliente:");
        JLabel lblFecha = new JLabel("Fecha:");
        JLabel lblModoPago = new JLabel("Modo de Pago:");

        txtCliente = new JTextField(20);
        txtFecha = new JTextField(15);
        txtFecha.setEditable(false); // La fecha normalmente se asigna automática
        comboModoPago = new JComboBox<>(new String[]{"Efectivo", "Tarjeta Crédito", "Tarjeta Débito", "Transferencia", "Sinpe Móvil", "Credix"});

        gbc.gridx = 0; gbc.gridy = 0; panelSuperior.add(lblCliente, gbc);
        gbc.gridx = 1; panelSuperior.add(txtCliente, gbc);

        gbc.gridx = 2; panelSuperior.add(lblFecha, gbc);
        gbc.gridx = 3; panelSuperior.add(txtFecha, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panelSuperior.add(lblModoPago, gbc);
        gbc.gridx = 1; panelSuperior.add(comboModoPago, gbc);

        // Tabla para detalle de productos
        String[] columnas = {"Producto", "Cantidad", "Precio Unitario", "Subtotal"};
        Object[][] datos = {};
        tablaDetalles = new JTable(datos, columnas);
        JScrollPane scrollTabla = new JScrollPane(tablaDetalles);

        // Panel inferior para total y botones
        JPanel panelInferior = new JPanel(new GridBagLayout());
        panelInferior.setBackground(grisClaro);

        lblTotal = new JLabel("Total: ₡0.00");
        lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
        lblTotal.setForeground(rojoPrincipal);

        btnNuevaFactura = new JButton("Nueva Factura");
        btnAgregarProducto = new JButton("Agregar Producto");
        btnEliminarProducto = new JButton("Eliminar Producto");
        btnFinalizarFactura = new JButton("Finalizar Factura");

        gbc.gridx = 0; gbc.gridy = 0; panelInferior.add(lblTotal, gbc);
        gbc.gridx = 1; panelInferior.add(btnNuevaFactura, gbc);
        gbc.gridx = 2; panelInferior.add(btnAgregarProducto, gbc);
        gbc.gridx = 3; panelInferior.add(btnEliminarProducto, gbc);
        gbc.gridx = 4; panelInferior.add(btnFinalizarFactura, gbc);

        // Agregamos paneles al JFrame
        add(panelSuperior, BorderLayout.NORTH);
        add(scrollTabla, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Getters para el controlador

    public JTextField getTxtCliente() {
        return txtCliente;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public JComboBox<String> getComboModoPago() {
        return comboModoPago;
    }

    public JTable getTablaDetalles() {
        return tablaDetalles;
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
