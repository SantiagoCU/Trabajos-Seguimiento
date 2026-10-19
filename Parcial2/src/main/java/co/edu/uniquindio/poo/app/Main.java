package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;
import java.time.LocalDate;
import javax.swing.JOptionPane; // Única librería estándar necesaria para las ventanas

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos la tienda principal
        Tienda tienda = new Tienda("TechRepair Quindío");

        // 2. Quemamos datos de prueba iniciales (Semillas) para agilizar las pruebas del parcial
        Cliente cliente1 = new Cliente("1010", "Santiago Cadavid", "312000", "santiago@mail.com");
        tienda.registrarCliente(cliente1);

        Escritorio pc1 = new Escritorio("EQ-01", "SER123", "Asus", "Gamer X", LocalDate.of(2025, 5, 10), "Buen Estado", TipoEquipo.COMPUTADOR_ESCRITORIO, "Intel i7", "16GB", "1TB SSD", true);
        tienda.registrarEquipo("1010", pc1);

        Tecnico tec1 = new Tecnico("TEC-01", "Carlos Gómez", "2020", Especialidad.COMPUTADORES, EstadoLaboral.ACTIVO);
        tienda.registrarTecnico(tec1);

        Repuesto rep1 = new Repuesto("REP-55", "Memoria RAM DDR4 8GB", "Módulo Kingston", 150000f, 10, TipoEquipo.COMPUTADOR_ESCRITORIO);
        tienda.registrarRepuesto(rep1);

        String menu = "===== MENU TECHREPAIR =====\n"
                + "1. Registrar Cliente\n"
                + "2. Registrar Orden de Servicio\n"
                + "3. Agregar Detalle a Orden\n"
                + "4. Asignar Técnico a Detalle\n"
                + "5. Registrar Repuesto Usado\n"
                + "6. Ver Reportes Generales\n"
                + "7. Salir\n\n"
                + "Seleccione una opción:";

        int opcion = 0;

        // 3. Ciclo interactivo con ventanas emergentes
        do {
            // El texto que ingresa el usuario en la ventana se convierte a un número entero
            String lectura = JOptionPane.showInputDialog(menu);

            // Validamos por si el usuario le da al botón "Cancelar" o la "X" de la ventana
            if (lectura == null) {
                opcion = 7;
            } else {
                opcion = Integer.parseInt(lectura);
            }

            if (opcion == 1) {
                String doc = JOptionPane.showInputDialog("Ingrese el documento del cliente:");
                String nom = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                String tel = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
                String mail = JOptionPane.showInputDialog("Ingrese el correo del cliente:");

                Cliente nuevo = new Cliente(doc, nom, tel, mail);
                tienda.registrarCliente(nuevo);
                JOptionPane.showMessageDialog(null, "Cliente procesado en el sistema.");

            } else if (opcion == 2) {
                String docCli = JOptionPane.showInputDialog("Documento del Cliente para la orden:");
                String codOrd = JOptionPane.showInputDialog("Código de la nueva Orden:");
                String desc = JOptionPane.showInputDialog("Descripción general del daño:");

                Cliente c = tienda.buscarCliente(docCli);
                if (c != null) {
                    OrdenServicio nuevaOrden = new OrdenServicio(codOrd, "Orden Taller", desc, 0f, TipoServicio.REPARACION_CORRECTIVA, LocalDate.now(), "Ninguna", EstadoOrden.ABIERTA, c);
                    tienda.crearOrden(docCli, nuevaOrden);
                    JOptionPane.showMessageDialog(null, "Orden abierta exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El cliente no existe.");
                }

            } else if (opcion == 3) {
                String codOrd = JOptionPane.showInputDialog("Código de la Orden:");
                String codDet = JOptionPane.showInputDialog("Código para este Detalle:");
                String desc = JOptionPane.showInputDialog("¿Qué se le va a hacer al equipo?:");
                String horasStr = JOptionPane.showInputDialog("Horas estimadas de trabajo:");
                byte horas = Byte.parseByte(horasStr); // Convierte el texto de la ventana a un byte

                DetalleServicio nuevoDetalle = new DetalleServicio(codDet, "Reparación", desc, 45000f, TipoServicio.REPARACION_CORRECTIVA, TipoEquipo.COMPUTADOR_ESCRITORIO, "Cambio de Pieza", horas, "Iniciado", null);
                tienda.agregarDetalle(codOrd, nuevoDetalle);
                JOptionPane.showMessageDialog(null, "Detalle indexado a la orden.");

            } else if (opcion == 4) {
                String codOrd = JOptionPane.showInputDialog("Código de la Orden:");
                String codDet = JOptionPane.showInputDialog("Código del Detalle:");
                String codTec = JOptionPane.showInputDialog("Código del Técnico a asignar:");

                tienda.asignarTecnico(codOrd, codDet, codTec);
                JOptionPane.showMessageDialog(null, "Asignación enviada.");

            } else if (opcion == 5) {
                String codOrd = JOptionPane.showInputDialog("Código de la Orden:");
                String codDet = JOptionPane.showInputDialog("Código del Detalle:");
                String codRep = JOptionPane.showInputDialog("Código del Repuesto de bodega:");
                String cantStr = JOptionPane.showInputDialog("Cantidad de unidades usadas:");
                byte cant = Byte.parseByte(cantStr);

                tienda.registrarRepuestosUtilizados(codOrd, codDet, codRep, cant);
                JOptionPane.showMessageDialog(null, "Inventario actualizado.");

            } else if (opcion == 6) {
                // Preparamos un bloque de texto para mostrar todos los reportes juntos en una sola ventana
                String reporte = "=== REPORTES DE FACTURACIÓN Y CARGA ===\n\n"
                        + "• Ingresos Totales de la Tienda: $" + tienda.calcularTotal() + "\n";

                JOptionPane.showMessageDialog(null, reporte);
                tienda.generarReporteServicios(); // Este imprime el desglose por consola
            }

        } while (opcion != 7);

        JOptionPane.showMessageDialog(null, "Programa de parcial finalizado. ¡Éxitos!");
    }
}

