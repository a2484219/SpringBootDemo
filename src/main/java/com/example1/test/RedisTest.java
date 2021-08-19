//package com.example1.test;
//
//import redis.clients.jedis.Jedis;
//
//import java.util.concurrent.CountDownLatch;
//
///**
// * Created by Administrator on 2017/12/16 0016.
// */
//public class RedisTest {
//
//    /**
//     * 线程大小
//     */
//    private static final int SIZE = 5;
//
//    /**
//     * 键
//     */
//    private static final String KEY = "myKey";
//
//    /**
//     * IP地址
//     */
//    private static final String IP = "127.0.0.1";
//
//    /**
//     * 端口
//     */
//    private static final int PORT = 6379;
//
//    public static void main(String[] args) throws InterruptedException {
//        testJedis();
//    }
//
//    /**
//     * 测试jedis
//     */
//    public static void testJedis() throws InterruptedException {
//        setJedis();
//        Jedis jedis = new Jedis(IP, PORT);
//        initValue(jedis);
//        CountDownLatch countDownLatch = new CountDownLatch(SIZE);
//        for (int i = 0; i < SIZE; i++) {
//            new Thread(new Test(countDownLatch)).start();
//        }
//        countDownLatch.await();
//        System.out.println("最终的值为：" + jedis.get(KEY));
//    }
//
//    static class Test implements Runnable {
//
//        private static ThreadLocal<Jedis> jedisThreadLocal = new ThreadLocal<Jedis>(){
//            @Override
//            protected Jedis initialValue() {
//                return new Jedis(IP, PORT);
//            }
//        };
//
//        private CountDownLatch countDownLatch;
//
//        public Test(CountDownLatch countDownLatch){
//            this.countDownLatch = countDownLatch;
//        }
//
//        @Override
//        public void run() {
//            System.out.println(jedisThreadLocal.get());
//            for(int j = 0; j < 10; j++) {
//                jedisThreadLocal.get().incr(KEY);
//                System.out.println(Thread.currentThread().getName()+ "\t" + jedisThreadLocal.get().get(KEY));
//            }
//            countDownLatch.countDown();
//        }
//    }
//
//    /**
//     * 初始化jedis
//     */
//    public static void setJedis(){
////        jedisThreadLocal.set(new Jedis(IP, PORT));
//    }
//
//    /**
//     * 初始化jedis
//     * @param jedis
//     */
//    private static void initValue(Jedis jedis) {
//        jedis.set(KEY, "0");
//    }
//}