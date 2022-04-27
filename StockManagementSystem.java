package com.bridgelabaz.objectorientedpgm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to manage stock account and display total stock value
 * 
 * @author : Snehal Patil
 */
public class StockManagementSystem {
	public static void main(String[] args) {
		System.out.println("------------- Welcome to Stock Management System --------------------");
		System.out.println();
		StockPortfolio stockPortfolio = new StockPortfolio();
		stockPortfolio.stockPortFolio();
	}
}

class Stock {
	int stocksNumber;
	int numOfShares;
	float sharePrice;

	ArrayList<String> stockNames;

	// Constructor
	public Stock() {
		stockNames = new ArrayList<>();
	}

	// Adding stock names
	public void addStockName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stock name  : ");
		String stockName = sc.nextLine();
		stockNames.add(stockName);
		System.out.println("Stocks names are:" + stockNames);
	}
}

class StockPortfolio extends Stock {
	float totalStockValue;

	// Taking values of shares and price from user
	public void stockPriceInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Shares:");
		numOfShares = sc.nextInt();
		System.out.println("Enter share price:");
		sharePrice = sc.nextFloat();

	}

	// Method to calculate total value of stock using share price and
	// number of shares
	public double stockCalculate() {
		this.totalStockValue = sharePrice * numOfShares;
		return totalStockValue;
	}

	// Method to calculate the total value company shares and Stock Report
	public void stockPortFolio() {
		int i = 0;
		float stockValue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how mant company stocks you want store :");
		stocksNumber = sc.nextInt();

		while (i < stocksNumber) {
			addStockName();
			stockPriceInput();
			stockCalculate();
			System.out.println("Total value of company shares is: " + stockCalculate());
			stockValue += totalStockValue;
			i++;
			System.out.println("---------------------------------------------------");
		}
		System.out.println("Total Stock Value is : " + stockValue);
		System.out.println("---------------------------------------------------");
	}
}
