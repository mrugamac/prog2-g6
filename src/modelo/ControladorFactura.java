package controlador;

import vista.FacturaVista;
import modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorFactura implements ActionListener {

    private FacturaVista vistaFactura;

    public ControladorFactura(FacturaVista vistaFactura) {
        this.vistaFactura = vistaFactura;
        agregarEventos();
    }

    private void agregarEventos() {
        vistaFactura.getBtnAgregarProducto().addActionListener(this);
        vistaFactura.getBtnEliminarProducto().addActionListener(this);
        vistaFactura.getBtnNuevaFactura().addActionListener(this);
        vistaFactura.getBtnFinalizarFactura().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaFactura.getBtnAgregarProducto()) {
            agregarProducto();
        } else if (e.getSource() == vistaFactura.getBtnEliminarProducto()) {
            eliminarProducto();
        } else if (e.getSource() == vistaFactura.getBtnNuevaFactura()) {
            nuevaFactura();
        } else if (e.getSource() == vistaFactura.getBtnFinalizarFactura()) {
            finalizarFactura();
        }
    }

    private void agregarProducto() {
        JOptionPane.showMessageDialog(null, "Función agregar producto no implementada todavía.");
    }

    private void eliminarProducto() {
        JOptionPane.showMessageDialog(null, "Función eliminar producto no implementada todavía.");
    }

    private void nuevaFactura() {
        JOptionPane.showMessageDialog(null, "Función nueva factura no implementada todavía.");
    }

    private void finalizarFactura() {
        JOptionPane.showMessageDialog(null, "Función finalizar factura no implementada todavía.");
    }
}
