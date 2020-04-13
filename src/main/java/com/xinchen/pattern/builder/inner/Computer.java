package com.xinchen.pattern.builder.inner;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 *
 *  建造者内部静态类的方式
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/4/13 22:50
 */
@Data
public class Computer {
    private String cpu;
    private String ram;
    private String keyboard;
    private String display;


    Computer(String cpu, String ram, String keyboard, String display) {
        this.cpu = cpu;
        this.ram = ram;
        this.keyboard = keyboard;
        this.display = display;
    }

    public static Computer.Builder custom(){
        return new Builder();
    }

    public static class Builder{
        private String cpu;
        private String ram;

        private String keyboard;
        private String display;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build(){
            return new Computer(cpu,ram,keyboard,display);
        }
    }
}
