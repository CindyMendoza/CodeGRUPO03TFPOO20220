package com.PA2;

public class Scooter extends Vehiculo{
        private String modeloMotor;
        private Integer duracionHorasBateria;

        public Scooter(String codigo, String anioCompra, String marca, String modelo, String color, String modeloMotor,
                       Integer duracionHorasBateria) {
                super(codigo, anioCompra, marca, modelo, color);
                this.modeloMotor = modeloMotor;
                this.duracionHorasBateria = duracionHorasBateria;
        }

        public String getModeloMotor() {
                return modeloMotor;
        }

        public void setModeloMotor(String modeloMotor) {
                this.modeloMotor = modeloMotor;
        }

        public Integer getDuracionHorasBateria() {
                return duracionHorasBateria;
        }

        public void setDuracionHorasBateria(Integer duracionHorasBateria) {
                this.duracionHorasBateria = duracionHorasBateria;
        }
        @Override
        public Integer calcularVelocidad() {
                return 35;
        }
        @Override
        public String toString() {
                return "Scooter{" +
                        "modeloMotor='" + modeloMotor + '\'' +
                        ", duracionHorasBateria=" + duracionHorasBateria +
                        "} " + super.toString();
        }


}
