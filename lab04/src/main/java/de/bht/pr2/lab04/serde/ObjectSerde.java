package de.bht.pr2.lab04.serde;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerde {

  public void serialize(Object o, String path) {
    try {
      final boolean mkdirs = new File(path).getParentFile().mkdirs();
      final boolean newFile = new File(path).createNewFile();
      FileOutputStream fileOutputStream
          = new FileOutputStream(path);
      ObjectOutputStream objectOutputStream
          = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(o);
      objectOutputStream.flush();
      objectOutputStream.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public Object deserialize(String path) {
    try {
      FileInputStream fileInputStream
          = new FileInputStream(path);
      ObjectInputStream objectInputStream
          = new ObjectInputStream(fileInputStream);
      Object o = objectInputStream.readObject();
      objectInputStream.close();
      return o;
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
