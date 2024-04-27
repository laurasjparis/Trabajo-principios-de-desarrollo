package com.mycompany.calendapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CodigoJPanel extends JPanel implements ActionListener {
    private JLabel titulo_app;
    private JLabel ingresarActividad;
    private JTextArea ingresar_actividad;
    private JLabel jcomp4;
    private JTextArea ingresarDia;
    private JLabel jcomp6;
    private JTextField INgresarHora;
    private JButton botonGuardarActividad;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JLabel jcomp11;
    private JLabel jcomp12;
    private JLabel jcomp13;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JLabel jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;
    private JButton botonModificar;
    private JTextArea ingresarNombreModificar;
    private JLabel jcomp21;
    private JLabel jcomp22;
    private JComboBox tipoPrioridad;
    private JTextArea crearNombreUsusario;
    private JTextArea crearContraseña;
    private JButton botonGuardarUsusario;
    private JTextArea ingresarNombreUsusario;
    private JTextArea ingresarContraseña;
    private JLabel jcomp29;
    private JLabel jcomp30;
    private JLabel jcomp31;
    private JLabel jcomp32;
    private JLabel jcomp33;
    private JLabel jcomp34;
    private JButton botonIngresarUsuario;
    private JTextArea textoLunes;
    private JTextArea textoMartes;
    private JTextArea textoMiercoles;
    private JTextArea textoJueves;
    private JTextArea textoViernes;
    private JTextArea textoSabado;
    private JTextArea textoDomingo;
    private JLabel jcomp43;
    private JLabel jcomp44;
    private JLabel jcomp45;
    private JLabel jcomp46;
    private JLabel jcomp47;
    private JLabel jcomp48;
    private JTextArea ingresarHoraModificar;
    private JTextArea ingresarDiaModificar;
    private JTextArea ingresarPrioridadModificar;
    private JLabel jcomp52;
    private JLabel jcomp53;
    private JLabel jcomp54;
    private JLabel jcomp55;
    private JTextArea IngresarNombreActividadEliminar;
    private JButton botonEliminar;
    private JTextArea ingresarNumeroActividad;
    private JButton botonAceptar;

    public CodigoJPanel() {
        //construct preComponents
        String[] tipoPrioridadItems = {"1", "2", "3"};

        //construct components
        titulo_app = new JLabel (" BIENVENIDO A CALENDAPP");
        ingresarActividad = new JLabel ("Ingresa la actividad que deseas hacer");
        ingresar_actividad = new JTextArea (5, 5);
        jcomp4 = new JLabel ("Ingrese el dia que va a asignar la actividad");
        ingresarDia = new JTextArea (5, 5);
        jcomp6 = new JLabel ("Ingrese la hora para enviar el recordatorio");
        INgresarHora = new JTextField (5);
        botonGuardarActividad = new JButton ("GUARDAR");
        botonGuardarActividad.addActionListener(this);
        jcomp9 = new JLabel ("CALENDARIO DE LA SEMANA");
        jcomp10 = new JLabel ("Lunes");
        jcomp11 = new JLabel ("Martes");
        jcomp12 = new JLabel ("Miercoles");
        jcomp13 = new JLabel ("Jueves");
        jcomp14 = new JLabel ("Sabado");
        jcomp15 = new JLabel ("Domingo");
        jcomp16 = new JLabel ("Actividades");
        jcomp17 = new JLabel ("Viernes");
        jcomp18 = new JLabel ("INGRESE EL NUMERO DE LA ACTIVIDAD");
        botonModificar = new JButton ("MODIFICAR");
        botonModificar.addActionListener(this);
        ingresarNombreModificar = new JTextArea (5, 5);
        jcomp21 = new JLabel ("NOMBRE ACTIVIDAD");
        jcomp22 = new JLabel ("Ingresar el tipo de prioridad");
        tipoPrioridad = new JComboBox (tipoPrioridadItems);
        ingresarNombreUsusario = new JTextArea (5, 5);
        ingresarContraseña = new JTextArea (5, 5);
        botonGuardarUsusario = new JButton ("Guardar Ususario");
        botonGuardarUsusario.addActionListener(this);
        ingresarNombreUsusario = new JTextArea (5, 5);
        ingresarContraseña = new JTextArea (5, 5);
        jcomp29 = new JLabel ("Crear Usuario");
        jcomp30 = new JLabel ("Ingresar Ususario");
        jcomp31 = new JLabel ("Ingresa el nombre del ususario");
        jcomp32 = new JLabel ("ingresa la contraseña");
        jcomp33 = new JLabel ("ingresa el nombre del usuario");
        jcomp34 = new JLabel ("ingresa la contraseña");
        botonIngresarUsuario = new JButton ("Ingresar Ususario");
        botonIngresarUsuario.addActionListener(this);
        textoLunes = new JTextArea (5, 5);
        textoMartes = new JTextArea (5, 5);
        textoMiercoles = new JTextArea (5, 5);
        textoJueves = new JTextArea (5, 5);
        textoViernes = new JTextArea (5, 5);
        textoSabado = new JTextArea (5, 5);
        textoDomingo = new JTextArea (5, 5);
        jcomp43 = new JLabel ("Actividades");
        jcomp44 = new JLabel ("Actividades");
        jcomp45 = new JLabel ("Actividades");
        jcomp46 = new JLabel ("Actividades");
        jcomp47 = new JLabel ("Actividades");
        jcomp48 = new JLabel ("Actividades");
        ingresarHoraModificar = new JTextArea (5, 5);
        ingresarDiaModificar = new JTextArea (5, 5);
        ingresarPrioridadModificar = new JTextArea (5, 5);
        jcomp52 = new JLabel ("HORA ACTIVIDAD");
        jcomp53 = new JLabel ("DIA ACTIVIDAD");
        jcomp54 = new JLabel ("PRIORIDAD ACTIVIDAD");
        jcomp55 = new JLabel ("INGRESE EL NOMBRE DE LA ACTIVIDAD QUE DESEA ELIMINAR");
        IngresarNombreActividadEliminar = new JTextArea (5, 5);
        botonEliminar = new JButton ("ELIMINAR");
        botonEliminar.addActionListener(this);
        ingresarNumeroActividad = new JTextArea (5, 5);
        botonAceptar = new JButton ("ACEPTAR");
        botonAceptar.addActionListener(this);

        //set components properties
        ingresar_actividad.setToolTipText ("ingrese la actividad que desee");

        //adjust size and set layout
        setPreferredSize (new Dimension (1346, 675));
        setLayout (null);

        //add components
        add (titulo_app);
        add (ingresar_actividad);
        add (jcomp4);
        add (ingresarDia);
        add (jcomp6);
        add (INgresarHora);
        add (botonGuardarActividad);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);
        add (jcomp18);
        add (botonModificar);
        add (ingresarNombreModificar);
        add (jcomp21);
        add (jcomp22);
        add (tipoPrioridad);
        add (ingresarNombreUsusario);
        add (ingresarContraseña);
        add (botonGuardarUsusario);
        add (ingresarNombreUsusario);
        add (ingresarContraseña);
        add (jcomp29);
        add (jcomp30);
        add (jcomp31);
        add (jcomp32);
        add (jcomp33);
        add (jcomp34);
        add (botonIngresarUsuario);
        add (textoLunes);
        add (textoMartes);
        add (textoMiercoles);
        add (textoJueves);
        add (textoViernes);
        add (textoSabado);
        add (textoDomingo);
        add (jcomp43);
        add (jcomp44);
        add (jcomp45);
        add (jcomp46);
        add (jcomp47);
        add (jcomp48);
        add (ingresarHoraModificar);
        add (ingresarDiaModificar);
        add (ingresarPrioridadModificar);
        add (jcomp52);
        add (jcomp53);
        add (jcomp54);
        add (jcomp55);
        add (IngresarNombreActividadEliminar);
        add (botonEliminar);
        add (ingresarNumeroActividad);
        add (botonAceptar);

        //set component bounds (only needed by Absolute Positioning)
        titulo_app.setBounds (540, -5, 165, 40);
        ingresarActividad.setBounds (15, 35, 220, 30);
        ingresar_actividad.setBounds (20, 75, 195, 45);
        jcomp4.setBounds (275, 35, 245, 30);
        ingresarDia.setBounds (305, 75, 195, 45);
        jcomp6.setBounds (565, 35, 245, 30);
        INgresarHora.setBounds (585, 75, 195, 45);
        botonGuardarActividad.setBounds (475, 150, 135, 30);
        jcomp9.setBounds (460, 200, 175, 25);
        jcomp10.setBounds (0, 240, 100, 25);
        jcomp11.setBounds (155, 240, 100, 25);
        jcomp12.setBounds (320, 240, 100, 25);
        jcomp13.setBounds (480, 240, 100, 25);
        jcomp14.setBounds (780, 240, 100, 25);
        jcomp15.setBounds (930, 240, 100, 25);
        jcomp16.setBounds (0, 265, 110, 25);
        jcomp17.setBounds (625, 240, 100, 25);
        jcomp18.setBounds (35, 510, 250, 30);
        botonModificar.setBounds (410, 630, 153, 35);
        ingresarNombreModificar.setBounds (335, 590, 125, 35);
        jcomp21.setBounds (500, 570, 185, 25);
        jcomp22.setBounds (845, 35, 160, 30);
        tipoPrioridad.setBounds (860, 75, 140, 45);
        ingresarNombreUsusario.setBounds (1130, 120, 140, 35);
        ingresarContraseña.setBounds (1130, 205, 140, 35);
        botonGuardarUsusario.setBounds (1135, 265, 135, 30);
        ingresarNombreUsusario.setBounds (1135, 420, 140, 35);
        ingresarContraseña.setBounds (1135, 495, 140, 35);
        jcomp29.setBounds (1150, 40, 100, 25);
        jcomp30.setBounds (1150, 340, 105, 25);
        jcomp31.setBounds (1110, 100, 180, 20);
        jcomp32.setBounds (1135, 185, 130, 20);
        jcomp33.setBounds (1115, 400, 185, 25);
        jcomp34.setBounds (1140, 475, 140, 25);
        botonIngresarUsuario.setBounds (1135, 550, 140, 35);
        textoLunes.setBounds (0, 290, 120, 195);
        textoMartes.setBounds (155, 290, 125, 195);
        textoMiercoles.setBounds (320, 290, 120, 195);
        textoJueves.setBounds (480, 290, 115, 195);
        textoViernes.setBounds (625, 290, 115, 195);
        textoSabado.setBounds (780, 290, 115, 190);
        textoDomingo.setBounds (930, 290, 115, 190);
        jcomp43.setBounds (155, 265, 100, 25);
        jcomp44.setBounds (320, 265, 100, 25);
        jcomp45.setBounds (480, 265, 100, 25);
        jcomp46.setBounds (625, 265, 100, 25);
        jcomp47.setBounds (780, 265, 100, 25);
        jcomp48.setBounds (930, 265, 100, 25);
        ingresarHoraModificar.setBounds (500, 590, 125, 35);
        ingresarDiaModificar.setBounds (335, 530, 125, 35);
        ingresarPrioridadModificar.setBounds (500, 530, 125, 35);
        jcomp52.setBounds (335, 570, 100, 25);
        jcomp53.setBounds (335, 510, 100, 25);
        jcomp54.setBounds (500, 510, 140, 25);
        jcomp55.setBounds (720, 520, 385, 25);
        IngresarNombreActividadEliminar.setBounds (785, 550, 235, 40);
        botonEliminar.setBounds (825, 600, 150, 40);
        ingresarNumeroActividad.setBounds (65, 540, 165, 50);
        botonAceptar.setBounds (80, 610, 130, 40);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("CodigoJPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new CodigoJPanel());
        frame.pack();
        frame.setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonGuardarActividad){
            String Nombre=ingresar_actividad.getText();
            String Dia=ingresarDia.getText().toLowerCase();
            String Hora=INgresarHora.getText();
            String Prioridad=(String) tipoPrioridad.getSelectedItem();
            Actividad A1=new Actividad(Dia,(Integer.parseInt(Prioridad)),(Integer.parseInt(Hora)),Nombre);
            switch(Dia){
                case "lunes":
                    textoLunes.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;
                case "martes":
                    textoMartes.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;
                case "miercoles":
                    textoMiercoles.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;
                case "jueves":
                    textoJueves.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;
                case "viernes":
                    textoViernes.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;
                case "sabado":
                    textoSabado.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;
                case "domingo":
                    textoDomingo.setText("Debes "+A1.getNombreActividad()+" a las"+Integer.toString(A1.getHoraActividad())+" con prioridad"+Integer.toString(A1.getTipoPrioridad()));
                    break;                    
            }}
        else if(e.getSource()==botonIngresarUsuario){
        String Nombre=ingresarNombreUsusario.getText();
        String Contrasena=ingresarContraseña.getText();
        Usuario U1=new Usuario(Nombre,Contrasena);
        String mensaje = "Usuario creado exitosamente";
        JOptionPane.showMessageDialog(null, mensaje);

        
    }
}}
