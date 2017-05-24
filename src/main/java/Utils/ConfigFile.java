/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Pojo.Config;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Evander R
 */
public class ConfigFile {

    private final int SIZE = 301;
    private RandomAccessFile raf;
    private File file;

    private void open() throws IOException {
        file = new File("config.dat");
        if (!file.exists()) {
            file.createNewFile();
            raf = new RandomAccessFile(file, "rw");
            raf.seek(0);
            raf.writeInt(0);

        } else {
            raf = new RandomAccessFile(file, "rw");
        }
    }

    private void close() throws IOException {
        if (raf != null) {
            raf.close();
        }

    }

    public void create(Config t) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        long pos = 4 + n * SIZE;
        raf.seek(pos);
        raf.writeInt(t.getIdConfig());
        raf.writeInt(t.getLanguage());
        raf.seek(0);
        raf.writeInt(++n);
        close();
    }

    public void update(Config t) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            long pos = 4 + i * SIZE;
            raf.seek(pos);
            int id_temp = raf.readInt();
            if (t.getIdConfig() == id_temp) {
                raf.writeInt(t.getIdConfig());
                raf.writeInt(t.getLanguage());
                close();
                break;
            }
        }
    }
    
    public Config findByID(int id) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        if (n <= 0) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            long pos = 4 + i * SIZE;
            raf.seek(pos);
            Config c= read();
            if (id==c.getIdConfig()) {
                close();
                return c;
            }
        }        
        close();
        return null;
    }
    
    private Config read() throws IOException {
        Config c = new Config();
        c.setIdConfig(raf.readInt());
        c.setLanguage(raf.readInt());
        return c;

    }
}
