package calculate.complex_utils;

import java.util.Stack;

/**
 * Это модель комплекского числа в данной модели не учитывается i
 */
public final class  ComplexNumber {
  int imangenary;
  int real;


    public ComplexNumber(int real, int imangenary) {
        this.imangenary = imangenary;
        this.real = real;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "imangenary=" + imangenary +
                ", real=" + real +
                '}';
    }

    public int getImangenary() {
        return imangenary;
    }

    public void setImangenary(int imangenary) {
        this.imangenary = imangenary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }
}
