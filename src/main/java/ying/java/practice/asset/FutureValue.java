package ying.java.practice.asset;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class FutureValue {

	
	
	public static void main(String[] args) {
		
		
		// 聚碩 6112
		BigDecimal stock_6112 = new BigDecimal(34.2);
		BigDecimal dividend_6112 = new BigDecimal(3);
		BigDecimal lot_6112 = new BigDecimal(7000);
		
		// 華固 2548
		BigDecimal stock_2548 = new BigDecimal(88.9);
		BigDecimal dividend_2548 = new BigDecimal(7.5);
		BigDecimal lot_2548 = new BigDecimal(2000);
		
		// 台新 2887
		BigDecimal stock_2887 = new BigDecimal(13.15);
		BigDecimal dividend_2887 = new BigDecimal(0.5);
		BigDecimal lot_2887 = new BigDecimal(6000);
		
		// 佳格 1227
		BigDecimal stock_1227 = new BigDecimal(56.7);
		BigDecimal dividend_1227 = new BigDecimal(2.5);
		BigDecimal lot_1227 = new BigDecimal(2000);
		
		// 元大期 6023
		BigDecimal stock_6023 = new BigDecimal(49.1);
		BigDecimal dividend_6023 = new BigDecimal(2);
		BigDecimal lot_6023 = new BigDecimal(1000);
		
		// 興富發 2542
		BigDecimal stock_2542 = new BigDecimal(40.4);
		BigDecimal dividend_2542 = new BigDecimal(2.5);
		BigDecimal lot_2542 = new BigDecimal(1000);
		
		// 元大臺灣ESG永續
		BigDecimal stock_00850 = new BigDecimal(22.61);
		BigDecimal dividend_00850 = new BigDecimal(0.7);
		BigDecimal lot_00850 = new BigDecimal(2000);
		
		// 正新 2105
		BigDecimal stock_2105 = new BigDecimal(39.6);
		BigDecimal dividend_2105 = new BigDecimal(1);
		BigDecimal lot_2105 = new BigDecimal(4000);
		
		// 大聯大 3702
		BigDecimal stock_3702 = new BigDecimal(38.1);
		BigDecimal dividend_3702 = new BigDecimal(2.5);
		BigDecimal lot_3702 = new BigDecimal(1000);
		
		// 元大全球未來通訊
		BigDecimal stock_00861 = new BigDecimal(19.72);
		BigDecimal dividend_00861 = new BigDecimal(0);
		BigDecimal lot_00861 = new BigDecimal(4000);

		// 中信金 2891
		BigDecimal stock_2891 = new BigDecimal(21.85);
		BigDecimal dividend_2891 = new BigDecimal(1);
		BigDecimal lot_2891 = new BigDecimal(2000);
		
		// 仁寶 2324
		BigDecimal stock_2324 = new BigDecimal(18.8);
		BigDecimal dividend_2324 = new BigDecimal(1);
		BigDecimal lot_2324 = new BigDecimal(2000);

		// 五鼎 1733
		BigDecimal stock_1733 = new BigDecimal(27.95);
		BigDecimal dividend_1733 = new BigDecimal(1.5);
		BigDecimal lot_1733 = new BigDecimal(4000);
		
		// 富爾特 6136
		BigDecimal stock_6136 = new BigDecimal(19.45);
		BigDecimal dividend_6136 = new BigDecimal(1.5);
		BigDecimal lot_6136 = new BigDecimal(2000);
		

		
		
		
		BigDecimal dividendTotal = new BigDecimal(0);
		BigDecimal stockPriceTotal = new BigDecimal(0);
		
		BigDecimal months = new BigDecimal(12);
		
		dividendTotal = mul(dividend_6112, lot_6112)			//聚碩 6112
						.add(mul(dividend_2548, lot_2548))		//華固 2548
						.add(mul(dividend_2887, lot_2887))		//台新 2887
						.add(mul(dividend_1227, lot_1227))		//佳格 1227
						.add(mul(dividend_6023, lot_6023))		//元大期 6023
						.add(mul(dividend_2542, lot_2542))		//興富發 2542
//						.add(mul(dividend_00850, lot_00850))	//元大臺灣ESG永續 00850
//						.add(mul(dividend_2105, lot_2105))		//正新 2105
//						.add(mul(dividend_3702, lot_3702))		//大聯大 3702
//						.add(mul(dividend_00861, lot_00861))	//元大全球未來通訊 00861
//						.add(mul(dividend_2891, lot_2891))		//中信金 2891
//						.add(mul(dividend_2324, lot_2324))		//仁寶 2324
//						.add(mul(dividend_1733, lot_1733))		//五鼎 1733
//						.add(mul(dividend_6136, lot_6136))		//富爾特 6136
						;
		
		stockPriceTotal = mul(stock_6112, lot_6112)				//聚碩 6112
						.add(mul(stock_2548, lot_2548))			//華固 2548
						.add(mul(stock_2887, lot_2887))			//台新 2887
						.add(mul(stock_1227, lot_1227))			//佳格 1227
						.add(mul(stock_6023, lot_6023))			//元大期 6023
						.add(mul(stock_2542, lot_2542))			//興富發 2542
//						.add(mul(stock_00850, lot_00850))		//元大臺灣ESG永續 00850
//						.add(mul(stock_2105, lot_2105))			//正新 2105
//						.add(mul(stock_3702, lot_3702))			//大聯大 3702
//						.add(mul(stock_00861, lot_00861))		//元大全球未來通訊 00861
//						.add(mul(stock_2891, lot_2891))			//中信金 2891
//						.add(mul(stock_2324, lot_2324))			//仁寶 2324
//						.add(mul(stock_1733, lot_1733))			//五鼎 1733
//						.add(mul(stock_6136, lot_6136))			//富爾特 6136
						;
		
		System.out.println(String.format("股票： %s元  (新台幣)",  formatNumber(stockPriceTotal)));
		System.out.println(String.format("股利： %s元  (每個月約賺： %s元 )",  formatNumber(dividendTotal) , formatNumber(div(dividendTotal, months))));
		System.out.println("=================================================");
		
		
		BigDecimal pv = new BigDecimal(960000);	// 本金
		BigDecimal finalPV = pv;
		BigDecimal interest = new BigDecimal(0.05);	//固定回報率
		int year = 30;	//週期(年)
		
		BigDecimal profitLastYear = dividendTotal;
		for (int n = 1; n <= year; n++) {
			BigDecimal fv = futureValue(pv, interest); //累積財富
			BigDecimal profit = sub(fv, pv); // 獲利 = 累積財富 - 本金
			// 健保補充保費
			/*
			BigDecimal tax = mul(profit, new BigDecimal(0.02));
			profit = sub(profit, tax);
			fv = sub(fv, tax);
			*/
			BigDecimal comparison = sub(profit, profitLastYear); // 比去年多賺 = 今年獲利 - 去年獲利
			String yearStr = n < 10 ? "0" + n : String.valueOf(n);
			System.out.println(String.format("第%s年本金： %s元  - 賺： %s元(每個月約賺： %s元 ) - 比去年多賺： %s元 ", yearStr, formatNumber(pv), formatNumber(profit), formatNumber(div(profit, months)) , formatNumber(comparison)));
			
			BigDecimal investmentMonth = BigDecimal.ZERO; // 每月投資
			if ( n <= 3 ) {
				investmentMonth = investmentMonth.add(new BigDecimal(10000));
			} else if (n > 3 && n <= 10) {
				investmentMonth = investmentMonth.add(new BigDecimal(12000));
			} else if (n > 10 && n <= 23) {
				investmentMonth = investmentMonth.add(new BigDecimal(15000));
//			} else if (n > 17 && n <= 23) {
//				investmentMonth = investmentMonth.add(new BigDecimal(10000));
//			} else if (n > 23 && n <= 32) {
//				investmentMonth = investmentMonth.add(new BigDecimal(10000));
			} else {
				
			}
			
			BigDecimal investmentYear = BigDecimal.ZERO; //每年投資
			for (int m = 1; m <= 12; m++) {
				investmentYear = investmentYear.add(investmentMonth);
			}
			BigDecimal investmentAmount = profit.add(investmentYear);
			System.out.println(String.format("財富累積      ： %s元  - 隔年加碼投資 %s元   / 隔年投資總金額 %s元", formatNumber(fv), formatNumber(investmentYear), formatNumber(investmentAmount)));
			if (!investmentYear.equals(BigDecimal.ZERO)) {
				pv = fv.add(investmentYear); // 本金 = 累積財富 + 每年投資
			}
			finalPV = finalPV.add(investmentYear);
			profitLastYear = profit;
		}
		System.out.println("=================================================");
		System.out.println(String.format("總投資金額： %s元", formatNumber(finalPV)));
			
		
	}
	
	/**
	 * 未來財富價值 
	 * @param presentValue 本金
	 * @param interest 週期內固定利率或固定回報率
	 * @return FV 未來價值(整數)
	 */
	public static BigDecimal futureValue(BigDecimal presentValue, BigDecimal interest) {
		BigDecimal FV = mul(presentValue, BigDecimal.ONE.add(interest));
		return FV;
	}
	
	
	/**
	 * 數字加上千分位
	 * @param number
	 * @return
	 */
	public static String formatNumber(BigDecimal number){
		if (number != null) {
			NumberFormat numberFormat = NumberFormat.getNumberInstance();
			return numberFormat.format(number);
		} else {
			return "";
		}
	}
	
	/**
	 * BigDecimal 乘法 取整數
	 * @param value1
	 * @param value2
	 * @return
	 */
	private static BigDecimal mul(BigDecimal value1, BigDecimal value2) {
		return value1.multiply(value2).setScale(0, BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * BigDecimal 除法 取整數
	 * @param value1
	 * @param value2
	 * @return
	 */
	public static BigDecimal div(BigDecimal value1, BigDecimal value2) {
		return value1.divide(value2, 0, BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * BigDecimal 減法
	 * @param value1
	 * @param value2
	 * @return
	 */
	public static BigDecimal sub(BigDecimal value1, BigDecimal value2) {
		return value1.subtract(value2);
	}
	
}
