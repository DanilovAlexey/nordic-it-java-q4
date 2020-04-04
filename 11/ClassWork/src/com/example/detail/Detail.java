package com.example.detail;

public class Detail implements Runnable {

	private int detailNumber;
	private int stageNumber;

	public Detail(int detailNumber) {
		super();
		this.detailNumber = detailNumber;
	}

	public int getDetailNumber() {
		return detailNumber;
	}

	public void setStageNumber(int stageNumber) {
		this.stageNumber = stageNumber;
	}

	public int getStageNumber() {
		return stageNumber;
	}

	@Override
	public void run() {
		System.out.println("Изделие №" + this.detailNumber + ". Стадия №" + this.stageNumber + ". Начало.");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		System.out.println("Изделие №" + this.detailNumber + ". Стадия №" + this.stageNumber + ". Конец.");
	}

}
