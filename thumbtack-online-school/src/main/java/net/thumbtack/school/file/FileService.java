package net.thumbtack.school.file;

import net.thumbtack.school.colors.Color;
import net.thumbtack.school.colors.ColorException;
import net.thumbtack.school.figures.v3.Rectangle;
import com.google.gson.Gson;

import java.io.*;

public class FileService {

    public static void writeByteArrayToBinaryFile(String fileName, byte[] array) throws IOException {
        writeByteArrayToBinaryFile(new File(fileName), array);
    }

    public static void writeByteArrayToBinaryFile(File file, byte[] array) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(array);
        }
    }

    public static byte[] readByteArrayFromBinaryFile(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(new File(fileName))) {
            byte[] array = new byte[6];
            fis.read(array);
            return array;
        }
    }

    public static byte[] readByteArrayFromBinaryFile(File file) throws IOException {
        return readByteArrayFromBinaryFile(file.getName());
    }

//    public static byte[]  writeAndReadByteArrayUsingByteStream( byte[] array) throws IOException {
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        byteArrayOutputStream.write(array);
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//        byte[] array2 = new byte[array.length];
//        byte[] array3 = new byte[array2.length/2];
//        inputStream.read(array2,2,1);
//        for (int i = 0 ;i<=array2.length/2;i++){
//
//        }
//    }

    public static void  writeByteArrayToBinaryFileBuffered(String fileName, byte[] array) throws IOException {
        writeByteArrayToBinaryFile(new File(fileName), array);
    }

    public static void  writeByteArrayToBinaryFileBuffered(File file, byte[] array) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream (file))) {
            bos.write(array);
        }
    }

    public static byte[] readByteArrayFromBinaryFileBuffered(String fileName) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)))) {
            byte[] array = new byte[6];
            bis.read(array);
            return array;
        }
    }

    public static byte[] readByteArrayFromBinaryFileBuffered(File file) throws IOException {
        return readByteArrayFromBinaryFile(file.getName());
    }

//    public static void  writeRectangleToBinaryFile(File file, Rectangle rect) throws IOException {
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream (file))) {
//            bos.write(rect);
//        }

//        try( ObjectOutputStream serial = new ObjectOutputStream(new FileOutputStream(file))){
//            serial.writeObject(rect);
//        }
//    }

    public static Rectangle  readRectangleFromBinaryFile(File file) throws IOException, ColorException {
        Gson gson = new Gson();
        try (BufferedReader bw = new BufferedReader(new FileReader(file))) {
            Rectangle rec = new Rectangle(Color.GREEN);
            return rec;
        }

    }

}
