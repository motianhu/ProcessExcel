package com.smona.base.excel.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public abstract class AbstractAction implements IAction {

    @Override
    public void readExcel(String xlsFile) {
        Workbook rwb = null;
        // 创建输入流
        InputStream stream;
        try {
            stream = new FileInputStream(xlsFile);
            // 获取Excel文件对象
            rwb = Workbook.getWorkbook(stream);
            // 获取文件的指定工作表 默认的第一个
            Sheet sheet = rwb.getSheet(0);
            readExcel(sheet);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    abstract protected void readExcel(Sheet sheet);

}
