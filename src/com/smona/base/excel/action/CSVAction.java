package com.smona.base.excel.action;

import java.io.File;
import java.util.List;

public abstract class CSVAction implements IAction {

    @Override
    public void readFile(String xlsFile) {
        List<String> datas = CSVUtils.importCsv(new File(xlsFile), getEncode());
        readFile(datas);
    }

    abstract protected String getEncode();
    abstract protected void readFile(List<String> datas);

}
