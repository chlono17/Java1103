package com.ocp32_io;

import java.io.File;

//  建立資料夾.../ocp32_io/files 資料夾
public class CreateFolder {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32_io"; //  " \\ " or "/"
        File folder = new File(path);
        
        //確認 Folder 是否是資料夾 ?
        if (folder.isDirectory()) {
            //建立 files  資料夾
            // folder.getPath() => src\\main\\java\\com\\ocp32_io
            // File.separator => "\\" (分隔號)
            File files = new File(folder.getPath() + File.separator + "files");
            if (files.exists()) {
                System.out.printf("%s 已經被建立\n", files);
            }else {
                System.out.printf("建立 %s 目錄", files);
                   //check 是否會得到是否成功的boolean 值
                    boolean check = files.mkdir();
                    if (check) {
                        System.out.println("成功");
                    }else{
                        System.out.println("失敗");
                    }
            }
        }else{
            System.out.printf("%s 不是資料夾\n", folder);
        }
        
    }
}
