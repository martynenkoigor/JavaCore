package com.martynenkoigor.javacore.chapter14;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Maccив nуст");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0)
                throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++)
                sum += n[i];

            return sum / n.length;
        };
        System.out.println("Cpeднee равно " + average.func(values));

        System.out.println("Cpeднee равно " + average.func(new double[0]));
    }
}
