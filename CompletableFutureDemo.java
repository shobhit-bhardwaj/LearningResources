package com;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

class SimpleRunnableTask implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("Inside Run");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Exiting Run");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class SimpleCallableTask implements Supplier<String> {
	@Override
	public String get() {
		try {
			System.out.println("Inside Call");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Exiting Call");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "DONE";
	}
}

public class CompletableFutureDemo {
	public static void main(String[] args) throws Exception {
		/*SimpleRunnableTask runnableTask = new SimpleRunnableTask();
		CompletableFuture<Void> runFuture = CompletableFuture.runAsync(runnableTask);
		System.out.println("Getting Value from runAsync - " + runFuture.get());

		SimpleCallableTask callableTask = new SimpleCallableTask();
		CompletableFuture<String> callFuture = CompletableFuture.supplyAsync(callableTask);
		System.out.println("Getting Value from supplyAsync - " + callFuture.get());*/

		/*CompletableFuture<String> textFuture = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return "Shobhit";
		})
		.thenApply(text -> "Welcome, " + text)
		.thenApply(text -> text + " to the Java World");
		System.out.println(textFuture.get());*/

		/*CompletableFuture<Void> productFuture = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return "This is a Product";
		})
		.thenAccept(product -> System.out.println(product))
		.thenAccept(text -> System.out.println(text))
		.thenApply(text -> "Future Product")
		.thenAccept(text -> System.out.println(text))
		.thenRun(() -> System.out.println("Completed"));
		productFuture.get();*/

		/*CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Retriving User");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Retrive USER1");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return "USER1";
		});
		CompletableFuture<Integer> ageFuture = CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Retriving Age");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Retrive Age 30");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return 30;
		});
		CompletableFuture<Integer> userAgeFuture = userFuture.thenCompose(user -> {
			System.out.println(user);
			return ageFuture;
		});
		System.out.println(userAgeFuture.get());*/

		/*CompletableFuture<Integer> weightFuture = CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Calculating Weight");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Weight is 80");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return 80;
		});
		CompletableFuture<Integer> heightFuture = CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Calculating Height");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Height is 180");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return 180;
		});

		CompletableFuture<Double> BMIFuture = weightFuture.thenCombine(heightFuture, (weight, height) -> {
			double heightMeter = height/100;
			return weight / (heightMeter * heightMeter);
		});
		System.out.println("BMI - " + BMIFuture.get());*/

		/*CompletableFuture<Integer> ageFuture = CompletableFuture
				.supplyAsync(() -> 0)
				.thenApply(age -> {
					if(age <= 0)
						throw new RuntimeException();
					return age;
				})
				.exceptionally(ex -> {
					System.out.println(ex.getMessage());
					return 10;
				});
		System.out.println(ageFuture.get());*/

		CompletableFuture<Integer> ageFuture = CompletableFuture
				.supplyAsync(() -> 12)
				.thenApply(age -> {
					if(age <= 0)
						throw new RuntimeException();
					return age;
				})
				.handle((age, ex) -> {
					if(ex != null) {
						System.out.println(ex.getMessage());
						return 10;
					}

					return age;
				});
		System.out.println(ageFuture.get());
	}
}