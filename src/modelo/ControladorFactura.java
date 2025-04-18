package controlador;

import vista.FacturaVista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFactura {

    private FacturaVista vista;

    public ControladorFactura(FacturaVista vista) {
        this.vista = vista;
        this.vista.getBtnAgregar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarProducto();
            }
        });
        this.vista.getBtnEliminar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarProducto();
            }
        });
        this.vista.getBtnNueva().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nuevaFactura();
            }
        });
        this.vista.getBtnFinalizar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                finalizarFactura();
            }
        });
    }

    private void agregarProducto() {
        String nombreProducto = JOptionPane.showInputDialog(vista, "Ingrese el nombre del producto:");
        if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
            return; // Si no escribe nada, se cancela
        }

        String cantidadStr = JOptionPane.showInputDialog(vista, "Ingrese la cantidad:");
        if (cantidadStr == null || cantidadStr.trim().isEmpty()) {
            return;
        }

        String precioStr = JOptionPane.showInputDialog(vista, "Ingrese el precio unitario:");
        if (precioStr == null || precioStr.trim().isEmpty()) {
            return;
        }

        try {
            int cantidad = Integer.parseInt(cantidadStr);
            double precio = Double.parseDouble(precioStr);
            double subtotal = cantidad * precio;

            vista.getModeloTabla().addRow(new Object[]{nombreProducto, cantidad, precio, subtotal});
            actualizarTotal();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Cantidad o precio inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarProducto() {
        int filaSeleccionada = vista.getTablaProductos().getSelectedRow();
        if (filaSeleccionada >= 0) {
            vista.getModeloTabla().removeRow(filaSeleccionada);
            actualizarTotal();
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione un producto para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void nuevaFactura() {
        DefaultTableModel modelo = vista.getModeloTabla();
        modelo.setRowCount(0); // Limpia toda la tabla
        vista.getTxtCliente().setText("");
        vista.getTxtFecha().setText("");
        vista.getComboPago().setSelectedIndex(0);
        vista.getLblTotal().setText("Total: ₡0.00");
    }

    private void finalizarFactura() {
        JOptionPane.showMessageDialog(vista, "Factura finalizada exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        nuevaFactura();
    }

    private void actualizarTotal() {
        double total = 0.0;
        for (int i = 0; i < vista.getModeloTabla().getRowCount(); i++) {
            total += (double) vista.getModeloTabla().getValueAt(i, 3); // Columna 3 = Subtotal
        }
        vista.getLblTotal().setText(String.format("Total: ₡%.2f", total));
    }
}
