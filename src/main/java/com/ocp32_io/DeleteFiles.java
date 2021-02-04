package com.ocp32_io;

import java.io.File;
import java.util.Arrays;
public class DeleteFiles {
    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\ocp32_io\\files");
        if (files.exists()) {
            //印出 files 內的內容(檔案或資料夾名稱)
            System.out.println(Arrays.toString(files.listFiles()));
            //刪除 temp 為首的檔案
            for (String fname : files.list()) {
                if (fname.contains("temp")/* || fname.contains(".txt")*/) {   //字含有temp || .txt
                    File deFile = new File(files.getPath() + File.separator + fname);
                    deFile.delete();
                }
            }
            System.out.println(Arrays.toString(files.listFiles()));
        }else{
            System.out.printf("%s 不存在\n", files);
        }
    }
}
