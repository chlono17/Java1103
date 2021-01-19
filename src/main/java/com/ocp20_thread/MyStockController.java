package com.ocp20_thread;

import java.util.Date;
import java.util.concurrent.FutureTask;
import javax.swing.JLabel;
import yahoofinance.Stock;

public class MyStockController implements Runnable{
    private String symbol;
    private JLabel pricaeLabel;
    private JLabel changeLabel;
    public boolean play;
   
    public MyStockController(String symbol, JLabel pricaeLabel, JLabel changeLabel) {
        this.symbol = symbol;
        this.pricaeLabel = pricaeLabel;
        this.changeLabel = changeLabel;
        play = true;
    }

    @Override
    public void run() {
        while (play) {            
            try {
                System.out.println(new Date());
                FutureTask<Stock> task = new FutureTask<Stock>(new MyStock(symbol));
                new Thread(task).start();   //放到執行緒去執行
                Stock stock = task.get();
                double price = stock.getQuote().getPrice().doubleValue();
                double change = stock.getQuote().getChange().doubleValue();
                pricaeLabel.setText(String.format("%.2f", price));
                changeLabel.setText(String.format("%.2f", change));
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
         }
    
            
}
