/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Divine
 */
public class TextFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isFile();
    }

    @Override
    public String getDescription() {
        String ext = null;
        ext = Utils.text;
        return ext;
    }
    class Utils{
        public final static String text = ".txt";
    }

}
