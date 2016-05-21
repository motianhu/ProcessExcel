package com.smona.base.excel;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.smona.base.excel.newlib.NewLibAction;

import jxl.read.biff.BiffException;

public class Main {

    public static void main(String[] args) {
        String currFilePath = System.getProperty("user.dir");
        String xlsFile = currFilePath + "/data.xls";
        try {
            NewLibAction action = new NewLibAction();
            action.readExcel(xlsFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
