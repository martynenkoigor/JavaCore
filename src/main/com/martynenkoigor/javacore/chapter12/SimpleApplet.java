package com.martynenkoigor.javacore.chapter12;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Пpocтeйwий аплет", 20, 20);
    }
}
