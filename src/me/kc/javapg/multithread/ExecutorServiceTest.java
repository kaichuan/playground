package me.kc.javapg.multithread;

import java.util.Arrays;
import java.util.concurrent.*;

/**
 * Created by kc. <br/>
 * Date: 22/09/2017.
 */
public class ExecutorServiceTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor2 = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
        executor2.submit(()->{
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
//        executor.shutdown();
        executor2.shutdown();

        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };
        Future<Integer> future = executor.submit(task);
        System.out.println(future.isDone());
        int result = future.get(2,TimeUnit.SECONDS);
        System.out.println(future.isDone() + "" + result + "");

        executor.shutdown();

        ExecutorService executorService = Executors.newWorkStealingPool();
        executorService.invokeAll(Arrays.asList(()->"task1", ()->"task2")).stream().map(f -> {
            try {
                return f.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }).forEach(System.out::println);


    }
}
