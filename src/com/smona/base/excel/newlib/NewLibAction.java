package com.smona.base.excel.newlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewLibAction {
    
    public void readExcel(String xlsFile) throws BiffException,
            IOException {
        Workbook rwb = null;
        Cell cell = null;
        // 创建输入流
        InputStream stream;
        stream = new FileInputStream(xlsFile);
        // 获取Excel文件对象
        rwb = Workbook.getWorkbook(stream);
        // 获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet(0);
        List<QueryCarBillListVo> datas = new ArrayList<QueryCarBillListVo>();
        QueryCarBillListVo vo = null;
        // 行数(表头的目录不需要，从1开始)
        for (int i = 2; i < sheet.getRows(); i++) {
            vo = new QueryCarBillListVo();
            // 评估单号
            cell = sheet.getCell(0, i);
            vo.setCarBillId(cell.getContents());
            // 车主
            cell = sheet.getCell(1, i);
            vo.setCarUserName(cell.getContents());
            // 车牌号码
            cell = sheet.getCell(2, i);
            vo.setCarNo(cell.getContents());
            // 排量
            cell = sheet.getCell(3, i);
            vo.setCarDisplace(cell.getContents());
            // 功率
            cell = sheet.getCell(4, i);
            vo.setPower(Integer.valueOf(cell.getContents()));
            // 发动机号
            cell = sheet.getCell(5, i);
            vo.setEngineNum(cell.getContents());
            // 车架号
            cell = sheet.getCell(6, i);
            vo.setCarFrameNum(cell.getContents());
            // 登记日期
            cell = sheet.getCell(7, i);
            vo.setRegDate(cell.getContents());
            // 出厂日期
            cell = sheet.getCell(8, i);
            vo.setProductionDate(cell.getContents());
            // 环保标准
            cell = sheet.getCell(9, i);
            vo.setEnvironmentType(cell.getContents());
            // 公里数
            cell = sheet.getCell(10, i);
            vo.setRunNum(Integer.valueOf(cell.getContents()));
            // 车牌型号
            cell = sheet.getCell(11, i);
            vo.setLabelTypeNum(cell.getContents());
            // 车辆类型
            cell = sheet.getCell(12, i);
            vo.setCarTypeInfo(cell.getContents());
            // 品牌
            cell = sheet.getCell(13, i);
            vo.setCarBrandName(cell.getContents());
            // 车系
            cell = sheet.getCell(14, i);
            vo.setCarSetName(cell.getContents());
            // 车型
            cell = sheet.getCell(15, i);
            vo.setCarTypeName(cell.getContents());
            // 座位数
            cell = sheet.getCell(16, i);
            vo.setSeat(cell.getContents());
            // 颜色
            cell = sheet.getCell(17, i);
            vo.setColor(cell.getContents());
            // 年审有效期
            cell = sheet.getCell(18, i);
            vo.setYearCheckDate(cell.getContents());
            // 提报人手机号
            cell = sheet.getCell(19, i);
            vo.setTakeUserPhone(cell.getContents());
            // escysjg
            cell = sheet.getCell(20, i);
            vo.setPreSalePrice(Double.valueOf(cell.getContents()));
            // 使用性质
            cell = sheet.getCell(21, i);
            vo.setUseNature(cell.getContents());
            // 变速箱形式
            cell = sheet.getCell(22, i);
            vo.setChangeSpeed(cell.getContents());
            // 车门型式
            cell = sheet.getCell(23, i);
            vo.setCarDoor(cell.getContents());
            // 传动方式
            cell = sheet.getCell(24, i);
            vo.setDriveType(cell.getContents());
            // 供油系统
            cell = sheet.getCell(25, i);
            vo.setOilSystem(cell.getContents());
            // 进气方式
            cell = sheet.getCell(26, i);
            vo.setAirSystem(cell.getContents());
            // 特殊车管业务
            cell = sheet.getCell(27, i);
            vo.setSpecialBizInfo(cell.getContents());
            // 特殊配置说明
            cell = sheet.getCell(28, i);
            vo.setSpecialConfigInfo(cell.getContents());
            // 备注
            cell = sheet.getCell(29, i);
            vo.setCarInfoMark(cell.getContents());
            // 新车价格
            cell = sheet.getCell(30, i);
            vo.setNewCarPrice(Double.valueOf(cell.getContents()));
            // 优惠价
            cell = sheet.getCell(31, i);
            vo.setFavorablePrice(Double.valueOf(cell.getContents()));
            // 购置税
            cell = sheet.getCell(32, i);
            vo.setPurchaseTax(Double.valueOf(cell.getContents()));
            // 购入价
            cell = sheet.getCell(33, i);
            vo.setPurchasePrice(Double.valueOf(cell.getContents()));
            // 成新率
            cell = sheet.getCell(34, i);
            vo.setNewRate(Integer.valueOf(cell.getContents()));
            // 车龄调整
            cell = sheet.getCell(35, i);
            vo.setCarAgeChange(Double.valueOf(cell.getContents()));
            // 市场冷热
            cell = sheet.getCell(36, i);
            vo.setMarketDeep(Double.valueOf(cell.getContents()));
            // 更新换代
            cell = sheet.getCell(37, i);
            vo.setUpgrading(Double.valueOf(cell.getContents()));
            // 车龄版本系数
            cell = sheet.getCell(38, i);
            vo.setCarVersionParam(Double.valueOf(cell.getContents()));
            // 公里系数
            cell = sheet.getCell(39, i);
            vo.setRunParam(Double.valueOf(cell.getContents()));
            // 车况等级
            cell = sheet.getCell(40, i);
            vo.setCarCondition(Double.valueOf(cell.getContents()));
            // 颜色系数
            cell = sheet.getCell(41, i);
            vo.setColorParam(Double.valueOf(cell.getContents()));
            // 整修费
            cell = sheet.getCell(42, i);
            vo.setRepairCost(Double.valueOf(cell.getContents()));
            // 评估价格
            cell = sheet.getCell(43, i);
            vo.setEvaluatePrice(Integer.valueOf(cell.getContents()));
            // 评估日期
            cell = sheet.getCell(44, i);
            vo.setEvaluateDate(cell.getContents());

            datas.add(vo);
        }
    }
}
