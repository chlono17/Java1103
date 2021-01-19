package com.ocp20_thread;

import java.util.concurrent.FutureTask;
import yahoofinance.Stock;

public class MyStockTest {

    public static void main(String[] args) throws Exception {
        // 設定商品代號
        String symbol = "USDTWD=x"; // 匯率
       // String symbol = "2337.TW"; // 股票
        //String symbol = "^TWIT";  //台股加權指數
        //String symbol = "GC=F"; //黃金

        //  建立 Callable 物件(如: myStock)
        MyStock myStock = new MyStock(symbol);

        //  建立 FutureTask 來執行Callable物件
        FutureTask<Stock> task = new FutureTask<>(myStock);

        //  啟動執行緒去執行
        new Thread(task).start();

        //接受價格
        Stock stock = task.get();

        //印出價格
        double price = stock.getQuote().getPrice().doubleValue();
        double change = stock.getQuote().getChange().doubleValue();
        System.out.println(stock.getName());
        System.out.printf("%s ==> %.2f (%.2f)\n", symbol, price, change);
    }

}
