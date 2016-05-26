package com.smona.base.excel.oldlib;

import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;

import com.smona.base.excel.action.QueryCarBillListVo;
import com.smona.base.excel.action.XlsAction;

public class OldLibAction extends XlsAction {

    private List<QueryCarBillListVo> mCellDatas = new ArrayList<QueryCarBillListVo>();

    public List<QueryCarBillListVo> getCellDatas() {
        return mCellDatas;
    }

    @Override
    protected void readExcel(Sheet sheet) {
        Cell cell = null;
        QueryCarBillListVo vo = null;
        // 行数(表头的目录不需要，从1开始)
        int column = 0;
        for (int i = 2; i < sheet.getRows(); i++) {
            try {
                vo = new QueryCarBillListVo();
                column = 0;
                
                cell = sheet.getCell(column, i);
                vo.setCarBrandName(cell.getContents());

                column++;
                cell = sheet.getCell(column, i);
                vo.setCarSetName(cell.getContents());
                
                // 评估单号
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarBillId(cell.getContents());
                // 车主
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarUserName(cell.getContents());
                // 车牌号码
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarNo(cell.getContents());
                // 排量
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarDisplace(cell.getContents());
                // 功率
                column++;
                cell = sheet.getCell(column, i);
                vo.setPower(Double.valueOf(cell.getContents()));
                // 发动机号
                column++;
                cell = sheet.getCell(column, i);
                vo.setEngineNum(cell.getContents());
                // 车架号
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarFrameNum(cell.getContents());
                // 登记日期
                column++;
                cell = sheet.getCell(column, i);
                vo.setRegDate(cell.getContents());
                // 出厂日期
                column++;
                cell = sheet.getCell(column, i);
                vo.setProductionDate(cell.getContents());
                // 环保标准
                column++;
                cell = sheet.getCell(column, i);
                vo.setEnvironmentType(cell.getContents());
                // 公里数
                column++;
                cell = sheet.getCell(column, i);
                vo.setRunNum(Integer.valueOf(cell.getContents()));
                // 车牌型号
                column++;
                cell = sheet.getCell(column, i);
                vo.setLabelTypeNum(cell.getContents());
                // 车辆类型
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarTypeInfo(cell.getContents());
                // 品牌
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarBrandName(cell.getContents());
                // 车系
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarSetName(cell.getContents());
                // 车型
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarTypeName(cell.getContents());
                // 座位数
                column++;
                cell = sheet.getCell(column, i);
                vo.setSeat(cell.getContents());
                // 颜色
                column++;
                cell = sheet.getCell(column, i);
                vo.setColor(cell.getContents());
                // 年审有效期
                column++;
                cell = sheet.getCell(column, i);
                vo.setYearCheckDate(cell.getContents());
                // 提报人手机号
                column++;
                cell = sheet.getCell(column, i);
                vo.setTakeUserPhone(cell.getContents());
                // escysjg
                column++;
                cell = sheet.getCell(column, i);
                vo.setPreSalePrice(Double.valueOf(cell.getContents()));
                // 使用性质
                column++;
                cell = sheet.getCell(column, i);
                vo.setUseNature(cell.getContents());
                // 变速箱形式
                column++;
                cell = sheet.getCell(column, i);
                vo.setChangeSpeed(cell.getContents());
                // 车门型式
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarDoor(cell.getContents());
                // 传动方式
                column++;
                cell = sheet.getCell(column, i);
                vo.setDriveType(cell.getContents());
                // 供油系统
                column++;
                cell = sheet.getCell(column, i);
                vo.setOilSystem(cell.getContents());
                // 进气方式
                column++;
                cell = sheet.getCell(column, i);
                vo.setAirSystem(cell.getContents());
                // 特殊车管业务
                column++;
                cell = sheet.getCell(column, i);
                vo.setSpecialBizInfo(cell.getContents());
                // 特殊配置说明
                column++;
                cell = sheet.getCell(column, i);
                vo.setSpecialConfigInfo(cell.getContents());
                // 备注
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarInfoMark(cell.getContents());
                // 新车价格
                column++;
                cell = sheet.getCell(column, i);
                vo.setNewCarPrice(Double.valueOf(cell.getContents()));
                // 优惠价
                column++;
                cell = sheet.getCell(column, i);
                vo.setFavorablePrice(Double.valueOf(cell.getContents()));
                // 购置税
                column++;
                cell = sheet.getCell(column, i);
                vo.setPurchaseTax(Double.valueOf(cell.getContents()));
                // 购入价
                column++;
                cell = sheet.getCell(column, i);
                vo.setPurchasePrice(Double.valueOf(cell.getContents()));
                // 成新率
                column++;
                cell = sheet.getCell(column, i);
                vo.setNewRate(Integer.valueOf(cell.getContents()));
                // 车龄调整
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarAgeChange(Double.valueOf(cell.getContents()));
                // 市场冷热
                column++;
                cell = sheet.getCell(column, i);
                vo.setMarketDeep(Double.valueOf(cell.getContents()));
                // 更新换代
                column++;
                cell = sheet.getCell(column, i);
                vo.setUpgrading(Double.valueOf(cell.getContents()));
                // 车龄版本系数
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarVersionParam(Double.valueOf(cell.getContents()));
                // 公里系数
                column++;
                cell = sheet.getCell(column, i);
                vo.setRunParam(Double.valueOf(cell.getContents()));
                // 车况等级
                column++;
                cell = sheet.getCell(column, i);
                vo.setCarCondition(Double.valueOf(cell.getContents()));
                // 颜色系数
                column++;
                cell = sheet.getCell(column, i);
                vo.setColorParam(Double.valueOf(cell.getContents()));
                // 整修费
                column++;
                cell = sheet.getCell(column, i);
                vo.setRepairCost(Double.valueOf(cell.getContents()));
                // 评估价格
                column++;
                cell = sheet.getCell(column, i);
                vo.setEvaluatePrice(Integer.valueOf(cell.getContents()));
                // 评估日期
                column++;
                cell = sheet.getCell(column, i);
                vo.setEvaluateDate(cell.getContents());

                mCellDatas.add(vo);
            } catch (Exception e) {
                System.out.println("Exception " + vo);
            }
        }
    }

}
