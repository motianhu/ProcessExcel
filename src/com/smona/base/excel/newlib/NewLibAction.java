package com.smona.base.excel.newlib;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.smona.base.excel.action.CSVUtils;

public class NewLibAction {
	private List<CarBrand> mCarBrands = new ArrayList<CarBrand>();
	private List<CarSet> mCarSets = new ArrayList<CarSet>();
	private List<CarType> mCarTypes = new ArrayList<CarType>();

	public void readCarBrand(String file) {
		List<String> brands = CSVUtils.importCsv(new File(file));
		CarBrand brand = null;
		// 行数(表头的目录不需要，从1开始)
		for (int i = 1; i < brands.size(); i++) {
			brand = new CarBrand();
			// 品牌ID
			String[] splits = brands.get(i).split(",");
			brand.setId(Integer.valueOf(splits[0].substring(1, splits[0].length() - 1)));
			// 品牌名称
			brand.setCarBrandName(splits[2]);
			mCarBrands.add(brand);
		}

		for (CarBrand carBrand : mCarBrands) {
			System.out.println(carBrand);
		}
	}

	public void readCarSet(String file) {
		List<String> brands = CSVUtils.importCsv(new File(file));
		CarSet set = null;
		// 行数(表头的目录不需要，从1开始)
		for (int i = 1; i < brands.size(); i++) {
			set = new CarSet();
			// 品牌ID
			String[] splits = brands.get(i).split(",");
			set.setId(Integer.valueOf(splits[0].substring(1, splits[0].length() - 1)));
			// 品牌名称
			set.setCarBrandId(Integer.valueOf(splits[2].substring(1, splits[2].length() - 1)));
			set.setCarSetName(splits[3].substring(1, splits[3].length() - 1));
			mCarSets.add(set);
		}

		for (CarSet carBrand : mCarSets) {
			System.out.println(carBrand);
		}
	}

	public void readCarType(String file) {
		List<String> brands = CSVUtils.importCsv(new File(file));
		CarType carType = null;
		// 行数(表头的目录不需要，从1开始)
		for (int i = 1; i < brands.size(); i++) {
			carType = new CarType();
			// 品牌ID
			String[] splits = brands.get(i).split(",");
			carType.setId(Integer.valueOf(splits[0].substring(1, splits[0].length() - 1)));
			// 品牌名称
			carType.setCarBrandId(Integer.valueOf(splits[2].substring(1, splits[2].length() - 1)));
			carType.setCarSetId(Integer.valueOf(splits[3].substring(1, splits[3].length() - 1)));
			carType.setCarTypeName(splits[5].substring(1, splits[5].length() - 1));
			mCarTypes.add(carType);
		}

		for (CarType type : mCarTypes) {
			System.out.println(type);
		}
	}
}
