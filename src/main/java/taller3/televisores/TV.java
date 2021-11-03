/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.televisores;

/**
 *
 * @author camilo
 */
public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    public static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if(1 <= canal && canal <= 120 && this.estado)
            this.canal = canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if(0 <= volumen && volumen <= 7 && this.estado)
            this.volumen = volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    
    public void turnOn() {
        this.estado = true;
    }
    
    public void turnOff() {
        this.estado = false;
    }
    
    public boolean getEstado() {
        return estado;
    }

    public void volumenUp() {
        if(this.volumen < 7 && this.estado)
            this.volumen++;
    }
    
    public void volumenDown() {
        if(0 < this.volumen && this.estado)
            this.volumen--;
    }
    
    public void canalUp() {
        if(this.canal < 120 && this.estado)
            this.canal++;
    }
    
    public void canalDown() {
        if(1 < this.canal && this.estado)
            this.canal--;
    }

}
